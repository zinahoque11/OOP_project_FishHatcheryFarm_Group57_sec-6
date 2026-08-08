package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.HatcheryProduction;

import java.io.Serializable;
import java.time.LocalDate;

public class FeedDistribution implements Serializable {
    private String batchId;
    private String feedType;
    private double quantity;
    private LocalDate feedingTime; // Or String/LocalDateTime depending on your date/time setup
    private double totalFeed;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getFeedType() {
        return feedType;
    }

    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public LocalDate getFeedingTime() {
        return feedingTime;
    }

    public void setFeedingTime(LocalDate feedingTime) {
        this.feedingTime = feedingTime;
    }

    public double getTotalFeed() {
        return totalFeed;
    }

    public void setTotalFeed(double totalFeed) {
        this.totalFeed = totalFeed;
    }

    @Override
    public String toString() {
        return "FeedDistribution{" +
                "batchId='" + batchId + '\'' +
                ", feedType='" + feedType + '\'' +
                ", quantity=" + quantity +
                ", feedingTime=" + feedingTime +
                ", totalFeed=" + totalFeed +
                '}';
    }

    public FeedDistribution(String batchId, String feedType, double quantity, LocalDate feedingTime, double totalFeed) {
        this.batchId = batchId;
        this.feedType = feedType;
        this.quantity = quantity;
        this.feedingTime = feedingTime;
        this.totalFeed = totalFeed;



    }
}
