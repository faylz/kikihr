package com.openhr.pm.entity;

import java.util.ArrayList;
import java.util.List;

public class PmUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmUserExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("FID is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("FID is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(String value) {
            addCriterion("FID =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(String value) {
            addCriterion("FID <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(String value) {
            addCriterion("FID >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(String value) {
            addCriterion("FID >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(String value) {
            addCriterion("FID <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(String value) {
            addCriterion("FID <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLike(String value) {
            addCriterion("FID like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotLike(String value) {
            addCriterion("FID not like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<String> values) {
            addCriterion("FID in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<String> values) {
            addCriterion("FID not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(String value1, String value2) {
            addCriterion("FID between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(String value1, String value2) {
            addCriterion("FID not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFnumberIsNull() {
            addCriterion("FNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andFnumberIsNotNull() {
            addCriterion("FNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andFnumberEqualTo(String value) {
            addCriterion("FNUMBER =", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotEqualTo(String value) {
            addCriterion("FNUMBER <>", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberGreaterThan(String value) {
            addCriterion("FNUMBER >", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberGreaterThanOrEqualTo(String value) {
            addCriterion("FNUMBER >=", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberLessThan(String value) {
            addCriterion("FNUMBER <", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberLessThanOrEqualTo(String value) {
            addCriterion("FNUMBER <=", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberLike(String value) {
            addCriterion("FNUMBER like", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotLike(String value) {
            addCriterion("FNUMBER not like", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberIn(List<String> values) {
            addCriterion("FNUMBER in", values, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotIn(List<String> values) {
            addCriterion("FNUMBER not in", values, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberBetween(String value1, String value2) {
            addCriterion("FNUMBER between", value1, value2, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotBetween(String value1, String value2) {
            addCriterion("FNUMBER not between", value1, value2, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnameIsNull() {
            addCriterion("FNAME is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("FNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("FNAME =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("FNAME <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("FNAME >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("FNAME >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("FNAME <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("FNAME <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("FNAME like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("FNAME not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("FNAME in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("FNAME not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("FNAME between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("FNAME not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFpasswordIsNull() {
            addCriterion("FPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andFpasswordIsNotNull() {
            addCriterion("FPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andFpasswordEqualTo(String value) {
            addCriterion("FPASSWORD =", value, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordNotEqualTo(String value) {
            addCriterion("FPASSWORD <>", value, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordGreaterThan(String value) {
            addCriterion("FPASSWORD >", value, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("FPASSWORD >=", value, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordLessThan(String value) {
            addCriterion("FPASSWORD <", value, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordLessThanOrEqualTo(String value) {
            addCriterion("FPASSWORD <=", value, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordLike(String value) {
            addCriterion("FPASSWORD like", value, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordNotLike(String value) {
            addCriterion("FPASSWORD not like", value, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordIn(List<String> values) {
            addCriterion("FPASSWORD in", values, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordNotIn(List<String> values) {
            addCriterion("FPASSWORD not in", values, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordBetween(String value1, String value2) {
            addCriterion("FPASSWORD between", value1, value2, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordNotBetween(String value1, String value2) {
            addCriterion("FPASSWORD not between", value1, value2, "fpassword");
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