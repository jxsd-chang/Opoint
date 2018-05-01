package cn.opt.po;

import java.util.ArrayList;
import java.util.List;

public class CompetitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompetitionExample() {
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

        public Criteria andCompIdIsNull() {
            addCriterion("comp_id is null");
            return (Criteria) this;
        }

        public Criteria andCompIdIsNotNull() {
            addCriterion("comp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompIdEqualTo(Integer value) {
            addCriterion("comp_id =", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotEqualTo(Integer value) {
            addCriterion("comp_id <>", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdGreaterThan(Integer value) {
            addCriterion("comp_id >", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comp_id >=", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdLessThan(Integer value) {
            addCriterion("comp_id <", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdLessThanOrEqualTo(Integer value) {
            addCriterion("comp_id <=", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdIn(List<Integer> values) {
            addCriterion("comp_id in", values, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotIn(List<Integer> values) {
            addCriterion("comp_id not in", values, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdBetween(Integer value1, Integer value2) {
            addCriterion("comp_id between", value1, value2, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comp_id not between", value1, value2, "compId");
            return (Criteria) this;
        }

        public Criteria andCompTitleIsNull() {
            addCriterion("comp_title is null");
            return (Criteria) this;
        }

        public Criteria andCompTitleIsNotNull() {
            addCriterion("comp_title is not null");
            return (Criteria) this;
        }

        public Criteria andCompTitleEqualTo(String value) {
            addCriterion("comp_title =", value, "compTitle");
            return (Criteria) this;
        }

        public Criteria andCompTitleNotEqualTo(String value) {
            addCriterion("comp_title <>", value, "compTitle");
            return (Criteria) this;
        }

        public Criteria andCompTitleGreaterThan(String value) {
            addCriterion("comp_title >", value, "compTitle");
            return (Criteria) this;
        }

        public Criteria andCompTitleGreaterThanOrEqualTo(String value) {
            addCriterion("comp_title >=", value, "compTitle");
            return (Criteria) this;
        }

        public Criteria andCompTitleLessThan(String value) {
            addCriterion("comp_title <", value, "compTitle");
            return (Criteria) this;
        }

        public Criteria andCompTitleLessThanOrEqualTo(String value) {
            addCriterion("comp_title <=", value, "compTitle");
            return (Criteria) this;
        }

        public Criteria andCompTitleLike(String value) {
            addCriterion("comp_title like", value, "compTitle");
            return (Criteria) this;
        }

        public Criteria andCompTitleNotLike(String value) {
            addCriterion("comp_title not like", value, "compTitle");
            return (Criteria) this;
        }

        public Criteria andCompTitleIn(List<String> values) {
            addCriterion("comp_title in", values, "compTitle");
            return (Criteria) this;
        }

        public Criteria andCompTitleNotIn(List<String> values) {
            addCriterion("comp_title not in", values, "compTitle");
            return (Criteria) this;
        }

        public Criteria andCompTitleBetween(String value1, String value2) {
            addCriterion("comp_title between", value1, value2, "compTitle");
            return (Criteria) this;
        }

        public Criteria andCompTitleNotBetween(String value1, String value2) {
            addCriterion("comp_title not between", value1, value2, "compTitle");
            return (Criteria) this;
        }

        public Criteria andCompParseIsNull() {
            addCriterion("comp_parse is null");
            return (Criteria) this;
        }

        public Criteria andCompParseIsNotNull() {
            addCriterion("comp_parse is not null");
            return (Criteria) this;
        }

        public Criteria andCompParseEqualTo(String value) {
            addCriterion("comp_parse =", value, "compParse");
            return (Criteria) this;
        }

        public Criteria andCompParseNotEqualTo(String value) {
            addCriterion("comp_parse <>", value, "compParse");
            return (Criteria) this;
        }

        public Criteria andCompParseGreaterThan(String value) {
            addCriterion("comp_parse >", value, "compParse");
            return (Criteria) this;
        }

        public Criteria andCompParseGreaterThanOrEqualTo(String value) {
            addCriterion("comp_parse >=", value, "compParse");
            return (Criteria) this;
        }

        public Criteria andCompParseLessThan(String value) {
            addCriterion("comp_parse <", value, "compParse");
            return (Criteria) this;
        }

        public Criteria andCompParseLessThanOrEqualTo(String value) {
            addCriterion("comp_parse <=", value, "compParse");
            return (Criteria) this;
        }

        public Criteria andCompParseLike(String value) {
            addCriterion("comp_parse like", value, "compParse");
            return (Criteria) this;
        }

        public Criteria andCompParseNotLike(String value) {
            addCriterion("comp_parse not like", value, "compParse");
            return (Criteria) this;
        }

        public Criteria andCompParseIn(List<String> values) {
            addCriterion("comp_parse in", values, "compParse");
            return (Criteria) this;
        }

        public Criteria andCompParseNotIn(List<String> values) {
            addCriterion("comp_parse not in", values, "compParse");
            return (Criteria) this;
        }

        public Criteria andCompParseBetween(String value1, String value2) {
            addCriterion("comp_parse between", value1, value2, "compParse");
            return (Criteria) this;
        }

        public Criteria andCompParseNotBetween(String value1, String value2) {
            addCriterion("comp_parse not between", value1, value2, "compParse");
            return (Criteria) this;
        }

        public Criteria andCompPaidIsNull() {
            addCriterion("comp_paid is null");
            return (Criteria) this;
        }

        public Criteria andCompPaidIsNotNull() {
            addCriterion("comp_paid is not null");
            return (Criteria) this;
        }

        public Criteria andCompPaidEqualTo(Integer value) {
            addCriterion("comp_paid =", value, "compPaid");
            return (Criteria) this;
        }

        public Criteria andCompPaidNotEqualTo(Integer value) {
            addCriterion("comp_paid <>", value, "compPaid");
            return (Criteria) this;
        }

        public Criteria andCompPaidGreaterThan(Integer value) {
            addCriterion("comp_paid >", value, "compPaid");
            return (Criteria) this;
        }

        public Criteria andCompPaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("comp_paid >=", value, "compPaid");
            return (Criteria) this;
        }

        public Criteria andCompPaidLessThan(Integer value) {
            addCriterion("comp_paid <", value, "compPaid");
            return (Criteria) this;
        }

        public Criteria andCompPaidLessThanOrEqualTo(Integer value) {
            addCriterion("comp_paid <=", value, "compPaid");
            return (Criteria) this;
        }

        public Criteria andCompPaidIn(List<Integer> values) {
            addCriterion("comp_paid in", values, "compPaid");
            return (Criteria) this;
        }

        public Criteria andCompPaidNotIn(List<Integer> values) {
            addCriterion("comp_paid not in", values, "compPaid");
            return (Criteria) this;
        }

        public Criteria andCompPaidBetween(Integer value1, Integer value2) {
            addCriterion("comp_paid between", value1, value2, "compPaid");
            return (Criteria) this;
        }

        public Criteria andCompPaidNotBetween(Integer value1, Integer value2) {
            addCriterion("comp_paid not between", value1, value2, "compPaid");
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