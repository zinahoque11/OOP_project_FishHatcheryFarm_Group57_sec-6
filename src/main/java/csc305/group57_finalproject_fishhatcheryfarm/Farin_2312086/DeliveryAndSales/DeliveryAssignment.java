package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.DeliveryAndSales;
import java.io.Serializable;

public class DeliveryAssignment implements Serializable {
    private String orderId;
    private String customer;
    private String fish;
    private String quantity;
    private String status;
    private String vehicleId;
    private String deliveryRoute;

    public DeliveryAssignment(String orderId, String customer, String fish, String quantity, String status, String vehicleId, String deliveryRoute) {
        this.orderId = orderId;
        this.customer = customer;
        this.fish = fish;
        this.quantity = quantity;
        this.status = status;
        this.vehicleId = vehicleId;
        this.deliveryRoute = deliveryRoute;

    }

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

    public String getFish() {
        return fish;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDeliveryRoute() {
        return deliveryRoute;
    }

    @Override
    public String toString() {
        return "DeliveryAssignment{" +
                "orderId='" + orderId + '\'' +
                ", customer='" + customer + '\'' +
                ", fish='" + fish + '\'' +
                ", quantity='" + quantity + '\'' +
                ", status='" + status + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                ", deliveryRoute='" + deliveryRoute + '\'' +
                '}';
    }

    public void setDeliveryRoute(String deliveryRoute) {
        this.deliveryRoute = deliveryRoute;


    }
}
