package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.DeliveryAndSales;

import java.io.Serializable;

public class BatchRevenueSummary implements Serializable {
    private String batchId;
    private String route;
    private int totalOrders;
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BatchRevenueSummary{" +
                "batchId='" + batchId + '\'' +
                ", route='" + route + '\'' +
                ", totalOrders=" + totalOrders +
                ", status='" + status + '\'' +
                '}';
    }

    public BatchRevenueSummary(String batchId, String route, int totalOrders, String status) {
        this.batchId = batchId;
        this.route = route;
        this.totalOrders = totalOrders;
        this.status = status;




    }
}
