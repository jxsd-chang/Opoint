package cn.opt.po;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCouNameIsNull() {
            addCriterion("cou_name is null");
            return (Criteria) this;
        }

        public Criteria andCouNameIsNotNull() {
            addCriterion("cou_name is not null");
            return (Criteria) this;
        }

        public Criteria andCouNameEqualTo(String value) {
            addCriterion("cou_name =", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameNotEqualTo(String value) {
            addCriterion("cou_name <>", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameGreaterThan(String value) {
            addCriterion("cou_name >", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameGreaterThanOrEqualTo(String value) {
            addCriterion("cou_name >=", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameLessThan(String value) {
            addCriterion("cou_name <", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameLessThanOrEqualTo(String value) {
            addCriterion("cou_name <=", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameLike(String value) {
            addCriterion("cou_name like", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameNotLike(String value) {
            addCriterion("cou_name not like", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameIn(List<String> values) {
            addCriterion("cou_name in", values, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameNotIn(List<String> values) {
            addCriterion("cou_name not in", values, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameBetween(String value1, String value2) {
            addCriterion("cou_name between", value1, value2, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameNotBetween(String value1, String value2) {
            addCriterion("cou_name not between", value1, value2, "couName");
            return (Criteria) this;
        }

        public Criteria andCouSummaryIsNull() {
            addCriterion("cou_summary is null");
            return (Criteria) this;
        }

        public Criteria andCouSummaryIsNotNull() {
            addCriterion("cou_summary is not null");
            return (Criteria) this;
        }

        public Criteria andCouSummaryEqualTo(String value) {
            addCriterion("cou_summary =", value, "couSummary");
            return (Criteria) this;
        }

        public Criteria andCouSummaryNotEqualTo(String value) {
            addCriterion("cou_summary <>", value, "couSummary");
            return (Criteria) this;
        }

        public Criteria andCouSummaryGreaterThan(String value) {
            addCriterion("cou_summary >", value, "couSummary");
            return (Criteria) this;
        }

        public Criteria andCouSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("cou_summary >=", value, "couSummary");
            return (Criteria) this;
        }

        public Criteria andCouSummaryLessThan(String value) {
            addCriterion("cou_summary <", value, "couSummary");
            return (Criteria) this;
        }

        public Criteria andCouSummaryLessThanOrEqualTo(String value) {
            addCriterion("cou_summary <=", value, "couSummary");
            return (Criteria) this;
        }

        public Criteria andCouSummaryLike(String value) {
            addCriterion("cou_summary like", value, "couSummary");
            return (Criteria) this;
        }

        public Criteria andCouSummaryNotLike(String value) {
            addCriterion("cou_summary not like", value, "couSummary");
            return (Criteria) this;
        }

        public Criteria andCouSummaryIn(List<String> values) {
            addCriterion("cou_summary in", values, "couSummary");
            return (Criteria) this;
        }

        public Criteria andCouSummaryNotIn(List<String> values) {
            addCriterion("cou_summary not in", values, "couSummary");
            return (Criteria) this;
        }

        public Criteria andCouSummaryBetween(String value1, String value2) {
            addCriterion("cou_summary between", value1, value2, "couSummary");
            return (Criteria) this;
        }

        public Criteria andCouSummaryNotBetween(String value1, String value2) {
            addCriterion("cou_summary not between", value1, value2, "couSummary");
            return (Criteria) this;
        }

        public Criteria andCouFlagIsNull() {
            addCriterion("cou_flag is null");
            return (Criteria) this;
        }

        public Criteria andCouFlagIsNotNull() {
            addCriterion("cou_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCouFlagEqualTo(String value) {
            addCriterion("cou_flag =", value, "couFlag");
            return (Criteria) this;
        }

        public Criteria andCouFlagNotEqualTo(String value) {
            addCriterion("cou_flag <>", value, "couFlag");
            return (Criteria) this;
        }

        public Criteria andCouFlagGreaterThan(String value) {
            addCriterion("cou_flag >", value, "couFlag");
            return (Criteria) this;
        }

        public Criteria andCouFlagGreaterThanOrEqualTo(String value) {
            addCriterion("cou_flag >=", value, "couFlag");
            return (Criteria) this;
        }

        public Criteria andCouFlagLessThan(String value) {
            addCriterion("cou_flag <", value, "couFlag");
            return (Criteria) this;
        }

        public Criteria andCouFlagLessThanOrEqualTo(String value) {
            addCriterion("cou_flag <=", value, "couFlag");
            return (Criteria) this;
        }

        public Criteria andCouFlagLike(String value) {
            addCriterion("cou_flag like", value, "couFlag");
            return (Criteria) this;
        }

        public Criteria andCouFlagNotLike(String value) {
            addCriterion("cou_flag not like", value, "couFlag");
            return (Criteria) this;
        }

        public Criteria andCouFlagIn(List<String> values) {
            addCriterion("cou_flag in", values, "couFlag");
            return (Criteria) this;
        }

        public Criteria andCouFlagNotIn(List<String> values) {
            addCriterion("cou_flag not in", values, "couFlag");
            return (Criteria) this;
        }

        public Criteria andCouFlagBetween(String value1, String value2) {
            addCriterion("cou_flag between", value1, value2, "couFlag");
            return (Criteria) this;
        }

        public Criteria andCouFlagNotBetween(String value1, String value2) {
            addCriterion("cou_flag not between", value1, value2, "couFlag");
            return (Criteria) this;
        }

        public Criteria andCouImgnameIsNull() {
            addCriterion("cou_imgname is null");
            return (Criteria) this;
        }

        public Criteria andCouImgnameIsNotNull() {
            addCriterion("cou_imgname is not null");
            return (Criteria) this;
        }

        public Criteria andCouImgnameEqualTo(String value) {
            addCriterion("cou_imgname =", value, "couImgname");
            return (Criteria) this;
        }

        public Criteria andCouImgnameNotEqualTo(String value) {
            addCriterion("cou_imgname <>", value, "couImgname");
            return (Criteria) this;
        }

        public Criteria andCouImgnameGreaterThan(String value) {
            addCriterion("cou_imgname >", value, "couImgname");
            return (Criteria) this;
        }

        public Criteria andCouImgnameGreaterThanOrEqualTo(String value) {
            addCriterion("cou_imgname >=", value, "couImgname");
            return (Criteria) this;
        }

        public Criteria andCouImgnameLessThan(String value) {
            addCriterion("cou_imgname <", value, "couImgname");
            return (Criteria) this;
        }

        public Criteria andCouImgnameLessThanOrEqualTo(String value) {
            addCriterion("cou_imgname <=", value, "couImgname");
            return (Criteria) this;
        }

        public Criteria andCouImgnameLike(String value) {
            addCriterion("cou_imgname like", value, "couImgname");
            return (Criteria) this;
        }

        public Criteria andCouImgnameNotLike(String value) {
            addCriterion("cou_imgname not like", value, "couImgname");
            return (Criteria) this;
        }

        public Criteria andCouImgnameIn(List<String> values) {
            addCriterion("cou_imgname in", values, "couImgname");
            return (Criteria) this;
        }

        public Criteria andCouImgnameNotIn(List<String> values) {
            addCriterion("cou_imgname not in", values, "couImgname");
            return (Criteria) this;
        }

        public Criteria andCouImgnameBetween(String value1, String value2) {
            addCriterion("cou_imgname between", value1, value2, "couImgname");
            return (Criteria) this;
        }

        public Criteria andCouImgnameNotBetween(String value1, String value2) {
            addCriterion("cou_imgname not between", value1, value2, "couImgname");
            return (Criteria) this;
        }

        public Criteria andCouLable1IsNull() {
            addCriterion("cou_lable1 is null");
            return (Criteria) this;
        }

        public Criteria andCouLable1IsNotNull() {
            addCriterion("cou_lable1 is not null");
            return (Criteria) this;
        }

        public Criteria andCouLable1EqualTo(String value) {
            addCriterion("cou_lable1 =", value, "couLable1");
            return (Criteria) this;
        }

        public Criteria andCouLable1NotEqualTo(String value) {
            addCriterion("cou_lable1 <>", value, "couLable1");
            return (Criteria) this;
        }

        public Criteria andCouLable1GreaterThan(String value) {
            addCriterion("cou_lable1 >", value, "couLable1");
            return (Criteria) this;
        }

        public Criteria andCouLable1GreaterThanOrEqualTo(String value) {
            addCriterion("cou_lable1 >=", value, "couLable1");
            return (Criteria) this;
        }

        public Criteria andCouLable1LessThan(String value) {
            addCriterion("cou_lable1 <", value, "couLable1");
            return (Criteria) this;
        }

        public Criteria andCouLable1LessThanOrEqualTo(String value) {
            addCriterion("cou_lable1 <=", value, "couLable1");
            return (Criteria) this;
        }

        public Criteria andCouLable1Like(String value) {
            addCriterion("cou_lable1 like", value, "couLable1");
            return (Criteria) this;
        }

        public Criteria andCouLable1NotLike(String value) {
            addCriterion("cou_lable1 not like", value, "couLable1");
            return (Criteria) this;
        }

        public Criteria andCouLable1In(List<String> values) {
            addCriterion("cou_lable1 in", values, "couLable1");
            return (Criteria) this;
        }

        public Criteria andCouLable1NotIn(List<String> values) {
            addCriterion("cou_lable1 not in", values, "couLable1");
            return (Criteria) this;
        }

        public Criteria andCouLable1Between(String value1, String value2) {
            addCriterion("cou_lable1 between", value1, value2, "couLable1");
            return (Criteria) this;
        }

        public Criteria andCouLable1NotBetween(String value1, String value2) {
            addCriterion("cou_lable1 not between", value1, value2, "couLable1");
            return (Criteria) this;
        }

        public Criteria andCouLable2IsNull() {
            addCriterion("cou_lable2 is null");
            return (Criteria) this;
        }

        public Criteria andCouLable2IsNotNull() {
            addCriterion("cou_lable2 is not null");
            return (Criteria) this;
        }

        public Criteria andCouLable2EqualTo(String value) {
            addCriterion("cou_lable2 =", value, "couLable2");
            return (Criteria) this;
        }

        public Criteria andCouLable2NotEqualTo(String value) {
            addCriterion("cou_lable2 <>", value, "couLable2");
            return (Criteria) this;
        }

        public Criteria andCouLable2GreaterThan(String value) {
            addCriterion("cou_lable2 >", value, "couLable2");
            return (Criteria) this;
        }

        public Criteria andCouLable2GreaterThanOrEqualTo(String value) {
            addCriterion("cou_lable2 >=", value, "couLable2");
            return (Criteria) this;
        }

        public Criteria andCouLable2LessThan(String value) {
            addCriterion("cou_lable2 <", value, "couLable2");
            return (Criteria) this;
        }

        public Criteria andCouLable2LessThanOrEqualTo(String value) {
            addCriterion("cou_lable2 <=", value, "couLable2");
            return (Criteria) this;
        }

        public Criteria andCouLable2Like(String value) {
            addCriterion("cou_lable2 like", value, "couLable2");
            return (Criteria) this;
        }

        public Criteria andCouLable2NotLike(String value) {
            addCriterion("cou_lable2 not like", value, "couLable2");
            return (Criteria) this;
        }

        public Criteria andCouLable2In(List<String> values) {
            addCriterion("cou_lable2 in", values, "couLable2");
            return (Criteria) this;
        }

        public Criteria andCouLable2NotIn(List<String> values) {
            addCriterion("cou_lable2 not in", values, "couLable2");
            return (Criteria) this;
        }

        public Criteria andCouLable2Between(String value1, String value2) {
            addCriterion("cou_lable2 between", value1, value2, "couLable2");
            return (Criteria) this;
        }

        public Criteria andCouLable2NotBetween(String value1, String value2) {
            addCriterion("cou_lable2 not between", value1, value2, "couLable2");
            return (Criteria) this;
        }

        public Criteria andCouLable3IsNull() {
            addCriterion("cou_lable3 is null");
            return (Criteria) this;
        }

        public Criteria andCouLable3IsNotNull() {
            addCriterion("cou_lable3 is not null");
            return (Criteria) this;
        }

        public Criteria andCouLable3EqualTo(String value) {
            addCriterion("cou_lable3 =", value, "couLable3");
            return (Criteria) this;
        }

        public Criteria andCouLable3NotEqualTo(String value) {
            addCriterion("cou_lable3 <>", value, "couLable3");
            return (Criteria) this;
        }

        public Criteria andCouLable3GreaterThan(String value) {
            addCriterion("cou_lable3 >", value, "couLable3");
            return (Criteria) this;
        }

        public Criteria andCouLable3GreaterThanOrEqualTo(String value) {
            addCriterion("cou_lable3 >=", value, "couLable3");
            return (Criteria) this;
        }

        public Criteria andCouLable3LessThan(String value) {
            addCriterion("cou_lable3 <", value, "couLable3");
            return (Criteria) this;
        }

        public Criteria andCouLable3LessThanOrEqualTo(String value) {
            addCriterion("cou_lable3 <=", value, "couLable3");
            return (Criteria) this;
        }

        public Criteria andCouLable3Like(String value) {
            addCriterion("cou_lable3 like", value, "couLable3");
            return (Criteria) this;
        }

        public Criteria andCouLable3NotLike(String value) {
            addCriterion("cou_lable3 not like", value, "couLable3");
            return (Criteria) this;
        }

        public Criteria andCouLable3In(List<String> values) {
            addCriterion("cou_lable3 in", values, "couLable3");
            return (Criteria) this;
        }

        public Criteria andCouLable3NotIn(List<String> values) {
            addCriterion("cou_lable3 not in", values, "couLable3");
            return (Criteria) this;
        }

        public Criteria andCouLable3Between(String value1, String value2) {
            addCriterion("cou_lable3 between", value1, value2, "couLable3");
            return (Criteria) this;
        }

        public Criteria andCouLable3NotBetween(String value1, String value2) {
            addCriterion("cou_lable3 not between", value1, value2, "couLable3");
            return (Criteria) this;
        }

        public Criteria andCouLable4IsNull() {
            addCriterion("cou_lable4 is null");
            return (Criteria) this;
        }

        public Criteria andCouLable4IsNotNull() {
            addCriterion("cou_lable4 is not null");
            return (Criteria) this;
        }

        public Criteria andCouLable4EqualTo(String value) {
            addCriterion("cou_lable4 =", value, "couLable4");
            return (Criteria) this;
        }

        public Criteria andCouLable4NotEqualTo(String value) {
            addCriterion("cou_lable4 <>", value, "couLable4");
            return (Criteria) this;
        }

        public Criteria andCouLable4GreaterThan(String value) {
            addCriterion("cou_lable4 >", value, "couLable4");
            return (Criteria) this;
        }

        public Criteria andCouLable4GreaterThanOrEqualTo(String value) {
            addCriterion("cou_lable4 >=", value, "couLable4");
            return (Criteria) this;
        }

        public Criteria andCouLable4LessThan(String value) {
            addCriterion("cou_lable4 <", value, "couLable4");
            return (Criteria) this;
        }

        public Criteria andCouLable4LessThanOrEqualTo(String value) {
            addCriterion("cou_lable4 <=", value, "couLable4");
            return (Criteria) this;
        }

        public Criteria andCouLable4Like(String value) {
            addCriterion("cou_lable4 like", value, "couLable4");
            return (Criteria) this;
        }

        public Criteria andCouLable4NotLike(String value) {
            addCriterion("cou_lable4 not like", value, "couLable4");
            return (Criteria) this;
        }

        public Criteria andCouLable4In(List<String> values) {
            addCriterion("cou_lable4 in", values, "couLable4");
            return (Criteria) this;
        }

        public Criteria andCouLable4NotIn(List<String> values) {
            addCriterion("cou_lable4 not in", values, "couLable4");
            return (Criteria) this;
        }

        public Criteria andCouLable4Between(String value1, String value2) {
            addCriterion("cou_lable4 between", value1, value2, "couLable4");
            return (Criteria) this;
        }

        public Criteria andCouLable4NotBetween(String value1, String value2) {
            addCriterion("cou_lable4 not between", value1, value2, "couLable4");
            return (Criteria) this;
        }

        public Criteria andCouPersonIsNull() {
            addCriterion("cou_person is null");
            return (Criteria) this;
        }

        public Criteria andCouPersonIsNotNull() {
            addCriterion("cou_person is not null");
            return (Criteria) this;
        }

        public Criteria andCouPersonEqualTo(String value) {
            addCriterion("cou_person =", value, "couPerson");
            return (Criteria) this;
        }

        public Criteria andCouPersonNotEqualTo(String value) {
            addCriterion("cou_person <>", value, "couPerson");
            return (Criteria) this;
        }

        public Criteria andCouPersonGreaterThan(String value) {
            addCriterion("cou_person >", value, "couPerson");
            return (Criteria) this;
        }

        public Criteria andCouPersonGreaterThanOrEqualTo(String value) {
            addCriterion("cou_person >=", value, "couPerson");
            return (Criteria) this;
        }

        public Criteria andCouPersonLessThan(String value) {
            addCriterion("cou_person <", value, "couPerson");
            return (Criteria) this;
        }

        public Criteria andCouPersonLessThanOrEqualTo(String value) {
            addCriterion("cou_person <=", value, "couPerson");
            return (Criteria) this;
        }

        public Criteria andCouPersonLike(String value) {
            addCriterion("cou_person like", value, "couPerson");
            return (Criteria) this;
        }

        public Criteria andCouPersonNotLike(String value) {
            addCriterion("cou_person not like", value, "couPerson");
            return (Criteria) this;
        }

        public Criteria andCouPersonIn(List<String> values) {
            addCriterion("cou_person in", values, "couPerson");
            return (Criteria) this;
        }

        public Criteria andCouPersonNotIn(List<String> values) {
            addCriterion("cou_person not in", values, "couPerson");
            return (Criteria) this;
        }

        public Criteria andCouPersonBetween(String value1, String value2) {
            addCriterion("cou_person between", value1, value2, "couPerson");
            return (Criteria) this;
        }

        public Criteria andCouPersonNotBetween(String value1, String value2) {
            addCriterion("cou_person not between", value1, value2, "couPerson");
            return (Criteria) this;
        }

        public Criteria andCouAimIsNull() {
            addCriterion("cou_aim is null");
            return (Criteria) this;
        }

        public Criteria andCouAimIsNotNull() {
            addCriterion("cou_aim is not null");
            return (Criteria) this;
        }

        public Criteria andCouAimEqualTo(String value) {
            addCriterion("cou_aim =", value, "couAim");
            return (Criteria) this;
        }

        public Criteria andCouAimNotEqualTo(String value) {
            addCriterion("cou_aim <>", value, "couAim");
            return (Criteria) this;
        }

        public Criteria andCouAimGreaterThan(String value) {
            addCriterion("cou_aim >", value, "couAim");
            return (Criteria) this;
        }

        public Criteria andCouAimGreaterThanOrEqualTo(String value) {
            addCriterion("cou_aim >=", value, "couAim");
            return (Criteria) this;
        }

        public Criteria andCouAimLessThan(String value) {
            addCriterion("cou_aim <", value, "couAim");
            return (Criteria) this;
        }

        public Criteria andCouAimLessThanOrEqualTo(String value) {
            addCriterion("cou_aim <=", value, "couAim");
            return (Criteria) this;
        }

        public Criteria andCouAimLike(String value) {
            addCriterion("cou_aim like", value, "couAim");
            return (Criteria) this;
        }

        public Criteria andCouAimNotLike(String value) {
            addCriterion("cou_aim not like", value, "couAim");
            return (Criteria) this;
        }

        public Criteria andCouAimIn(List<String> values) {
            addCriterion("cou_aim in", values, "couAim");
            return (Criteria) this;
        }

        public Criteria andCouAimNotIn(List<String> values) {
            addCriterion("cou_aim not in", values, "couAim");
            return (Criteria) this;
        }

        public Criteria andCouAimBetween(String value1, String value2) {
            addCriterion("cou_aim between", value1, value2, "couAim");
            return (Criteria) this;
        }

        public Criteria andCouAimNotBetween(String value1, String value2) {
            addCriterion("cou_aim not between", value1, value2, "couAim");
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