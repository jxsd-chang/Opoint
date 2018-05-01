package cn.opt.po;

import java.util.ArrayList;
import java.util.List;

public class NoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoteExample() {
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

        public Criteria andNoteIdIsNull() {
            addCriterion("note_id is null");
            return (Criteria) this;
        }

        public Criteria andNoteIdIsNotNull() {
            addCriterion("note_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoteIdEqualTo(Integer value) {
            addCriterion("note_id =", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotEqualTo(Integer value) {
            addCriterion("note_id <>", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThan(Integer value) {
            addCriterion("note_id >", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("note_id >=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThan(Integer value) {
            addCriterion("note_id <", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThanOrEqualTo(Integer value) {
            addCriterion("note_id <=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdIn(List<Integer> values) {
            addCriterion("note_id in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotIn(List<Integer> values) {
            addCriterion("note_id not in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdBetween(Integer value1, Integer value2) {
            addCriterion("note_id between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("note_id not between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteUserIsNull() {
            addCriterion("note_user is null");
            return (Criteria) this;
        }

        public Criteria andNoteUserIsNotNull() {
            addCriterion("note_user is not null");
            return (Criteria) this;
        }

        public Criteria andNoteUserEqualTo(Integer value) {
            addCriterion("note_user =", value, "noteUser");
            return (Criteria) this;
        }

        public Criteria andNoteUserNotEqualTo(Integer value) {
            addCriterion("note_user <>", value, "noteUser");
            return (Criteria) this;
        }

        public Criteria andNoteUserGreaterThan(Integer value) {
            addCriterion("note_user >", value, "noteUser");
            return (Criteria) this;
        }

        public Criteria andNoteUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("note_user >=", value, "noteUser");
            return (Criteria) this;
        }

        public Criteria andNoteUserLessThan(Integer value) {
            addCriterion("note_user <", value, "noteUser");
            return (Criteria) this;
        }

        public Criteria andNoteUserLessThanOrEqualTo(Integer value) {
            addCriterion("note_user <=", value, "noteUser");
            return (Criteria) this;
        }

        public Criteria andNoteUserIn(List<Integer> values) {
            addCriterion("note_user in", values, "noteUser");
            return (Criteria) this;
        }

        public Criteria andNoteUserNotIn(List<Integer> values) {
            addCriterion("note_user not in", values, "noteUser");
            return (Criteria) this;
        }

        public Criteria andNoteUserBetween(Integer value1, Integer value2) {
            addCriterion("note_user between", value1, value2, "noteUser");
            return (Criteria) this;
        }

        public Criteria andNoteUserNotBetween(Integer value1, Integer value2) {
            addCriterion("note_user not between", value1, value2, "noteUser");
            return (Criteria) this;
        }

        public Criteria andNoteInfoIsNull() {
            addCriterion("note_info is null");
            return (Criteria) this;
        }

        public Criteria andNoteInfoIsNotNull() {
            addCriterion("note_info is not null");
            return (Criteria) this;
        }

        public Criteria andNoteInfoEqualTo(String value) {
            addCriterion("note_info =", value, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoNotEqualTo(String value) {
            addCriterion("note_info <>", value, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoGreaterThan(String value) {
            addCriterion("note_info >", value, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoGreaterThanOrEqualTo(String value) {
            addCriterion("note_info >=", value, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoLessThan(String value) {
            addCriterion("note_info <", value, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoLessThanOrEqualTo(String value) {
            addCriterion("note_info <=", value, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoLike(String value) {
            addCriterion("note_info like", value, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoNotLike(String value) {
            addCriterion("note_info not like", value, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoIn(List<String> values) {
            addCriterion("note_info in", values, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoNotIn(List<String> values) {
            addCriterion("note_info not in", values, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoBetween(String value1, String value2) {
            addCriterion("note_info between", value1, value2, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoNotBetween(String value1, String value2) {
            addCriterion("note_info not between", value1, value2, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteTimeIsNull() {
            addCriterion("note_time is null");
            return (Criteria) this;
        }

        public Criteria andNoteTimeIsNotNull() {
            addCriterion("note_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTimeEqualTo(String value) {
            addCriterion("note_time =", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeNotEqualTo(String value) {
            addCriterion("note_time <>", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeGreaterThan(String value) {
            addCriterion("note_time >", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("note_time >=", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeLessThan(String value) {
            addCriterion("note_time <", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeLessThanOrEqualTo(String value) {
            addCriterion("note_time <=", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeLike(String value) {
            addCriterion("note_time like", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeNotLike(String value) {
            addCriterion("note_time not like", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeIn(List<String> values) {
            addCriterion("note_time in", values, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeNotIn(List<String> values) {
            addCriterion("note_time not in", values, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeBetween(String value1, String value2) {
            addCriterion("note_time between", value1, value2, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeNotBetween(String value1, String value2) {
            addCriterion("note_time not between", value1, value2, "noteTime");
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