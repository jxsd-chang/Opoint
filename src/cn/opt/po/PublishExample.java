package cn.opt.po;

import java.util.ArrayList;
import java.util.List;

public class PublishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PublishExample() {
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

        public Criteria andPublishIdIsNull() {
            addCriterion("publish_id is null");
            return (Criteria) this;
        }

        public Criteria andPublishIdIsNotNull() {
            addCriterion("publish_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublishIdEqualTo(String value) {
            addCriterion("publish_id =", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdNotEqualTo(String value) {
            addCriterion("publish_id <>", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdGreaterThan(String value) {
            addCriterion("publish_id >", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdGreaterThanOrEqualTo(String value) {
            addCriterion("publish_id >=", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdLessThan(String value) {
            addCriterion("publish_id <", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdLessThanOrEqualTo(String value) {
            addCriterion("publish_id <=", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdLike(String value) {
            addCriterion("publish_id like", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdNotLike(String value) {
            addCriterion("publish_id not like", value, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdIn(List<String> values) {
            addCriterion("publish_id in", values, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdNotIn(List<String> values) {
            addCriterion("publish_id not in", values, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdBetween(String value1, String value2) {
            addCriterion("publish_id between", value1, value2, "publishId");
            return (Criteria) this;
        }

        public Criteria andPublishIdNotBetween(String value1, String value2) {
            addCriterion("publish_id not between", value1, value2, "publishId");
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

        public Criteria andClaIdIsNull() {
            addCriterion("cla_id is null");
            return (Criteria) this;
        }

        public Criteria andClaIdIsNotNull() {
            addCriterion("cla_id is not null");
            return (Criteria) this;
        }

        public Criteria andClaIdEqualTo(Integer value) {
            addCriterion("cla_id =", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdNotEqualTo(Integer value) {
            addCriterion("cla_id <>", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdGreaterThan(Integer value) {
            addCriterion("cla_id >", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cla_id >=", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdLessThan(Integer value) {
            addCriterion("cla_id <", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdLessThanOrEqualTo(Integer value) {
            addCriterion("cla_id <=", value, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdIn(List<Integer> values) {
            addCriterion("cla_id in", values, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdNotIn(List<Integer> values) {
            addCriterion("cla_id not in", values, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdBetween(Integer value1, Integer value2) {
            addCriterion("cla_id between", value1, value2, "claId");
            return (Criteria) this;
        }

        public Criteria andClaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cla_id not between", value1, value2, "claId");
            return (Criteria) this;
        }

        public Criteria andWorkTitleIsNull() {
            addCriterion("work_title is null");
            return (Criteria) this;
        }

        public Criteria andWorkTitleIsNotNull() {
            addCriterion("work_title is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTitleEqualTo(String value) {
            addCriterion("work_title =", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleNotEqualTo(String value) {
            addCriterion("work_title <>", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleGreaterThan(String value) {
            addCriterion("work_title >", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleGreaterThanOrEqualTo(String value) {
            addCriterion("work_title >=", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleLessThan(String value) {
            addCriterion("work_title <", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleLessThanOrEqualTo(String value) {
            addCriterion("work_title <=", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleLike(String value) {
            addCriterion("work_title like", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleNotLike(String value) {
            addCriterion("work_title not like", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleIn(List<String> values) {
            addCriterion("work_title in", values, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleNotIn(List<String> values) {
            addCriterion("work_title not in", values, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleBetween(String value1, String value2) {
            addCriterion("work_title between", value1, value2, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleNotBetween(String value1, String value2) {
            addCriterion("work_title not between", value1, value2, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkInfoIsNull() {
            addCriterion("work_info is null");
            return (Criteria) this;
        }

        public Criteria andWorkInfoIsNotNull() {
            addCriterion("work_info is not null");
            return (Criteria) this;
        }

        public Criteria andWorkInfoEqualTo(String value) {
            addCriterion("work_info =", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoNotEqualTo(String value) {
            addCriterion("work_info <>", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoGreaterThan(String value) {
            addCriterion("work_info >", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoGreaterThanOrEqualTo(String value) {
            addCriterion("work_info >=", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoLessThan(String value) {
            addCriterion("work_info <", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoLessThanOrEqualTo(String value) {
            addCriterion("work_info <=", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoLike(String value) {
            addCriterion("work_info like", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoNotLike(String value) {
            addCriterion("work_info not like", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoIn(List<String> values) {
            addCriterion("work_info in", values, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoNotIn(List<String> values) {
            addCriterion("work_info not in", values, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoBetween(String value1, String value2) {
            addCriterion("work_info between", value1, value2, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoNotBetween(String value1, String value2) {
            addCriterion("work_info not between", value1, value2, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkPicIsNull() {
            addCriterion("work_pic is null");
            return (Criteria) this;
        }

        public Criteria andWorkPicIsNotNull() {
            addCriterion("work_pic is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPicEqualTo(String value) {
            addCriterion("work_pic =", value, "workPic");
            return (Criteria) this;
        }

        public Criteria andWorkPicNotEqualTo(String value) {
            addCriterion("work_pic <>", value, "workPic");
            return (Criteria) this;
        }

        public Criteria andWorkPicGreaterThan(String value) {
            addCriterion("work_pic >", value, "workPic");
            return (Criteria) this;
        }

        public Criteria andWorkPicGreaterThanOrEqualTo(String value) {
            addCriterion("work_pic >=", value, "workPic");
            return (Criteria) this;
        }

        public Criteria andWorkPicLessThan(String value) {
            addCriterion("work_pic <", value, "workPic");
            return (Criteria) this;
        }

        public Criteria andWorkPicLessThanOrEqualTo(String value) {
            addCriterion("work_pic <=", value, "workPic");
            return (Criteria) this;
        }

        public Criteria andWorkPicLike(String value) {
            addCriterion("work_pic like", value, "workPic");
            return (Criteria) this;
        }

        public Criteria andWorkPicNotLike(String value) {
            addCriterion("work_pic not like", value, "workPic");
            return (Criteria) this;
        }

        public Criteria andWorkPicIn(List<String> values) {
            addCriterion("work_pic in", values, "workPic");
            return (Criteria) this;
        }

        public Criteria andWorkPicNotIn(List<String> values) {
            addCriterion("work_pic not in", values, "workPic");
            return (Criteria) this;
        }

        public Criteria andWorkPicBetween(String value1, String value2) {
            addCriterion("work_pic between", value1, value2, "workPic");
            return (Criteria) this;
        }

        public Criteria andWorkPicNotBetween(String value1, String value2) {
            addCriterion("work_pic not between", value1, value2, "workPic");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(String value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(String value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(String value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(String value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(String value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(String value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLike(String value) {
            addCriterion("publish_time like", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotLike(String value) {
            addCriterion("publish_time not like", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<String> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<String> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(String value1, String value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(String value1, String value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishEndtimeIsNull() {
            addCriterion("publish_endtime is null");
            return (Criteria) this;
        }

        public Criteria andPublishEndtimeIsNotNull() {
            addCriterion("publish_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishEndtimeEqualTo(String value) {
            addCriterion("publish_endtime =", value, "publishEndtime");
            return (Criteria) this;
        }

        public Criteria andPublishEndtimeNotEqualTo(String value) {
            addCriterion("publish_endtime <>", value, "publishEndtime");
            return (Criteria) this;
        }

        public Criteria andPublishEndtimeGreaterThan(String value) {
            addCriterion("publish_endtime >", value, "publishEndtime");
            return (Criteria) this;
        }

        public Criteria andPublishEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("publish_endtime >=", value, "publishEndtime");
            return (Criteria) this;
        }

        public Criteria andPublishEndtimeLessThan(String value) {
            addCriterion("publish_endtime <", value, "publishEndtime");
            return (Criteria) this;
        }

        public Criteria andPublishEndtimeLessThanOrEqualTo(String value) {
            addCriterion("publish_endtime <=", value, "publishEndtime");
            return (Criteria) this;
        }

        public Criteria andPublishEndtimeLike(String value) {
            addCriterion("publish_endtime like", value, "publishEndtime");
            return (Criteria) this;
        }

        public Criteria andPublishEndtimeNotLike(String value) {
            addCriterion("publish_endtime not like", value, "publishEndtime");
            return (Criteria) this;
        }

        public Criteria andPublishEndtimeIn(List<String> values) {
            addCriterion("publish_endtime in", values, "publishEndtime");
            return (Criteria) this;
        }

        public Criteria andPublishEndtimeNotIn(List<String> values) {
            addCriterion("publish_endtime not in", values, "publishEndtime");
            return (Criteria) this;
        }

        public Criteria andPublishEndtimeBetween(String value1, String value2) {
            addCriterion("publish_endtime between", value1, value2, "publishEndtime");
            return (Criteria) this;
        }

        public Criteria andPublishEndtimeNotBetween(String value1, String value2) {
            addCriterion("publish_endtime not between", value1, value2, "publishEndtime");
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