package review.services;

import review.models.InternCandidates;

import java.util.List;

public interface IInternCandidates {
    public void addInternCandidate(InternCandidates internCandidates);
    public void displayInternCandidate(List<InternCandidates> internCandidatesList);
    public void searchInternCandidate();
}
