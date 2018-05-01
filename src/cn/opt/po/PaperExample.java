package cn.opt.po;

import java.util.ArrayList;
import java.util.List;

public class PaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperExample() {
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

        public Criteria andPaIdIsNull() {
            addCriterion("pa_id is null");
            return (Criteria) this;
        }

        public Criteria andPaIdIsNotNull() {
            addCriterion("pa_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaIdEqualTo(Integer value) {
            addCriterion("pa_id =", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdNotEqualTo(Integer value) {
            addCriterion("pa_id <>", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdGreaterThan(Integer value) {
            addCriterion("pa_id >", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pa_id >=", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdLessThan(Integer value) {
            addCriterion("pa_id <", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdLessThanOrEqualTo(Integer value) {
            addCriterion("pa_id <=", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdIn(List<Integer> values) {
            addCriterion("pa_id in", values, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdNotIn(List<Integer> values) {
            addCriterion("pa_id not in", values, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdBetween(Integer value1, Integer value2) {
            addCriterion("pa_id between", value1, value2, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pa_id not between", value1, value2, "paId");
            return (Criteria) this;
        }

        public Criteria andCouIdIsNull() {
            addCriterion("cou_id is null");
            return (Criteria) this;
        }

        public Criteria andCouIdIsNotNull() {
            addCriterion("cou_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouIdEqualTo(Integer value) {
            addCriterion("cou_id =", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdNotEqualTo(Integer value) {
            addCriterion("cou_id <>", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdGreaterThan(Integer value) {
            addCriterion("cou_id >", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cou_id >=", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdLessThan(Integer value) {
            addCriterion("cou_id <", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdLessThanOrEqualTo(Integer value) {
            addCriterion("cou_id <=", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdIn(List<Integer> values) {
            addCriterion("cou_id in", values, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdNotIn(List<Integer> values) {
            addCriterion("cou_id not in", values, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdBetween(Integer value1, Integer value2) {
            addCriterion("cou_id between", value1, value2, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cou_id not between", value1, value2, "couId");
            return (Criteria) this;
        }

        public Criteria andPaNameIsNull() {
            addCriterion("pa_name is null");
            return (Criteria) this;
        }

        public Criteria andPaNameIsNotNull() {
            addCriterion("pa_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaNameEqualTo(String value) {
            addCriterion("pa_name =", value, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameNotEqualTo(String value) {
            addCriterion("pa_name <>", value, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameGreaterThan(String value) {
            addCriterion("pa_name >", value, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameGreaterThanOrEqualTo(String value) {
            addCriterion("pa_name >=", value, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameLessThan(String value) {
            addCriterion("pa_name <", value, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameLessThanOrEqualTo(String value) {
            addCriterion("pa_name <=", value, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameLike(String value) {
            addCriterion("pa_name like", value, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameNotLike(String value) {
            addCriterion("pa_name not like", value, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameIn(List<String> values) {
            addCriterion("pa_name in", values, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameNotIn(List<String> values) {
            addCriterion("pa_name not in", values, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameBetween(String value1, String value2) {
            addCriterion("pa_name between", value1, value2, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameNotBetween(String value1, String value2) {
            addCriterion("pa_name not between", value1, value2, "paName");
            return (Criteria) this;
        }

        public Criteria andPaJifenIsNull() {
            addCriterion("pa_jifen is null");
            return (Criteria) this;
        }

        public Criteria andPaJifenIsNotNull() {
            addCriterion("pa_jifen is not null");
            return (Criteria) this;
        }

        public Criteria andPaJifenEqualTo(Integer value) {
            addCriterion("pa_jifen =", value, "paJifen");
            return (Criteria) this;
        }

        public Criteria andPaJifenNotEqualTo(Integer value) {
            addCriterion("pa_jifen <>", value, "paJifen");
            return (Criteria) this;
        }

        public Criteria andPaJifenGreaterThan(Integer value) {
            addCriterion("pa_jifen >", value, "paJifen");
            return (Criteria) this;
        }

        public Criteria andPaJifenGreaterThanOrEqualTo(Integer value) {
            addCriterion("pa_jifen >=", value, "paJifen");
            return (Criteria) this;
        }

        public Criteria andPaJifenLessThan(Integer value) {
            addCriterion("pa_jifen <", value, "paJifen");
            return (Criteria) this;
        }

        public Criteria andPaJifenLessThanOrEqualTo(Integer value) {
            addCriterion("pa_jifen <=", value, "paJifen");
            return (Criteria) this;
        }

        public Criteria andPaJifenIn(List<Integer> values) {
            addCriterion("pa_jifen in", values, "paJifen");
            return (Criteria) this;
        }

        public Criteria andPaJifenNotIn(List<Integer> values) {
            addCriterion("pa_jifen not in", values, "paJifen");
            return (Criteria) this;
        }

        public Criteria andPaJifenBetween(Integer value1, Integer value2) {
            addCriterion("pa_jifen between", value1, value2, "paJifen");
            return (Criteria) this;
        }

        public Criteria andPaJifenNotBetween(Integer value1, Integer value2) {
            addCriterion("pa_jifen not between", value1, value2, "paJifen");
            return (Criteria) this;
        }

        public Criteria andPaNanduIsNull() {
            addCriterion("pa_nandu is null");
            return (Criteria) this;
        }

        public Criteria andPaNanduIsNotNull() {
            addCriterion("pa_nandu is not null");
            return (Criteria) this;
        }

        public Criteria andPaNanduEqualTo(String value) {
            addCriterion("pa_nandu =", value, "paNandu");
            return (Criteria) this;
        }

        public Criteria andPaNanduNotEqualTo(String value) {
            addCriterion("pa_nandu <>", value, "paNandu");
            return (Criteria) this;
        }

        public Criteria andPaNanduGreaterThan(String value) {
            addCriterion("pa_nandu >", value, "paNandu");
            return (Criteria) this;
        }

        public Criteria andPaNanduGreaterThanOrEqualTo(String value) {
            addCriterion("pa_nandu >=", value, "paNandu");
            return (Criteria) this;
        }

        public Criteria andPaNanduLessThan(String value) {
            addCriterion("pa_nandu <", value, "paNandu");
            return (Criteria) this;
        }

        public Criteria andPaNanduLessThanOrEqualTo(String value) {
            addCriterion("pa_nandu <=", value, "paNandu");
            return (Criteria) this;
        }

        public Criteria andPaNanduLike(String value) {
            addCriterion("pa_nandu like", value, "paNandu");
            return (Criteria) this;
        }

        public Criteria andPaNanduNotLike(String value) {
            addCriterion("pa_nandu not like", value, "paNandu");
            return (Criteria) this;
        }

        public Criteria andPaNanduIn(List<String> values) {
            addCriterion("pa_nandu in", values, "paNandu");
            return (Criteria) this;
        }

        public Criteria andPaNanduNotIn(List<String> values) {
            addCriterion("pa_nandu not in", values, "paNandu");
            return (Criteria) this;
        }

        public Criteria andPaNanduBetween(String value1, String value2) {
            addCriterion("pa_nandu between", value1, value2, "paNandu");
            return (Criteria) this;
        }

        public Criteria andPaNanduNotBetween(String value1, String value2) {
            addCriterion("pa_nandu not between", value1, value2, "paNandu");
            return (Criteria) this;
        }

        public Criteria andPaCountIsNull() {
            addCriterion("pa_count is null");
            return (Criteria) this;
        }

        public Criteria andPaCountIsNotNull() {
            addCriterion("pa_count is not null");
            return (Criteria) this;
        }

        public Criteria andPaCountEqualTo(Integer value) {
            addCriterion("pa_count =", value, "paCount");
            return (Criteria) this;
        }

        public Criteria andPaCountNotEqualTo(Integer value) {
            addCriterion("pa_count <>", value, "paCount");
            return (Criteria) this;
        }

        public Criteria andPaCountGreaterThan(Integer value) {
            addCriterion("pa_count >", value, "paCount");
            return (Criteria) this;
        }

        public Criteria andPaCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pa_count >=", value, "paCount");
            return (Criteria) this;
        }

        public Criteria andPaCountLessThan(Integer value) {
            addCriterion("pa_count <", value, "paCount");
            return (Criteria) this;
        }

        public Criteria andPaCountLessThanOrEqualTo(Integer value) {
            addCriterion("pa_count <=", value, "paCount");
            return (Criteria) this;
        }

        public Criteria andPaCountIn(List<Integer> values) {
            addCriterion("pa_count in", values, "paCount");
            return (Criteria) this;
        }

        public Criteria andPaCountNotIn(List<Integer> values) {
            addCriterion("pa_count not in", values, "paCount");
            return (Criteria) this;
        }

        public Criteria andPaCountBetween(Integer value1, Integer value2) {
            addCriterion("pa_count between", value1, value2, "paCount");
            return (Criteria) this;
        }

        public Criteria andPaCountNotBetween(Integer value1, Integer value2) {
            addCriterion("pa_count not between", value1, value2, "paCount");
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