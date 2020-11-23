package com.liwin.security.config;

import com.liwin.common.config.BaseSwaggerConfig;
import com.liwin.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author riversky
 * @date 2020/11/23
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.liwin")
                .title("spring demo ")
                .description("spring demo")
                .contactName("macro")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
