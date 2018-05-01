package cn.opt.po;

import java.util.ArrayList;
import java.util.List;

public class ClagradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClagradeExample() {
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

        public Criteria andClaIdIsNull() {
            addCriterion("cla_id is null");
            return (Criteria) this;
        }

        public Criteria andClaIdIsNotNull() {
            addCriterion("cla_id is not null");
            return (Criteria) this;
        }

        public Criteria andClaIdEqualTo(Integer value) {
            addCriterion("cla_id =", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdNotEqualTo(Integer value) {
            addCriterion("cla_id <>", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdGreaterThan(Integer value) {
            addCriterion("cla_id >", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cla_id >=", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdLessThan(Integer value) {
            addCriterion("cla_id <", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdLessThanOrEqualTo(Integer value) {
            addCriterion("cla_id <=", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdIn(List<Integer> values) {
            addCriterion("cla_id in", values, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdNotIn(List<Integer> values) {
            addCriterion("cla_id not in", values, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdBetween(Integer value1, Integer value2) {
            addCriterion("cla_id between", value1, value2, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cla_id not between", value1, value2, "claId");
            return (Criteria) this;
        }

        public Criteria andClaNoIsNull() {
            addCriterion("cla_no is null");
            return (Criteria) this;
        }

        public Criteria andClaNoIsNotNull() {
            addCriterion("cla_no is not null");
            return (Criteria) this;
        }

        public Criteria andClaNoEqualTo(Integer value) {
            addCriterion("cla_no =", value, "claNo");
            return (Criteria) this;
        }

        public Criteria andClaNoNotEqualTo(Integer value) {
            addCriterion("cla_no <>", value, "claNo");
            return (Criteria) this;
        }

        public Criteria andClaNoGreaterThan(Integer value) {
            addCriterion("cla_no >", value, "claNo");
            return (Criteria) this;
        }

        public Criteria andClaNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cla_no >=", value, "claNo");
            return (Criteria) this;
        }

        public Criteria andClaNoLessThan(Integer value) {
            addCriterion("cla_no <", value, "claNo");
            return (Criteria) this;
        }

        public Criteria andClaNoLessThanOrEqualTo(Integer value) {
            addCriterion("cla_no <=", value, "claNo");
            return (Criteria) this;
        }

        public Criteria andClaNoIn(List<Integer> values) {
            addCriterion("cla_no in", values, "claNo");
            return (Criteria) this;
        }

        public Criteria andClaNoNotIn(List<Integer> values) {
            addCriterion("cla_no not in", values, "claNo");
            return (Criteria) this;
        }

        public Criteria andClaNoBetween(Integer value1, Integer value2) {
            addCriterion("cla_no between", value1, value2, "claNo");
            return (Criteria) this;
        }

        public Criteria andClaNoNotBetween(Integer value1, Integer value2) {
            addCriterion("cla_no not between", value1, value2, "claNo");
            return (Criteria) this;
        }

        public Criteria andClaNameIsNull() {
            addCriterion("cla_name is null");
            return (Criteria) this;
        }

        public Criteria andClaNameIsNotNull() {
            addCriterion("cla_name is not null");
            return (Criteria) this;
        }

        public Criteria andClaNameEqualTo(String value) {
            addCriterion("cla_name =", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameNotEqualTo(String value) {
            addCriterion("cla_name <>", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameGreaterThan(String value) {
            addCriterion("cla_name >", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameGreaterThanOrEqualTo(String value) {
            addCriterion("cla_name >=", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameLessThan(String value) {
            addCriterion("cla_name <", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameLessThanOrEqualTo(String value) {
            addCriterion("cla_name <=", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameLike(String value) {
            addCriterion("cla_name like", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameNotLike(String value) {
            addCriterion("cla_name not like", value, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameIn(List<String> values) {
            addCriterion("cla_name in", values, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameNotIn(List<String> values) {
            addCriterion("cla_name not in", values, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameBetween(String value1, String value2) {
            addCriterion("cla_name between", value1, value2, "claName");
            return (Criteria) this;
        }

        public Criteria andClaNameNotBetween(String value1, String value2) {
            addCriterion("cla_name not between", value1, value2, "claName");
            return (Criteria) this;
        }

        public Criteria andClaCapacityIsNull() {
            addCriterion("cla_capacity is null");
            return (Criteria) this;
        }

        public Criteria andClaCapacityIsNotNull() {
            addCriterion("cla_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andClaCapacityEqualTo(Integer value) {
            addCriterion("cla_capacity =", value, "claCapacity");
            return (Criteria) this;
        }

        public Criteria andClaCapacityNotEqualTo(Integer value) {
            addCriterion("cla_capacity <>", value, "claCapacity");
            return (Criteria) this;
        }

        public Criteria andClaCapacityGreaterThan(Integer value) {
            addCriterion("cla_capacity >", value, "claCapacity");
            return (Criteria) this;
        }

        public Criteria andClaCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("cla_capacity >=", value, "claCapacity");
            return (Criteria) this;
        }

        public Criteria andClaCapacityLessThan(Integer value) {
            addCriterion("cla_capacity <", value, "claCapacity");
            return (Criteria) this;
        }

        public Criteria andClaCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("cla_capacity <=", value, "claCapacity");
            return (Criteria) this;
        }

        public Criteria andClaCapacityIn(List<Integer> values) {
            addCriterion("cla_capacity in", values, "claCapacity");
            return (Criteria) this;
        }

        public Criteria andClaCapacityNotIn(List<Integer> values) {
            addCriterion("cla_capacity not in", values, "claCapacity");
            return (Criteria) this;
        }

        public Criteria andClaCapacityBetween(Integer value1, Integer value2) {
            addCriterion("cla_capacity between", value1, value2, "claCapacity");
            return (Criteria) this;
        }

        public Criteria andClaCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("cla_capacity not between", value1, value2, "claCapacity");
            return (Criteria) this;
        }

        public Criteria andClaIntroIsNull() {
            addCriterion("cla_intro is null");
            return (Criteria) this;
        }

        public Criteria andClaIntroIsNotNull() {
            addCriterion("cla_intro is not null");
            return (Criteria) this;
        }

        public Criteria andClaIntroEqualTo(String value) {
            addCriterion("cla_intro =", value, "claIntro");
            return (Criteria) this;
        }

        public Criteria andClaIntroNotEqualTo(String value) {
            addCriterion("cla_intro <>", value, "claIntro");
            return (Criteria) this;
        }

        public Criteria andClaIntroGreaterThan(String value) {
            addCriterion("cla_intro >", value, "claIntro");
            return (Criteria) this;
        }

        public Criteria andClaIntroGreaterThanOrEqualTo(String value) {
            addCriterion("cla_intro >=", value, "claIntro");
            return (Criteria) this;
        }

        public Criteria andClaIntroLessThan(String value) {
            addCriterion("cla_intro <", value, "claIntro");
            return (Criteria) this;
        }

        public Criteria andClaIntroLessThanOrEqualTo(String value) {
            addCriterion("cla_intro <=", value, "claIntro");
            return (Criteria) this;
        }

        public Criteria andClaIntroLike(String value) {
            addCriterion("cla_intro like", value, "claIntro");
            return (Criteria) this;
        }

        public Criteria andClaIntroNotLike(String value) {
            addCriterion("cla_intro not like", value, "claIntro");
            return (Criteria) this;
        }

        public Criteria andClaIntroIn(List<String> values) {
            addCriterion("cla_intro in", values, "claIntro");
            return (Criteria) this;
        }

        public Criteria andClaIntroNotIn(List<String> values) {
            addCriterion("cla_intro not in", values, "claIntro");
            return (Criteria) this;
        }

        public Criteria andClaIntroBetween(String value1, String value2) {
            addCriterion("cla_intro between", value1, value2, "claIntro");
            return (Criteria) this;
        }

        public Criteria andClaIntroNotBetween(String value1, String value2) {
            addCriterion("cla_intro not between", value1, value2, "claIntro");
            return (Criteria) this;
        }

        public Criteria andTeaIdIsNull() {
            addCriterion("tea_id is null");
            return (Criteria) this;
        }

        public Criteria andTeaIdIsNotNull() {
            addCriterion("tea_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeaIdEqualTo(Integer value) {
            addCriterion("tea_id =", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotEqualTo(Integer value) {
            addCriterion("tea_id <>", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThan(Integer value) {
            addCriterion("tea_id >", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_id >=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThan(Integer value) {
            addCriterion("tea_id <", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThanOrEqualTo(Integer value) {
            addCriterion("tea_id <=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdIn(List<Integer> values) {
            addCriterion("tea_id in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotIn(List<Integer> values) {
            addCriterion("tea_id not in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdBetween(Integer value1, Integer value2) {
            addCriterion("tea_id between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_id not between", value1, value2, "teaId");
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