package com.bw.zy422.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBookExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("BOOK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("BOOK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("BOOK_NAME =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("BOOK_NAME <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("BOOK_NAME >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("BOOK_NAME >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("BOOK_NAME <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("BOOK_NAME <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("BOOK_NAME like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("BOOK_NAME not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("BOOK_NAME in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("BOOK_NAME not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("BOOK_NAME between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("BOOK_NAME not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookIntroduceIsNull() {
            addCriterion("BOOK_INTRODUCE is null");
            return (Criteria) this;
        }

        public Criteria andBookIntroduceIsNotNull() {
            addCriterion("BOOK_INTRODUCE is not null");
            return (Criteria) this;
        }

        public Criteria andBookIntroduceEqualTo(String value) {
            addCriterion("BOOK_INTRODUCE =", value, "bookIntroduce");
            return (Criteria) this;
        }

        public Criteria andBookIntroduceNotEqualTo(String value) {
            addCriterion("BOOK_INTRODUCE <>", value, "bookIntroduce");
            return (Criteria) this;
        }

        public Criteria andBookIntroduceGreaterThan(String value) {
            addCriterion("BOOK_INTRODUCE >", value, "bookIntroduce");
            return (Criteria) this;
        }

        public Criteria andBookIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("BOOK_INTRODUCE >=", value, "bookIntroduce");
            return (Criteria) this;
        }

        public Criteria andBookIntroduceLessThan(String value) {
            addCriterion("BOOK_INTRODUCE <", value, "bookIntroduce");
            return (Criteria) this;
        }

        public Criteria andBookIntroduceLessThanOrEqualTo(String value) {
            addCriterion("BOOK_INTRODUCE <=", value, "bookIntroduce");
            return (Criteria) this;
        }

        public Criteria andBookIntroduceLike(String value) {
            addCriterion("BOOK_INTRODUCE like", value, "bookIntroduce");
            return (Criteria) this;
        }

        public Criteria andBookIntroduceNotLike(String value) {
            addCriterion("BOOK_INTRODUCE not like", value, "bookIntroduce");
            return (Criteria) this;
        }

        public Criteria andBookIntroduceIn(List<String> values) {
            addCriterion("BOOK_INTRODUCE in", values, "bookIntroduce");
            return (Criteria) this;
        }

        public Criteria andBookIntroduceNotIn(List<String> values) {
            addCriterion("BOOK_INTRODUCE not in", values, "bookIntroduce");
            return (Criteria) this;
        }

        public Criteria andBookIntroduceBetween(String value1, String value2) {
            addCriterion("BOOK_INTRODUCE between", value1, value2, "bookIntroduce");
            return (Criteria) this;
        }

        public Criteria andBookIntroduceNotBetween(String value1, String value2) {
            addCriterion("BOOK_INTRODUCE not between", value1, value2, "bookIntroduce");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNull() {
            addCriterion("BOOK_AUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNotNull() {
            addCriterion("BOOK_AUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorEqualTo(String value) {
            addCriterion("BOOK_AUTHOR =", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotEqualTo(String value) {
            addCriterion("BOOK_AUTHOR <>", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThan(String value) {
            addCriterion("BOOK_AUTHOR >", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("BOOK_AUTHOR >=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThan(String value) {
            addCriterion("BOOK_AUTHOR <", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThanOrEqualTo(String value) {
            addCriterion("BOOK_AUTHOR <=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLike(String value) {
            addCriterion("BOOK_AUTHOR like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotLike(String value) {
            addCriterion("BOOK_AUTHOR not like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIn(List<String> values) {
            addCriterion("BOOK_AUTHOR in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotIn(List<String> values) {
            addCriterion("BOOK_AUTHOR not in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorBetween(String value1, String value2) {
            addCriterion("BOOK_AUTHOR between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotBetween(String value1, String value2) {
            addCriterion("BOOK_AUTHOR not between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBorrowingCountIsNull() {
            addCriterion("BORROWING_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andBorrowingCountIsNotNull() {
            addCriterion("BORROWING_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowingCountEqualTo(Short value) {
            addCriterion("BORROWING_COUNT =", value, "borrowingCount");
            return (Criteria) this;
        }

        public Criteria andBorrowingCountNotEqualTo(Short value) {
            addCriterion("BORROWING_COUNT <>", value, "borrowingCount");
            return (Criteria) this;
        }

        public Criteria andBorrowingCountGreaterThan(Short value) {
            addCriterion("BORROWING_COUNT >", value, "borrowingCount");
            return (Criteria) this;
        }

        public Criteria andBorrowingCountGreaterThanOrEqualTo(Short value) {
            addCriterion("BORROWING_COUNT >=", value, "borrowingCount");
            return (Criteria) this;
        }

        public Criteria andBorrowingCountLessThan(Short value) {
            addCriterion("BORROWING_COUNT <", value, "borrowingCount");
            return (Criteria) this;
        }

        public Criteria andBorrowingCountLessThanOrEqualTo(Short value) {
            addCriterion("BORROWING_COUNT <=", value, "borrowingCount");
            return (Criteria) this;
        }

        public Criteria andBorrowingCountIn(List<Short> values) {
            addCriterion("BORROWING_COUNT in", values, "borrowingCount");
            return (Criteria) this;
        }

        public Criteria andBorrowingCountNotIn(List<Short> values) {
            addCriterion("BORROWING_COUNT not in", values, "borrowingCount");
            return (Criteria) this;
        }

        public Criteria andBorrowingCountBetween(Short value1, Short value2) {
            addCriterion("BORROWING_COUNT between", value1, value2, "borrowingCount");
            return (Criteria) this;
        }

        public Criteria andBorrowingCountNotBetween(Short value1, Short value2) {
            addCriterion("BORROWING_COUNT not between", value1, value2, "borrowingCount");
            return (Criteria) this;
        }

        public Criteria andBorrowingFlagIsNull() {
            addCriterion("BORROWING_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBorrowingFlagIsNotNull() {
            addCriterion("BORROWING_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowingFlagEqualTo(String value) {
            addCriterion("BORROWING_FLAG =", value, "borrowingFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowingFlagNotEqualTo(String value) {
            addCriterion("BORROWING_FLAG <>", value, "borrowingFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowingFlagGreaterThan(String value) {
            addCriterion("BORROWING_FLAG >", value, "borrowingFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowingFlagGreaterThanOrEqualTo(String value) {
            addCriterion("BORROWING_FLAG >=", value, "borrowingFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowingFlagLessThan(String value) {
            addCriterion("BORROWING_FLAG <", value, "borrowingFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowingFlagLessThanOrEqualTo(String value) {
            addCriterion("BORROWING_FLAG <=", value, "borrowingFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowingFlagLike(String value) {
            addCriterion("BORROWING_FLAG like", value, "borrowingFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowingFlagNotLike(String value) {
            addCriterion("BORROWING_FLAG not like", value, "borrowingFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowingFlagIn(List<String> values) {
            addCriterion("BORROWING_FLAG in", values, "borrowingFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowingFlagNotIn(List<String> values) {
            addCriterion("BORROWING_FLAG not in", values, "borrowingFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowingFlagBetween(String value1, String value2) {
            addCriterion("BORROWING_FLAG between", value1, value2, "borrowingFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowingFlagNotBetween(String value1, String value2) {
            addCriterion("BORROWING_FLAG not between", value1, value2, "borrowingFlag");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("PIC_URL is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("PIC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("PIC_URL =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("PIC_URL <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("PIC_URL >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_URL >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("PIC_URL <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("PIC_URL <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("PIC_URL like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("PIC_URL not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("PIC_URL in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("PIC_URL not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("PIC_URL between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("PIC_URL not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNull() {
            addCriterion("TRAFFIC is null");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNotNull() {
            addCriterion("TRAFFIC is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficEqualTo(Long value) {
            addCriterion("TRAFFIC =", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotEqualTo(Long value) {
            addCriterion("TRAFFIC <>", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThan(Long value) {
            addCriterion("TRAFFIC >", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThanOrEqualTo(Long value) {
            addCriterion("TRAFFIC >=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThan(Long value) {
            addCriterion("TRAFFIC <", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThanOrEqualTo(Long value) {
            addCriterion("TRAFFIC <=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficIn(List<Long> values) {
            addCriterion("TRAFFIC in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotIn(List<Long> values) {
            addCriterion("TRAFFIC not in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficBetween(Long value1, Long value2) {
            addCriterion("TRAFFIC between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotBetween(Long value1, Long value2) {
            addCriterion("TRAFFIC not between", value1, value2, "traffic");
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