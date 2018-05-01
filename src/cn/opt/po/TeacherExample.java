package cn.opt.po;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeaNameIsNull() {
            addCriterion("tea_name is null");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNotNull() {
            addCriterion("tea_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNameEqualTo(String value) {
            addCriterion("tea_name =", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotEqualTo(String value) {
            addCriterion("tea_name <>", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThan(String value) {
            addCriterion("tea_name >", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThanOrEqualTo(String value) {
            addCriterion("tea_name >=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThan(String value) {
            addCriterion("tea_name <", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThanOrEqualTo(String value) {
            addCriterion("tea_name <=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLike(String value) {
            addCriterion("tea_name like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotLike(String value) {
            addCriterion("tea_name not like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameIn(List<String> values) {
            addCriterion("tea_name in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotIn(List<String> values) {
            addCriterion("tea_name not in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameBetween(String value1, String value2) {
            addCriterion("tea_name between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotBetween(String value1, String value2) {
            addCriterion("tea_name not between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaPwdIsNull() {
            addCriterion("tea_pwd is null");
            return (Criteria) this;
        }

        public Criteria andTeaPwdIsNotNull() {
            addCriterion("tea_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andTeaPwdEqualTo(String value) {
            addCriterion("tea_pwd =", value, "teaPwd");
            return (Criteria) this;
        }

        public Criteria andTeaPwdNotEqualTo(String value) {
            addCriterion("tea_pwd <>", value, "teaPwd");
            return (Criteria) this;
        }

        public Criteria andTeaPwdGreaterThan(String value) {
            addCriterion("tea_pwd >", value, "teaPwd");
            return (Criteria) this;
        }

        public Criteria andTeaPwdGreaterThanOrEqualTo(String value) {
            addCriterion("tea_pwd >=", value, "teaPwd");
            return (Criteria) this;
        }

        public Criteria andTeaPwdLessThan(String value) {
            addCriterion("tea_pwd <", value, "teaPwd");
            return (Criteria) this;
        }

        public Criteria andTeaPwdLessThanOrEqualTo(String value) {
            addCriterion("tea_pwd <=", value, "teaPwd");
            return (Criteria) this;
        }

        public Criteria andTeaPwdLike(String value) {
            addCriterion("tea_pwd like", value, "teaPwd");
            return (Criteria) this;
        }

        public Criteria andTeaPwdNotLike(String value) {
            addCriterion("tea_pwd not like", value, "teaPwd");
            return (Criteria) this;
        }

        public Criteria andTeaPwdIn(List<String> values) {
            addCriterion("tea_pwd in", values, "teaPwd");
            return (Criteria) this;
        }

        public Criteria andTeaPwdNotIn(List<String> values) {
            addCriterion("tea_pwd not in", values, "teaPwd");
            return (Criteria) this;
        }

        public Criteria andTeaPwdBetween(String value1, String value2) {
            addCriterion("tea_pwd between", value1, value2, "teaPwd");
            return (Criteria) this;
        }

        public Criteria andTeaPwdNotBetween(String value1, String value2) {
            addCriterion("tea_pwd not between", value1, value2, "teaPwd");
            return (Criteria) this;
        }

        public Criteria andTeaSexIsNull() {
            addCriterion("tea_sex is null");
            return (Criteria) this;
        }

        public Criteria andTeaSexIsNotNull() {
            addCriterion("tea_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeaSexEqualTo(String value) {
            addCriterion("tea_sex =", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotEqualTo(String value) {
            addCriterion("tea_sex <>", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexGreaterThan(String value) {
            addCriterion("tea_sex >", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexGreaterThanOrEqualTo(String value) {
            addCriterion("tea_sex >=", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLessThan(String value) {
            addCriterion("tea_sex <", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLessThanOrEqualTo(String value) {
            addCriterion("tea_sex <=", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLike(String value) {
            addCriterion("tea_sex like", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotLike(String value) {
            addCriterion("tea_sex not like", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexIn(List<String> values) {
            addCriterion("tea_sex in", values, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotIn(List<String> values) {
            addCriterion("tea_sex not in", values, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexBetween(String value1, String value2) {
            addCriterion("tea_sex between", value1, value2, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotBetween(String value1, String value2) {
            addCriterion("tea_sex not between", value1, value2, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaJifenIsNull() {
            addCriterion("tea_jifen is null");
            return (Criteria) this;
        }

        public Criteria andTeaJifenIsNotNull() {
            addCriterion("tea_jifen is not null");
            return (Criteria) this;
        }

        public Criteria andTeaJifenEqualTo(Integer value) {
            addCriterion("tea_jifen =", value, "teaJifen");
            return (Criteria) this;
        }

        public Criteria andTeaJifenNotEqualTo(Integer value) {
            addCriterion("tea_jifen <>", value, "teaJifen");
            return (Criteria) this;
        }

        public Criteria andTeaJifenGreaterThan(Integer value) {
            addCriterion("tea_jifen >", value, "teaJifen");
            return (Criteria) this;
        }

        public Criteria andTeaJifenGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_jifen >=", value, "teaJifen");
            return (Criteria) this;
        }

        public Criteria andTeaJifenLessThan(Integer value) {
            addCriterion("tea_jifen <", value, "teaJifen");
            return (Criteria) this;
        }

        public Criteria andTeaJifenLessThanOrEqualTo(Integer value) {
            addCriterion("tea_jifen <=", value, "teaJifen");
            return (Criteria) this;
        }

        public Criteria andTeaJifenIn(List<Integer> values) {
            addCriterion("tea_jifen in", values, "teaJifen");
            return (Criteria) this;
        }

        public Criteria andTeaJifenNotIn(List<Integer> values) {
            addCriterion("tea_jifen not in", values, "teaJifen");
            return (Criteria) this;
        }

        public Criteria andTeaJifenBetween(Integer value1, Integer value2) {
            addCriterion("tea_jifen between", value1, value2, "teaJifen");
            return (Criteria) this;
        }

        public Criteria andTeaJifenNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_jifen not between", value1, value2, "teaJifen");
            return (Criteria) this;
        }

        public Criteria andTeaSubIsNull() {
            addCriterion("tea_sub is null");
            return (Criteria) this;
        }

        public Criteria andTeaSubIsNotNull() {
            addCriterion("tea_sub is not null");
            return (Criteria) this;
        }

        public Criteria andTeaSubEqualTo(String value) {
            addCriterion("tea_sub =", value, "teaSub");
            return (Criteria) this;
        }

        public Criteria andTeaSubNotEqualTo(String value) {
            addCriterion("tea_sub <>", value, "teaSub");
            return (Criteria) this;
        }

        public Criteria andTeaSubGreaterThan(String value) {
            addCriterion("tea_sub >", value, "teaSub");
            return (Criteria) this;
        }

        public Criteria andTeaSubGreaterThanOrEqualTo(String value) {
            addCriterion("tea_sub >=", value, "teaSub");
            return (Criteria) this;
        }

        public Criteria andTeaSubLessThan(String value) {
            addCriterion("tea_sub <", value, "teaSub");
            return (Criteria) this;
        }

        public Criteria andTeaSubLessThanOrEqualTo(String value) {
            addCriterion("tea_sub <=", value, "teaSub");
            return (Criteria) this;
        }

        public Criteria andTeaSubLike(String value) {
            addCriterion("tea_sub like", value, "teaSub");
            return (Criteria) this;
        }

        public Criteria andTeaSubNotLike(String value) {
            addCriterion("tea_sub not like", value, "teaSub");
            return (Criteria) this;
        }

        public Criteria andTeaSubIn(List<String> values) {
            addCriterion("tea_sub in", values, "teaSub");
            return (Criteria) this;
        }

        public Criteria andTeaSubNotIn(List<String> values) {
            addCriterion("tea_sub not in", values, "teaSub");
            return (Criteria) this;
        }

        public Criteria andTeaSubBetween(String value1, String value2) {
            addCriterion("tea_sub between", value1, value2, "teaSub");
            return (Criteria) this;
        }

        public Criteria andTeaSubNotBetween(String value1, String value2) {
            addCriterion("tea_sub not between", value1, value2, "teaSub");
            return (Criteria) this;
        }

        public Criteria andTeaTelIsNull() {
            addCriterion("tea_tel is null");
            return (Criteria) this;
        }

        public Criteria andTeaTelIsNotNull() {
            addCriterion("tea_tel is not null");
            return (Criteria) this;
        }

        public Criteria andTeaTelEqualTo(String value) {
            addCriterion("tea_tel =", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelNotEqualTo(String value) {
            addCriterion("tea_tel <>", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelGreaterThan(String value) {
            addCriterion("tea_tel >", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelGreaterThanOrEqualTo(String value) {
            addCriterion("tea_tel >=", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelLessThan(String value) {
            addCriterion("tea_tel <", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelLessThanOrEqualTo(String value) {
            addCriterion("tea_tel <=", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelLike(String value) {
            addCriterion("tea_tel like", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelNotLike(String value) {
            addCriterion("tea_tel not like", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelIn(List<String> values) {
            addCriterion("tea_tel in", values, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelNotIn(List<String> values) {
            addCriterion("tea_tel not in", values, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelBetween(String value1, String value2) {
            addCriterion("tea_tel between", value1, value2, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelNotBetween(String value1, String value2) {
            addCriterion("tea_tel not between", value1, value2, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaSummyIsNull() {
            addCriterion("tea_summy is null");
            return (Criteria) this;
        }

        public Criteria andTeaSummyIsNotNull() {
            addCriterion("tea_summy is not null");
            return (Criteria) this;
        }

        public Criteria andTeaSummyEqualTo(String value) {
            addCriterion("tea_summy =", value, "teaSummy");
            return (Criteria) this;
        }

        public Criteria andTeaSummyNotEqualTo(String value) {
            addCriterion("tea_summy <>", value, "teaSummy");
            return (Criteria) this;
        }

        public Criteria andTeaSummyGreaterThan(String value) {
            addCriterion("tea_summy >", value, "teaSummy");
            return (Criteria) this;
        }

        public Criteria andTeaSummyGreaterThanOrEqualTo(String value) {
            addCriterion("tea_summy >=", value, "teaSummy");
            return (Criteria) this;
        }

        public Criteria andTeaSummyLessThan(String value) {
            addCriterion("tea_summy <", value, "teaSummy");
            return (Criteria) this;
        }

        public Criteria andTeaSummyLessThanOrEqualTo(String value) {
            addCriterion("tea_summy <=", value, "teaSummy");
            return (Criteria) this;
        }

        public Criteria andTeaSummyLike(String value) {
            addCriterion("tea_summy like", value, "teaSummy");
            return (Criteria) this;
        }

        public Criteria andTeaSummyNotLike(String value) {
            addCriterion("tea_summy not like", value, "teaSummy");
            return (Criteria) this;
        }

        public Criteria andTeaSummyIn(List<String> values) {
            addCriterion("tea_summy in", values, "teaSummy");
            return (Criteria) this;
        }

        public Criteria andTeaSummyNotIn(List<String> values) {
            addCriterion("tea_summy not in", values, "teaSummy");
            return (Criteria) this;
        }

        public Criteria andTeaSummyBetween(String value1, String value2) {
            addCriterion("tea_summy between", value1, value2, "teaSummy");
            return (Criteria) this;
        }

        public Criteria andTeaSummyNotBetween(String value1, String value2) {
            addCriterion("tea_summy not between", value1, value2, "teaSummy");
            return (Criteria) this;
        }

        public Criteria andTeaPicIsNull() {
            addCriterion("tea_pic is null");
            return (Criteria) this;
        }

        public Criteria andTeaPicIsNotNull() {
            addCriterion("tea_pic is not null");
            return (Criteria) this;
        }

        public Criteria andTeaPicEqualTo(String value) {
            addCriterion("tea_pic =", value, "teaPic");
            return (Criteria) this;
        }

        public Criteria andTeaPicNotEqualTo(String value) {
            addCriterion("tea_pic <>", value, "teaPic");
            return (Criteria) this;
        }

        public Criteria andTeaPicGreaterThan(String value) {
            addCriterion("tea_pic >", value, "teaPic");
            return (Criteria) this;
        }

        public Criteria andTeaPicGreaterThanOrEqualTo(String value) {
            addCriterion("tea_pic >=", value, "teaPic");
            return (Criteria) this;
        }

        public Criteria andTeaPicLessThan(String value) {
            addCriterion("tea_pic <", value, "teaPic");
            return (Criteria) this;
        }

        public Criteria andTeaPicLessThanOrEqualTo(String value) {
            addCriterion("tea_pic <=", value, "teaPic");
            return (Criteria) this;
        }

        public Criteria andTeaPicLike(String value) {
            addCriterion("tea_pic like", value, "teaPic");
            return (Criteria) this;
        }

        public Criteria andTeaPicNotLike(String value) {
            addCriterion("tea_pic not like", value, "teaPic");
            return (Criteria) this;
        }

        public Criteria andTeaPicIn(List<String> values) {
            addCriterion("tea_pic in", values, "teaPic");
            return (Criteria) this;
        }

        public Criteria andTeaPicNotIn(List<String> values) {
            addCriterion("tea_pic not in", values, "teaPic");
            return (Criteria) this;
        }

        public Criteria andTeaPicBetween(String value1, String value2) {
            addCriterion("tea_pic between", value1, value2, "teaPic");
            return (Criteria) this;
        }

        public Criteria andTeaPicNotBetween(String value1, String value2) {
            addCriterion("tea_pic not between", value1, value2, "teaPic");
            return (Criteria) this;
        }

        public Criteria andTeaQucountIsNull() {
            addCriterion("tea_qucount is null");
            return (Criteria) this;
        }

        public Criteria andTeaQucountIsNotNull() {
            addCriterion("tea_qucount is not null");
            return (Criteria) this;
        }

        public Criteria andTeaQucountEqualTo(Integer value) {
            addCriterion("tea_qucount =", value, "teaQucount");
            return (Criteria) this;
        }

        public Criteria andTeaQucountNotEqualTo(Integer value) {
            addCriterion("tea_qucount <>", value, "teaQucount");
            return (Criteria) this;
        }

        public Criteria andTeaQucountGreaterThan(Integer value) {
            addCriterion("tea_qucount >", value, "teaQucount");
            return (Criteria) this;
        }

        public Criteria andTeaQucountGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_qucount >=", value, "teaQucount");
            return (Criteria) this;
        }

        public Criteria andTeaQucountLessThan(Integer value) {
            addCriterion("tea_qucount <", value, "teaQucount");
            return (Criteria) this;
        }

        public Criteria andTeaQucountLessThanOrEqualTo(Integer value) {
            addCriterion("tea_qucount <=", value, "teaQucount");
            return (Criteria) this;
        }

        public Criteria andTeaQucountIn(List<Integer> values) {
            addCriterion("tea_qucount in", values, "teaQucount");
            return (Criteria) this;
        }

        public Criteria andTeaQucountNotIn(List<Integer> values) {
            addCriterion("tea_qucount not in", values, "teaQucount");
            return (Criteria) this;
        }

        public Criteria andTeaQucountBetween(Integer value1, Integer value2) {
            addCriterion("tea_qucount between", value1, value2, "teaQucount");
            return (Criteria) this;
        }

        public Criteria andTeaQucountNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_qucount not between", value1, value2, "teaQucount");
            return (Criteria) this;
        }

        public Criteria andTeaAttenIsNull() {
            addCriterion("tea_atten is null");
            return (Criteria) this;
        }

        public Criteria andTeaAttenIsNotNull() {
            addCriterion("tea_atten is not null");
            return (Criteria) this;
        }

        public Criteria andTeaAttenEqualTo(Integer value) {
            addCriterion("tea_atten =", value, "teaAtten");
            return (Criteria) this;
        }

        public Criteria andTeaAttenNotEqualTo(Integer value) {
            addCriterion("tea_atten <>", value, "teaAtten");
            return (Criteria) this;
        }

        public Criteria andTeaAttenGreaterThan(Integer value) {
            addCriterion("tea_atten >", value, "teaAtten");
            return (Criteria) this;
        }

        public Criteria andTeaAttenGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_atten >=", value, "teaAtten");
            return (Criteria) this;
        }

        public Criteria andTeaAttenLessThan(Integer value) {
            addCriterion("tea_atten <", value, "teaAtten");
            return (Criteria) this;
        }

        public Criteria andTeaAttenLessThanOrEqualTo(Integer value) {
            addCriterion("tea_atten <=", value, "teaAtten");
            return (Criteria) this;
        }

        public Criteria andTeaAttenIn(List<Integer> values) {
            addCriterion("tea_atten in", values, "teaAtten");
            return (Criteria) this;
        }

        public Criteria andTeaAttenNotIn(List<Integer> values) {
            addCriterion("tea_atten not in", values, "teaAtten");
            return (Criteria) this;
        }

        public Criteria andTeaAttenBetween(Integer value1, Integer value2) {
            addCriterion("tea_atten between", value1, value2, "teaAtten");
            return (Criteria) this;
        }

        public Criteria andTeaAttenNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_atten not between", value1, value2, "teaAtten");
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