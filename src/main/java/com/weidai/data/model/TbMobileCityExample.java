package com.weidai.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbMobileCityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMobileCityExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andProvinceCodeIsNull() {
            addCriterion("province_code is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("province_code is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("province_code =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("province_code <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("province_code >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("province_code >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("province_code <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("province_code <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("province_code like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("province_code not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("province_code in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("province_code not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("province_code between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("province_code not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCnIsNull() {
            addCriterion("province_cn is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCnIsNotNull() {
            addCriterion("province_cn is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCnEqualTo(String value) {
            addCriterion("province_cn =", value, "provinceCn");
            return (Criteria) this;
        }

        public Criteria andProvinceCnNotEqualTo(String value) {
            addCriterion("province_cn <>", value, "provinceCn");
            return (Criteria) this;
        }

        public Criteria andProvinceCnGreaterThan(String value) {
            addCriterion("province_cn >", value, "provinceCn");
            return (Criteria) this;
        }

        public Criteria andProvinceCnGreaterThanOrEqualTo(String value) {
            addCriterion("province_cn >=", value, "provinceCn");
            return (Criteria) this;
        }

        public Criteria andProvinceCnLessThan(String value) {
            addCriterion("province_cn <", value, "provinceCn");
            return (Criteria) this;
        }

        public Criteria andProvinceCnLessThanOrEqualTo(String value) {
            addCriterion("province_cn <=", value, "provinceCn");
            return (Criteria) this;
        }

        public Criteria andProvinceCnLike(String value) {
            addCriterion("province_cn like", value, "provinceCn");
            return (Criteria) this;
        }

        public Criteria andProvinceCnNotLike(String value) {
            addCriterion("province_cn not like", value, "provinceCn");
            return (Criteria) this;
        }

        public Criteria andProvinceCnIn(List<String> values) {
            addCriterion("province_cn in", values, "provinceCn");
            return (Criteria) this;
        }

        public Criteria andProvinceCnNotIn(List<String> values) {
            addCriterion("province_cn not in", values, "provinceCn");
            return (Criteria) this;
        }

        public Criteria andProvinceCnBetween(String value1, String value2) {
            addCriterion("province_cn between", value1, value2, "provinceCn");
            return (Criteria) this;
        }

        public Criteria andProvinceCnNotBetween(String value1, String value2) {
            addCriterion("province_cn not between", value1, value2, "provinceCn");
            return (Criteria) this;
        }

        public Criteria andProvinceEnIsNull() {
            addCriterion("province_en is null");
            return (Criteria) this;
        }

        public Criteria andProvinceEnIsNotNull() {
            addCriterion("province_en is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEnEqualTo(String value) {
            addCriterion("province_en =", value, "provinceEn");
            return (Criteria) this;
        }

        public Criteria andProvinceEnNotEqualTo(String value) {
            addCriterion("province_en <>", value, "provinceEn");
            return (Criteria) this;
        }

        public Criteria andProvinceEnGreaterThan(String value) {
            addCriterion("province_en >", value, "provinceEn");
            return (Criteria) this;
        }

        public Criteria andProvinceEnGreaterThanOrEqualTo(String value) {
            addCriterion("province_en >=", value, "provinceEn");
            return (Criteria) this;
        }

        public Criteria andProvinceEnLessThan(String value) {
            addCriterion("province_en <", value, "provinceEn");
            return (Criteria) this;
        }

        public Criteria andProvinceEnLessThanOrEqualTo(String value) {
            addCriterion("province_en <=", value, "provinceEn");
            return (Criteria) this;
        }

        public Criteria andProvinceEnLike(String value) {
            addCriterion("province_en like", value, "provinceEn");
            return (Criteria) this;
        }

        public Criteria andProvinceEnNotLike(String value) {
            addCriterion("province_en not like", value, "provinceEn");
            return (Criteria) this;
        }

        public Criteria andProvinceEnIn(List<String> values) {
            addCriterion("province_en in", values, "provinceEn");
            return (Criteria) this;
        }

        public Criteria andProvinceEnNotIn(List<String> values) {
            addCriterion("province_en not in", values, "provinceEn");
            return (Criteria) this;
        }

        public Criteria andProvinceEnBetween(String value1, String value2) {
            addCriterion("province_en between", value1, value2, "provinceEn");
            return (Criteria) this;
        }

        public Criteria andProvinceEnNotBetween(String value1, String value2) {
            addCriterion("province_en not between", value1, value2, "provinceEn");
            return (Criteria) this;
        }

        public Criteria andParamsPatternIsNull() {
            addCriterion("params_pattern is null");
            return (Criteria) this;
        }

        public Criteria andParamsPatternIsNotNull() {
            addCriterion("params_pattern is not null");
            return (Criteria) this;
        }

        public Criteria andParamsPatternEqualTo(String value) {
            addCriterion("params_pattern =", value, "paramsPattern");
            return (Criteria) this;
        }

        public Criteria andParamsPatternNotEqualTo(String value) {
            addCriterion("params_pattern <>", value, "paramsPattern");
            return (Criteria) this;
        }

        public Criteria andParamsPatternGreaterThan(String value) {
            addCriterion("params_pattern >", value, "paramsPattern");
            return (Criteria) this;
        }

        public Criteria andParamsPatternGreaterThanOrEqualTo(String value) {
            addCriterion("params_pattern >=", value, "paramsPattern");
            return (Criteria) this;
        }

        public Criteria andParamsPatternLessThan(String value) {
            addCriterion("params_pattern <", value, "paramsPattern");
            return (Criteria) this;
        }

        public Criteria andParamsPatternLessThanOrEqualTo(String value) {
            addCriterion("params_pattern <=", value, "paramsPattern");
            return (Criteria) this;
        }

        public Criteria andParamsPatternLike(String value) {
            addCriterion("params_pattern like", value, "paramsPattern");
            return (Criteria) this;
        }

        public Criteria andParamsPatternNotLike(String value) {
            addCriterion("params_pattern not like", value, "paramsPattern");
            return (Criteria) this;
        }

        public Criteria andParamsPatternIn(List<String> values) {
            addCriterion("params_pattern in", values, "paramsPattern");
            return (Criteria) this;
        }

        public Criteria andParamsPatternNotIn(List<String> values) {
            addCriterion("params_pattern not in", values, "paramsPattern");
            return (Criteria) this;
        }

        public Criteria andParamsPatternBetween(String value1, String value2) {
            addCriterion("params_pattern between", value1, value2, "paramsPattern");
            return (Criteria) this;
        }

        public Criteria andParamsPatternNotBetween(String value1, String value2) {
            addCriterion("params_pattern not between", value1, value2, "paramsPattern");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOperationFlowIsNull() {
            addCriterion("operation_flow is null");
            return (Criteria) this;
        }

        public Criteria andOperationFlowIsNotNull() {
            addCriterion("operation_flow is not null");
            return (Criteria) this;
        }

        public Criteria andOperationFlowEqualTo(String value) {
            addCriterion("operation_flow =", value, "operationFlow");
            return (Criteria) this;
        }

        public Criteria andOperationFlowNotEqualTo(String value) {
            addCriterion("operation_flow <>", value, "operationFlow");
            return (Criteria) this;
        }

        public Criteria andOperationFlowGreaterThan(String value) {
            addCriterion("operation_flow >", value, "operationFlow");
            return (Criteria) this;
        }

        public Criteria andOperationFlowGreaterThanOrEqualTo(String value) {
            addCriterion("operation_flow >=", value, "operationFlow");
            return (Criteria) this;
        }

        public Criteria andOperationFlowLessThan(String value) {
            addCriterion("operation_flow <", value, "operationFlow");
            return (Criteria) this;
        }

        public Criteria andOperationFlowLessThanOrEqualTo(String value) {
            addCriterion("operation_flow <=", value, "operationFlow");
            return (Criteria) this;
        }

        public Criteria andOperationFlowLike(String value) {
            addCriterion("operation_flow like", value, "operationFlow");
            return (Criteria) this;
        }

        public Criteria andOperationFlowNotLike(String value) {
            addCriterion("operation_flow not like", value, "operationFlow");
            return (Criteria) this;
        }

        public Criteria andOperationFlowIn(List<String> values) {
            addCriterion("operation_flow in", values, "operationFlow");
            return (Criteria) this;
        }

        public Criteria andOperationFlowNotIn(List<String> values) {
            addCriterion("operation_flow not in", values, "operationFlow");
            return (Criteria) this;
        }

        public Criteria andOperationFlowBetween(String value1, String value2) {
            addCriterion("operation_flow between", value1, value2, "operationFlow");
            return (Criteria) this;
        }

        public Criteria andOperationFlowNotBetween(String value1, String value2) {
            addCriterion("operation_flow not between", value1, value2, "operationFlow");
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