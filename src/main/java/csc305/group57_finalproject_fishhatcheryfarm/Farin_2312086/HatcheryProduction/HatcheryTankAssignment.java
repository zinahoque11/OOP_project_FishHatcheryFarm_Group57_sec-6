package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.HatcheryProduction;

import java.io.Serializable;

public class HatcheryTankAssignment implements Serializable {
    private String batchId;
    private String tankId;
    private String species;
    private String assignedTank;
    private double eggSize;
    private String status;


    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getTankId() {
        return tankId;
    }

    public void setTankId(String tankId) {
        this.tankId = tankId;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAssignedTank() {
        return assignedTank;
    }

    public void setAssignedTank(String assignedTank) {
        this.assignedTank = assignedTank;
    }

    public double getEggSize() {
        return eggSize;
    }

    public void setEggSize(double eggSize) {
        this.eggSize = eggSize;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HatcheryTankAssignment{" +
                "batchId='" + batchId + '\'' +
                ", tankId='" + tankId + '\'' +
                ", species='" + species + '\'' +
                ", assignedTank='" + assignedTank + '\'' +
                ", eggSize=" + eggSize +
                ", status='" + status + '\'' +
                '}';
    }

    public HatcheryTankAssignment(String batchId, String tankId, String species, String assignedTank, double eggSize, String status) {
        this.batchId = batchId;
        this.tankId = tankId;
        this.species = species;
        this.assignedTank = assignedTank;
        this.eggSize = eggSize;
        this.status = status;




    }
}
