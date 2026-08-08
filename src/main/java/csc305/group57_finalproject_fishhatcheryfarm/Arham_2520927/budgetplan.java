package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import java.io.Serializable;
import java.time.LocalDate;

public class budgetplan implements Serializable {

    private String department, Category;
    private Float totalAmount;
    private LocalDate period;

    public budgetplan(String department, String category, Float totalAmount, LocalDate period) {
        this.department = department;
        Category = category;
        this.totalAmount = totalAmount;
        this.period = period;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDate getPeriod() {
        return period;
    }

    public void setPeriod(LocalDate period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "budgetplan{" +
                "department='" + department + '\'' +
                ", Category='" + Category + '\'' +
                ", totalAmount=" + totalAmount +
                ", period=" + period +
                '}';
    }
}