package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.user;

class supplier extends user {

    private String companyName, contractStatus, licenseNumber;
    private int contactNumber;
    private boolean activeSupplier;

    public supplier(String userName, String userEmail, String userId, String password, String companyName, String contractStatus, String licenseNumber, int contactNumber, boolean activeSupplier) {
        super(userName, userEmail, userId, password);
        this.companyName = companyName;
        this.contractStatus = contractStatus;
        this.licenseNumber = licenseNumber;
        this.contactNumber = contactNumber;
        this.activeSupplier = activeSupplier;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isActiveSupplier() {
        return activeSupplier;
    }

    public void setActiveSupplier(boolean activeSupplier) {
        this.activeSupplier = activeSupplier;
    }


    @Override
    public String toString() {
        return "supplier{" +
                "companyName='" + companyName + '\'' +
                ", contractStatus='" + contractStatus + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", contactNumber=" + contactNumber +
                ", activeSupplier=" + activeSupplier +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
