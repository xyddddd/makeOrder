package com.makeorder.pack.entity;

import java.io.Serializable;
import java.util.Date;

public class Ticket implements Serializable {
    private Long id;
    private String tktNo;
    private String tripType;
    private Long paxId;
    private String paxName;
    private String paxType;
    private Double tktAmt;
    private Double taxAmt;
    private Long orderNo;
    private String remark;
    private Integer isValid;
    private Long crtId;
    private Pax pax;

    public Pax getPax() {
        return pax;
    }

    public void setPax(Pax pax) {
        this.pax = pax;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    private Date crtDt;
    private Long version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTktNo() {
        return tktNo;
    }

    public void setTktNo(String tktNo) {
        this.tktNo = tktNo;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public Long getPaxId() {
        return paxId;
    }

    public void setPaxId(Long paxId) {
        this.paxId = paxId;
    }

    public String getPaxName() {
        return paxName;
    }

    public void setPaxName(String paxName) {
        this.paxName = paxName;
    }

    public String getPaxType() {
        return paxType;
    }

    public void setPaxType(String paxType) {
        this.paxType = paxType;
    }

    public Double getTktAmt() {
        return tktAmt;
    }

    public void setTktAmt(Double tktAmt) {
        this.tktAmt = tktAmt;
    }

    public Double getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(Double taxAmt) {
        this.taxAmt = taxAmt;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
