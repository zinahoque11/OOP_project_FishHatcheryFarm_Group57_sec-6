package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.HatcheryProduction;
import java.io.Serializable;

public class HatchSurvivalRate implements Serializable{
    private String batchId;
    private int initialEggs;
    private int survivingFry;
    private double survivalRate;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public int getInitialEggs() {
        return initialEggs;
    }

    public void setInitialEggs(int initialEggs) {
        this.initialEggs = initialEggs;
    }

    public int getSurvivingFry() {
        return survivingFry;
    }

    public void setSurvivingFry(int survivingFry) {
        this.survivingFry = survivingFry;
    }

    public double getSurvivingRate() {
        return survivalRate;
    }

    public void setSurvivingRate(double survivingRate) {
        this.survivalRate = survivingRate;
    }

    @Override
    public String toString() {
        return "HatchSurvivalRate{" +
                "batchId='" + batchId + '\'' +
                ", initialEggs=" + initialEggs +
                ", survivingFry=" + survivingFry +
                ", survivingRate=" + survivalRate +
                '}';
    }

    public HatchSurvivalRate(String batchId, int initialEggs, int survivingFry, double survivingRate) {
        this.batchId = batchId;
        this.initialEggs = initialEggs;
        this.survivingFry = survivingFry;
        this.survivalRate = survivingRate;




    }
}
