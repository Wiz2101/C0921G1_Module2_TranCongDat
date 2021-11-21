package review.services.impl;

import review.models.ExperienceCandidates;
import review.models.FresherCandidates;
import review.models.FresherCandidates;
import review.services.IFresherCandidates;

import java.util.ArrayList;
import java.util.List;

public class FresherCandidateService implements IFresherCandidates {
    List<FresherCandidates> fresherCandidatesList = new ArrayList<>();

    @Override
    public void addFresherCandidate(FresherCandidates fresherCandidates) {
        fresherCandidatesList.add(new FresherCandidates());
    }

    @Override
    public void displayFresherCandidate(List<FresherCandidates> fresherCandidatesList) {
        for (FresherCandidates freCan : fresherCandidatesList) {
            System.out.println(freCan);
        }
    }

    @Override
    public void searchFresherCandidate() {

    }

    public List<FresherCandidates> returnFre() {
        return fresherCandidatesList;
    }

    public boolean checkSearch(String input, List<FresherCandidates> fresherCandidatesList) {
        for (int i = 0; i < fresherCandidatesList.size(); i++) {
            if (fresherCandidatesList.get(i).getFirstName().toLowerCase().contains(input)) {
                System.out.println(fresherCandidatesList.get(i));
                return true;
            } else if (fresherCandidatesList.get(i).getLastName().toLowerCase().contains(input)) {
                System.out.println(fresherCandidatesList.get(i));
                return true;
            }
        }
        return false;
    }
}
