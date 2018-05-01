package cn.opt.po;

import java.util.ArrayList;
import java.util.List;

public class ExamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamExample() {
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

        public Criteria andExIdIsNull() {
            addCriterion("ex_id is null");
            return (Criteria) this;
        }

        public Criteria andExIdIsNotNull() {
            addCriterion("ex_id is not null");
            return (Criteria) this;
        }

        public Criteria andExIdEqualTo(String value) {
            addCriterion("ex_id =", value, "exId");
            return (Criteria) this;
        }

        public Criteria andExIdNotEqualTo(String value) {
            addCriterion("ex_id <>", value, "exId");
            return (Criteria) this;
        }

        public Criteria andExIdGreaterThan(String value) {
            addCriterion("ex_id >", value, "exId");
            return (Criteria) this;
        }

        public Criteria andExIdGreaterThanOrEqualTo(String value) {
            addCriterion("ex_id >=", value, "exId");
            return (Criteria) this;
        }

        public Criteria andExIdLessThan(String value) {
            addCriterion("ex_id <", value, "exId");
            return (Criteria) this;
        }

        public Criteria andExIdLessThanOrEqualTo(String value) {
            addCriterion("ex_id <=", value, "exId");
            return (Criteria) this;
        }

        public Criteria andExIdLike(String value) {
            addCriterion("ex_id like", value, "exId");
            return (Criteria) this;
        }

        public Criteria andExIdNotLike(String value) {
            addCriterion("ex_id not like", value, "exId");
            return (Criteria) this;
        }

        public Criteria andExIdIn(List<String> values) {
            addCriterion("ex_id in", values, "exId");
            return (Criteria) this;
        }

        public Criteria andExIdNotIn(List<String> values) {
            addCriterion("ex_id not in", values, "exId");
            return (Criteria) this;
        }

        public Criteria andExIdBetween(String value1, String value2) {
            addCriterion("ex_id between", value1, value2, "exId");
            return (Criteria) this;
        }

