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
//@Table(name = "FR_HIST")
//public class FrHist {
//    @Id
//    @Basic
//    @Column(name = "EC_No", nullable = true, length = 16)
//    private String ecNo;
//    @Basic
//    @Column(name = "AD_Code", nullable = true)
//    private Integer adCode;
//    @Basic
//    @Column(name = "Amount", nullable = true, precision = 2)
//    private BigDecimal amount;
//    @Basic
//    @Column(name = "from_date")
//    private Date from;
//    @Basic
//    @Column(name = "To_Date", nullable = true)
//    private Date toDate;
//    @Basic
//    @Column(name = "Ref", nullable = true, length = 50)
//    private String ref;
//    @Basic
//    @Column(name = "Pay_pr", nullable = true)
//    private Integer payPr;
//
//    public String getEcNo() {
//        return ecNo;
//    }
//
//    public void setEcNo(String ecNo) {
//        this.ecNo = ecNo;
//    }
//
//    public Integer getAdCode() {
//        return adCode;
//    }
//
//    public void setAdCode(Integer adCode) {
//        this.adCode = adCode;
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
//    public Date getfrom() {
//        return from;
//    }
//
//    public void setfrom(Date from) {
//        this.from = from;
//    }
//
//    public Date getToDate() {
//        return toDate;
//    }
//
//    public void setToDate(Date toDate) {
//        this.toDate = toDate;
//    }
//
//    public String getRef() {
//        return ref;
//    }
//
//    public void setRef(String ref) {
//        this.ref = ref;
//    }
//
//    public Integer getPayPr() {
//        return payPr;
//    }
//
//    public void setPayPr(Integer payPr) {
//        this.payPr = payPr;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        FrHist frHist = (FrHist) o;
//
//        if (ecNo != null ? !ecNo.equals(frHist.ecNo) : frHist.ecNo != null) return false;
//        if (adCode != null ? !adCode.equals(frHist.adCode) : frHist.adCode != null) return false;
//        if (amount != null ? !amount.equals(frHist.amount) : frHist.amount != null) return false;
//        if (from != null ? !from.equals(frHist.from) : frHist.from != null) return false;
//        if (toDate != null ? !toDate.equals(frHist.toDate) : frHist.toDate != null) return false;
//        if (ref != null ? !ref.equals(frHist.ref) : frHist.ref != null) return false;
//        if (payPr != null ? !payPr.equals(frHist.payPr) : frHist.payPr != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = ecNo != null ? ecNo.hashCode() : 0;
//        result = 31 * result + (adCode != null ? adCode.hashCode() : 0);
//        result = 31 * result + (amount != null ? amount.hashCode() : 0);
//        result = 31 * result + (from != null ? from.hashCode() : 0);
//        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
//        result = 31 * result + (ref != null ? ref.hashCode() : 0);
//        result = 31 * result + (payPr != null ? payPr.hashCode() : 0);
//        return result;
//    }
//}
