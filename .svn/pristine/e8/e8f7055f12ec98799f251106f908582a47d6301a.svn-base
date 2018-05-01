package cn.opt.po;

import java.util.ArrayList;
import java.util.List;

public class CollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectExample() {
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

        public Criteria andColIdIsNull() {
            addCriterion("col_id is null");
            return (Criteria) this;
        }

        public Criteria andColIdIsNotNull() {
            addCriterion("col_id is not null");
            return (Criteria) this;
        }

        public Criteria andColIdEqualTo(Integer value) {
            addCriterion("col_id =", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotEqualTo(Integer value) {
            addCriterion("col_id <>", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdGreaterThan(Integer value) {
            addCriterion("col_id >", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_id >=", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdLessThan(Integer value) {
            addCriterion("col_id <", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdLessThanOrEqualTo(Integer value) {
            addCriterion("col_id <=", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdIn(List<Integer> values) {
            addCriterion("col_id in", values, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotIn(List<Integer> values) {
            addCriterion("col_id not in", values, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdBetween(Integer value1, Integer value2) {
            addCriterion("col_id between", value1, value2, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotBetween(Integer value1, Integer value2) {
            addCriterion("col_id not between", value1, value2, "colId");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andVioIdIsNull() {
            addCriterion("vio_id is null");
            return (Criteria) this;
        }

        public Criteria andVioIdIsNotNull() {
            addCriterion("vio_id is not null");
            return (Criteria) this;
        }

        public Criteria andVioIdEqualTo(Integer value) {
            addCriterion("vio_id =", value, "vioId");
            return (Criteria) this;
        }

        public Criteria andVioIdNotEqualTo(Integer value) {
            addCriterion("vio_id <>", value, "vioId");
            return (Criteria) this;
        }

        public Criteria andVioIdGreaterThan(Integer value) {
            addCriterion("vio_id >", value, "vioId");
            return (Criteria) this;
        }

        public Criteria andVioIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vio_id >=", value, "vioId");
            return (Criteria) this;
        }

        public Criteria andVioIdLessThan(Integer value) {
            addCriterion("vio_id <", value, "vioId");
            return (Criteria) this;
        }

        public Criteria andVioIdLessThanOrEqualTo(Integer value) {
            addCriterion("vio_id <=", value, "vioId");
            return (Criteria) this;
        }

        public Criteria andVioIdIn(List<Integer> values) {
            addCriterion("vio_id in", values, "vioId");
            return (Criteria) this;
        }

        public Criteria andVioIdNotIn(List<Integer> values) {
            addCriterion("vio_id not in", values, "vioId");
            return (Criteria) this;
        }

        public Criteria andVioIdBetween(Integer value1, Integer value2) {
            addCriterion("vio_id between", value1, value2, "vioId");
            return (Criteria) this;
        }

        public Criteria andVioIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vio_id not between", value1, value2, "vioId");
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

        public Criteria andBrushIdIsNull() {
            addCriterion("brush_id is null");
            return (Criteria) this;
        }

        public Criteria andBrushIdIsNotNull() {
            addCriterion("brush_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrushIdEqualTo(Integer value) {
            addCriterion("brush_id =", value, "brushId");
            return (Criteria) this;
        }

        public Criteria andBrushIdNotEqualTo(Integer value) {
            addCriterion("brush_id <>", value, "brushId");
            return (Criteria) this;
        }

        public Criteria andBrushIdGreaterThan(Integer value) {
            addCriterion("brush_id >", value, "brushId");
            return (Criteria) this;
        }

        public Criteria andBrushIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brush_id >=", value, "brushId");
            return (Criteria) this;
        }

        public Criteria andBrushIdLessThan(Integer value) {
            addCriterion("brush_id <", value, "brushId");
            return (Criteria) this;
        }

        public Criteria andBrushIdLessThanOrEqualTo(Integer value) {
            addCriterion("brush_id <=", value, "brushId");
            return (Criteria) this;
        }

        public Criteria andBrushIdIn(List<Integer> values) {
            addCriterion("brush_id in", values, "brushId");
            return (Criteria) this;
        }

        public Criteria andBrushIdNotIn(List<Integer> values) {
            addCriterion("brush_id not in", values, "brushId");
            return (Criteria) this;
        }

        public Criteria andBrushIdBetween(Integer value1, Integer value2) {
            addCriterion("brush_id between", value1, value2, "brushId");
            return (Criteria) this;
        }

        public Criteria andBrushIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brush_id not between", value1, value2, "brushId");
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

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
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