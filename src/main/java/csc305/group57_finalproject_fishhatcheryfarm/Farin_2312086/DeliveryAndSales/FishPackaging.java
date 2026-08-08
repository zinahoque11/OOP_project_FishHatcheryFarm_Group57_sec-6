package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.DeliveryAndSales;

import java.io.Serializable;

public class FishPackaging implements Serializable {
    private String batchId;
    private String route;
    private int totalOrders;
    private String packagingType;
    private int packagingQuantity;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }

    public String getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    public int getPackagingQuantity() {
        return packagingQuantity;
    }

    public void setPackagingQuantity(int packagingQuantity) {
        this.packagingQuantity = packagingQuantity;
    }

    @Override
    public String toString() {
        return "FishPackaging{" +
                "batchId='" + batchId + '\'' +
                ", route='" + route + '\'' +
                ", totalOrders=" + totalOrders +
                ", packagingType='" + packagingType + '\'' +
                ", packagingQuantity=" + packagingQuantity +
                '}';
    }

    public FishPackaging(String batchId, String route, int totalOrders, String packagingType, int packagingQuantity) {
        this.batchId = batchId;
        this.route = route;
        this.totalOrders = totalOrders;
        this.packagingType = packagingType;
        this.packagingQuantity = packagingQuantity;


    }
}
