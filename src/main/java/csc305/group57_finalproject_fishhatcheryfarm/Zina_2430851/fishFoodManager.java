package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.user;

import java.time.LocalDate;

class fishFoodManager extends user {


    private LocalDate shiftDate;
    private String shiftType, currentTask,assignedSection;

    public fishFoodManager(String userName, String userEmail, String userId, String password, LocalDate shiftDate, String shiftType, String currentTask, String assignedSection) {
        super(userName, userEmail, userId, password);
        this.shiftDate = shiftDate;
        this.shiftType = shiftType;
        this.currentTask = currentTask;
        this.assignedSection = assignedSection;
    }


    public LocalDate getShiftDate() {
        return shiftDate;
    }

    public void setShiftDate(LocalDate shiftDate) {
        this.shiftDate = shiftDate;
    }

    public String getShiftType() {
        return shiftType;
    }

    public void setShiftType(String shiftType) {
        this.shiftType = shiftType;
    }

    public String getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTask(String currentTask) {
        this.currentTask = currentTask;
    }

    public String getAssignedSection() {
        return assignedSection;
    }

    public void setAssignedSection(String assignedSection) {
        this.assignedSection = assignedSection;
    }


    @Override
    public String toString() {
        return "fishFoodManager{" +
                "shiftDate=" + shiftDate +
                ", shiftType='" + shiftType + '\'' +
                ", currentTask='" + currentTask + '\'' +
                ", assignedSection='" + assignedSection + '\'' +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
