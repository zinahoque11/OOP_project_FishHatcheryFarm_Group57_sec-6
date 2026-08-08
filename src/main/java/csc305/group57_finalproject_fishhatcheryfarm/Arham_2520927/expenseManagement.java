package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import java.io.Serializable;
import java.time.LocalDate;

public class expenseManagement implements Serializable {
    private String expensetitle, expensetype;
    private Float amount;
    private LocalDate date;


    public expenseManagement(String expensetitle, String expensetype, Float amount, LocalDate date) {
        this.expensetitle = expensetitle;
        this.expensetype = expensetype;
        this.amount = amount;
        this.date = date;
    }

    public String getExpensetitle() {
        return expensetitle;
    }

    public void setExpensetitle(String expensetitle) {
        this.expensetitle = expensetitle;
    }

    public String getExpensetype() {
        return expensetype;
    }

    public void setExpensetype(String expensetype) {
        this.expensetype = expensetype;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "expenseManagement{" +
                "expensetitle='" + expensetitle + '\'' +
                ", expensetype='" + expensetype + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
