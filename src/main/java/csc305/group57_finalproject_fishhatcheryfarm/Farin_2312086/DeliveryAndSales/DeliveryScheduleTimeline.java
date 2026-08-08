package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.DeliveryAndSales;

import java.io.Serializable;
import java.time.LocalDate;

public class DeliveryScheduleTimeline implements Serializable {
    private String batchId;
    private String vehicle;
    private LocalDate date;
    private String status;
    private int process;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getProcess() {
        return process;
    }

    public void setProcess(int process) {
        this.process = process;
    }

    @Override
    public String toString() {
        return "DeliveryScheduleTimeline{" +
                "batchId='" + batchId + '\'' +
                ", vehicle='" + vehicle + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", process=" + process +
                '}';
    }

    public DeliveryScheduleTimeline(String batchId, String vehicle, LocalDate date, String status, int process) {
        this.batchId = batchId;
        this.vehicle = vehicle;
        this.date = date;
        this.status = status;
        this.process = process;


    }
}
