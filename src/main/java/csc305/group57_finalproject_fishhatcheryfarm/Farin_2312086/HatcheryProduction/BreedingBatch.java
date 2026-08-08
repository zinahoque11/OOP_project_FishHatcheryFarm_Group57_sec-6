package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.HatcheryProduction;

import java.io.Serializable;
import java.time.LocalDate;

public class BreedingBatch implements Serializable {
    private String batchId;
    private String fishSpecies;
    private String parentStockId;
    private String breedingMethod;
    private String fertilizationMethod;
    private LocalDate spawningDate;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getFishSpecies() {
        return fishSpecies;
    }

    public void setFishSpecies(String fishSpecies) {
        this.fishSpecies = fishSpecies;
    }

    public String getParentStockId() {
        return parentStockId;
    }

    public void setParentStockId(String parentStockId) {
        this.parentStockId = parentStockId;
    }

    public String getBreedingMethod() {
        return breedingMethod;
    }

    public void setBreedingMethod(String breedingMethod) {
        this.breedingMethod = breedingMethod;
    }

    public String getFertilizationMethod() {
        return fertilizationMethod;
    }

    public void setFertilizationMethod(String fertilizationMethod) {
        this.fertilizationMethod = fertilizationMethod;
    }

    public LocalDate getSpawningDate() {
        return spawningDate;
    }

    public void setSpawningDate(LocalDate spawningDate) {
        this.spawningDate = spawningDate;
    }

    @Override
    public String toString() {
        return "BreedingBatch{" +
                "batchId='" + batchId + '\'' +
                ", fishSpecies='" + fishSpecies + '\'' +
                ", parentStockId='" + parentStockId + '\'' +
                ", breedingMethod='" + breedingMethod + '\'' +
                ", fertilizationMethod='" + fertilizationMethod + '\'' +
                ", spawningDate=" + spawningDate +
                '}';
    }

    public BreedingBatch(String batchId, String fishSpecies, String parentStockId, String breedingMethod, String fertilizationMethod, LocalDate spawningDate) {
        this.batchId = batchId;
        this.fishSpecies = fishSpecies;
        this.parentStockId = parentStockId;
        this.breedingMethod = breedingMethod;
        this.fertilizationMethod = fertilizationMethod;
        this.spawningDate = spawningDate;
    }
}