        public Criteria andExIdNotBetween(String value1, String value2) {
            addCriterion("ex_id not between", value1, value2, "exId");
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

        public Criteria andExOptAnsIsNull() {
            addCriterion("ex_opt_ans is null");
            return (Criteria) this;
        }

        public Criteria andExOptAnsIsNotNull() {
            addCriterion("ex_opt_ans is not null");
            return (Criteria) this;
        }

        public Criteria andExOptAnsEqualTo(String value) {
            addCriterion("ex_opt_ans =", value, "exOptAns");
            return (Criteria) this;
        }

        public Criteria andExOptAnsNotEqualTo(String value) {
            addCriterion("ex_opt_ans <>", value, "exOptAns");
            return (Criteria) this;
        }

        public Criteria andExOptAnsGreaterThan(String value) {
            addCriterion("ex_opt_ans >", value, "exOptAns");
            return (Criteria) this;
        }

        public Criteria andExOptAnsGreaterThanOrEqualTo(String value) {
            addCriterion("ex_opt_ans >=", value, "exOptAns");
            return (Criteria) this;
        }

        public Criteria andExOptAnsLessThan(String value) {
            addCriterion("ex_opt_ans <", value, "exOptAns");
            return (Criteria) this;
        }

        public Criteria andExOptAnsLessThanOrEqualTo(String value) {
            addCriterion("ex_opt_ans <=", value, "exOptAns");
            return (Criteria) this;
        }

        public Criteria andExOptAnsLike(String value) {
            addCriterion("ex_opt_ans like", value, "exOptAns");
            return (Criteria) this;
        }

        public Criteria andExOptAnsNotLike(String value) {
            addCriterion("ex_opt_ans not like", value, "exOptAns");
            return (Criteria) this;
        }

        public Criteria andExOptAnsIn(List<String> values) {
            addCriterion("ex_opt_ans in", values, "exOptAns");
            return (Criteria) this;
        }

        public Criteria andExOptAnsNotIn(List<String> values) {
            addCriterion("ex_opt_ans not in", values, "exOptAns");
            return (Criteria) this;
        }

        public Criteria andExOptAnsBetween(String value1, String value2) {
            addCriterion("ex_opt_ans between", value1, value2, "exOptAns");
            return (Criteria) this;
        }

        public Criteria andExOptAnsNotBetween(String value1, String value2) {
            addCriterion("ex_opt_ans not between", value1, value2, "exOptAns");
            return (Criteria) this;
        }

        public Criteria andExDatiAnsIsNull() {
            addCriterion("ex_dati_ans is null");
            return (Criteria) this;
        }

        public Criteria andExDatiAnsIsNotNull() {
            addCriterion("ex_dati_ans is not null");
            return (Criteria) this;
        }

        public Criteria andExDatiAnsEqualTo(String value) {
            addCriterion("ex_dati_ans =", value, "exDatiAns");
            return (Criteria) this;
        }

        public Criteria andExDatiAnsNotEqualTo(String value) {
            addCriterion("ex_dati_ans <>", value, "exDatiAns");
            return (Criteria) this;
        }

        public Criteria andExDatiAnsGreaterThan(String value) {
            addCriterion("ex_dati_ans >", value, "exDatiAns");
            return (Criteria) this;
        }

        public Criteria andExDatiAnsGreaterThanOrEqualTo(String value) {
            addCriterion("ex_dati_ans >=", value, "exDatiAns");
            return (Criteria) this;
        }

        public Criteria andExDatiAnsLessThan(String value) {
            addCriterion("ex_dati_ans <", value, "exDatiAns");
            return (Criteria) this;
        }

        public Criteria andExDatiAnsLessThanOrEqualTo(String value) {
            addCriterion("ex_dati_ans <=", value, "exDatiAns");
            return (Criteria) this;
        }

        public Criteria andExDatiAnsLike(String value) {
            addCriterion("ex_dati_ans like", value, "exDatiAns");
            return (Criteria) this;
        }

        public Criteria andExDatiAnsNotLike(String value) {
            addCriterion("ex_dati_ans not like", value, "exDatiAns");
            return (Criteria) this;
        }

        public Criteria andExDatiAnsIn(List<String> values) {
            addCriterion("ex_dati_ans in", values, "exDatiAns");
            return (Criteria) this;
        }

        public Criteria andExDatiAnsNotIn(List<String> values) {
            addCriterion("ex_dati_ans not in", values, "exDatiAns");
            return (Criteria) this;
        }

        public Criteria andExDatiAnsBetween(String value1, String value2) {
            addCriterion("ex_dati_ans between", value1, value2, "exDatiAns");
            return (Criteria) this;
        }

        public Criteria andExDatiAnsNotBetween(String value1, String value2) {
            addCriterion("ex_dati_ans not between", value1, value2, "exDatiAns");
            return (Criteria) this;
        }

        public Criteria andExTimeIsNull() {
            addCriterion("ex_time is null");
            return (Criteria) this;
        }

        public Criteria andExTimeIsNotNull() {
            addCriterion("ex_time is not null");
            return (Criteria) this;
        }

        public Criteria andExTimeEqualTo(String value) {
            addCriterion("ex_time =", value, "exTime");
            return (Criteria) this;
        }

        public Criteria andExTimeNotEqualTo(String value) {
            addCriterion("ex_time <>", value, "exTime");
            return (Criteria) this;
        }

        public Criteria andExTimeGreaterThan(String value) {
            addCriterion("ex_time >", value, "exTime");
            return (Criteria) this;
        }

        public Criteria andExTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ex_time >=", value, "exTime");
            return (Criteria) this;
        }

        public Criteria andExTimeLessThan(String value) {
            addCriterion("ex_time <", value, "exTime");
            return (Criteria) this;
        }

        public Criteria andExTimeLessThanOrEqualTo(String value) {
            addCriterion("ex_time <=", value, "exTime");
            return (Criteria) this;
        }

