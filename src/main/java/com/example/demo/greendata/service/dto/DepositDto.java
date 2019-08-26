package com.example.demo.greendata.service.dto;

import java.math.BigDecimal;
import java.util.Date;

public class DepositDto extends CommonDto {

    private Integer clientId;

    private Integer bankId;

    private Date openDate;

    private BigDecimal percent;

    private Integer term;

    public DepositDto() {
    }

    public DepositDto(Integer clientId, Integer bankId, Date openDate, BigDecimal percent, Integer term) {
        this.clientId = clientId;
        this.bankId = bankId;
        this.openDate = openDate;
        this.percent = percent;
        this.term = term;
    }

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
