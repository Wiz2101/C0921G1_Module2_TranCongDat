package review.models;

public abstract class Candidates {
    private String idCandidate;
    private String firstName;
    private String lastName;
    private int dOB;
    private String address;
    private long phoneNum;
    private String email;
    private int candidateType;

    public Candidates() {
    }

    public Candidates(String idCandidate, String firstName, String lastName, int dOB, String address, long phoneNum, String email, int candidateType) {
        this.idCandidate = idCandidate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dOB = dOB;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
        this.candidateType = candidateType;
    }

    public String getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(String idCandidate) {
        this.idCandidate = idCandidate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getdOB() {
        return dOB;
    }

    public void setdOB(int dOB) {
        this.dOB = dOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }

    @Override
    public String toString() {
        return "idCandidate='" + idCandidate + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dOB='" + dOB + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum=" + phoneNum +
                ", email='" + email + '\'' +
                ", candidateType='" + candidateType;
    }
}
