package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import csc305.group57_finalproject_fishhatcheryfarm.user;

class managingDirector extends user {
    private String status, responsibilities;
    private int contactNO, experience;

    public managingDirector(String userName, String userEmail, String userId, String password, String status, String responsibilities, int contactNO, int experience) {
        super(userName, userEmail, userId, password);
        this.status = status;
        this.responsibilities = responsibilities;
        this.contactNO = contactNO;
        this.experience = experience;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public int getContactNO() {
        return contactNO;
    }

    public void setContactNO(int contactNO) {
        this.contactNO = contactNO;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "managingDirector{" +
                "status='" + status + '\'' +
                ", responsibilities='" + responsibilities + '\'' +
                ", contactNO=" + contactNO +
                ", experience=" + experience +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
