package review.models;

public class FresherCandidates extends Candidates {
    private String graduatedDate;
    private String graduatedRank;
    private String education;

    public FresherCandidates() {
    }

    public FresherCandidates(String graduatedDate, String graduatedRank, String education) {
        this.graduatedDate = graduatedDate;
        this.graduatedRank = graduatedRank;
        this.education = education;
    }

    public FresherCandidates(String idCandidate, String firstName, String lastName, String dOB, String address, int phoneNum, String email, int candidateType, String graduatedDate, String graduatedRank, String education) {
        super(idCandidate, firstName, lastName, dOB, address, phoneNum, email, candidateType);
        this.graduatedDate = graduatedDate;
        this.graduatedRank = graduatedRank;
        this.education = education;
    }

    public String getGraduatedDate() {
        return graduatedDate;
    }

    public void setGraduatedDate(String graduatedDate) {
        this.graduatedDate = graduatedDate;
    }

    public String getGraduatedRank() {
        return graduatedRank;
    }

    public void setGraduatedRank(String graduatedRank) {
        this.graduatedRank = graduatedRank;
    }

    public String getUniversity() {
        return education;
    }

    public void setUniversity(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "FresherCandidates{" +
                super.toString() +
                ", graduatedDate='" + graduatedDate + '\'' +
                ", graduatedRank='" + graduatedRank + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
