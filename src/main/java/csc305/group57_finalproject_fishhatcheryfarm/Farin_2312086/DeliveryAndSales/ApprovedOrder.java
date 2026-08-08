package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.DeliveryAndSales;

import java.time.LocalDate;

public class ApprovedOrder {
    private String orderId;
    private String customer;
    private String route;
    private int quantity;
    private String deliveryStatus;
    private String batchId;
    private LocalDate deliveryDate;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "ApprovedOrder{" +
                "orderId='" + orderId + '\'' +
                ", customer='" + customer + '\'' +
                ", route='" + route + '\'' +
                ", quantity=" + quantity +
                ", deliveryStatus='" + deliveryStatus + '\'' +
                ", batchId='" + batchId + '\'' +
                ", deliveryDate=" + deliveryDate +
                '}';
    }

    public ApprovedOrder(String orderId, String customer, String route, int quantity, String deliveryStatus, String batchId, LocalDate deliveryDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.route = route;
        this.quantity = quantity;
        this.deliveryStatus = deliveryStatus;
        this.batchId = batchId;
        this.deliveryDate = deliveryDate;


    }
}
