package com.newoj.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContestExample() {
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

        public Criteria andConIdIsNull() {
            addCriterion("con_id is null");
            return (Criteria) this;
        }

        public Criteria andConIdIsNotNull() {
            addCriterion("con_id is not null");
            return (Criteria) this;
        }

        public Criteria andConIdEqualTo(Integer value) {
            addCriterion("con_id =", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdNotEqualTo(Integer value) {
            addCriterion("con_id <>", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdGreaterThan(Integer value) {
            addCriterion("con_id >", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("con_id >=", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdLessThan(Integer value) {
            addCriterion("con_id <", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdLessThanOrEqualTo(Integer value) {
            addCriterion("con_id <=", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdIn(List<Integer> values) {
            addCriterion("con_id in", values, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdNotIn(List<Integer> values) {
            addCriterion("con_id not in", values, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdBetween(Integer value1, Integer value2) {
            addCriterion("con_id between", value1, value2, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdNotBetween(Integer value1, Integer value2) {
            addCriterion("con_id not between", value1, value2, "conId");
            return (Criteria) this;
        }

        public Criteria andConNameIsNull() {
            addCriterion("con_name is null");
            return (Criteria) this;
        }

        public Criteria andConNameIsNotNull() {
            addCriterion("con_name is not null");
            return (Criteria) this;
        }

        public Criteria andConNameEqualTo(String value) {
            addCriterion("con_name =", value, "conName");
            return (Criteria) this;
        }

        public Criteria andConNameNotEqualTo(String value) {
            addCriterion("con_name <>", value, "conName");
            return (Criteria) this;
        }

        public Criteria andConNameGreaterThan(String value) {
            addCriterion("con_name >", value, "conName");
            return (Criteria) this;
        }

        public Criteria andConNameGreaterThanOrEqualTo(String value) {
            addCriterion("con_name >=", value, "conName");
            return (Criteria) this;
        }

        public Criteria andConNameLessThan(String value) {
            addCriterion("con_name <", value, "conName");
            return (Criteria) this;
        }

        public Criteria andConNameLessThanOrEqualTo(String value) {
            addCriterion("con_name <=", value, "conName");
            return (Criteria) this;
        }

        public Criteria andConNameLike(String value) {
            addCriterion("con_name like", value, "conName");
            return (Criteria) this;
        }

        public Criteria andConNameNotLike(String value) {
            addCriterion("con_name not like", value, "conName");
            return (Criteria) this;
        }

        public Criteria andConNameIn(List<String> values) {
            addCriterion("con_name in", values, "conName");
            return (Criteria) this;
        }

        public Criteria andConNameNotIn(List<String> values) {
            addCriterion("con_name not in", values, "conName");
            return (Criteria) this;
        }

        public Criteria andConNameBetween(String value1, String value2) {
            addCriterion("con_name between", value1, value2, "conName");
            return (Criteria) this;
        }

        public Criteria andConNameNotBetween(String value1, String value2) {
            addCriterion("con_name not between", value1, value2, "conName");
            return (Criteria) this;
        }

        public Criteria andConStarttimeIsNull() {
            addCriterion("con_starttime is null");
            return (Criteria) this;
        }

        public Criteria andConStarttimeIsNotNull() {
            addCriterion("con_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andConStarttimeEqualTo(Date value) {
            addCriterion("con_starttime =", value, "conStarttime");
            return (Criteria) this;
        }

        public Criteria andConStarttimeNotEqualTo(Date value) {
            addCriterion("con_starttime <>", value, "conStarttime");
            return (Criteria) this;
        }

        public Criteria andConStarttimeGreaterThan(Date value) {
            addCriterion("con_starttime >", value, "conStarttime");
            return (Criteria) this;
        }

        public Criteria andConStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("con_starttime >=", value, "conStarttime");
            return (Criteria) this;
        }

        public Criteria andConStarttimeLessThan(Date value) {
            addCriterion("con_starttime <", value, "conStarttime");
            return (Criteria) this;
        }

        public Criteria andConStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("con_starttime <=", value, "conStarttime");
            return (Criteria) this;
        }

        public Criteria andConStarttimeIn(List<Date> values) {
            addCriterion("con_starttime in", values, "conStarttime");
            return (Criteria) this;
        }

        public Criteria andConStarttimeNotIn(List<Date> values) {
            addCriterion("con_starttime not in", values, "conStarttime");
            return (Criteria) this;
        }

        public Criteria andConStarttimeBetween(Date value1, Date value2) {
            addCriterion("con_starttime between", value1, value2, "conStarttime");
            return (Criteria) this;
        }

        public Criteria andConStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("con_starttime not between", value1, value2, "conStarttime");
            return (Criteria) this;
        }

        public Criteria andConEndtimeIsNull() {
            addCriterion("con_endtime is null");
            return (Criteria) this;
        }

        public Criteria andConEndtimeIsNotNull() {
            addCriterion("con_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andConEndtimeEqualTo(Date value) {
            addCriterion("con_endtime =", value, "conEndtime");
            return (Criteria) this;
        }

        public Criteria andConEndtimeNotEqualTo(Date value) {
            addCriterion("con_endtime <>", value, "conEndtime");
            return (Criteria) this;
        }

        public Criteria andConEndtimeGreaterThan(Date value) {
            addCriterion("con_endtime >", value, "conEndtime");
            return (Criteria) this;
        }

        public Criteria andConEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("con_endtime >=", value, "conEndtime");
            return (Criteria) this;
        }

        public Criteria andConEndtimeLessThan(Date value) {
            addCriterion("con_endtime <", value, "conEndtime");
            return (Criteria) this;
        }

        public Criteria andConEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("con_endtime <=", value, "conEndtime");
            return (Criteria) this;
        }

        public Criteria andConEndtimeIn(List<Date> values) {
            addCriterion("con_endtime in", values, "conEndtime");
            return (Criteria) this;
        }

        public Criteria andConEndtimeNotIn(List<Date> values) {
            addCriterion("con_endtime not in", values, "conEndtime");
            return (Criteria) this;
        }

        public Criteria andConEndtimeBetween(Date value1, Date value2) {
            addCriterion("con_endtime between", value1, value2, "conEndtime");
            return (Criteria) this;
        }

        public Criteria andConEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("con_endtime not between", value1, value2, "conEndtime");
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