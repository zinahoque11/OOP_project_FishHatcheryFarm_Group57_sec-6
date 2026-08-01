package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import java.io.Serializable;
import java.time.LocalDate;

public class foodInventory implements Serializable {

    private String foodType;
    private float foodQuantity;
    private String stockStatus;
    private LocalDate expiryDate;
    private LocalDate productionDate;
    private float expiredFoodQuantity;
    private float wastedFoodQuantity;
    private String fishSpecies;

    public foodInventory(String foodType, float foodQuantity, String stockStatus, LocalDate expiryDate, LocalDate productionDate, float expiredFoodQuantity, float wastedFoodQuantity, String fishSpecies) {
        this.foodType = foodType;
        this.foodQuantity = foodQuantity;
        this.stockStatus = stockStatus;
        this.expiryDate = expiryDate;
        this.productionDate = productionDate;
        this.expiredFoodQuantity = expiredFoodQuantity;
        this.wastedFoodQuantity = wastedFoodQuantity;
        this.fishSpecies = fishSpecies;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public float getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(float foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public float getExpiredFoodQuantity() {
        return expiredFoodQuantity;
    }

    public void setExpiredFoodQuantity(float expiredFoodQuantity) {
        this.expiredFoodQuantity = expiredFoodQuantity;
    }

    public float getWastedFoodQuantity() {
        return wastedFoodQuantity;
    }

    public void setWastedFoodQuantity(float wastedFoodQuantity) {
        this.wastedFoodQuantity = wastedFoodQuantity;
    }

    public String getFishSpecies() {
        return fishSpecies;
    }

    public void setFishSpecies(String fishSpecies) {
        this.fishSpecies = fishSpecies;
    }

    @Override
    public String toString() {
        return "foodInventory{" +
                "foodType='" + foodType + '\'' +
                ", foodQuantity=" + foodQuantity +
                ", stockStatus='" + stockStatus + '\'' +
                ", expiryDate=" + expiryDate +
                ", productionDate=" + productionDate +
                ", expiredFoodQuantity=" + expiredFoodQuantity +
                ", wastedFoodQuantity=" + wastedFoodQuantity +
                ", fishSpecies='" + fishSpecies + '\'' +
                '}';
    }
}
