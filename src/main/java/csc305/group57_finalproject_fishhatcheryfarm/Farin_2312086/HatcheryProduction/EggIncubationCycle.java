package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.HatcheryProduction;

import java.io.Serializable;

public class EggIncubationCycle implements Serializable {
    private double temperature;
    private double oxygenLevel;
    private double phValue;
    private String cycleStatus;
    private String status;
    private String duration;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(double oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public double getPhValue() {
        return phValue;
    }

    public void setPhValue(double phValue) {
        this.phValue = phValue;
    }

    public String getCycleStatus() {
        return cycleStatus;
    }

    public void setCycleStatus(String cycleStatus) {
        this.cycleStatus = cycleStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "EggIncubationCycle{" +
                "temperature=" + temperature +
                ", oxygenLevel=" + oxygenLevel +
                ", phValue=" + phValue +
                ", cycleStatus='" + cycleStatus + '\'' +
                ", status='" + status + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    public EggIncubationCycle(double temperature, double oxygenLevel, double phValue, String cycleStatus, String status, String duration) {
        this.temperature = temperature;
        this.oxygenLevel = oxygenLevel;
        this.phValue = phValue;
        this.cycleStatus = cycleStatus;
        this.status = status;
        this.duration = duration;




    }
}
