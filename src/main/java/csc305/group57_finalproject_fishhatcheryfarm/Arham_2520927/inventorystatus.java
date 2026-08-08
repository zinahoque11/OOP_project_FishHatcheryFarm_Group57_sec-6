package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import java.time.LocalDate;

public class inventorystatus {
    private String category;
    private String itemName;
    private int quantity;
    private String status;
    private LocalDate lastUpdated;
    private String remarks;

    // Constructor
    public inventorystatus(String category, String itemName, int quantity,
                           String status, LocalDate lastUpdated, String remarks) {
        this.category = category;
        this.itemName = itemName;
        this.quantity = quantity;
        this.status = status;
        this.lastUpdated = lastUpdated;
        this.remarks = remarks;
    }

    public inventorystatus() {
    }

    // Getters and setters
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDate getLastUpdated() { return lastUpdated; }
    public void setLastUpdated(LocalDate lastUpdated) { this.lastUpdated = lastUpdated; }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }

    @Override
    public String toString() {
        return "inventorystatus{" +
                "category='" + category + '\'' +
                ", itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                ", lastUpdated=" + lastUpdated +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
