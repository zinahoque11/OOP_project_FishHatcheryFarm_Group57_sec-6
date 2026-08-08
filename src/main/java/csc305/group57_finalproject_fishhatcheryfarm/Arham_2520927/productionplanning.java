package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import java.time.LocalDate;

public class productionplanning {
    private int targetFishQuantity;
    private String fishType;
    private LocalDate deadline;
    private String status;

    // Constructor
    public productionplanning(int targetFishQuantity, String fishType, LocalDate deadline, String status) {
        this.targetFishQuantity = targetFishQuantity;
        this.fishType = fishType;
        this.deadline = deadline;
        this.status = status;
    }

    public productionplanning() {
    }

    // Getters and setters
    public int getTargetFishQuantity() { return targetFishQuantity; }
    public void setTargetFishQuantity(int targetFishQuantity) { this.targetFishQuantity = targetFishQuantity; }

    public String getFishType() { return fishType; }
    public void setFishType(String fishType) { this.fishType = fishType; }

    public LocalDate getDeadline() { return deadline; }
    public void setDeadline(LocalDate deadline) { this.deadline = deadline; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "productionplanning{" +
                "targetFishQuantity=" + targetFishQuantity +
                ", fishType='" + fishType + '\'' +
                ", deadline=" + deadline +
                ", status='" + status + '\'' +
                '}';
    }
}
