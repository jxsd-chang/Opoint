package cn.opt.po;

import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommIdIsNull() {
            addCriterion("comm_id is null");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNotNull() {
            addCriterion("comm_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommIdEqualTo(Integer value) {
            addCriterion("comm_id =", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotEqualTo(Integer value) {
            addCriterion("comm_id <>", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThan(Integer value) {
            addCriterion("comm_id >", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comm_id >=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThan(Integer value) {
            addCriterion("comm_id <", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThanOrEqualTo(Integer value) {
            addCriterion("comm_id <=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdIn(List<Integer> values) {
            addCriterion("comm_id in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotIn(List<Integer> values) {
            addCriterion("comm_id not in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdBetween(Integer value1, Integer value2) {
            addCriterion("comm_id between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comm_id not between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andCommUserIsNull() {
            addCriterion("comm_user is null");
            return (Criteria) this;
        }

        public Criteria andCommUserIsNotNull() {
            addCriterion("comm_user is not null");
            return (Criteria) this;
        }

        public Criteria andCommUserEqualTo(Integer value) {
            addCriterion("comm_user =", value, "commUser");
            return (Criteria) this;
        }

        public Criteria andCommUserNotEqualTo(Integer value) {
            addCriterion("comm_user <>", value, "commUser");
            return (Criteria) this;
        }

        public Criteria andCommUserGreaterThan(Integer value) {
            addCriterion("comm_user >", value, "commUser");
            return (Criteria) this;
        }

        public Criteria andCommUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("comm_user >=", value, "commUser");
            return (Criteria) this;
        }

        public Criteria andCommUserLessThan(Integer value) {
            addCriterion("comm_user <", value, "commUser");
            return (Criteria) this;
        }

        public Criteria andCommUserLessThanOrEqualTo(Integer value) {
            addCriterion("comm_user <=", value, "commUser");
            return (Criteria) this;
        }

        public Criteria andCommUserIn(List<Integer> values) {
            addCriterion("comm_user in", values, "commUser");
            return (Criteria) this;
        }

        public Criteria andCommUserNotIn(List<Integer> values) {
            addCriterion("comm_user not in", values, "commUser");
            return (Criteria) this;
        }

        public Criteria andCommUserBetween(Integer value1, Integer value2) {
            addCriterion("comm_user between", value1, value2, "commUser");
            return (Criteria) this;
        }

        public Criteria andCommUserNotBetween(Integer value1, Integer value2) {
            addCriterion("comm_user not between", value1, value2, "commUser");
            return (Criteria) this;
        }

        public Criteria andCommUserTeaIsNull() {
            addCriterion("comm_user_tea is null");
            return (Criteria) this;
        }

        public Criteria andCommUserTeaIsNotNull() {
            addCriterion("comm_user_tea is not null");
            return (Criteria) this;
        }

        public Criteria andCommUserTeaEqualTo(Integer value) {
            addCriterion("comm_user_tea =", value, "commUserTea");
            return (Criteria) this;
        }

        public Criteria andCommUserTeaNotEqualTo(Integer value) {
            addCriterion("comm_user_tea <>", value, "commUserTea");
            return (Criteria) this;
        }

        public Criteria andCommUserTeaGreaterThan(Integer value) {
            addCriterion("comm_user_tea >", value, "commUserTea");
            return (Criteria) this;
        }

        public Criteria andCommUserTeaGreaterThanOrEqualTo(Integer value) {
            addCriterion("comm_user_tea >=", value, "commUserTea");
            return (Criteria) this;
        }

        public Criteria andCommUserTeaLessThan(Integer value) {
            addCriterion("comm_user_tea <", value, "commUserTea");
            return (Criteria) this;
        }

        public Criteria andCommUserTeaLessThanOrEqualTo(Integer value) {
            addCriterion("comm_user_tea <=", value, "commUserTea");
            return (Criteria) this;
        }

        public Criteria andCommUserTeaIn(List<Integer> values) {
            addCriterion("comm_user_tea in", values, "commUserTea");
            return (Criteria) this;
        }

        public Criteria andCommUserTeaNotIn(List<Integer> values) {
            addCriterion("comm_user_tea not in", values, "commUserTea");
            return (Criteria) this;
        }

        public Criteria andCommUserTeaBetween(Integer value1, Integer value2) {
            addCriterion("comm_user_tea between", value1, value2, "commUserTea");
            return (Criteria) this;
        }

        public Criteria andCommUserTeaNotBetween(Integer value1, Integer value2) {
            addCriterion("comm_user_tea not between", value1, value2, "commUserTea");
            return (Criteria) this;
        }

        public Criteria andCommInfoIsNull() {
            addCriterion("comm_info is null");
            return (Criteria) this;
        }

        public Criteria andCommInfoIsNotNull() {
            addCriterion("comm_info is not null");
            return (Criteria) this;
        }

        public Criteria andCommInfoEqualTo(String value) {
            addCriterion("comm_info =", value, "commInfo");
            return (Criteria) this;
        }

        public Criteria andCommInfoNotEqualTo(String value) {
            addCriterion("comm_info <>", value, "commInfo");
            return (Criteria) this;
        }

        public Criteria andCommInfoGreaterThan(String value) {
            addCriterion("comm_info >", value, "commInfo");
            return (Criteria) this;
        }

        public Criteria andCommInfoGreaterThanOrEqualTo(String value) {
            addCriterion("comm_info >=", value, "commInfo");
            return (Criteria) this;
        }

        public Criteria andCommInfoLessThan(String value) {
            addCriterion("comm_info <", value, "commInfo");
            return (Criteria) this;
        }

        public Criteria andCommInfoLessThanOrEqualTo(String value) {
            addCriterion("comm_info <=", value, "commInfo");
            return (Criteria) this;
        }

        public Criteria andCommInfoLike(String value) {
            addCriterion("comm_info like", value, "commInfo");
            return (Criteria) this;
        }

        public Criteria andCommInfoNotLike(String value) {
            addCriterion("comm_info not like", value, "commInfo");
            return (Criteria) this;
        }

        public Criteria andCommInfoIn(List<String> values) {
            addCriterion("comm_info in", values, "commInfo");
            return (Criteria) this;
        }

        public Criteria andCommInfoNotIn(List<String> values) {
            addCriterion("comm_info not in", values, "commInfo");
            return (Criteria) this;
        }

        public Criteria andCommInfoBetween(String value1, String value2) {
            addCriterion("comm_info between", value1, value2, "commInfo");
            return (Criteria) this;
        }

        public Criteria andCommInfoNotBetween(String value1, String value2) {
            addCriterion("comm_info not between", value1, value2, "commInfo");
            return (Criteria) this;
        }

        public Criteria andCommTimeIsNull() {
            addCriterion("comm_time is null");
            return (Criteria) this;
        }

        public Criteria andCommTimeIsNotNull() {
            addCriterion("comm_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommTimeEqualTo(String value) {
            addCriterion("comm_time =", value, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeNotEqualTo(String value) {
            addCriterion("comm_time <>", value, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeGreaterThan(String value) {
            addCriterion("comm_time >", value, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeGreaterThanOrEqualTo(String value) {
            addCriterion("comm_time >=", value, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeLessThan(String value) {
            addCriterion("comm_time <", value, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeLessThanOrEqualTo(String value) {
            addCriterion("comm_time <=", value, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeLike(String value) {
            addCriterion("comm_time like", value, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeNotLike(String value) {
            addCriterion("comm_time not like", value, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeIn(List<String> values) {
            addCriterion("comm_time in", values, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeNotIn(List<String> values) {
            addCriterion("comm_time not in", values, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeBetween(String value1, String value2) {
            addCriterion("comm_time between", value1, value2, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeNotBetween(String value1, String value2) {
            addCriterion("comm_time not between", value1, value2, "commTime");
            return (Criteria) this;
        }

        public Criteria andKninfoIdIsNull() {
            addCriterion("kninfo_id is null");
            return (Criteria) this;
        }

        public Criteria andKninfoIdIsNotNull() {
            addCriterion("kninfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andKninfoIdEqualTo(Integer value) {
            addCriterion("kninfo_id =", value, "kninfoId");
            return (Criteria) this;
        }

        public Criteria andKninfoIdNotEqualTo(Integer value) {
            addCriterion("kninfo_id <>", value, "kninfoId");
            return (Criteria) this;
        }

        public Criteria andKninfoIdGreaterThan(Integer value) {
            addCriterion("kninfo_id >", value, "kninfoId");
            return (Criteria) this;
        }

        public Criteria andKninfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kninfo_id >=", value, "kninfoId");
            return (Criteria) this;
        }

        public Criteria andKninfoIdLessThan(Integer value) {
            addCriterion("kninfo_id <", value, "kninfoId");
            return (Criteria) this;
        }

        public Criteria andKninfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("kninfo_id <=", value, "kninfoId");
            return (Criteria) this;
        }

        public Criteria andKninfoIdIn(List<Integer> values) {
            addCriterion("kninfo_id in", values, "kninfoId");
            return (Criteria) this;
        }

        public Criteria andKninfoIdNotIn(List<Integer> values) {
            addCriterion("kninfo_id not in", values, "kninfoId");
            return (Criteria) this;
        }

        public Criteria andKninfoIdBetween(Integer value1, Integer value2) {
            addCriterion("kninfo_id between", value1, value2, "kninfoId");
            return (Criteria) this;
        }

        public Criteria andKninfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kninfo_id not between", value1, value2, "kninfoId");
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