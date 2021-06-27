package com.makeorder.pack.entity;

import java.io.Serializable;
import java.util.Date;

public class Seg implements Serializable {
    private Long id;
    private Long paxId;
    private String departAirport;
    private String arriveAirport;
    private Date departDate;
    private Date arriveDate;
    private Integer segIndex;
    private String fltNo;
    private String cabinCode;
    private String cabinLevel;
    private Long orderNo;
    private Long tktId;
    private String tktNo;
    private String remark;
    private Integer isValid;
    private Long crtId;
    private Date crtDt;
    private Long version;

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPaxId() {
        return paxId;
    }

    public void setPaxId(Long paxId) {
        this.paxId = paxId;
    }

    public String getDepartAirport() {
        return departAirport;
    }

    public void setDepartAirport(String departAirport) {
        this.departAirport = departAirport;
    }

    public String getArriveAirport() {
        return arriveAirport;
    }

    public void setArriveAirport(String arriveAirport) {
        this.arriveAirport = arriveAirport;
    }

    public Date getDepartDate() {
        return departDate;
    }

    public void setDepartDate(Date departDate) {
        this.departDate = departDate;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public Integer getSegIndex() {
        return segIndex;
    }

    public void setSegIndex(Integer segIndex) {
        this.segIndex = segIndex;
    }

    public String getFltNo() {
        return fltNo;
    }

    public void setFltNo(String fltNo) {
        this.fltNo = fltNo;
    }

    public String getCabinCode() {
        return cabinCode;
    }

    public void setCabinCode(String cabinCode) {
        this.cabinCode = cabinCode;
    }

    public String getCabinLevel() {
        return cabinLevel;
    }

    public void setCabinLevel(String cabinLevel) {
        this.cabinLevel = cabinLevel;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Long getTktId() {
        return tktId;
    }

    public void setTktId(Long tktId) {
        this.tktId = tktId;
    }

    public String getTktNo() {
        return tktNo;
    }

    public void setTktNo(String tktNo) {
        this.tktNo = tktNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Long getCrtId() {
        return crtId;
    }

    public void setCrtId(Long crtId) {
        this.crtId = crtId;
    }

    public Date getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(Date crtDt) {
        this.crtDt = crtDt;
    }
}
