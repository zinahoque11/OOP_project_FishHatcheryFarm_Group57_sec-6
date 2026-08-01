package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import java.io.Serializable;
import java.time.LocalDate;

public class supplyFood implements Serializable {
    private String productName, feedType;
    private float quantitySupplied, unitPrice;
    private LocalDate deliveryDate, expiryDate, MfgDate;

    public supplyFood(String productName, String feedType, float quantitySupplied, float unitPrice, LocalDate deliveryDate, LocalDate expiryDate, LocalDate mfgDate) {
        this.productName = productName;
        this.feedType = feedType;
        this.quantitySupplied = quantitySupplied;
        this.unitPrice = unitPrice;
        this.deliveryDate = deliveryDate;
        this.expiryDate = expiryDate;
        MfgDate = mfgDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getFeedType() {
        return feedType;
    }

    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    public float getQuantitySupplied() {
        return quantitySupplied;
    }

    public void setQuantitySupplied(float quantitySupplied) {
        this.quantitySupplied = quantitySupplied;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public LocalDate getMfgDate() {
        return MfgDate;
    }

    public void setMfgDate(LocalDate mfgDate) {
        MfgDate = mfgDate;
    }

    @Override
    public String toString() {
        return "supplyFood{" +
                "productName='" + productName + '\'' +
                ", feedType='" + feedType + '\'' +
                ", quantitySupplied=" + quantitySupplied +
                ", unitPrice=" + unitPrice +
                ", deliveryDate=" + deliveryDate +
                ", expiryDate=" + expiryDate +
                ", MfgDate=" + MfgDate +
                '}';
    }
}
