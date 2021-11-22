package review.services;

import review.models.ExperienceCandidates;
import review.models.FresherCandidates;
import review.models.FresherCandidates;

import java.util.List;

public interface IFresherCandidates {
    public void addFresherCandidateService(List<FresherCandidates> list);

    public void removeFresherCandidateService(String id, List<FresherCandidates> list);

    public void updateFresherCandidatesService(String input, List<FresherCandidates> list);

    public void displayFresherCandidateService(List<FresherCandidates> list);

    public List<String> readCSVExperienceCandidateService(String path);

    public void writeCSVExperienceCandidateService(String path, List<FresherCandidates> list);

}
