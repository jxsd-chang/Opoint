package cn.opt.po;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuPwdIsNull() {
            addCriterion("stu_pwd is null");
            return (Criteria) this;
        }

        public Criteria andStuPwdIsNotNull() {
            addCriterion("stu_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andStuPwdEqualTo(String value) {
            addCriterion("stu_pwd =", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdNotEqualTo(String value) {
            addCriterion("stu_pwd <>", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdGreaterThan(String value) {
            addCriterion("stu_pwd >", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdGreaterThanOrEqualTo(String value) {
            addCriterion("stu_pwd >=", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdLessThan(String value) {
            addCriterion("stu_pwd <", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdLessThanOrEqualTo(String value) {
            addCriterion("stu_pwd <=", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdLike(String value) {
            addCriterion("stu_pwd like", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdNotLike(String value) {
            addCriterion("stu_pwd not like", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdIn(List<String> values) {
            addCriterion("stu_pwd in", values, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdNotIn(List<String> values) {
            addCriterion("stu_pwd not in", values, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdBetween(String value1, String value2) {
            addCriterion("stu_pwd between", value1, value2, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdNotBetween(String value1, String value2) {
            addCriterion("stu_pwd not between", value1, value2, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuJifenIsNull() {
            addCriterion("stu_jifen is null");
            return (Criteria) this;
        }

        public Criteria andStuJifenIsNotNull() {
            addCriterion("stu_jifen is not null");
            return (Criteria) this;
        }

        public Criteria andStuJifenEqualTo(Integer value) {
            addCriterion("stu_jifen =", value, "stuJifen");
            return (Criteria) this;
        }

        public Criteria andStuJifenNotEqualTo(Integer value) {
            addCriterion("stu_jifen <>", value, "stuJifen");
            return (Criteria) this;
        }

        public Criteria andStuJifenGreaterThan(Integer value) {
            addCriterion("stu_jifen >", value, "stuJifen");
            return (Criteria) this;
        }

        public Criteria andStuJifenGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_jifen >=", value, "stuJifen");
            return (Criteria) this;
        }

        public Criteria andStuJifenLessThan(Integer value) {
            addCriterion("stu_jifen <", value, "stuJifen");
            return (Criteria) this;
        }

        public Criteria andStuJifenLessThanOrEqualTo(Integer value) {
            addCriterion("stu_jifen <=", value, "stuJifen");
            return (Criteria) this;
        }

        public Criteria andStuJifenIn(List<Integer> values) {
            addCriterion("stu_jifen in", values, "stuJifen");
            return (Criteria) this;
        }

        public Criteria andStuJifenNotIn(List<Integer> values) {
            addCriterion("stu_jifen not in", values, "stuJifen");
            return (Criteria) this;
        }

        public Criteria andStuJifenBetween(Integer value1, Integer value2) {
            addCriterion("stu_jifen between", value1, value2, "stuJifen");
            return (Criteria) this;
        }

        public Criteria andStuJifenNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_jifen not between", value1, value2, "stuJifen");
            return (Criteria) this;
        }

        public Criteria andStuProIsNull() {
            addCriterion("stu_pro is null");
            return (Criteria) this;
        }

        public Criteria andStuProIsNotNull() {
            addCriterion("stu_pro is not null");
            return (Criteria) this;
        }

        public Criteria andStuProEqualTo(String value) {
            addCriterion("stu_pro =", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProNotEqualTo(String value) {
            addCriterion("stu_pro <>", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProGreaterThan(String value) {
            addCriterion("stu_pro >", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProGreaterThanOrEqualTo(String value) {
            addCriterion("stu_pro >=", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProLessThan(String value) {
            addCriterion("stu_pro <", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProLessThanOrEqualTo(String value) {
            addCriterion("stu_pro <=", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProLike(String value) {
            addCriterion("stu_pro like", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProNotLike(String value) {
            addCriterion("stu_pro not like", value, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProIn(List<String> values) {
            addCriterion("stu_pro in", values, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProNotIn(List<String> values) {
            addCriterion("stu_pro not in", values, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProBetween(String value1, String value2) {
            addCriterion("stu_pro between", value1, value2, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuProNotBetween(String value1, String value2) {
            addCriterion("stu_pro not between", value1, value2, "stuPro");
            return (Criteria) this;
        }

        public Criteria andStuTelIsNull() {
            addCriterion("stu_tel is null");
            return (Criteria) this;
        }

        public Criteria andStuTelIsNotNull() {
            addCriterion("stu_tel is not null");
            return (Criteria) this;
        }

        public Criteria andStuTelEqualTo(String value) {
            addCriterion("stu_tel =", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelNotEqualTo(String value) {
            addCriterion("stu_tel <>", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelGreaterThan(String value) {
            addCriterion("stu_tel >", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelGreaterThanOrEqualTo(String value) {
            addCriterion("stu_tel >=", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelLessThan(String value) {
            addCriterion("stu_tel <", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelLessThanOrEqualTo(String value) {
            addCriterion("stu_tel <=", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelLike(String value) {
            addCriterion("stu_tel like", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelNotLike(String value) {
            addCriterion("stu_tel not like", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelIn(List<String> values) {
            addCriterion("stu_tel in", values, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelNotIn(List<String> values) {
            addCriterion("stu_tel not in", values, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelBetween(String value1, String value2) {
            addCriterion("stu_tel between", value1, value2, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelNotBetween(String value1, String value2) {
            addCriterion("stu_tel not between", value1, value2, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuGradeIsNull() {
            addCriterion("stu_grade is null");
            return (Criteria) this;
        }

        public Criteria andStuGradeIsNotNull() {
            addCriterion("stu_grade is not null");
            return (Criteria) this;
        }

        public Criteria andStuGradeEqualTo(String value) {
            addCriterion("stu_grade =", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotEqualTo(String value) {
            addCriterion("stu_grade <>", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeGreaterThan(String value) {
            addCriterion("stu_grade >", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeGreaterThanOrEqualTo(String value) {
            addCriterion("stu_grade >=", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLessThan(String value) {
            addCriterion("stu_grade <", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLessThanOrEqualTo(String value) {
            addCriterion("stu_grade <=", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLike(String value) {
            addCriterion("stu_grade like", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotLike(String value) {
            addCriterion("stu_grade not like", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeIn(List<String> values) {
            addCriterion("stu_grade in", values, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotIn(List<String> values) {
            addCriterion("stu_grade not in", values, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeBetween(String value1, String value2) {
            addCriterion("stu_grade between", value1, value2, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotBetween(String value1, String value2) {
            addCriterion("stu_grade not between", value1, value2, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuPicIsNull() {
            addCriterion("stu_pic is null");
            return (Criteria) this;
        }

        public Criteria andStuPicIsNotNull() {
            addCriterion("stu_pic is not null");
            return (Criteria) this;
        }

        public Criteria andStuPicEqualTo(String value) {
            addCriterion("stu_pic =", value, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicNotEqualTo(String value) {
            addCriterion("stu_pic <>", value, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicGreaterThan(String value) {
            addCriterion("stu_pic >", value, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicGreaterThanOrEqualTo(String value) {
            addCriterion("stu_pic >=", value, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicLessThan(String value) {
            addCriterion("stu_pic <", value, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicLessThanOrEqualTo(String value) {
            addCriterion("stu_pic <=", value, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicLike(String value) {
            addCriterion("stu_pic like", value, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicNotLike(String value) {
            addCriterion("stu_pic not like", value, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicIn(List<String> values) {
            addCriterion("stu_pic in", values, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicNotIn(List<String> values) {
            addCriterion("stu_pic not in", values, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicBetween(String value1, String value2) {
            addCriterion("stu_pic between", value1, value2, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuPicNotBetween(String value1, String value2) {
            addCriterion("stu_pic not between", value1, value2, "stuPic");
            return (Criteria) this;
        }

        public Criteria andStuQuecountIsNull() {
            addCriterion("stu_quecount is null");
            return (Criteria) this;
        }

        public Criteria andStuQuecountIsNotNull() {
            addCriterion("stu_quecount is not null");
            return (Criteria) this;
        }

        public Criteria andStuQuecountEqualTo(Integer value) {
            addCriterion("stu_quecount =", value, "stuQuecount");
            return (Criteria) this;
        }

        public Criteria andStuQuecountNotEqualTo(Integer value) {
            addCriterion("stu_quecount <>", value, "stuQuecount");
            return (Criteria) this;
        }

        public Criteria andStuQuecountGreaterThan(Integer value) {
            addCriterion("stu_quecount >", value, "stuQuecount");
            return (Criteria) this;
        }

        public Criteria andStuQuecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_quecount >=", value, "stuQuecount");
            return (Criteria) this;
        }

        public Criteria andStuQuecountLessThan(Integer value) {
            addCriterion("stu_quecount <", value, "stuQuecount");
            return (Criteria) this;
        }

        public Criteria andStuQuecountLessThanOrEqualTo(Integer value) {
            addCriterion("stu_quecount <=", value, "stuQuecount");
            return (Criteria) this;
        }

        public Criteria andStuQuecountIn(List<Integer> values) {
            addCriterion("stu_quecount in", values, "stuQuecount");
            return (Criteria) this;
        }

        public Criteria andStuQuecountNotIn(List<Integer> values) {
            addCriterion("stu_quecount not in", values, "stuQuecount");
            return (Criteria) this;
        }

        public Criteria andStuQuecountBetween(Integer value1, Integer value2) {
            addCriterion("stu_quecount between", value1, value2, "stuQuecount");
            return (Criteria) this;
        }

        public Criteria andStuQuecountNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_quecount not between", value1, value2, "stuQuecount");
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