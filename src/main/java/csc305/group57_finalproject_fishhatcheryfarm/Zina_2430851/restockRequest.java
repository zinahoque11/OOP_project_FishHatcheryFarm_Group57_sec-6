package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import java.io.Serializable;
import java.time.LocalDate;

public class restockRequest implements Serializable {
    private String reqId;
    private String productType;
    private float requestedQuantity;
    private LocalDate requestedDate;
    private String requestedBy;

    public restockRequest(String reqId, String productType, float requestedQuantity, LocalDate requestedDate, String requestedBy) {
        this.reqId = reqId;
        this.productType = productType;
        this.requestedQuantity = requestedQuantity;
        this.requestedDate = requestedDate;
        this.requestedBy = requestedBy;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public float getRequestedQuantity() {
        return requestedQuantity;
    }

    public void setRequestedQuantity(float requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public LocalDate getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(LocalDate requestedDate) {
        this.requestedDate = requestedDate;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    @Override
    public String toString() {
        return "restockRequest{" +
                "reqId='" + reqId + '\'' +
                ", productType='" + productType + '\'' +
                ", requestedQuantity=" + requestedQuantity +
                ", requestedDate=" + requestedDate +
                ", requestedBy='" + requestedBy + '\'' +
                '}';
    }
}
