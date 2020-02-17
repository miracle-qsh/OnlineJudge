package com.newoj.bean;

import java.util.ArrayList;
import java.util.List;

public class ProblemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProblemExample() {
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

        public Criteria andProIdIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_id not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProTitleIsNull() {
            addCriterion("pro_title is null");
            return (Criteria) this;
        }

        public Criteria andProTitleIsNotNull() {
            addCriterion("pro_title is not null");
            return (Criteria) this;
        }

        public Criteria andProTitleEqualTo(String value) {
            addCriterion("pro_title =", value, "proTitle");
            return (Criteria) this;
        }

        public Criteria andProTitleNotEqualTo(String value) {
            addCriterion("pro_title <>", value, "proTitle");
            return (Criteria) this;
        }

        public Criteria andProTitleGreaterThan(String value) {
            addCriterion("pro_title >", value, "proTitle");
            return (Criteria) this;
        }

        public Criteria andProTitleGreaterThanOrEqualTo(String value) {
            addCriterion("pro_title >=", value, "proTitle");
            return (Criteria) this;
        }

        public Criteria andProTitleLessThan(String value) {
            addCriterion("pro_title <", value, "proTitle");
            return (Criteria) this;
        }

        public Criteria andProTitleLessThanOrEqualTo(String value) {
            addCriterion("pro_title <=", value, "proTitle");
            return (Criteria) this;
        }

        public Criteria andProTitleLike(String value) {
            addCriterion("pro_title like", value, "proTitle");
            return (Criteria) this;
        }

        public Criteria andProTitleNotLike(String value) {
            addCriterion("pro_title not like", value, "proTitle");
            return (Criteria) this;
        }

        public Criteria andProTitleIn(List<String> values) {
            addCriterion("pro_title in", values, "proTitle");
            return (Criteria) this;
        }

        public Criteria andProTitleNotIn(List<String> values) {
            addCriterion("pro_title not in", values, "proTitle");
            return (Criteria) this;
        }

        public Criteria andProTitleBetween(String value1, String value2) {
            addCriterion("pro_title between", value1, value2, "proTitle");
            return (Criteria) this;
        }

        public Criteria andProTitleNotBetween(String value1, String value2) {
            addCriterion("pro_title not between", value1, value2, "proTitle");
            return (Criteria) this;
        }

        public Criteria andProTimelimIsNull() {
            addCriterion("pro_timelim is null");
            return (Criteria) this;
        }

        public Criteria andProTimelimIsNotNull() {
            addCriterion("pro_timelim is not null");
            return (Criteria) this;
        }

        public Criteria andProTimelimEqualTo(Integer value) {
            addCriterion("pro_timelim =", value, "proTimelim");
            return (Criteria) this;
        }

        public Criteria andProTimelimNotEqualTo(Integer value) {
            addCriterion("pro_timelim <>", value, "proTimelim");
            return (Criteria) this;
        }

        public Criteria andProTimelimGreaterThan(Integer value) {
            addCriterion("pro_timelim >", value, "proTimelim");
            return (Criteria) this;
        }

