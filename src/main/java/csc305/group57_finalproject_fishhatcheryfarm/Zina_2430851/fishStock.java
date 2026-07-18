package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

public class fishStock {
    private String fishSpecies;
    private String batchID;
    private String healthStatus;
    private String tankID;
    private String growthStage;
    private int feedSessionsPerDay;

    public fishStock(String fishSpecies, String batchID, String healthStatus, String tankID, String growthStage, int feedSessionsPerDay) {
        this.fishSpecies = fishSpecies;
        this.batchID = batchID;
        this.healthStatus = healthStatus;
        this.tankID = tankID;
        this.growthStage = growthStage;
        this.feedSessionsPerDay = feedSessionsPerDay;
    }

    public String getFishSpecies() {
        return fishSpecies;
    }

    public void setFishSpecies(String fishSpecies) {
        this.fishSpecies = fishSpecies;
    }

    public String getBatchID() {
        return batchID;
    }

    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getTankID() {
        return tankID;
    }

    public void setTankID(String tankID) {
        this.tankID = tankID;
    }

    public String getGrowthStage() {
        return growthStage;
    }

    public void setGrowthStage(String growthStage) {
        this.growthStage = growthStage;
    }

    public int getFeedSessionsPerDay() {
        return feedSessionsPerDay;
    }

    public void setFeedSessionsPerDay(int feedSessionsPerDay) {
        this.feedSessionsPerDay = feedSessionsPerDay;
    }

    @Override
    public String toString() {
        return "fishStock{" +
                "fishSpecies='" + fishSpecies + '\'' +
                ", batchID='" + batchID + '\'' +
                ", healthStatus='" + healthStatus + '\'' +
                ", tankID='" + tankID + '\'' +
                ", growthStage='" + growthStage + '\'' +
                ", feedSessionsPerDay=" + feedSessionsPerDay +
                '}';
    }
}
