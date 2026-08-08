package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.DeliveryAndSales;

import java.io.Serializable;

public class DeliveryCompletionRecord implements Serializable {
    private String batchId;
    private String customer;
    private String vehicle;
    private String status;
    private String deliveryStatus;
    private String receipt;
    private String orderStatus;
    private String recordStatus;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    @Override
    public String toString() {
        return "DeliveryCompletionRecord{" +
                "batchId='" + batchId + '\'' +
                ", customer='" + customer + '\'' +
                ", vehicle='" + vehicle + '\'' +
                ", status='" + status + '\'' +
                ", deliveryStatus='" + deliveryStatus + '\'' +
                ", receipt='" + receipt + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", recordStatus='" + recordStatus + '\'' +
                '}';
    }

    public DeliveryCompletionRecord(String batchId, String customer, String vehicle, String status, String deliveryStatus, String receipt, String orderStatus, String recordStatus) {
        this.batchId = batchId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.status = status;
        this.deliveryStatus = deliveryStatus;
        this.receipt = receipt;
        this.orderStatus = orderStatus;
        this.recordStatus = recordStatus;



    }
}
