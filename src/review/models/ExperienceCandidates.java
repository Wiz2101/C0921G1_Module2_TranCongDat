package review.models;

public class ExperienceCandidates extends Candidates{
    private double expInYear;
    private String proSkill;

    public ExperienceCandidates() {
    }

    public ExperienceCandidates(double expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public ExperienceCandidates(String idCandidate, String firstName, String lastName, String dOB, String address, int phoneNum, String email, int candidateType, double expInYear, String proSkill) {
        super(idCandidate, firstName, lastName, dOB, address, phoneNum, email, candidateType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public double getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(double expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public String getFirstName(){
        return super.getFirstName();
    }

    @Override
    public String toString() {
        return "ExperienceCandidates{" +
                super.toString() +
                ", expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
}
