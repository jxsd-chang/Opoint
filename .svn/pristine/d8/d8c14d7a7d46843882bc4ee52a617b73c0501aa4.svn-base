package cn.opt.po;

import java.util.ArrayList;
import java.util.List;

public class EtimuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EtimuExample() {
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

        public Criteria andEtimuIdIsNull() {
            addCriterion("etimu_id is null");
            return (Criteria) this;
        }

        public Criteria andEtimuIdIsNotNull() {
            addCriterion("etimu_id is not null");
            return (Criteria) this;
        }

        public Criteria andEtimuIdEqualTo(Integer value) {
            addCriterion("etimu_id =", value, "etimuId");
            return (Criteria) this;
        }

        public Criteria andEtimuIdNotEqualTo(Integer value) {
            addCriterion("etimu_id <>", value, "etimuId");
            return (Criteria) this;
        }

        public Criteria andEtimuIdGreaterThan(Integer value) {
            addCriterion("etimu_id >", value, "etimuId");
            return (Criteria) this;
        }

        public Criteria andEtimuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("etimu_id >=", value, "etimuId");
            return (Criteria) this;
        }

        public Criteria andEtimuIdLessThan(Integer value) {
            addCriterion("etimu_id <", value, "etimuId");
            return (Criteria) this;
        }

        public Criteria andEtimuIdLessThanOrEqualTo(Integer value) {
            addCriterion("etimu_id <=", value, "etimuId");
            return (Criteria) this;
        }

        public Criteria andEtimuIdIn(List<Integer> values) {
            addCriterion("etimu_id in", values, "etimuId");
            return (Criteria) this;
        }

        public Criteria andEtimuIdNotIn(List<Integer> values) {
            addCriterion("etimu_id not in", values, "etimuId");
            return (Criteria) this;
        }

        public Criteria andEtimuIdBetween(Integer value1, Integer value2) {
            addCriterion("etimu_id between", value1, value2, "etimuId");
            return (Criteria) this;
        }

        public Criteria andEtimuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("etimu_id not between", value1, value2, "etimuId");
            return (Criteria) this;
        }

        public Criteria andEtimuTitleIsNull() {
            addCriterion("etimu_title is null");
            return (Criteria) this;
        }

        public Criteria andEtimuTitleIsNotNull() {
            addCriterion("etimu_title is not null");
            return (Criteria) this;
        }

        public Criteria andEtimuTitleEqualTo(String value) {
            addCriterion("etimu_title =", value, "etimuTitle");
            return (Criteria) this;
        }

        public Criteria andEtimuTitleNotEqualTo(String value) {
            addCriterion("etimu_title <>", value, "etimuTitle");
            return (Criteria) this;
        }

        public Criteria andEtimuTitleGreaterThan(String value) {
            addCriterion("etimu_title >", value, "etimuTitle");
            return (Criteria) this;
        }

        public Criteria andEtimuTitleGreaterThanOrEqualTo(String value) {
            addCriterion("etimu_title >=", value, "etimuTitle");
            return (Criteria) this;
        }

        public Criteria andEtimuTitleLessThan(String value) {
            addCriterion("etimu_title <", value, "etimuTitle");
            return (Criteria) this;
        }

        public Criteria andEtimuTitleLessThanOrEqualTo(String value) {
            addCriterion("etimu_title <=", value, "etimuTitle");
            return (Criteria) this;
        }

        public Criteria andEtimuTitleLike(String value) {
            addCriterion("etimu_title like", value, "etimuTitle");
            return (Criteria) this;
        }

        public Criteria andEtimuTitleNotLike(String value) {
            addCriterion("etimu_title not like", value, "etimuTitle");
            return (Criteria) this;
        }

        public Criteria andEtimuTitleIn(List<String> values) {
            addCriterion("etimu_title in", values, "etimuTitle");
            return (Criteria) this;
        }

        public Criteria andEtimuTitleNotIn(List<String> values) {
            addCriterion("etimu_title not in", values, "etimuTitle");
            return (Criteria) this;
        }

        public Criteria andEtimuTitleBetween(String value1, String value2) {
            addCriterion("etimu_title between", value1, value2, "etimuTitle");
            return (Criteria) this;
        }

        public Criteria andEtimuTitleNotBetween(String value1, String value2) {
            addCriterion("etimu_title not between", value1, value2, "etimuTitle");
            return (Criteria) this;
        }

        public Criteria andEtimuTypeIsNull() {
            addCriterion("etimu_type is null");
            return (Criteria) this;
        }

        public Criteria andEtimuTypeIsNotNull() {
            addCriterion("etimu_type is not null");
            return (Criteria) this;
        }

        public Criteria andEtimuTypeEqualTo(Integer value) {
            addCriterion("etimu_type =", value, "etimuType");
            return (Criteria) this;
        }

        public Criteria andEtimuTypeNotEqualTo(Integer value) {
            addCriterion("etimu_type <>", value, "etimuType");
            return (Criteria) this;
        }

        public Criteria andEtimuTypeGreaterThan(Integer value) {
            addCriterion("etimu_type >", value, "etimuType");
            return (Criteria) this;
        }

        public Criteria andEtimuTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("etimu_type >=", value, "etimuType");
            return (Criteria) this;
        }

        public Criteria andEtimuTypeLessThan(Integer value) {
            addCriterion("etimu_type <", value, "etimuType");
            return (Criteria) this;
        }

        public Criteria andEtimuTypeLessThanOrEqualTo(Integer value) {
            addCriterion("etimu_type <=", value, "etimuType");
            return (Criteria) this;
        }

        public Criteria andEtimuTypeIn(List<Integer> values) {
            addCriterion("etimu_type in", values, "etimuType");
            return (Criteria) this;
        }

        public Criteria andEtimuTypeNotIn(List<Integer> values) {
            addCriterion("etimu_type not in", values, "etimuType");
            return (Criteria) this;
        }

        public Criteria andEtimuTypeBetween(Integer value1, Integer value2) {
            addCriterion("etimu_type between", value1, value2, "etimuType");
            return (Criteria) this;
        }

        public Criteria andEtimuTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("etimu_type not between", value1, value2, "etimuType");
            return (Criteria) this;
        }

        public Criteria andEtimuAnsIsNull() {
            addCriterion("etimu_ans is null");
            return (Criteria) this;
        }

        public Criteria andEtimuAnsIsNotNull() {
            addCriterion("etimu_ans is not null");
            return (Criteria) this;
        }

        public Criteria andEtimuAnsEqualTo(String value) {
            addCriterion("etimu_ans =", value, "etimuAns");
            return (Criteria) this;
        }

        public Criteria andEtimuAnsNotEqualTo(String value) {
            addCriterion("etimu_ans <>", value, "etimuAns");
            return (Criteria) this;
        }

        public Criteria andEtimuAnsGreaterThan(String value) {
            addCriterion("etimu_ans >", value, "etimuAns");
            return (Criteria) this;
        }

        public Criteria andEtimuAnsGreaterThanOrEqualTo(String value) {
            addCriterion("etimu_ans >=", value, "etimuAns");
            return (Criteria) this;
        }

        public Criteria andEtimuAnsLessThan(String value) {
            addCriterion("etimu_ans <", value, "etimuAns");
            return (Criteria) this;
        }

        public Criteria andEtimuAnsLessThanOrEqualTo(String value) {
            addCriterion("etimu_ans <=", value, "etimuAns");
            return (Criteria) this;
        }

        public Criteria andEtimuAnsLike(String value) {
            addCriterion("etimu_ans like", value, "etimuAns");
            return (Criteria) this;
        }

        public Criteria andEtimuAnsNotLike(String value) {
            addCriterion("etimu_ans not like", value, "etimuAns");
            return (Criteria) this;
        }

        public Criteria andEtimuAnsIn(List<String> values) {
            addCriterion("etimu_ans in", values, "etimuAns");
            return (Criteria) this;
        }

        public Criteria andEtimuAnsNotIn(List<String> values) {
            addCriterion("etimu_ans not in", values, "etimuAns");
            return (Criteria) this;
        }

        public Criteria andEtimuAnsBetween(String value1, String value2) {
            addCriterion("etimu_ans between", value1, value2, "etimuAns");
            return (Criteria) this;
        }

        public Criteria andEtimuAnsNotBetween(String value1, String value2) {
            addCriterion("etimu_ans not between", value1, value2, "etimuAns");
            return (Criteria) this;
        }

        public Criteria andEtimuExpIsNull() {
            addCriterion("etimu_exp is null");
            return (Criteria) this;
        }

        public Criteria andEtimuExpIsNotNull() {
            addCriterion("etimu_exp is not null");
            return (Criteria) this;
        }

        public Criteria andEtimuExpEqualTo(String value) {
            addCriterion("etimu_exp =", value, "etimuExp");
            return (Criteria) this;
        }

        public Criteria andEtimuExpNotEqualTo(String value) {
            addCriterion("etimu_exp <>", value, "etimuExp");
            return (Criteria) this;
        }

        public Criteria andEtimuExpGreaterThan(String value) {
            addCriterion("etimu_exp >", value, "etimuExp");
            return (Criteria) this;
        }

        public Criteria andEtimuExpGreaterThanOrEqualTo(String value) {
            addCriterion("etimu_exp >=", value, "etimuExp");
            return (Criteria) this;
        }

        public Criteria andEtimuExpLessThan(String value) {
            addCriterion("etimu_exp <", value, "etimuExp");
            return (Criteria) this;
        }

        public Criteria andEtimuExpLessThanOrEqualTo(String value) {
            addCriterion("etimu_exp <=", value, "etimuExp");
            return (Criteria) this;
        }

        public Criteria andEtimuExpLike(String value) {
            addCriterion("etimu_exp like", value, "etimuExp");
            return (Criteria) this;
        }

        public Criteria andEtimuExpNotLike(String value) {
            addCriterion("etimu_exp not like", value, "etimuExp");
            return (Criteria) this;
        }

        public Criteria andEtimuExpIn(List<String> values) {
            addCriterion("etimu_exp in", values, "etimuExp");
            return (Criteria) this;
        }

        public Criteria andEtimuExpNotIn(List<String> values) {
            addCriterion("etimu_exp not in", values, "etimuExp");
            return (Criteria) this;
        }

        public Criteria andEtimuExpBetween(String value1, String value2) {
            addCriterion("etimu_exp between", value1, value2, "etimuExp");
            return (Criteria) this;
        }

        public Criteria andEtimuExpNotBetween(String value1, String value2) {
            addCriterion("etimu_exp not between", value1, value2, "etimuExp");
            return (Criteria) this;
        }

        public Criteria andEtimuFenIsNull() {
            addCriterion("etimu_fen is null");
            return (Criteria) this;
        }

        public Criteria andEtimuFenIsNotNull() {
            addCriterion("etimu_fen is not null");
            return (Criteria) this;
        }

        public Criteria andEtimuFenEqualTo(Integer value) {
            addCriterion("etimu_fen =", value, "etimuFen");
            return (Criteria) this;
        }

        public Criteria andEtimuFenNotEqualTo(Integer value) {
            addCriterion("etimu_fen <>", value, "etimuFen");
            return (Criteria) this;
        }

        public Criteria andEtimuFenGreaterThan(Integer value) {
            addCriterion("etimu_fen >", value, "etimuFen");
            return (Criteria) this;
        }

        public Criteria andEtimuFenGreaterThanOrEqualTo(Integer value) {
            addCriterion("etimu_fen >=", value, "etimuFen");
            return (Criteria) this;
        }

        public Criteria andEtimuFenLessThan(Integer value) {
            addCriterion("etimu_fen <", value, "etimuFen");
            return (Criteria) this;
        }

        public Criteria andEtimuFenLessThanOrEqualTo(Integer value) {
            addCriterion("etimu_fen <=", value, "etimuFen");
            return (Criteria) this;
        }

        public Criteria andEtimuFenIn(List<Integer> values) {
            addCriterion("etimu_fen in", values, "etimuFen");
            return (Criteria) this;
        }

        public Criteria andEtimuFenNotIn(List<Integer> values) {
            addCriterion("etimu_fen not in", values, "etimuFen");
            return (Criteria) this;
        }

        public Criteria andEtimuFenBetween(Integer value1, Integer value2) {
            addCriterion("etimu_fen between", value1, value2, "etimuFen");
            return (Criteria) this;
        }

        public Criteria andEtimuFenNotBetween(Integer value1, Integer value2) {
            addCriterion("etimu_fen not between", value1, value2, "etimuFen");
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