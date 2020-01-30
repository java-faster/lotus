package com.coder520.mamabuyschedulerservice.stock.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockFlowExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSkuidIsNull() {
            addCriterion("skuid is null");
            return (Criteria) this;
        }

        public Criteria andSkuidIsNotNull() {
            addCriterion("skuid is not null");
            return (Criteria) this;
        }

        public Criteria andSkuidEqualTo(Long value) {
            addCriterion("skuid =", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotEqualTo(Long value) {
            addCriterion("skuid <>", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidGreaterThan(Long value) {
            addCriterion("skuid >", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidGreaterThanOrEqualTo(Long value) {
            addCriterion("skuid >=", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidLessThan(Long value) {
            addCriterion("skuid <", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidLessThanOrEqualTo(Long value) {
            addCriterion("skuid <=", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidIn(List<Long> values) {
            addCriterion("skuid in", values, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotIn(List<Long> values) {
            addCriterion("skuid not in", values, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidBetween(Long value1, Long value2) {
            addCriterion("skuid between", value1, value2, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotBetween(Long value1, Long value2) {
            addCriterion("skuid not between", value1, value2, "skuid");
            return (Criteria) this;
        }

        public Criteria andStockbeforeIsNull() {
            addCriterion("stockbefore is null");
            return (Criteria) this;
        }

        public Criteria andStockbeforeIsNotNull() {
            addCriterion("stockbefore is not null");
            return (Criteria) this;
        }

        public Criteria andStockbeforeEqualTo(Integer value) {
            addCriterion("stockbefore =", value, "stockbefore");
            return (Criteria) this;
        }

        public Criteria andStockbeforeNotEqualTo(Integer value) {
            addCriterion("stockbefore <>", value, "stockbefore");
            return (Criteria) this;
        }

        public Criteria andStockbeforeGreaterThan(Integer value) {
            addCriterion("stockbefore >", value, "stockbefore");
            return (Criteria) this;
        }

        public Criteria andStockbeforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockbefore >=", value, "stockbefore");
            return (Criteria) this;
        }

        public Criteria andStockbeforeLessThan(Integer value) {
            addCriterion("stockbefore <", value, "stockbefore");
            return (Criteria) this;
        }

        public Criteria andStockbeforeLessThanOrEqualTo(Integer value) {
            addCriterion("stockbefore <=", value, "stockbefore");
            return (Criteria) this;
        }

        public Criteria andStockbeforeIn(List<Integer> values) {
            addCriterion("stockbefore in", values, "stockbefore");
            return (Criteria) this;
        }

        public Criteria andStockbeforeNotIn(List<Integer> values) {
            addCriterion("stockbefore not in", values, "stockbefore");
            return (Criteria) this;
        }

        public Criteria andStockbeforeBetween(Integer value1, Integer value2) {
            addCriterion("stockbefore between", value1, value2, "stockbefore");
            return (Criteria) this;
        }

        public Criteria andStockbeforeNotBetween(Integer value1, Integer value2) {
            addCriterion("stockbefore not between", value1, value2, "stockbefore");
            return (Criteria) this;
        }

        public Criteria andStockafterIsNull() {
            addCriterion("stockafter is null");
            return (Criteria) this;
        }

        public Criteria andStockafterIsNotNull() {
            addCriterion("stockafter is not null");
            return (Criteria) this;
        }

        public Criteria andStockafterEqualTo(Integer value) {
            addCriterion("stockafter =", value, "stockafter");
            return (Criteria) this;
        }

        public Criteria andStockafterNotEqualTo(Integer value) {
            addCriterion("stockafter <>", value, "stockafter");
            return (Criteria) this;
        }

        public Criteria andStockafterGreaterThan(Integer value) {
            addCriterion("stockafter >", value, "stockafter");
            return (Criteria) this;
        }

        public Criteria andStockafterGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockafter >=", value, "stockafter");
            return (Criteria) this;
        }

        public Criteria andStockafterLessThan(Integer value) {
            addCriterion("stockafter <", value, "stockafter");
            return (Criteria) this;
        }

        public Criteria andStockafterLessThanOrEqualTo(Integer value) {
            addCriterion("stockafter <=", value, "stockafter");
            return (Criteria) this;
        }

        public Criteria andStockafterIn(List<Integer> values) {
            addCriterion("stockafter in", values, "stockafter");
            return (Criteria) this;
        }

        public Criteria andStockafterNotIn(List<Integer> values) {
            addCriterion("stockafter not in", values, "stockafter");
            return (Criteria) this;
        }

        public Criteria andStockafterBetween(Integer value1, Integer value2) {
            addCriterion("stockafter between", value1, value2, "stockafter");
            return (Criteria) this;
        }

        public Criteria andStockafterNotBetween(Integer value1, Integer value2) {
            addCriterion("stockafter not between", value1, value2, "stockafter");
            return (Criteria) this;
        }

        public Criteria andStockchangeIsNull() {
            addCriterion("stockchange is null");
            return (Criteria) this;
        }

        public Criteria andStockchangeIsNotNull() {
            addCriterion("stockchange is not null");
            return (Criteria) this;
        }

        public Criteria andStockchangeEqualTo(Integer value) {
            addCriterion("stockchange =", value, "stockchange");
            return (Criteria) this;
        }

        public Criteria andStockchangeNotEqualTo(Integer value) {
            addCriterion("stockchange <>", value, "stockchange");
            return (Criteria) this;
        }

        public Criteria andStockchangeGreaterThan(Integer value) {
            addCriterion("stockchange >", value, "stockchange");
            return (Criteria) this;
        }

        public Criteria andStockchangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockchange >=", value, "stockchange");
            return (Criteria) this;
        }

        public Criteria andStockchangeLessThan(Integer value) {
            addCriterion("stockchange <", value, "stockchange");
            return (Criteria) this;
        }

        public Criteria andStockchangeLessThanOrEqualTo(Integer value) {
            addCriterion("stockchange <=", value, "stockchange");
            return (Criteria) this;
        }

        public Criteria andStockchangeIn(List<Integer> values) {
            addCriterion("stockchange in", values, "stockchange");
            return (Criteria) this;
        }

        public Criteria andStockchangeNotIn(List<Integer> values) {
            addCriterion("stockchange not in", values, "stockchange");
            return (Criteria) this;
        }

        public Criteria andStockchangeBetween(Integer value1, Integer value2) {
            addCriterion("stockchange between", value1, value2, "stockchange");
            return (Criteria) this;
        }

        public Criteria andStockchangeNotBetween(Integer value1, Integer value2) {
            addCriterion("stockchange not between", value1, value2, "stockchange");
            return (Criteria) this;
        }

        public Criteria andLockstockbeforeIsNull() {
            addCriterion("lockstockbefore is null");
            return (Criteria) this;
        }

        public Criteria andLockstockbeforeIsNotNull() {
            addCriterion("lockstockbefore is not null");
            return (Criteria) this;
        }

        public Criteria andLockstockbeforeEqualTo(Integer value) {
            addCriterion("lockstockbefore =", value, "lockstockbefore");
            return (Criteria) this;
        }

        public Criteria andLockstockbeforeNotEqualTo(Integer value) {
            addCriterion("lockstockbefore <>", value, "lockstockbefore");
            return (Criteria) this;
        }

        public Criteria andLockstockbeforeGreaterThan(Integer value) {
            addCriterion("lockstockbefore >", value, "lockstockbefore");
            return (Criteria) this;
        }

        public Criteria andLockstockbeforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lockstockbefore >=", value, "lockstockbefore");
            return (Criteria) this;
        }

        public Criteria andLockstockbeforeLessThan(Integer value) {
            addCriterion("lockstockbefore <", value, "lockstockbefore");
            return (Criteria) this;
        }

        public Criteria andLockstockbeforeLessThanOrEqualTo(Integer value) {
            addCriterion("lockstockbefore <=", value, "lockstockbefore");
            return (Criteria) this;
        }

        public Criteria andLockstockbeforeIn(List<Integer> values) {
            addCriterion("lockstockbefore in", values, "lockstockbefore");
            return (Criteria) this;
        }

        public Criteria andLockstockbeforeNotIn(List<Integer> values) {
            addCriterion("lockstockbefore not in", values, "lockstockbefore");
            return (Criteria) this;
        }

        public Criteria andLockstockbeforeBetween(Integer value1, Integer value2) {
            addCriterion("lockstockbefore between", value1, value2, "lockstockbefore");
            return (Criteria) this;
        }

        public Criteria andLockstockbeforeNotBetween(Integer value1, Integer value2) {
            addCriterion("lockstockbefore not between", value1, value2, "lockstockbefore");
            return (Criteria) this;
        }

        public Criteria andLockstockafterIsNull() {
            addCriterion("lockstockafter is null");
            return (Criteria) this;
        }

        public Criteria andLockstockafterIsNotNull() {
            addCriterion("lockstockafter is not null");
            return (Criteria) this;
        }

        public Criteria andLockstockafterEqualTo(Integer value) {
            addCriterion("lockstockafter =", value, "lockstockafter");
            return (Criteria) this;
        }

        public Criteria andLockstockafterNotEqualTo(Integer value) {
            addCriterion("lockstockafter <>", value, "lockstockafter");
            return (Criteria) this;
        }

        public Criteria andLockstockafterGreaterThan(Integer value) {
            addCriterion("lockstockafter >", value, "lockstockafter");
            return (Criteria) this;
        }

        public Criteria andLockstockafterGreaterThanOrEqualTo(Integer value) {
            addCriterion("lockstockafter >=", value, "lockstockafter");
            return (Criteria) this;
        }

        public Criteria andLockstockafterLessThan(Integer value) {
            addCriterion("lockstockafter <", value, "lockstockafter");
            return (Criteria) this;
        }

        public Criteria andLockstockafterLessThanOrEqualTo(Integer value) {
            addCriterion("lockstockafter <=", value, "lockstockafter");
            return (Criteria) this;
        }

        public Criteria andLockstockafterIn(List<Integer> values) {
            addCriterion("lockstockafter in", values, "lockstockafter");
            return (Criteria) this;
        }

        public Criteria andLockstockafterNotIn(List<Integer> values) {
            addCriterion("lockstockafter not in", values, "lockstockafter");
            return (Criteria) this;
        }

        public Criteria andLockstockafterBetween(Integer value1, Integer value2) {
            addCriterion("lockstockafter between", value1, value2, "lockstockafter");
            return (Criteria) this;
        }

        public Criteria andLockstockafterNotBetween(Integer value1, Integer value2) {
            addCriterion("lockstockafter not between", value1, value2, "lockstockafter");
            return (Criteria) this;
        }

        public Criteria andLockstockchangeIsNull() {
            addCriterion("lockstockchange is null");
            return (Criteria) this;
        }

        public Criteria andLockstockchangeIsNotNull() {
            addCriterion("lockstockchange is not null");
            return (Criteria) this;
        }

        public Criteria andLockstockchangeEqualTo(Integer value) {
            addCriterion("lockstockchange =", value, "lockstockchange");
            return (Criteria) this;
        }

        public Criteria andLockstockchangeNotEqualTo(Integer value) {
            addCriterion("lockstockchange <>", value, "lockstockchange");
            return (Criteria) this;
        }

        public Criteria andLockstockchangeGreaterThan(Integer value) {
            addCriterion("lockstockchange >", value, "lockstockchange");
            return (Criteria) this;
        }

        public Criteria andLockstockchangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lockstockchange >=", value, "lockstockchange");
            return (Criteria) this;
        }

        public Criteria andLockstockchangeLessThan(Integer value) {
            addCriterion("lockstockchange <", value, "lockstockchange");
            return (Criteria) this;
        }

        public Criteria andLockstockchangeLessThanOrEqualTo(Integer value) {
            addCriterion("lockstockchange <=", value, "lockstockchange");
            return (Criteria) this;
        }

        public Criteria andLockstockchangeIn(List<Integer> values) {
            addCriterion("lockstockchange in", values, "lockstockchange");
            return (Criteria) this;
        }

        public Criteria andLockstockchangeNotIn(List<Integer> values) {
            addCriterion("lockstockchange not in", values, "lockstockchange");
            return (Criteria) this;
        }

        public Criteria andLockstockchangeBetween(Integer value1, Integer value2) {
            addCriterion("lockstockchange between", value1, value2, "lockstockchange");
            return (Criteria) this;
        }

        public Criteria andLockstockchangeNotBetween(Integer value1, Integer value2) {
            addCriterion("lockstockchange not between", value1, value2, "lockstockchange");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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