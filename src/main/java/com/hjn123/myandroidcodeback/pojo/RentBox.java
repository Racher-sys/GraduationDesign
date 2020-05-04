package com.hjn123.myandroidcodeback.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class RentBox {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier_rent_box.id
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier_rent_box.courier_id
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    private Integer courierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier_rent_box.order_no
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    private Long orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier_rent_box.cabinet_id
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    private Integer cabinetId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier_rent_box.rent_number
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    private Integer rentNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier_rent_box.rent_size
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    private Integer rentSize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier_rent_box.start_time
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier_rent_box.day_number
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    private Integer dayNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier_rent_box.finish_time
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    private Date finishTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier_rent_box.payment
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    private BigDecimal payment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier_rent_box.status
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier_rent_box.create_time
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier_rent_box.payment_time
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    private Date paymentTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier_rent_box.id
     *
     * @return the value of courier_rent_box.id
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier_rent_box.id
     *
     * @param id the value for courier_rent_box.id
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier_rent_box.courier_id
     *
     * @return the value of courier_rent_box.courier_id
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public Integer getCourierId() {
        return courierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier_rent_box.courier_id
     *
     * @param courierId the value for courier_rent_box.courier_id
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public void setCourierId(Integer courierId) {
        this.courierId = courierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier_rent_box.order_no
     *
     * @return the value of courier_rent_box.order_no
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public Long getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier_rent_box.order_no
     *
     * @param orderNo the value for courier_rent_box.order_no
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier_rent_box.cabinet_id
     *
     * @return the value of courier_rent_box.cabinet_id
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public Integer getCabinetId() {
        return cabinetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier_rent_box.cabinet_id
     *
     * @param cabinetId the value for courier_rent_box.cabinet_id
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public void setCabinetId(Integer cabinetId) {
        this.cabinetId = cabinetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier_rent_box.rent_number
     *
     * @return the value of courier_rent_box.rent_number
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public Integer getRentNumber() {
        return rentNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier_rent_box.rent_number
     *
     * @param rentNumber the value for courier_rent_box.rent_number
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public void setRentNumber(Integer rentNumber) {
        this.rentNumber = rentNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier_rent_box.rent_size
     *
     * @return the value of courier_rent_box.rent_size
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public Integer getRentSize() {
        return rentSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier_rent_box.rent_size
     *
     * @param rentSize the value for courier_rent_box.rent_size
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public void setRentSize(Integer rentSize) {
        this.rentSize = rentSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier_rent_box.start_time
     *
     * @return the value of courier_rent_box.start_time
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier_rent_box.start_time
     *
     * @param startTime the value for courier_rent_box.start_time
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier_rent_box.day_number
     *
     * @return the value of courier_rent_box.day_number
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public Integer getDayNumber() {
        return dayNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier_rent_box.day_number
     *
     * @param dayNumber the value for courier_rent_box.day_number
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public void setDayNumber(Integer dayNumber) {
        this.dayNumber = dayNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier_rent_box.finish_time
     *
     * @return the value of courier_rent_box.finish_time
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier_rent_box.finish_time
     *
     * @param finishTime the value for courier_rent_box.finish_time
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier_rent_box.payment
     *
     * @return the value of courier_rent_box.payment
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier_rent_box.payment
     *
     * @param payment the value for courier_rent_box.payment
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier_rent_box.status
     *
     * @return the value of courier_rent_box.status
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier_rent_box.status
     *
     * @param status the value for courier_rent_box.status
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier_rent_box.create_time
     *
     * @return the value of courier_rent_box.create_time
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier_rent_box.create_time
     *
     * @param createTime the value for courier_rent_box.create_time
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier_rent_box.payment_time
     *
     * @return the value of courier_rent_box.payment_time
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier_rent_box.payment_time
     *
     * @param paymentTime the value for courier_rent_box.payment_time
     *
     * @mbg.generated Mon May 04 16:20:14 CST 2020
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }
}