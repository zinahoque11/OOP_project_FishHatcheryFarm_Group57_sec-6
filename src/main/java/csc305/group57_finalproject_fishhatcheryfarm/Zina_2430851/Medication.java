package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import java.time.LocalDate;

public class Medication {
    private String medType;
    private float dosage,quantity;
    private LocalDate expiryDate,deliveryDate;
    private String tankID;
    private String fishSpecies;
    private int medDurationDays;

    public Medication(String medType, float dosage, float quantity, LocalDate expiryDate, LocalDate deliveryDate, String tankID, String fishSpecies, int medDurationDays) {
        this.medType = medType;
        this.dosage = dosage;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.deliveryDate = deliveryDate;
        this.tankID = tankID;
        this.fishSpecies = fishSpecies;
        this.medDurationDays = medDurationDays;
    }

    public String getMedType() {
        return medType;
    }

    public void setMedType(String medType) {
        this.medType = medType;
    }

    public float getDosage() {
        return dosage;
    }

    public void setDosage(float dosage) {
        this.dosage = dosage;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getTankID() {
        return tankID;
    }

    public void setTankID(String tankID) {
        this.tankID = tankID;
    }

    public String getFishSpecies() {
        return fishSpecies;
    }

    public void setFishSpecies(String fishSpecies) {
        this.fishSpecies = fishSpecies;
    }

    public int getMedDurationDays() {
        return medDurationDays;
    }

    public void setMedDurationDays(int medDurationDays) {
        this.medDurationDays = medDurationDays;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "medType='" + medType + '\'' +
                ", dosage=" + dosage +
                ", quantity=" + quantity +
                ", expiryDate=" + expiryDate +
                ", deliveryDate=" + deliveryDate +
                ", tankID='" + tankID + '\'' +
                ", fishSpecies='" + fishSpecies + '\'' +
                ", medDurationDays=" + medDurationDays +
                '}';
    }
}
