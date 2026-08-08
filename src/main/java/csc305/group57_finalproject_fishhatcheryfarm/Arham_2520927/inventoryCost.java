package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import java.io.Serializable;

public class inventoryCost implements Serializable{
        private String itemId;
        private String itemName;
        private String category;
        private int quantity;
        private float unitCost;
        private float totalCost;
        private String status;
        private String lastUpdated;

        public inventoryCost(String itemId, String itemName, String category,
                             int quantity, float unitCost, String status, String lastUpdated) {
            this.itemId = itemId;
            this.itemName = itemName;
            this.category = category;
            this.quantity = quantity;
            this.unitCost = unitCost;
            this.totalCost = quantity * unitCost;
            this.status = status;
            this.lastUpdated = lastUpdated;
        }

        // Getters and setters
        public String getItemId() { return itemId; }
        public void setItemId(String itemId) { this.itemId = itemId; }

        public String getItemName() { return itemName; }
        public void setItemName(String itemName) { this.itemName = itemName; }

        public String getCategory() { return category; }
        public void setCategory(String category) { this.category = category; }

        public int getQuantity() { return quantity; }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
            this.totalCost = this.quantity * this.unitCost;
        }

        public float getUnitCost() { return unitCost; }
        public void setUnitCost(float unitCost) {
            this.unitCost = unitCost;
            this.totalCost = this.quantity * this.unitCost;
        }

        public float getTotalCost() { return totalCost; }

        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }

        public String getLastUpdated() { return lastUpdated; }
        public void setLastUpdated(String lastUpdated) { this.lastUpdated = lastUpdated; }

    @Override
    public String toString() {
        return "inventoryCost{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", unitCost=" + unitCost +
                ", totalCost=" + totalCost +
                ", status='" + status + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                '}';
    }
}



