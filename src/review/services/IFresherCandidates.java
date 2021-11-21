package review.services;

import review.models.FresherCandidates;
import review.models.FresherCandidates;

import java.util.List;

public interface IFresherCandidates {
    public void addFresherCandidate(FresherCandidates fresherCandidates);
    public void displayFresherCandidate(List<FresherCandidates> fresherCandidatesList);
    public void searchFresherCandidate();
}
