package com.example.demo.greendata.dao.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table (schema = "greendata", name = "deposits")
public class DepositEntity extends CommonEntity {

    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "bank_id")
    private Integer bankId;

    @Column(name = "open_date")
    private Date openDate;

    @Column(name = "percent")
    private BigDecimal percent;

    @Column(name = "term")
    private Integer term;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }
}
