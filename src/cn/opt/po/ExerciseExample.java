package cn.opt.po;

import java.util.ArrayList;
import java.util.List;

public class ExerciseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExerciseExample() {
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

        public Criteria andExerIdIsNull() {
            addCriterion("exer_id is null");
            return (Criteria) this;
        }

        public Criteria andExerIdIsNotNull() {
            addCriterion("exer_id is not null");
            return (Criteria) this;
        }

        public Criteria andExerIdEqualTo(Integer value) {
            addCriterion("exer_id =", value, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdNotEqualTo(Integer value) {
            addCriterion("exer_id <>", value, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdGreaterThan(Integer value) {
            addCriterion("exer_id >", value, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exer_id >=", value, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdLessThan(Integer value) {
            addCriterion("exer_id <", value, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdLessThanOrEqualTo(Integer value) {
            addCriterion("exer_id <=", value, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdIn(List<Integer> values) {
            addCriterion("exer_id in", values, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdNotIn(List<Integer> values) {
            addCriterion("exer_id not in", values, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdBetween(Integer value1, Integer value2) {
            addCriterion("exer_id between", value1, value2, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exer_id not between", value1, value2, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerTitleIsNull() {
            addCriterion("exer_title is null");
            return (Criteria) this;
        }

        public Criteria andExerTitleIsNotNull() {
            addCriterion("exer_title is not null");
            return (Criteria) this;
        }

        public Criteria andExerTitleEqualTo(String value) {
            addCriterion("exer_title =", value, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleNotEqualTo(String value) {
            addCriterion("exer_title <>", value, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleGreaterThan(String value) {
            addCriterion("exer_title >", value, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleGreaterThanOrEqualTo(String value) {
            addCriterion("exer_title >=", value, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleLessThan(String value) {
            addCriterion("exer_title <", value, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleLessThanOrEqualTo(String value) {
            addCriterion("exer_title <=", value, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleLike(String value) {
            addCriterion("exer_title like", value, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleNotLike(String value) {
            addCriterion("exer_title not like", value, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleIn(List<String> values) {
            addCriterion("exer_title in", values, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleNotIn(List<String> values) {
            addCriterion("exer_title not in", values, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleBetween(String value1, String value2) {
            addCriterion("exer_title between", value1, value2, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleNotBetween(String value1, String value2) {
            addCriterion("exer_title not between", value1, value2, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerParseIsNull() {
            addCriterion("exer_parse is null");
            return (Criteria) this;
        }

        public Criteria andExerParseIsNotNull() {
            addCriterion("exer_parse is not null");
            return (Criteria) this;
        }

        public Criteria andExerParseEqualTo(String value) {
            addCriterion("exer_parse =", value, "exerParse");
            return (Criteria) this;
        }

        public Criteria andExerParseNotEqualTo(String value) {
            addCriterion("exer_parse <>", value, "exerParse");
            return (Criteria) this;
        }

        public Criteria andExerParseGreaterThan(String value) {
            addCriterion("exer_parse >", value, "exerParse");
            return (Criteria) this;
        }

        public Criteria andExerParseGreaterThanOrEqualTo(String value) {
            addCriterion("exer_parse >=", value, "exerParse");
            return (Criteria) this;
        }

        public Criteria andExerParseLessThan(String value) {
            addCriterion("exer_parse <", value, "exerParse");
            return (Criteria) this;
        }

        public Criteria andExerParseLessThanOrEqualTo(String value) {
            addCriterion("exer_parse <=", value, "exerParse");
            return (Criteria) this;
        }

        public Criteria andExerParseLike(String value) {
            addCriterion("exer_parse like", value, "exerParse");
            return (Criteria) this;
        }

        public Criteria andExerParseNotLike(String value) {
            addCriterion("exer_parse not like", value, "exerParse");
            return (Criteria) this;
        }

        public Criteria andExerParseIn(List<String> values) {
            addCriterion("exer_parse in", values, "exerParse");
            return (Criteria) this;
        }

        public Criteria andExerParseNotIn(List<String> values) {
            addCriterion("exer_parse not in", values, "exerParse");
            return (Criteria) this;
        }

        public Criteria andExerParseBetween(String value1, String value2) {
            addCriterion("exer_parse between", value1, value2, "exerParse");
            return (Criteria) this;
        }

        public Criteria andExerParseNotBetween(String value1, String value2) {
            addCriterion("exer_parse not between", value1, value2, "exerParse");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(Integer value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(Integer value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(Integer value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(Integer value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(Integer value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(Integer value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<Integer> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<Integer> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(Integer value1, Integer value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(Integer value1, Integer value2) {
            addCriterion("icon not between", value1, value2, "icon");
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