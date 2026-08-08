package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import java.time.LocalDate;

public class taxmanagement {
    private String taxID, taxtype, paymentmethod;
    private LocalDate dueDate, paymentDate;
    private float paymentamount, dueamount;

    public taxmanagement(String taxID, String taxtype, String paymentmethod, LocalDate dueDate, LocalDate paymentDate, float paymentamount, float dueamount) {
        this.taxID = taxID;
        this.taxtype = taxtype;
        this.paymentmethod = paymentmethod;
        this.dueDate = dueDate;
        this.paymentDate = paymentDate;
        this.paymentamount = paymentamount;
        this.dueamount = dueamount;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public String getTaxtype() {
        return taxtype;
    }

    public void setTaxtype(String taxtype) {
        this.taxtype = taxtype;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public float getPaymentamount() {
        return paymentamount;
    }

    public void setPaymentamount(float paymentamount) {
        this.paymentamount = paymentamount;
    }

    public float getDueamount() {
        return dueamount;
    }

    public void setDueamount(float dueamount) {
        this.dueamount = dueamount;
    }

    @Override
    public String toString() {
        return "taxmanagement{" +
                "taxID='" + taxID + '\'' +
                ", taxtype='" + taxtype + '\'' +
                ", paymentmethod='" + paymentmethod + '\'' +
                ", dueDate=" + dueDate +
                ", paymentDate=" + paymentDate +
                ", paymentamount=" + paymentamount +
                ", dueamount=" + dueamount +
                '}';
    }
}
