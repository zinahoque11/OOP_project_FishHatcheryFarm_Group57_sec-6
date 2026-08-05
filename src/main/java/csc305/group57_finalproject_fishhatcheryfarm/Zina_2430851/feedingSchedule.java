package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import java.io.Serializable;
import java.time.LocalDate;

public class feedingSchedule implements Serializable {

    private String fishSpecies,dayOfFeeding,assignedSection;
    private LocalDate feedDate;
    private float foodAmount;
    private int tankID;

    public feedingSchedule(String fishSpecies, String dayOfFeeding, String assignedSection, LocalDate feedDate, float foodAmount, int tankID) {
        this.fishSpecies = fishSpecies;
        this.dayOfFeeding = dayOfFeeding;
        this.assignedSection = assignedSection;
        this.feedDate = feedDate;
        this.foodAmount = foodAmount;
        this.tankID = tankID;
    }


    public String getFishSpecies() {
        return fishSpecies;
    }

    public void setFishSpecies(String fishSpecies) {
        this.fishSpecies = fishSpecies;
    }

    public String getDayOfFeeding() {
        return dayOfFeeding;
    }

    public void setDayOfFeeding(String dayOfFeeding) {
        this.dayOfFeeding = dayOfFeeding;
    }

    public String getAssignedSection() {
        return assignedSection;
    }

    public void setAssignedSection(String assignedSection) {
        this.assignedSection = assignedSection;
    }

    public LocalDate getFeedDate() {
        return feedDate;
    }

    public void setFeedDate(LocalDate feedDate) {
        this.feedDate = feedDate;
    }

    public float getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(float foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getTankID() {
        return tankID;
    }

    public void setTankID(int tankID) {
        this.tankID = tankID;
    }

    @Override
    public String toString() {
        return "feedingSchedule{" +
                "fishSpecies='" + fishSpecies + '\'' +
                ", dayOfFeeding='" + dayOfFeeding + '\'' +
                ", assignedSection='" + assignedSection + '\'' +
                ", feedDate=" + feedDate +
                ", foodAmount=" + foodAmount +
                ", tankID=" + tankID +
                '}';
    }
}
