package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.DeliveryAndSales;

import java.io.Serializable;

public class Orderrequest implements Serializable {
    private String orderId;
    private String customerName;
    private String customerPhone;
    private String fishSpecies;
    private int quantity;
    private double estimatedPrice;
    private String status;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getFishSpecies() {
        return fishSpecies;
    }

    public void setFishSpecies(String fishSpecies) {
        this.fishSpecies = fishSpecies;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getEstimatedPrice() {
        return estimatedPrice;
    }

    public void setEstimatedPrice(double estimatedPrice) {
        this.estimatedPrice = estimatedPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Orderrequest{" +
                "orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", fishSpecies='" + fishSpecies + '\'' +
                ", quantity=" + quantity +
                ", estimatedPrice=" + estimatedPrice +
                ", status='" + status + '\'' +
                '}';
    }

    public Orderrequest(String orderId, String customerName, String customerPhone, String fishSpecies, int quantity, double estimatedPrice, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.fishSpecies = fishSpecies;
        this.quantity = quantity;
        this.estimatedPrice = estimatedPrice;
        this.status = status;




    }
}