        public Criteria andExTimeLike(String value) {
            addCriterion("ex_time like", value, "exTime");
            return (Criteria) this;
        }

        public Criteria andExTimeNotLike(String value) {
            addCriterion("ex_time not like", value, "exTime");
            return (Criteria) this;
        }

        public Criteria andExTimeIn(List<String> values) {
            addCriterion("ex_time in", values, "exTime");
            return (Criteria) this;
        }

        public Criteria andExTimeNotIn(List<String> values) {
            addCriterion("ex_time not in", values, "exTime");
            return (Criteria) this;
        }

        public Criteria andExTimeBetween(String value1, String value2) {
            addCriterion("ex_time between", value1, value2, "exTime");
            return (Criteria) this;
        }

        public Criteria andExTimeNotBetween(String value1, String value2) {
            addCriterion("ex_time not between", value1, value2, "exTime");
            return (Criteria) this;
        }

        public Criteria andExGradeIsNull() {
            addCriterion("ex_grade is null");
            return (Criteria) this;
        }

        public Criteria andExGradeIsNotNull() {
            addCriterion("ex_grade is not null");
            return (Criteria) this;
        }

        public Criteria andExGradeEqualTo(String value) {
            addCriterion("ex_grade =", value, "exGrade");
            return (Criteria) this;
        }

        public Criteria andExGradeNotEqualTo(String value) {
            addCriterion("ex_grade <>", value, "exGrade");
            return (Criteria) this;
        }

        public Criteria andExGradeGreaterThan(String value) {
            addCriterion("ex_grade >", value, "exGrade");
            return (Criteria) this;
        }

        public Criteria andExGradeGreaterThanOrEqualTo(String value) {
            addCriterion("ex_grade >=", value, "exGrade");
            return (Criteria) this;
        }

        public Criteria andExGradeLessThan(String value) {
            addCriterion("ex_grade <", value, "exGrade");
            return (Criteria) this;
        }

        public Criteria andExGradeLessThanOrEqualTo(String value) {
            addCriterion("ex_grade <=", value, "exGrade");
            return (Criteria) this;
        }

        public Criteria andExGradeLike(String value) {
            addCriterion("ex_grade like", value, "exGrade");
            return (Criteria) this;
        }

        public Criteria andExGradeNotLike(String value) {
            addCriterion("ex_grade not like", value, "exGrade");
            return (Criteria) this;
        }

        public Criteria andExGradeIn(List<String> values) {
            addCriterion("ex_grade in", values, "exGrade");
            return (Criteria) this;
        }

        public Criteria andExGradeNotIn(List<String> values) {
            addCriterion("ex_grade not in", values, "exGrade");
            return (Criteria) this;
        }

        public Criteria andExGradeBetween(String value1, String value2) {
            addCriterion("ex_grade between", value1, value2, "exGrade");
            return (Criteria) this;
        }

        public Criteria andExGradeNotBetween(String value1, String value2) {
            addCriterion("ex_grade not between", value1, value2, "exGrade");
            return (Criteria) this;
        }

        public Criteria andExStateIsNull() {
            addCriterion("ex_state is null");
            return (Criteria) this;
        }

        public Criteria andExStateIsNotNull() {
            addCriterion("ex_state is not null");
            return (Criteria) this;
        }

        public Criteria andExStateEqualTo(Integer value) {
            addCriterion("ex_state =", value, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateNotEqualTo(Integer value) {
            addCriterion("ex_state <>", value, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateGreaterThan(Integer value) {
            addCriterion("ex_state >", value, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ex_state >=", value, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateLessThan(Integer value) {
            addCriterion("ex_state <", value, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateLessThanOrEqualTo(Integer value) {
            addCriterion("ex_state <=", value, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateIn(List<Integer> values) {
            addCriterion("ex_state in", values, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateNotIn(List<Integer> values) {
            addCriterion("ex_state not in", values, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateBetween(Integer value1, Integer value2) {
            addCriterion("ex_state between", value1, value2, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ex_state not between", value1, value2, "exState");
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