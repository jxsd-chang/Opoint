package cn.opt.po;

import java.util.ArrayList;
import java.util.List;

public class KninfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KninfoExample() {
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

        public Criteria andKpIdIsNull() {
            addCriterion("kp_id is null");
            return (Criteria) this;
        }

        public Criteria andKpIdIsNotNull() {
            addCriterion("kp_id is not null");
            return (Criteria) this;
        }

        public Criteria andKpIdEqualTo(Integer value) {
            addCriterion("kp_id =", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdNotEqualTo(Integer value) {
            addCriterion("kp_id <>", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdGreaterThan(Integer value) {
            addCriterion("kp_id >", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kp_id >=", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdLessThan(Integer value) {
            addCriterion("kp_id <", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdLessThanOrEqualTo(Integer value) {
            addCriterion("kp_id <=", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdIn(List<Integer> values) {
            addCriterion("kp_id in", values, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdNotIn(List<Integer> values) {
            addCriterion("kp_id not in", values, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdBetween(Integer value1, Integer value2) {
            addCriterion("kp_id between", value1, value2, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kp_id not between", value1, value2, "kpId");
            return (Criteria) this;
        }

        public Criteria andKninfoContentIsNull() {
            addCriterion("kninfo_content is null");
            return (Criteria) this;
        }

        public Criteria andKninfoContentIsNotNull() {
            addCriterion("kninfo_content is not null");
            return (Criteria) this;
        }

        public Criteria andKninfoContentEqualTo(String value) {
            addCriterion("kninfo_content =", value, "kninfoContent");
            return (Criteria) this;
        }

        public Criteria andKninfoContentNotEqualTo(String value) {
            addCriterion("kninfo_content <>", value, "kninfoContent");
            return (Criteria) this;
        }

        public Criteria andKninfoContentGreaterThan(String value) {
            addCriterion("kninfo_content >", value, "kninfoContent");
            return (Criteria) this;
        }

        public Criteria andKninfoContentGreaterThanOrEqualTo(String value) {
            addCriterion("kninfo_content >=", value, "kninfoContent");
            return (Criteria) this;
        }

        public Criteria andKninfoContentLessThan(String value) {
            addCriterion("kninfo_content <", value, "kninfoContent");
            return (Criteria) this;
        }

        public Criteria andKninfoContentLessThanOrEqualTo(String value) {
            addCriterion("kninfo_content <=", value, "kninfoContent");
            return (Criteria) this;
        }

        public Criteria andKninfoContentLike(String value) {
            addCriterion("kninfo_content like", value, "kninfoContent");
            return (Criteria) this;
        }

        public Criteria andKninfoContentNotLike(String value) {
            addCriterion("kninfo_content not like", value, "kninfoContent");
            return (Criteria) this;
        }

        public Criteria andKninfoContentIn(List<String> values) {
            addCriterion("kninfo_content in", values, "kninfoContent");
            return (Criteria) this;
        }

        public Criteria andKninfoContentNotIn(List<String> values) {
            addCriterion("kninfo_content not in", values, "kninfoContent");
            return (Criteria) this;
        }

        public Criteria andKninfoContentBetween(String value1, String value2) {
            addCriterion("kninfo_content between", value1, value2, "kninfoContent");
            return (Criteria) this;
        }

        public Criteria andKninfoContentNotBetween(String value1, String value2) {
            addCriterion("kninfo_content not between", value1, value2, "kninfoContent");
            return (Criteria) this;
        }

        public Criteria andKninfoTitleIsNull() {
            addCriterion("kninfo_title is null");
            return (Criteria) this;
        }

        public Criteria andKninfoTitleIsNotNull() {
            addCriterion("kninfo_title is not null");
            return (Criteria) this;
        }

        public Criteria andKninfoTitleEqualTo(String value) {
            addCriterion("kninfo_title =", value, "kninfoTitle");
            return (Criteria) this;
        }

        public Criteria andKninfoTitleNotEqualTo(String value) {
            addCriterion("kninfo_title <>", value, "kninfoTitle");
            return (Criteria) this;
        }

        public Criteria andKninfoTitleGreaterThan(String value) {
            addCriterion("kninfo_title >", value, "kninfoTitle");
            return (Criteria) this;
        }

        public Criteria andKninfoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("kninfo_title >=", value, "kninfoTitle");
            return (Criteria) this;
        }

        public Criteria andKninfoTitleLessThan(String value) {
            addCriterion("kninfo_title <", value, "kninfoTitle");
            return (Criteria) this;
        }

        public Criteria andKninfoTitleLessThanOrEqualTo(String value) {
            addCriterion("kninfo_title <=", value, "kninfoTitle");
            return (Criteria) this;
        }

        public Criteria andKninfoTitleLike(String value) {
            addCriterion("kninfo_title like", value, "kninfoTitle");
            return (Criteria) this;
        }

        public Criteria andKninfoTitleNotLike(String value) {
            addCriterion("kninfo_title not like", value, "kninfoTitle");
            return (Criteria) this;
        }

        public Criteria andKninfoTitleIn(List<String> values) {
            addCriterion("kninfo_title in", values, "kninfoTitle");
            return (Criteria) this;
        }

        public Criteria andKninfoTitleNotIn(List<String> values) {
            addCriterion("kninfo_title not in", values, "kninfoTitle");
            return (Criteria) this;
        }

        public Criteria andKninfoTitleBetween(String value1, String value2) {
            addCriterion("kninfo_title between", value1, value2, "kninfoTitle");
            return (Criteria) this;
        }

        public Criteria andKninfoTitleNotBetween(String value1, String value2) {
            addCriterion("kninfo_title not between", value1, value2, "kninfoTitle");
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