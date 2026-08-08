package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import csc305.group57_finalproject_fishhatcheryfarm.user;

class accountant extends user {
    private String qualification, assignedsection;
    private int contactNo, experience;

    public accountant(String userName, String userEmail, String userId, String password, String qualification, String assignedsection, int contactNo, int experience) {
        super(userName, userEmail, userId, password);
        this.qualification = qualification;
        this.assignedsection = assignedsection;
        this.contactNo = contactNo;
        this.experience = experience;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getAssignedsection() {
        return assignedsection;
    }

    public void setAssignedsection(String assignedsection) {
        this.assignedsection = assignedsection;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "accountant{" +
                "qualification='" + qualification + '\'' +
                ", assignedsection='" + assignedsection + '\'' +
                ", contactNo=" + contactNo +
                ", experience=" + experience +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
