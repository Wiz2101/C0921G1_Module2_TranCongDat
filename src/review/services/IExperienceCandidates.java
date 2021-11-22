package review.services;

import review.models.Candidates;
import review.models.ExperienceCandidates;

import java.util.List;

public interface IExperienceCandidates {
    public void addExperienceCandidateService(List<ExperienceCandidates> candidatesList);

    public void displayExperienceCandidateService(List<ExperienceCandidates> candidatesList);

    public void removeExperienceCandidateService(String id, List<ExperienceCandidates> list);

    public void updateExperienceCandidatesService(String input, List<ExperienceCandidates> list);

    public List<String> readCSVExperienceCandidateService(String path);

    public void writeCSVExperienceCandidateService(String path, List<ExperienceCandidates> list);
}
