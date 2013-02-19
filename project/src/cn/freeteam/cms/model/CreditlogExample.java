package cn.freeteam.cms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.freeteam.base.BaseExample;

public class CreditlogExample extends BaseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecms_creditlog
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecms_creditlog
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecms_creditlog
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_creditlog
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public CreditlogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_creditlog
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_creditlog
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_creditlog
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_creditlog
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_creditlog
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_creditlog
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_creditlog
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_creditlog
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_creditlog
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_creditlog
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecms_creditlog
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNull() {
            addCriterion("memberid is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(String value) {
            addCriterion("memberid =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(String value) {
            addCriterion("memberid <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(String value) {
            addCriterion("memberid >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(String value) {
            addCriterion("memberid >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(String value) {
            addCriterion("memberid <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(String value) {
            addCriterion("memberid <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLike(String value) {
            addCriterion("memberid like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotLike(String value) {
            addCriterion("memberid not like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<String> values) {
            addCriterion("memberid in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<String> values) {
            addCriterion("memberid not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(String value1, String value2) {
            addCriterion("memberid between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(String value1, String value2) {
            addCriterion("memberid not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andCreditruleidIsNull() {
            addCriterion("creditruleid is null");
            return (Criteria) this;
        }

        public Criteria andCreditruleidIsNotNull() {
            addCriterion("creditruleid is not null");
            return (Criteria) this;
        }

        public Criteria andCreditruleidEqualTo(String value) {
            addCriterion("creditruleid =", value, "creditruleid");
            return (Criteria) this;
        }

        public Criteria andCreditruleidNotEqualTo(String value) {
            addCriterion("creditruleid <>", value, "creditruleid");
            return (Criteria) this;
        }

        public Criteria andCreditruleidGreaterThan(String value) {
            addCriterion("creditruleid >", value, "creditruleid");
            return (Criteria) this;
        }

        public Criteria andCreditruleidGreaterThanOrEqualTo(String value) {
            addCriterion("creditruleid >=", value, "creditruleid");
            return (Criteria) this;
        }

        public Criteria andCreditruleidLessThan(String value) {
            addCriterion("creditruleid <", value, "creditruleid");
            return (Criteria) this;
        }

        public Criteria andCreditruleidLessThanOrEqualTo(String value) {
            addCriterion("creditruleid <=", value, "creditruleid");
            return (Criteria) this;
        }

        public Criteria andCreditruleidLike(String value) {
            addCriterion("creditruleid like", value, "creditruleid");
            return (Criteria) this;
        }

        public Criteria andCreditruleidNotLike(String value) {
            addCriterion("creditruleid not like", value, "creditruleid");
            return (Criteria) this;
        }

        public Criteria andCreditruleidIn(List<String> values) {
            addCriterion("creditruleid in", values, "creditruleid");
            return (Criteria) this;
        }

        public Criteria andCreditruleidNotIn(List<String> values) {
            addCriterion("creditruleid not in", values, "creditruleid");
            return (Criteria) this;
        }

        public Criteria andCreditruleidBetween(String value1, String value2) {
            addCriterion("creditruleid between", value1, value2, "creditruleid");
            return (Criteria) this;
        }

        public Criteria andCreditruleidNotBetween(String value1, String value2) {
            addCriterion("creditruleid not between", value1, value2, "creditruleid");
            return (Criteria) this;
        }

        public Criteria andRewardtypeIsNull() {
            addCriterion("rewardtype is null");
            return (Criteria) this;
        }

        public Criteria andRewardtypeIsNotNull() {
            addCriterion("rewardtype is not null");
            return (Criteria) this;
        }

        public Criteria andRewardtypeEqualTo(Integer value) {
            addCriterion("rewardtype =", value, "rewardtype");
            return (Criteria) this;
        }

        public Criteria andSql(String value) {
            addCriterion( value);
            return (Criteria) this;
        }
        public Criteria andRewardtypeNotEqualTo(Integer value) {
            addCriterion("rewardtype <>", value, "rewardtype");
            return (Criteria) this;
        }

        public Criteria andRewardtypeGreaterThan(Integer value) {
            addCriterion("rewardtype >", value, "rewardtype");
            return (Criteria) this;
        }

        public Criteria andRewardtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rewardtype >=", value, "rewardtype");
            return (Criteria) this;
        }

        public Criteria andRewardtypeLessThan(Integer value) {
            addCriterion("rewardtype <", value, "rewardtype");
            return (Criteria) this;
        }

        public Criteria andRewardtypeLessThanOrEqualTo(Integer value) {
            addCriterion("rewardtype <=", value, "rewardtype");
            return (Criteria) this;
        }

        public Criteria andRewardtypeIn(List<Integer> values) {
            addCriterion("rewardtype in", values, "rewardtype");
            return (Criteria) this;
        }

        public Criteria andRewardtypeNotIn(List<Integer> values) {
            addCriterion("rewardtype not in", values, "rewardtype");
            return (Criteria) this;
        }

        public Criteria andRewardtypeBetween(Integer value1, Integer value2) {
            addCriterion("rewardtype between", value1, value2, "rewardtype");
            return (Criteria) this;
        }

        public Criteria andRewardtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("rewardtype not between", value1, value2, "rewardtype");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Integer value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Integer value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Integer value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Integer value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Integer value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Integer> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Integer> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Integer value1, Integer value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNull() {
            addCriterion("experience is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNotNull() {
            addCriterion("experience is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceEqualTo(Integer value) {
            addCriterion("experience =", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotEqualTo(Integer value) {
            addCriterion("experience <>", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThan(Integer value) {
            addCriterion("experience >", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThanOrEqualTo(Integer value) {
            addCriterion("experience >=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThan(Integer value) {
            addCriterion("experience <", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThanOrEqualTo(Integer value) {
            addCriterion("experience <=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceIn(List<Integer> values) {
            addCriterion("experience in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotIn(List<Integer> values) {
            addCriterion("experience not in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceBetween(Integer value1, Integer value2) {
            addCriterion("experience between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotBetween(Integer value1, Integer value2) {
            addCriterion("experience not between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andCredittimeIsNull() {
            addCriterion("credittime is null");
            return (Criteria) this;
        }

        public Criteria andCredittimeIsNotNull() {
            addCriterion("credittime is not null");
            return (Criteria) this;
        }

        public Criteria andCredittimeEqualTo(Date value) {
            addCriterion("credittime =", value, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeNotEqualTo(Date value) {
            addCriterion("credittime <>", value, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeGreaterThan(Date value) {
            addCriterion("credittime >", value, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("credittime >=", value, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeLessThan(Date value) {
            addCriterion("credittime <", value, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeLessThanOrEqualTo(Date value) {
            addCriterion("credittime <=", value, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeIn(List<Date> values) {
            addCriterion("credittime in", values, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeNotIn(List<Date> values) {
            addCriterion("credittime not in", values, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeBetween(Date value1, Date value2) {
            addCriterion("credittime between", value1, value2, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeNotBetween(Date value1, Date value2) {
            addCriterion("credittime not between", value1, value2, "credittime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecms_creditlog
     *
     * @mbggenerated do_not_delete_during_merge Mon Feb 04 21:34:40 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecms_creditlog
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
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