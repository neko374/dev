package com.example.web22;

import java.util.ArrayList;
import java.util.List;

public class UserXxcxDoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_xxcx
     *
     * @mbg.generated Thu Oct 14 20:18:43 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_xxcx
     *
     * @mbg.generated Thu Oct 14 20:18:43 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_xxcx
     *
     * @mbg.generated Thu Oct 14 20:18:43 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_xxcx
     *
     * @mbg.generated Thu Oct 14 20:18:43 CST 2021
     */
    public UserXxcxDoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_xxcx
     *
     * @mbg.generated Thu Oct 14 20:18:43 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_xxcx
     *
     * @mbg.generated Thu Oct 14 20:18:43 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_xxcx
     *
     * @mbg.generated Thu Oct 14 20:18:43 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_xxcx
     *
     * @mbg.generated Thu Oct 14 20:18:43 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_xxcx
     *
     * @mbg.generated Thu Oct 14 20:18:43 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_xxcx
     *
     * @mbg.generated Thu Oct 14 20:18:43 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_xxcx
     *
     * @mbg.generated Thu Oct 14 20:18:43 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_xxcx
     *
     * @mbg.generated Thu Oct 14 20:18:43 CST 2021
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
     * This method corresponds to the database table user_xxcx
     *
     * @mbg.generated Thu Oct 14 20:18:43 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_xxcx
     *
     * @mbg.generated Thu Oct 14 20:18:43 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_xxcx
     *
     * @mbg.generated Thu Oct 14 20:18:43 CST 2021
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

        public Criteria andTeamnameIsNull() {
            addCriterion("teamName is null");
            return (Criteria) this;
        }

        public Criteria andTeamnameIsNotNull() {
            addCriterion("teamName is not null");
            return (Criteria) this;
        }

        public Criteria andTeamnameEqualTo(String value) {
            addCriterion("teamName =", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotEqualTo(String value) {
            addCriterion("teamName <>", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThan(String value) {
            addCriterion("teamName >", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThanOrEqualTo(String value) {
            addCriterion("teamName >=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThan(String value) {
            addCriterion("teamName <", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThanOrEqualTo(String value) {
            addCriterion("teamName <=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLike(String value) {
            addCriterion("teamName like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotLike(String value) {
            addCriterion("teamName not like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameIn(List<String> values) {
            addCriterion("teamName in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotIn(List<String> values) {
            addCriterion("teamName not in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameBetween(String value1, String value2) {
            addCriterion("teamName between", value1, value2, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotBetween(String value1, String value2) {
            addCriterion("teamName not between", value1, value2, "teamname");
            return (Criteria) this;
        }

        public Criteria andSosIsNull() {
            addCriterion("sos is null");
            return (Criteria) this;
        }

        public Criteria andSosIsNotNull() {
            addCriterion("sos is not null");
            return (Criteria) this;
        }

        public Criteria andSosEqualTo(String value) {
            addCriterion("sos =", value, "sos");
            return (Criteria) this;
        }

        public Criteria andSosNotEqualTo(String value) {
            addCriterion("sos <>", value, "sos");
            return (Criteria) this;
        }

        public Criteria andSosGreaterThan(String value) {
            addCriterion("sos >", value, "sos");
            return (Criteria) this;
        }

        public Criteria andSosGreaterThanOrEqualTo(String value) {
            addCriterion("sos >=", value, "sos");
            return (Criteria) this;
        }

        public Criteria andSosLessThan(String value) {
            addCriterion("sos <", value, "sos");
            return (Criteria) this;
        }

        public Criteria andSosLessThanOrEqualTo(String value) {
            addCriterion("sos <=", value, "sos");
            return (Criteria) this;
        }

        public Criteria andSosLike(String value) {
            addCriterion("sos like", value, "sos");
            return (Criteria) this;
        }

        public Criteria andSosNotLike(String value) {
            addCriterion("sos not like", value, "sos");
            return (Criteria) this;
        }

        public Criteria andSosIn(List<String> values) {
            addCriterion("sos in", values, "sos");
            return (Criteria) this;
        }

        public Criteria andSosNotIn(List<String> values) {
            addCriterion("sos not in", values, "sos");
            return (Criteria) this;
        }

        public Criteria andSosBetween(String value1, String value2) {
            addCriterion("sos between", value1, value2, "sos");
            return (Criteria) this;
        }

        public Criteria andSosNotBetween(String value1, String value2) {
            addCriterion("sos not between", value1, value2, "sos");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andBigequipIsNull() {
            addCriterion("bigEquip is null");
            return (Criteria) this;
        }

        public Criteria andBigequipIsNotNull() {
            addCriterion("bigEquip is not null");
            return (Criteria) this;
        }

        public Criteria andBigequipEqualTo(String value) {
            addCriterion("bigEquip =", value, "bigequip");
            return (Criteria) this;
        }

        public Criteria andBigequipNotEqualTo(String value) {
            addCriterion("bigEquip <>", value, "bigequip");
            return (Criteria) this;
        }

        public Criteria andBigequipGreaterThan(String value) {
            addCriterion("bigEquip >", value, "bigequip");
            return (Criteria) this;
        }

        public Criteria andBigequipGreaterThanOrEqualTo(String value) {
            addCriterion("bigEquip >=", value, "bigequip");
            return (Criteria) this;
        }

        public Criteria andBigequipLessThan(String value) {
            addCriterion("bigEquip <", value, "bigequip");
            return (Criteria) this;
        }

        public Criteria andBigequipLessThanOrEqualTo(String value) {
            addCriterion("bigEquip <=", value, "bigequip");
            return (Criteria) this;
        }

        public Criteria andBigequipLike(String value) {
            addCriterion("bigEquip like", value, "bigequip");
            return (Criteria) this;
        }

        public Criteria andBigequipNotLike(String value) {
            addCriterion("bigEquip not like", value, "bigequip");
            return (Criteria) this;
        }

        public Criteria andBigequipIn(List<String> values) {
            addCriterion("bigEquip in", values, "bigequip");
            return (Criteria) this;
        }

        public Criteria andBigequipNotIn(List<String> values) {
            addCriterion("bigEquip not in", values, "bigequip");
            return (Criteria) this;
        }

        public Criteria andBigequipBetween(String value1, String value2) {
            addCriterion("bigEquip between", value1, value2, "bigequip");
            return (Criteria) this;
        }

        public Criteria andBigequipNotBetween(String value1, String value2) {
            addCriterion("bigEquip not between", value1, value2, "bigequip");
            return (Criteria) this;
        }

        public Criteria andAbilityIsNull() {
            addCriterion("ability is null");
            return (Criteria) this;
        }

        public Criteria andAbilityIsNotNull() {
            addCriterion("ability is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityEqualTo(String value) {
            addCriterion("ability =", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotEqualTo(String value) {
            addCriterion("ability <>", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityGreaterThan(String value) {
            addCriterion("ability >", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityGreaterThanOrEqualTo(String value) {
            addCriterion("ability >=", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityLessThan(String value) {
            addCriterion("ability <", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityLessThanOrEqualTo(String value) {
            addCriterion("ability <=", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityLike(String value) {
            addCriterion("ability like", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotLike(String value) {
            addCriterion("ability not like", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityIn(List<String> values) {
            addCriterion("ability in", values, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotIn(List<String> values) {
            addCriterion("ability not in", values, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityBetween(String value1, String value2) {
            addCriterion("ability between", value1, value2, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotBetween(String value1, String value2) {
            addCriterion("ability not between", value1, value2, "ability");
            return (Criteria) this;
        }

        public Criteria andSmallequipIsNull() {
            addCriterion("smallEquip is null");
            return (Criteria) this;
        }

        public Criteria andSmallequipIsNotNull() {
            addCriterion("smallEquip is not null");
            return (Criteria) this;
        }

        public Criteria andSmallequipEqualTo(String value) {
            addCriterion("smallEquip =", value, "smallequip");
            return (Criteria) this;
        }

        public Criteria andSmallequipNotEqualTo(String value) {
            addCriterion("smallEquip <>", value, "smallequip");
            return (Criteria) this;
        }

        public Criteria andSmallequipGreaterThan(String value) {
            addCriterion("smallEquip >", value, "smallequip");
            return (Criteria) this;
        }

        public Criteria andSmallequipGreaterThanOrEqualTo(String value) {
            addCriterion("smallEquip >=", value, "smallequip");
            return (Criteria) this;
        }

        public Criteria andSmallequipLessThan(String value) {
            addCriterion("smallEquip <", value, "smallequip");
            return (Criteria) this;
        }

        public Criteria andSmallequipLessThanOrEqualTo(String value) {
            addCriterion("smallEquip <=", value, "smallequip");
            return (Criteria) this;
        }

        public Criteria andSmallequipLike(String value) {
            addCriterion("smallEquip like", value, "smallequip");
            return (Criteria) this;
        }

        public Criteria andSmallequipNotLike(String value) {
            addCriterion("smallEquip not like", value, "smallequip");
            return (Criteria) this;
        }

        public Criteria andSmallequipIn(List<String> values) {
            addCriterion("smallEquip in", values, "smallequip");
            return (Criteria) this;
        }

        public Criteria andSmallequipNotIn(List<String> values) {
            addCriterion("smallEquip not in", values, "smallequip");
            return (Criteria) this;
        }

        public Criteria andSmallequipBetween(String value1, String value2) {
            addCriterion("smallEquip between", value1, value2, "smallequip");
            return (Criteria) this;
        }

        public Criteria andSmallequipNotBetween(String value1, String value2) {
            addCriterion("smallEquip not between", value1, value2, "smallequip");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_xxcx
     *
     * @mbg.generated do_not_delete_during_merge Thu Oct 14 20:18:43 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_xxcx
     *
     * @mbg.generated Thu Oct 14 20:18:43 CST 2021
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