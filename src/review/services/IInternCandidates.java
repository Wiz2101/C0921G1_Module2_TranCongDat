package review.services;

import review.models.ExperienceCandidates;
import review.models.FresherCandidates;
import review.models.InternCandidates;

import java.util.List;

public interface IInternCandidates {
    public void addInternCandidateService(List<InternCandidates> list);

    public void removeInternCandidateService(String input, List<InternCandidates> list);

    public void updateInternCandidatesService(String input, List<InternCandidates> list);

    public void displayInternCandidateService(List<InternCandidates> list);

    public List<String> readCSVExperienceCandidateService(String path);

    public void writeCSVExperienceCandidateService(String path, List<InternCandidates> list);
}
