package review.services;

import review.models.ExperienceCandidates;

import java.util.List;

public interface IExperienceCandidates {
    public void addExperienceCandidate(ExperienceCandidates experienceCandidates);
    public void displayExperienceCandidate(List<ExperienceCandidates> experienceCandidatesList);
    public void searchExperienceCandidate(String input, List<ExperienceCandidates> list);
}
