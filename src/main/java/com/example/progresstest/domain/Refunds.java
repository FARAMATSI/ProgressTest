//package com.example.progresstest.domain;
//
//import javax.persistence.*;
//import java.math.BigDecimal;
//import java.sql.Date;
//
///**
// * @author Terrance Nyamfukudza
// * 28/11/2023
// */
//@Entity
//@Table(name = "REFUNDS", schema = "PUB", catalog = "SSBDATABASE")
//public class Refunds {
//    @Id
//    @Basic
//    @Column(name = "Refund_Type", nullable = true, length = 2)
//    private String refundType;
//    @Basic
//    @Column(name = "Refund_Code", nullable = true, length = 16)
//    private String refundCode;
//    @Basic
//    @Column(name = "Cheque_Date", nullable = false)
//    private Date chequeDate;
//    @Basic
//    @Column(name = "Crossed", nullable = true, columnDefinition = "BIT", length = 1)
//    private Boolean crossed;
//    @Basic
//    @Column(name = "Payee", nullable = true, length = 60)
//    private String payee;
//    @Basic
//    @Column(name = "Amount", nullable = true, precision = 2)
//    private BigDecimal amount;
//    @Basic
//    @Column(name = "Original_Chq", nullable = true, length = 16)
//    private String originalChq;
//    @Basic
//    @Column(name = "Run_Date", nullable = true)
//    private Date runDate;
//    @Basic
//    @Column(name = "Amend_Date", nullable = true)
//    private Date amendDate;
//    @Basic
//    @Column(name = "Amend_Time", nullable = true)
//    private Integer amendTime;
//    @Basic
//    @Column(name = "Amend_Op", nullable = true, length = 8)
//    private String amendOp;
//
//    public String getRefundType() {
//        return refundType;
//    }
//
//    public void setRefundType(String refundType) {
//        this.refundType = refundType;
//    }
//
//    public String getRefundCode() {
//        return refundCode;
//    }
//
//    public void setRefundCode(String refundCode) {
//        this.refundCode = refundCode;
//    }
//
//    public Date getChequeDate() {
//        return chequeDate;
//    }
//
//    public void setChequeDate(Date chequeDate) {
//        this.chequeDate = chequeDate;
//    }
//
//    public Boolean getCrossed() {
//        return crossed;
//    }
//
//    public void setCrossed(Boolean crossed) {
//        this.crossed = crossed;
//    }
//
//    public String getPayee() {
//        return payee;
//    }
//
//    public void setPayee(String payee) {
//        this.payee = payee;
//    }
//
//    public BigDecimal getAmount() {
//        return amount;
//    }
//
//    public void setAmount(BigDecimal amount) {
//        this.amount = amount;
//    }
//
//    public String getOriginalChq() {
//        return originalChq;
//    }
//
//    public void setOriginalChq(String originalChq) {
//        this.originalChq = originalChq;
//    }
//
//    public Date getRunDate() {
//        return runDate;
//    }
//
//    public void setRunDate(Date runDate) {
//        this.runDate = runDate;
//    }
//
//    public Date getAmendDate() {
//        return amendDate;
//    }
//
//    public void setAmendDate(Date amendDate) {
//        this.amendDate = amendDate;
//    }
//
//    public Integer getAmendTime() {
//        return amendTime;
//    }
//
//    public void setAmendTime(Integer amendTime) {
//        this.amendTime = amendTime;
//    }
//
//    public String getAmendOp() {
//        return amendOp;
//    }
//
//    public void setAmendOp(String amendOp) {
//        this.amendOp = amendOp;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Refunds refunds = (Refunds) o;
//
//        if (refundType != null ? !refundType.equals(refunds.refundType) : refunds.refundType != null) return false;
//        if (refundCode != null ? !refundCode.equals(refunds.refundCode) : refunds.refundCode != null) return false;
//        if (chequeDate != null ? !chequeDate.equals(refunds.chequeDate) : refunds.chequeDate != null) return false;
//        if (crossed != null ? !crossed.equals(refunds.crossed) : refunds.crossed != null) return false;
//        if (payee != null ? !payee.equals(refunds.payee) : refunds.payee != null) return false;
//        if (amount != null ? !amount.equals(refunds.amount) : refunds.amount != null) return false;
//        if (originalChq != null ? !originalChq.equals(refunds.originalChq) : refunds.originalChq != null) return false;
//        if (runDate != null ? !runDate.equals(refunds.runDate) : refunds.runDate != null) return false;
//        if (amendDate != null ? !amendDate.equals(refunds.amendDate) : refunds.amendDate != null) return false;
//        if (amendTime != null ? !amendTime.equals(refunds.amendTime) : refunds.amendTime != null) return false;
//        if (amendOp != null ? !amendOp.equals(refunds.amendOp) : refunds.amendOp != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = refundType != null ? refundType.hashCode() : 0;
//        result = 31 * result + (refundCode != null ? refundCode.hashCode() : 0);
//        result = 31 * result + (chequeDate != null ? chequeDate.hashCode() : 0);
//        result = 31 * result + (crossed != null ? crossed.hashCode() : 0);
//        result = 31 * result + (payee != null ? payee.hashCode() : 0);
//        result = 31 * result + (amount != null ? amount.hashCode() : 0);
//        result = 31 * result + (originalChq != null ? originalChq.hashCode() : 0);
//        result = 31 * result + (runDate != null ? runDate.hashCode() : 0);
//        result = 31 * result + (amendDate != null ? amendDate.hashCode() : 0);
//        result = 31 * result + (amendTime != null ? amendTime.hashCode() : 0);
//        result = 31 * result + (amendOp != null ? amendOp.hashCode() : 0);
//        return result;
//    }
//}