        public Criteria andProTimelimGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_timelim >=", value, "proTimelim");
            return (Criteria) this;
        }

        public Criteria andProTimelimLessThan(Integer value) {
            addCriterion("pro_timelim <", value, "proTimelim");
            return (Criteria) this;
        }

        public Criteria andProTimelimLessThanOrEqualTo(Integer value) {
            addCriterion("pro_timelim <=", value, "proTimelim");
            return (Criteria) this;
        }

        public Criteria andProTimelimIn(List<Integer> values) {
            addCriterion("pro_timelim in", values, "proTimelim");
            return (Criteria) this;
        }

        public Criteria andProTimelimNotIn(List<Integer> values) {
            addCriterion("pro_timelim not in", values, "proTimelim");
            return (Criteria) this;
        }

        public Criteria andProTimelimBetween(Integer value1, Integer value2) {
            addCriterion("pro_timelim between", value1, value2, "proTimelim");
            return (Criteria) this;
        }

        public Criteria andProTimelimNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_timelim not between", value1, value2, "proTimelim");
            return (Criteria) this;
        }

        public Criteria andProMemlimIsNull() {
            addCriterion("pro_memlim is null");
            return (Criteria) this;
        }

        public Criteria andProMemlimIsNotNull() {
            addCriterion("pro_memlim is not null");
            return (Criteria) this;
        }

        public Criteria andProMemlimEqualTo(Integer value) {
            addCriterion("pro_memlim =", value, "proMemlim");
            return (Criteria) this;
        }

        public Criteria andProMemlimNotEqualTo(Integer value) {
            addCriterion("pro_memlim <>", value, "proMemlim");
            return (Criteria) this;
        }

        public Criteria andProMemlimGreaterThan(Integer value) {
            addCriterion("pro_memlim >", value, "proMemlim");
            return (Criteria) this;
        }

        public Criteria andProMemlimGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_memlim >=", value, "proMemlim");
            return (Criteria) this;
        }

        public Criteria andProMemlimLessThan(Integer value) {
            addCriterion("pro_memlim <", value, "proMemlim");
            return (Criteria) this;
        }

        public Criteria andProMemlimLessThanOrEqualTo(Integer value) {
            addCriterion("pro_memlim <=", value, "proMemlim");
            return (Criteria) this;
        }

        public Criteria andProMemlimIn(List<Integer> values) {
            addCriterion("pro_memlim in", values, "proMemlim");
            return (Criteria) this;
        }

        public Criteria andProMemlimNotIn(List<Integer> values) {
            addCriterion("pro_memlim not in", values, "proMemlim");
            return (Criteria) this;
        }

        public Criteria andProMemlimBetween(Integer value1, Integer value2) {
            addCriterion("pro_memlim between", value1, value2, "proMemlim");
            return (Criteria) this;
        }

        public Criteria andProMemlimNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_memlim not between", value1, value2, "proMemlim");
            return (Criteria) this;
        }

        public Criteria andProInfoIsNull() {
            addCriterion("pro_info is null");
            return (Criteria) this;
        }

        public Criteria andProInfoIsNotNull() {
            addCriterion("pro_info is not null");
            return (Criteria) this;
        }

        public Criteria andProInfoEqualTo(String value) {
            addCriterion("pro_info =", value, "proInfo");
            return (Criteria) this;
        }

        public Criteria andProInfoNotEqualTo(String value) {
            addCriterion("pro_info <>", value, "proInfo");
            return (Criteria) this;
        }

        public Criteria andProInfoGreaterThan(String value) {
            addCriterion("pro_info >", value, "proInfo");
            return (Criteria) this;
        }

        public Criteria andProInfoGreaterThanOrEqualTo(String value) {
            addCriterion("pro_info >=", value, "proInfo");
            return (Criteria) this;
        }

        public Criteria andProInfoLessThan(String value) {
            addCriterion("pro_info <", value, "proInfo");
            return (Criteria) this;
        }

        public Criteria andProInfoLessThanOrEqualTo(String value) {
            addCriterion("pro_info <=", value, "proInfo");
            return (Criteria) this;
        }

        public Criteria andProInfoLike(String value) {
            addCriterion("pro_info like", value, "proInfo");
            return (Criteria) this;
        }

        public Criteria andProInfoNotLike(String value) {
            addCriterion("pro_info not like", value, "proInfo");
            return (Criteria) this;
        }

        public Criteria andProInfoIn(List<String> values) {
            addCriterion("pro_info in", values, "proInfo");
            return (Criteria) this;
        }

        public Criteria andProInfoNotIn(List<String> values) {
            addCriterion("pro_info not in", values, "proInfo");
            return (Criteria) this;
        }

        public Criteria andProInfoBetween(String value1, String value2) {
            addCriterion("pro_info between", value1, value2, "proInfo");
            return (Criteria) this;
        }

        public Criteria andProInfoNotBetween(String value1, String value2) {
            addCriterion("pro_info not between", value1, value2, "proInfo");
            return (Criteria) this;
        }

        public Criteria andProInputIsNull() {
            addCriterion("pro_input is null");
            return (Criteria) this;
        }

        public Criteria andProInputIsNotNull() {
            addCriterion("pro_input is not null");
            return (Criteria) this;
        }

        public Criteria andProInputEqualTo(String value) {
            addCriterion("pro_input =", value, "proInput");
            return (Criteria) this;
        }

        public Criteria andProInputNotEqualTo(String value) {
            addCriterion("pro_input <>", value, "proInput");
            return (Criteria) this;
        }

        public Criteria andProInputGreaterThan(String value) {
            addCriterion("pro_input >", value, "proInput");
            return (Criteria) this;
        }

        public Criteria andProInputGreaterThanOrEqualTo(String value) {
            addCriterion("pro_input >=", value, "proInput");
            return (Criteria) this;
        }

        public Criteria andProInputLessThan(String value) {
            addCriterion("pro_input <", value, "proInput");
            return (Criteria) this;
        }

        public Criteria andProInputLessThanOrEqualTo(String value) {
            addCriterion("pro_input <=", value, "proInput");
            return (Criteria) this;
        }

        public Criteria andProInputLike(String value) {
            addCriterion("pro_input like", value, "proInput");
            return (Criteria) this;
        }

        public Criteria andProInputNotLike(String value) {
            addCriterion("pro_input not like", value, "proInput");
            return (Criteria) this;
        }

        public Criteria andProInputIn(List<String> values) {
            addCriterion("pro_input in", values, "proInput");
            return (Criteria) this;
        }

        public Criteria andProInputNotIn(List<String> values) {
            addCriterion("pro_input not in", values, "proInput");
            return (Criteria) this;
        }

        public Criteria andProInputBetween(String value1, String value2) {
            addCriterion("pro_input between", value1, value2, "proInput");
            return (Criteria) this;
        }

        public Criteria andProInputNotBetween(String value1, String value2) {
            addCriterion("pro_input not between", value1, value2, "proInput");
            return (Criteria) this;
        }

        public Criteria andProOutputIsNull() {
            addCriterion("pro_output is null");
            return (Criteria) this;
        }

        public Criteria andProOutputIsNotNull() {
            addCriterion("pro_output is not null");
            return (Criteria) this;
        }

        public Criteria andProOutputEqualTo(String value) {
            addCriterion("pro_output =", value, "proOutput");
            return (Criteria) this;
        }

        public Criteria andProOutputNotEqualTo(String value) {
            addCriterion("pro_output <>", value, "proOutput");
            return (Criteria) this;
        }

        public Criteria andProOutputGreaterThan(String value) {
            addCriterion("pro_output >", value, "proOutput");
            return (Criteria) this;
        }

        public Criteria andProOutputGreaterThanOrEqualTo(String value) {
            addCriterion("pro_output >=", value, "proOutput");
            return (Criteria) this;
        }

        public Criteria andProOutputLessThan(String value) {
            addCriterion("pro_output <", value, "proOutput");
            return (Criteria) this;
        }

        public Criteria andProOutputLessThanOrEqualTo(String value) {
            addCriterion("pro_output <=", value, "proOutput");
            return (Criteria) this;
        }

        public Criteria andProOutputLike(String value) {
            addCriterion("pro_output like", value, "proOutput");
            return (Criteria) this;
        }

        public Criteria andProOutputNotLike(String value) {
            addCriterion("pro_output not like", value, "proOutput");
            return (Criteria) this;
        }

        public Criteria andProOutputIn(List<String> values) {
            addCriterion("pro_output in", values, "proOutput");
            return (Criteria) this;
        }

        public Criteria andProOutputNotIn(List<String> values) {
            addCriterion("pro_output not in", values, "proOutput");
            return (Criteria) this;
        }

        public Criteria andProOutputBetween(String value1, String value2) {
            addCriterion("pro_output between", value1, value2, "proOutput");
            return (Criteria) this;
        }

        public Criteria andProOutputNotBetween(String value1, String value2) {
            addCriterion("pro_output not between", value1, value2, "proOutput");
            return (Criteria) this;
        }

        public Criteria andProSinputIsNull() {
            addCriterion("pro_sinput is null");
            return (Criteria) this;
        }

        public Criteria andProSinputIsNotNull() {
            addCriterion("pro_sinput is not null");
            return (Criteria) this;
        }

        public Criteria andProSinputEqualTo(String value) {
            addCriterion("pro_sinput =", value, "proSinput");
            return (Criteria) this;
        }

        public Criteria andProSinputNotEqualTo(String value) {
            addCriterion("pro_sinput <>", value, "proSinput");
            return (Criteria) this;
        }

        public Criteria andProSinputGreaterThan(String value) {
            addCriterion("pro_sinput >", value, "proSinput");
            return (Criteria) this;
        }

        public Criteria andProSinputGreaterThanOrEqualTo(String value) {
            addCriterion("pro_sinput >=", value, "proSinput");
            return (Criteria) this;
        }

        public Criteria andProSinputLessThan(String value) {
            addCriterion("pro_sinput <", value, "proSinput");
            return (Criteria) this;
        }

        public Criteria andProSinputLessThanOrEqualTo(String value) {
            addCriterion("pro_sinput <=", value, "proSinput");
            return (Criteria) this;
        }

        public Criteria andProSinputLike(String value) {
            addCriterion("pro_sinput like", value, "proSinput");
            return (Criteria) this;
        }

        public Criteria andProSinputNotLike(String value) {
            addCriterion("pro_sinput not like", value, "proSinput");
            return (Criteria) this;
        }

        public Criteria andProSinputIn(List<String> values) {
            addCriterion("pro_sinput in", values, "proSinput");
            return (Criteria) this;
        }

        public Criteria andProSinputNotIn(List<String> values) {
            addCriterion("pro_sinput not in", values, "proSinput");
            return (Criteria) this;
        }

        public Criteria andProSinputBetween(String value1, String value2) {
            addCriterion("pro_sinput between", value1, value2, "proSinput");
            return (Criteria) this;
        }

        public Criteria andProSinputNotBetween(String value1, String value2) {
            addCriterion("pro_sinput not between", value1, value2, "proSinput");
            return (Criteria) this;
        }

        public Criteria andProSoutputIsNull() {
            addCriterion("pro_soutput is null");
            return (Criteria) this;
        }

        public Criteria andProSoutputIsNotNull() {
            addCriterion("pro_soutput is not null");
            return (Criteria) this;
        }

        public Criteria andProSoutputEqualTo(String value) {
            addCriterion("pro_soutput =", value, "proSoutput");
            return (Criteria) this;
        }

        public Criteria andProSoutputNotEqualTo(String value) {
            addCriterion("pro_soutput <>", value, "proSoutput");
            return (Criteria) this;
        }

        public Criteria andProSoutputGreaterThan(String value) {
            addCriterion("pro_soutput >", value, "proSoutput");
            return (Criteria) this;
        }

        public Criteria andProSoutputGreaterThanOrEqualTo(String value) {
            addCriterion("pro_soutput >=", value, "proSoutput");
            return (Criteria) this;
        }

        public Criteria andProSoutputLessThan(String value) {
            addCriterion("pro_soutput <", value, "proSoutput");
            return (Criteria) this;
        }

        public Criteria andProSoutputLessThanOrEqualTo(String value) {
            addCriterion("pro_soutput <=", value, "proSoutput");
            return (Criteria) this;
        }

        public Criteria andProSoutputLike(String value) {
            addCriterion("pro_soutput like", value, "proSoutput");
            return (Criteria) this;
        }

        public Criteria andProSoutputNotLike(String value) {
            addCriterion("pro_soutput not like", value, "proSoutput");
            return (Criteria) this;
        }

        public Criteria andProSoutputIn(List<String> values) {
            addCriterion("pro_soutput in", values, "proSoutput");
            return (Criteria) this;
        }

        public Criteria andProSoutputNotIn(List<String> values) {
            addCriterion("pro_soutput not in", values, "proSoutput");
            return (Criteria) this;
        }

        public Criteria andProSoutputBetween(String value1, String value2) {
            addCriterion("pro_soutput between", value1, value2, "proSoutput");
            return (Criteria) this;
        }

        public Criteria andProSoutputNotBetween(String value1, String value2) {
            addCriterion("pro_soutput not between", value1, value2, "proSoutput");
            return (Criteria) this;
        }

        public Criteria andProHintIsNull() {
            addCriterion("pro_hint is null");
            return (Criteria) this;
        }

        public Criteria andProHintIsNotNull() {
            addCriterion("pro_hint is not null");
            return (Criteria) this;
        }

        public Criteria andProHintEqualTo(String value) {
            addCriterion("pro_hint =", value, "proHint");
            return (Criteria) this;
        }

        public Criteria andProHintNotEqualTo(String value) {
            addCriterion("pro_hint <>", value, "proHint");
            return (Criteria) this;
        }

        public Criteria andProHintGreaterThan(String value) {
            addCriterion("pro_hint >", value, "proHint");
            return (Criteria) this;
        }

        public Criteria andProHintGreaterThanOrEqualTo(String value) {
            addCriterion("pro_hint >=", value, "proHint");
            return (Criteria) this;
        }

        public Criteria andProHintLessThan(String value) {
            addCriterion("pro_hint <", value, "proHint");
            return (Criteria) this;
        }

        public Criteria andProHintLessThanOrEqualTo(String value) {
            addCriterion("pro_hint <=", value, "proHint");
            return (Criteria) this;
        }

        public Criteria andProHintLike(String value) {
            addCriterion("pro_hint like", value, "proHint");
            return (Criteria) this;
        }

        public Criteria andProHintNotLike(String value) {
            addCriterion("pro_hint not like", value, "proHint");
            return (Criteria) this;
        }

        public Criteria andProHintIn(List<String> values) {
            addCriterion("pro_hint in", values, "proHint");
            return (Criteria) this;
        }

        public Criteria andProHintNotIn(List<String> values) {
            addCriterion("pro_hint not in", values, "proHint");
            return (Criteria) this;
        }

        public Criteria andProHintBetween(String value1, String value2) {
            addCriterion("pro_hint between", value1, value2, "proHint");
            return (Criteria) this;
        }

        public Criteria andProHintNotBetween(String value1, String value2) {
            addCriterion("pro_hint not between", value1, value2, "proHint");
            return (Criteria) this;
        }

        public Criteria andProAuthoridIsNull() {
            addCriterion("pro_authorid is null");
            return (Criteria) this;
        }

        public Criteria andProAuthoridIsNotNull() {
            addCriterion("pro_authorid is not null");
            return (Criteria) this;
        }

        public Criteria andProAuthoridEqualTo(Integer value) {
            addCriterion("pro_authorid =", value, "proAuthorid");
            return (Criteria) this;
        }

        public Criteria andProAuthoridNotEqualTo(Integer value) {
            addCriterion("pro_authorid <>", value, "proAuthorid");
            return (Criteria) this;
        }

        public Criteria andProAuthoridGreaterThan(Integer value) {
            addCriterion("pro_authorid >", value, "proAuthorid");
            return (Criteria) this;
        }

        public Criteria andProAuthoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_authorid >=", value, "proAuthorid");
            return (Criteria) this;
        }

        public Criteria andProAuthoridLessThan(Integer value) {
            addCriterion("pro_authorid <", value, "proAuthorid");
            return (Criteria) this;
        }

        public Criteria andProAuthoridLessThanOrEqualTo(Integer value) {
            addCriterion("pro_authorid <=", value, "proAuthorid");
            return (Criteria) this;
        }

        public Criteria andProAuthoridIn(List<Integer> values) {
            addCriterion("pro_authorid in", values, "proAuthorid");
            return (Criteria) this;
        }

        public Criteria andProAuthoridNotIn(List<Integer> values) {
            addCriterion("pro_authorid not in", values, "proAuthorid");
            return (Criteria) this;
        }

        public Criteria andProAuthoridBetween(Integer value1, Integer value2) {
            addCriterion("pro_authorid between", value1, value2, "proAuthorid");
            return (Criteria) this;
        }

        public Criteria andProAuthoridNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_authorid not between", value1, value2, "proAuthorid");
            return (Criteria) this;
        }

        public Criteria andProAcnumIsNull() {
            addCriterion("pro_acnum is null");
            return (Criteria) this;
        }

        public Criteria andProAcnumIsNotNull() {
            addCriterion("pro_acnum is not null");
            return (Criteria) this;
        }

        public Criteria andProAcnumEqualTo(Integer value) {
            addCriterion("pro_acnum =", value, "proAcnum");
            return (Criteria) this;
        }

        public Criteria andProAcnumNotEqualTo(Integer value) {
            addCriterion("pro_acnum <>", value, "proAcnum");
            return (Criteria) this;
        }

        public Criteria andProAcnumGreaterThan(Integer value) {
            addCriterion("pro_acnum >", value, "proAcnum");
            return (Criteria) this;
        }

        public Criteria andProAcnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_acnum >=", value, "proAcnum");
            return (Criteria) this;
        }

        public Criteria andProAcnumLessThan(Integer value) {
            addCriterion("pro_acnum <", value, "proAcnum");
            return (Criteria) this;
        }

        public Criteria andProAcnumLessThanOrEqualTo(Integer value) {
            addCriterion("pro_acnum <=", value, "proAcnum");
            return (Criteria) this;
        }

        public Criteria andProAcnumIn(List<Integer> values) {
            addCriterion("pro_acnum in", values, "proAcnum");
            return (Criteria) this;
        }

        public Criteria andProAcnumNotIn(List<Integer> values) {
            addCriterion("pro_acnum not in", values, "proAcnum");
            return (Criteria) this;
        }

        public Criteria andProAcnumBetween(Integer value1, Integer value2) {
            addCriterion("pro_acnum between", value1, value2, "proAcnum");
            return (Criteria) this;
        }

        public Criteria andProAcnumNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_acnum not between", value1, value2, "proAcnum");
            return (Criteria) this;
        }

        public Criteria andProTotalnumIsNull() {
            addCriterion("pro_totalnum is null");
            return (Criteria) this;
        }

        public Criteria andProTotalnumIsNotNull() {
            addCriterion("pro_totalnum is not null");
            return (Criteria) this;
        }

        public Criteria andProTotalnumEqualTo(Integer value) {
            addCriterion("pro_totalnum =", value, "proTotalnum");
            return (Criteria) this;
        }

        public Criteria andProTotalnumNotEqualTo(Integer value) {
            addCriterion("pro_totalnum <>", value, "proTotalnum");
            return (Criteria) this;
        }

        public Criteria andProTotalnumGreaterThan(Integer value) {
            addCriterion("pro_totalnum >", value, "proTotalnum");
            return (Criteria) this;
        }

        public Criteria andProTotalnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_totalnum >=", value, "proTotalnum");
            return (Criteria) this;
        }

        public Criteria andProTotalnumLessThan(Integer value) {
            addCriterion("pro_totalnum <", value, "proTotalnum");
            return (Criteria) this;
        }

        public Criteria andProTotalnumLessThanOrEqualTo(Integer value) {
            addCriterion("pro_totalnum <=", value, "proTotalnum");
            return (Criteria) this;
        }

        public Criteria andProTotalnumIn(List<Integer> values) {
            addCriterion("pro_totalnum in", values, "proTotalnum");
            return (Criteria) this;
        }

        public Criteria andProTotalnumNotIn(List<Integer> values) {
            addCriterion("pro_totalnum not in", values, "proTotalnum");
            return (Criteria) this;
        }

        public Criteria andProTotalnumBetween(Integer value1, Integer value2) {
            addCriterion("pro_totalnum between", value1, value2, "proTotalnum");
            return (Criteria) this;
        }

        public Criteria andProTotalnumNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_totalnum not between", value1, value2, "proTotalnum");
            return (Criteria) this;
        }

        public Criteria andProDataIsNull() {
            addCriterion("pro_data is null");
            return (Criteria) this;
        }

        public Criteria andProDataIsNotNull() {
            addCriterion("pro_data is not null");
            return (Criteria) this;
        }

        public Criteria andProDataEqualTo(String value) {
            addCriterion("pro_data =", value, "proData");
            return (Criteria) this;
        }

        public Criteria andProDataNotEqualTo(String value) {
            addCriterion("pro_data <>", value, "proData");
            return (Criteria) this;
        }

        public Criteria andProDataGreaterThan(String value) {
            addCriterion("pro_data >", value, "proData");
            return (Criteria) this;
        }

        public Criteria andProDataGreaterThanOrEqualTo(String value) {
            addCriterion("pro_data >=", value, "proData");
            return (Criteria) this;
        }

        public Criteria andProDataLessThan(String value) {
            addCriterion("pro_data <", value, "proData");
            return (Criteria) this;
        }

        public Criteria andProDataLessThanOrEqualTo(String value) {
            addCriterion("pro_data <=", value, "proData");
            return (Criteria) this;
        }

        public Criteria andProDataLike(String value) {
            addCriterion("pro_data like", value, "proData");
            return (Criteria) this;
        }

        public Criteria andProDataNotLike(String value) {
            addCriterion("pro_data not like", value, "proData");
            return (Criteria) this;
        }

        public Criteria andProDataIn(List<String> values) {
            addCriterion("pro_data in", values, "proData");
            return (Criteria) this;
        }

        public Criteria andProDataNotIn(List<String> values) {
            addCriterion("pro_data not in", values, "proData");
            return (Criteria) this;
        }

        public Criteria andProDataBetween(String value1, String value2) {
            addCriterion("pro_data between", value1, value2, "proData");
            return (Criteria) this;
        }

        public Criteria andProDataNotBetween(String value1, String value2) {
            addCriterion("pro_data not between", value1, value2, "proData");
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