package com.example.web22;

import java.util.ArrayList;
import java.util.List;

public class DwyqsdDoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    public DwyqsdDoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
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
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andZbIsNull() {
            addCriterion("zb is null");
            return (Criteria) this;
        }

        public Criteria andZbIsNotNull() {
            addCriterion("zb is not null");
            return (Criteria) this;
        }

        public Criteria andZbEqualTo(String value) {
            addCriterion("zb =", value, "zb");
            return (Criteria) this;
        }

        public Criteria andZbNotEqualTo(String value) {
            addCriterion("zb <>", value, "zb");
            return (Criteria) this;
        }

        public Criteria andZbGreaterThan(String value) {
            addCriterion("zb >", value, "zb");
            return (Criteria) this;
        }

        public Criteria andZbGreaterThanOrEqualTo(String value) {
            addCriterion("zb >=", value, "zb");
            return (Criteria) this;
        }

        public Criteria andZbLessThan(String value) {
            addCriterion("zb <", value, "zb");
            return (Criteria) this;
        }

        public Criteria andZbLessThanOrEqualTo(String value) {
            addCriterion("zb <=", value, "zb");
            return (Criteria) this;
        }

        public Criteria andZbLike(String value) {
            addCriterion("zb like", value, "zb");
            return (Criteria) this;
        }

        public Criteria andZbNotLike(String value) {
            addCriterion("zb not like", value, "zb");
            return (Criteria) this;
        }

        public Criteria andZbIn(List<String> values) {
            addCriterion("zb in", values, "zb");
            return (Criteria) this;
        }

        public Criteria andZbNotIn(List<String> values) {
            addCriterion("zb not in", values, "zb");
            return (Criteria) this;
        }

        public Criteria andZbBetween(String value1, String value2) {
            addCriterion("zb between", value1, value2, "zb");
            return (Criteria) this;
        }

        public Criteria andZbNotBetween(String value1, String value2) {
            addCriterion("zb not between", value1, value2, "zb");
            return (Criteria) this;
        }

        public Criteria andWzIsNull() {
            addCriterion("wz is null");
            return (Criteria) this;
        }

        public Criteria andWzIsNotNull() {
            addCriterion("wz is not null");
            return (Criteria) this;
        }

        public Criteria andWzEqualTo(String value) {
            addCriterion("wz =", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotEqualTo(String value) {
            addCriterion("wz <>", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzGreaterThan(String value) {
            addCriterion("wz >", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzGreaterThanOrEqualTo(String value) {
            addCriterion("wz >=", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzLessThan(String value) {
            addCriterion("wz <", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzLessThanOrEqualTo(String value) {
            addCriterion("wz <=", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzLike(String value) {
            addCriterion("wz like", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotLike(String value) {
            addCriterion("wz not like", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzIn(List<String> values) {
            addCriterion("wz in", values, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotIn(List<String> values) {
            addCriterion("wz not in", values, "wz");
            return (Criteria) this;
        }

        public Criteria andWzBetween(String value1, String value2) {
            addCriterion("wz between", value1, value2, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotBetween(String value1, String value2) {
            addCriterion("wz not between", value1, value2, "wz");
            return (Criteria) this;
        }

        public Criteria andRyIsNull() {
            addCriterion("ry is null");
            return (Criteria) this;
        }

        public Criteria andRyIsNotNull() {
            addCriterion("ry is not null");
            return (Criteria) this;
        }

        public Criteria andRyEqualTo(String value) {
            addCriterion("ry =", value, "ry");
            return (Criteria) this;
        }

        public Criteria andRyNotEqualTo(String value) {
            addCriterion("ry <>", value, "ry");
            return (Criteria) this;
        }

        public Criteria andRyGreaterThan(String value) {
            addCriterion("ry >", value, "ry");
            return (Criteria) this;
        }

        public Criteria andRyGreaterThanOrEqualTo(String value) {
            addCriterion("ry >=", value, "ry");
            return (Criteria) this;
        }

        public Criteria andRyLessThan(String value) {
            addCriterion("ry <", value, "ry");
            return (Criteria) this;
        }

        public Criteria andRyLessThanOrEqualTo(String value) {
            addCriterion("ry <=", value, "ry");
            return (Criteria) this;
        }

        public Criteria andRyLike(String value) {
            addCriterion("ry like", value, "ry");
            return (Criteria) this;
        }

        public Criteria andRyNotLike(String value) {
            addCriterion("ry not like", value, "ry");
            return (Criteria) this;
        }

        public Criteria andRyIn(List<String> values) {
            addCriterion("ry in", values, "ry");
            return (Criteria) this;
        }

        public Criteria andRyNotIn(List<String> values) {
            addCriterion("ry not in", values, "ry");
            return (Criteria) this;
        }

        public Criteria andRyBetween(String value1, String value2) {
            addCriterion("ry between", value1, value2, "ry");
            return (Criteria) this;
        }

        public Criteria andRyNotBetween(String value1, String value2) {
            addCriterion("ry not between", value1, value2, "ry");
            return (Criteria) this;
        }

        public Criteria andXlIsNull() {
            addCriterion("xl is null");
            return (Criteria) this;
        }

        public Criteria andXlIsNotNull() {
            addCriterion("xl is not null");
            return (Criteria) this;
        }

        public Criteria andXlEqualTo(String value) {
            addCriterion("xl =", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotEqualTo(String value) {
            addCriterion("xl <>", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlGreaterThan(String value) {
            addCriterion("xl >", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlGreaterThanOrEqualTo(String value) {
            addCriterion("xl >=", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLessThan(String value) {
            addCriterion("xl <", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLessThanOrEqualTo(String value) {
            addCriterion("xl <=", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLike(String value) {
            addCriterion("xl like", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotLike(String value) {
            addCriterion("xl not like", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlIn(List<String> values) {
            addCriterion("xl in", values, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotIn(List<String> values) {
            addCriterion("xl not in", values, "xl");
            return (Criteria) this;
        }

        public Criteria andXlBetween(String value1, String value2) {
            addCriterion("xl between", value1, value2, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotBetween(String value1, String value2) {
            addCriterion("xl not between", value1, value2, "xl");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dwyqsd
     *
     * @mbg.generated do_not_delete_during_merge Sat Oct 16 15:25:13 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dwyqsd
     *
     * @mbg.generated Sat Oct 16 15:25:13 CST 2021
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