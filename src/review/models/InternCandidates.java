package review.models;

public class InternCandidates extends Candidates {
    private String major;
    private String semester;
    private String universityName;

    public InternCandidates() {
    }

    public InternCandidates(String major, String semester, String universityName) {
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public InternCandidates(String idCandidate, String firstName, String lastName, int dOB, String address, long phoneNum, String email, int candidateType, String major, String semester, String universityName) {
        super(idCandidate, firstName, lastName, dOB, address, phoneNum, email, candidateType);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "InternCadidates{" +
                super.toString() +
                ", major='" + major + '\'' +
                ", semester='" + semester + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
