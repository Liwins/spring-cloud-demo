package com.liwin.security.service.impl;

import com.liwin.common.constant.AuthConstant;
import com.liwin.common.domain.UserDto;
import com.liwin.security.constant.MessageConstant;
import com.liwin.security.domain.SecurityUser;
import com.liwin.security.service.UmsAdminService;
import com.liwin.security.service.UmsMemberService;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Member;

/**
 * @author riversky
 * @date 2020/11/23
 **/
@Service
public class UserServiceImpl implements UserDetailsService {
    @Autowired
    private UmsAdminService adminService;
    @Autowired
    private UmsMemberService umsMemberService;
    @Autowired
    private HttpServletRequest request;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        String clientId = request.getParameter("client_id");
        UserDto userDto;
        if(AuthConstant.ADMIN_CLIENT_ID.equals(clientId)){
            userDto=adminService.loadUserByUsername(userName);
        }else{
            userDto= umsMemberService.loadUserByUsername(userName);
        }
        if(userDto==null){
            throw new UsernameNotFoundException(MessageConstant.USERNAME_PASSWORD_ERROR);
        }
        userDto.setClientId(clientId);
        SecurityUser securityUser = new SecurityUser(userDto);
        if(!securityUser.isEnabled()){
            throw new DisabledException(MessageConstant.ACCOUNT_DISABLED);
        } else if (!securityUser.isAccountNonLocked()) {
            throw new LockedException(MessageConstant.ACCOUNT_LOCKED);
        } else if (!securityUser.isAccountNonExpired()) {
            throw new AccountExpiredException(MessageConstant.ACCOUNT_EXPIRED);
        } else if (!securityUser.isCredentialsNonExpired()) {
            throw new CredentialsExpiredException(MessageConstant.CREDENTIALS_EXPIRED);
        }
        return securityUser;
    }
}
