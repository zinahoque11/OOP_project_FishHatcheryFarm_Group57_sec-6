package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import java.io.Serializable;
import java.time.LocalDate;

public class foodInventory implements Serializable {

    private String foodType,stockStatus,fishSpecies ;
    private float foodQuantity;
    private LocalDate expiryDate,productionDate;
    private float expiredFoodQuantity,wastedFoodQuantity;


    public foodInventory(String foodType, String stockStatus, String fishSpecies, float foodQuantity, LocalDate expiryDate, LocalDate productionDate, float expiredFoodQuantity, float wastedFoodQuantity) {
        this.foodType = foodType;
        this.stockStatus = stockStatus;
        this.fishSpecies = fishSpecies;
        this.foodQuantity = foodQuantity;
        this.expiryDate = expiryDate;
        this.productionDate = productionDate;
        this.expiredFoodQuantity = expiredFoodQuantity;
        this.wastedFoodQuantity = wastedFoodQuantity;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public String getFishSpecies() {
        return fishSpecies;
    }

    public void setFishSpecies(String fishSpecies) {
        this.fishSpecies = fishSpecies;
    }

    public float getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(float foodQuantity) {
        this.foodQuantity = foodQuantity;
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

    @Override
    public String toString() {
        return "foodInventory{" +
                "foodType='" + foodType + '\'' +
                ", stockStatus='" + stockStatus + '\'' +
                ", fishSpecies='" + fishSpecies + '\'' +
                ", foodQuantity=" + foodQuantity +
                ", expiryDate=" + expiryDate +
                ", productionDate=" + productionDate +
                ", expiredFoodQuantity=" + expiredFoodQuantity +
                ", wastedFoodQuantity=" + wastedFoodQuantity +
                '}';
    }

    public foodInventory(){

    }
}
