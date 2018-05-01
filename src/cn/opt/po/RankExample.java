package cn.opt.po;

import java.util.ArrayList;
import java.util.List;

public class RankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RankExample() {
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

        public Criteria andRankIdIsNull() {
            addCriterion("rank_id is null");
            return (Criteria) this;
        }

        public Criteria andRankIdIsNotNull() {
            addCriterion("rank_id is not null");
            return (Criteria) this;
        }

        public Criteria andRankIdEqualTo(Integer value) {
            addCriterion("rank_id =", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotEqualTo(Integer value) {
            addCriterion("rank_id <>", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdGreaterThan(Integer value) {
            addCriterion("rank_id >", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_id >=", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdLessThan(Integer value) {
            addCriterion("rank_id <", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdLessThanOrEqualTo(Integer value) {
            addCriterion("rank_id <=", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdIn(List<Integer> values) {
            addCriterion("rank_id in", values, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotIn(List<Integer> values) {
            addCriterion("rank_id not in", values, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdBetween(Integer value1, Integer value2) {
            addCriterion("rank_id between", value1, value2, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_id not between", value1, value2, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankKninfoidIsNull() {
            addCriterion("rank_kninfoId is null");
            return (Criteria) this;
        }

        public Criteria andRankKninfoidIsNotNull() {
            addCriterion("rank_kninfoId is not null");
            return (Criteria) this;
        }

        public Criteria andRankKninfoidEqualTo(Integer value) {
            addCriterion("rank_kninfoId =", value, "rankKninfoid");
            return (Criteria) this;
        }

        public Criteria andRankKninfoidNotEqualTo(Integer value) {
            addCriterion("rank_kninfoId <>", value, "rankKninfoid");
            return (Criteria) this;
        }

        public Criteria andRankKninfoidGreaterThan(Integer value) {
            addCriterion("rank_kninfoId >", value, "rankKninfoid");
            return (Criteria) this;
        }

        public Criteria andRankKninfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_kninfoId >=", value, "rankKninfoid");
            return (Criteria) this;
        }

        public Criteria andRankKninfoidLessThan(Integer value) {
            addCriterion("rank_kninfoId <", value, "rankKninfoid");
            return (Criteria) this;
        }

        public Criteria andRankKninfoidLessThanOrEqualTo(Integer value) {
            addCriterion("rank_kninfoId <=", value, "rankKninfoid");
            return (Criteria) this;
        }

        public Criteria andRankKninfoidIn(List<Integer> values) {
            addCriterion("rank_kninfoId in", values, "rankKninfoid");
            return (Criteria) this;
        }

        public Criteria andRankKninfoidNotIn(List<Integer> values) {
            addCriterion("rank_kninfoId not in", values, "rankKninfoid");
            return (Criteria) this;
        }

        public Criteria andRankKninfoidBetween(Integer value1, Integer value2) {
            addCriterion("rank_kninfoId between", value1, value2, "rankKninfoid");
            return (Criteria) this;
        }

        public Criteria andRankKninfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_kninfoId not between", value1, value2, "rankKninfoid");
            return (Criteria) this;
        }

        public Criteria andRankVideoidIsNull() {
            addCriterion("rank_videoId is null");
            return (Criteria) this;
        }

        public Criteria andRankVideoidIsNotNull() {
            addCriterion("rank_videoId is not null");
            return (Criteria) this;
        }

        public Criteria andRankVideoidEqualTo(Integer value) {
            addCriterion("rank_videoId =", value, "rankVideoid");
            return (Criteria) this;
        }

        public Criteria andRankVideoidNotEqualTo(Integer value) {
            addCriterion("rank_videoId <>", value, "rankVideoid");
            return (Criteria) this;
        }

        public Criteria andRankVideoidGreaterThan(Integer value) {
            addCriterion("rank_videoId >", value, "rankVideoid");
            return (Criteria) this;
        }

        public Criteria andRankVideoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_videoId >=", value, "rankVideoid");
            return (Criteria) this;
        }

        public Criteria andRankVideoidLessThan(Integer value) {
            addCriterion("rank_videoId <", value, "rankVideoid");
            return (Criteria) this;
        }

        public Criteria andRankVideoidLessThanOrEqualTo(Integer value) {
            addCriterion("rank_videoId <=", value, "rankVideoid");
            return (Criteria) this;
        }

        public Criteria andRankVideoidIn(List<Integer> values) {
            addCriterion("rank_videoId in", values, "rankVideoid");
            return (Criteria) this;
        }

        public Criteria andRankVideoidNotIn(List<Integer> values) {
            addCriterion("rank_videoId not in", values, "rankVideoid");
            return (Criteria) this;
        }

        public Criteria andRankVideoidBetween(Integer value1, Integer value2) {
            addCriterion("rank_videoId between", value1, value2, "rankVideoid");
            return (Criteria) this;
        }

        public Criteria andRankVideoidNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_videoId not between", value1, value2, "rankVideoid");
            return (Criteria) this;
        }

        public Criteria andRankBrushidIsNull() {
            addCriterion("rank_brushId is null");
            return (Criteria) this;
        }

        public Criteria andRankBrushidIsNotNull() {
            addCriterion("rank_brushId is not null");
            return (Criteria) this;
        }

        public Criteria andRankBrushidEqualTo(Integer value) {
            addCriterion("rank_brushId =", value, "rankBrushid");
            return (Criteria) this;
        }

        public Criteria andRankBrushidNotEqualTo(Integer value) {
            addCriterion("rank_brushId <>", value, "rankBrushid");
            return (Criteria) this;
        }

        public Criteria andRankBrushidGreaterThan(Integer value) {
            addCriterion("rank_brushId >", value, "rankBrushid");
            return (Criteria) this;
        }

        public Criteria andRankBrushidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_brushId >=", value, "rankBrushid");
            return (Criteria) this;
        }

        public Criteria andRankBrushidLessThan(Integer value) {
            addCriterion("rank_brushId <", value, "rankBrushid");
            return (Criteria) this;
        }

        public Criteria andRankBrushidLessThanOrEqualTo(Integer value) {
            addCriterion("rank_brushId <=", value, "rankBrushid");
            return (Criteria) this;
        }

        public Criteria andRankBrushidIn(List<Integer> values) {
            addCriterion("rank_brushId in", values, "rankBrushid");
            return (Criteria) this;
        }

        public Criteria andRankBrushidNotIn(List<Integer> values) {
            addCriterion("rank_brushId not in", values, "rankBrushid");
            return (Criteria) this;
        }

        public Criteria andRankBrushidBetween(Integer value1, Integer value2) {
            addCriterion("rank_brushId between", value1, value2, "rankBrushid");
            return (Criteria) this;
        }

        public Criteria andRankBrushidNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_brushId not between", value1, value2, "rankBrushid");
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