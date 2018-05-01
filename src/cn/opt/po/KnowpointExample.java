package cn.opt.po;

import java.util.ArrayList;
import java.util.List;

public class KnowpointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KnowpointExample() {
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

        public Criteria andKpContentIsNull() {
            addCriterion("kp_content is null");
            return (Criteria) this;
        }

        public Criteria andKpContentIsNotNull() {
            addCriterion("kp_content is not null");
            return (Criteria) this;
        }

        public Criteria andKpContentEqualTo(String value) {
            addCriterion("kp_content =", value, "kpContent");
            return (Criteria) this;
        }

        public Criteria andKpContentNotEqualTo(String value) {
            addCriterion("kp_content <>", value, "kpContent");
            return (Criteria) this;
        }

        public Criteria andKpContentGreaterThan(String value) {
            addCriterion("kp_content >", value, "kpContent");
            return (Criteria) this;
        }

        public Criteria andKpContentGreaterThanOrEqualTo(String value) {
            addCriterion("kp_content >=", value, "kpContent");
            return (Criteria) this;
        }

        public Criteria andKpContentLessThan(String value) {
            addCriterion("kp_content <", value, "kpContent");
            return (Criteria) this;
        }

        public Criteria andKpContentLessThanOrEqualTo(String value) {
            addCriterion("kp_content <=", value, "kpContent");
            return (Criteria) this;
        }

        public Criteria andKpContentLike(String value) {
            addCriterion("kp_content like", value, "kpContent");
            return (Criteria) this;
        }

        public Criteria andKpContentNotLike(String value) {
            addCriterion("kp_content not like", value, "kpContent");
            return (Criteria) this;
        }

        public Criteria andKpContentIn(List<String> values) {
            addCriterion("kp_content in", values, "kpContent");
            return (Criteria) this;
        }

        public Criteria andKpContentNotIn(List<String> values) {
            addCriterion("kp_content not in", values, "kpContent");
            return (Criteria) this;
        }

        public Criteria andKpContentBetween(String value1, String value2) {
            addCriterion("kp_content between", value1, value2, "kpContent");
            return (Criteria) this;
        }

        public Criteria andKpContentNotBetween(String value1, String value2) {
            addCriterion("kp_content not between", value1, value2, "kpContent");
            return (Criteria) this;
        }

        public Criteria andKpBigtagIsNull() {
            addCriterion("kp_bigtag is null");
            return (Criteria) this;
        }

        public Criteria andKpBigtagIsNotNull() {
            addCriterion("kp_bigtag is not null");
            return (Criteria) this;
        }

        public Criteria andKpBigtagEqualTo(String value) {
            addCriterion("kp_bigtag =", value, "kpBigtag");
            return (Criteria) this;
        }

        public Criteria andKpBigtagNotEqualTo(String value) {
            addCriterion("kp_bigtag <>", value, "kpBigtag");
            return (Criteria) this;
        }

        public Criteria andKpBigtagGreaterThan(String value) {
            addCriterion("kp_bigtag >", value, "kpBigtag");
            return (Criteria) this;
        }

        public Criteria andKpBigtagGreaterThanOrEqualTo(String value) {
            addCriterion("kp_bigtag >=", value, "kpBigtag");
            return (Criteria) this;
        }

        public Criteria andKpBigtagLessThan(String value) {
            addCriterion("kp_bigtag <", value, "kpBigtag");
            return (Criteria) this;
        }

        public Criteria andKpBigtagLessThanOrEqualTo(String value) {
            addCriterion("kp_bigtag <=", value, "kpBigtag");
            return (Criteria) this;
        }

        public Criteria andKpBigtagLike(String value) {
            addCriterion("kp_bigtag like", value, "kpBigtag");
            return (Criteria) this;
        }

        public Criteria andKpBigtagNotLike(String value) {
            addCriterion("kp_bigtag not like", value, "kpBigtag");
            return (Criteria) this;
        }

        public Criteria andKpBigtagIn(List<String> values) {
            addCriterion("kp_bigtag in", values, "kpBigtag");
            return (Criteria) this;
        }

        public Criteria andKpBigtagNotIn(List<String> values) {
            addCriterion("kp_bigtag not in", values, "kpBigtag");
            return (Criteria) this;
        }

        public Criteria andKpBigtagBetween(String value1, String value2) {
            addCriterion("kp_bigtag between", value1, value2, "kpBigtag");
            return (Criteria) this;
        }

        public Criteria andKpBigtagNotBetween(String value1, String value2) {
            addCriterion("kp_bigtag not between", value1, value2, "kpBigtag");
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