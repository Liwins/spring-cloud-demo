package com.liwin.mbg.domain;

import java.util.ArrayList;
import java.util.List;

public class UmsClientRoleRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsClientRoleRelationExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClientNoIsNull() {
            addCriterion("client_no is null");
            return (Criteria) this;
        }

        public Criteria andClientNoIsNotNull() {
            addCriterion("client_no is not null");
            return (Criteria) this;
        }

        public Criteria andClientNoEqualTo(String value) {
            addCriterion("client_no =", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoNotEqualTo(String value) {
            addCriterion("client_no <>", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoGreaterThan(String value) {
            addCriterion("client_no >", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoGreaterThanOrEqualTo(String value) {
            addCriterion("client_no >=", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoLessThan(String value) {
            addCriterion("client_no <", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoLessThanOrEqualTo(String value) {
            addCriterion("client_no <=", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoLike(String value) {
            addCriterion("client_no like", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoNotLike(String value) {
            addCriterion("client_no not like", value, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoIn(List<String> values) {
            addCriterion("client_no in", values, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoNotIn(List<String> values) {
            addCriterion("client_no not in", values, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoBetween(String value1, String value2) {
            addCriterion("client_no between", value1, value2, "clientNo");
            return (Criteria) this;
        }

        public Criteria andClientNoNotBetween(String value1, String value2) {
            addCriterion("client_no not between", value1, value2, "clientNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoIsNull() {
            addCriterion("role_no is null");
            return (Criteria) this;
        }

        public Criteria andRoleNoIsNotNull() {
            addCriterion("role_no is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNoEqualTo(String value) {
            addCriterion("role_no =", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoNotEqualTo(String value) {
            addCriterion("role_no <>", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoGreaterThan(String value) {
            addCriterion("role_no >", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoGreaterThanOrEqualTo(String value) {
            addCriterion("role_no >=", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoLessThan(String value) {
            addCriterion("role_no <", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoLessThanOrEqualTo(String value) {
            addCriterion("role_no <=", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoLike(String value) {
            addCriterion("role_no like", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoNotLike(String value) {
            addCriterion("role_no not like", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoIn(List<String> values) {
            addCriterion("role_no in", values, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoNotIn(List<String> values) {
            addCriterion("role_no not in", values, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoBetween(String value1, String value2) {
            addCriterion("role_no between", value1, value2, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoNotBetween(String value1, String value2) {
            addCriterion("role_no not between", value1, value2, "roleNo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}