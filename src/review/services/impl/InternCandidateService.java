package review.services.impl;

import review.models.ExperienceCandidates;
import review.models.InternCandidates;
import review.services.IInternCandidates;

import java.util.ArrayList;
import java.util.List;

public class InternCandidateService implements IInternCandidates {
    List<InternCandidates> internCandidatesList = new ArrayList<>();

    @Override
    public void addInternCandidate(InternCandidates internCandidates) {
        internCandidatesList.add(new InternCandidates());
    }

    @Override
    public void displayInternCandidate(List<InternCandidates> internCandidatesList) {
        for (InternCandidates intCan : internCandidatesList) {
            System.out.println(intCan);
        }
    }

    @Override
    public void searchInternCandidate() {

    }

    public List<InternCandidates> returnInt() {
        return internCandidatesList;
    }

    public boolean checkSearch(String input, List<InternCandidates> internCandidatesList) {
        for (int i = 0; i < internCandidatesList.size(); i++) {
            if (internCandidatesList.get(i).getFirstName().toLowerCase().contains(input)) {
                System.out.println(internCandidatesList.get(i));
                return true;
            } else if (internCandidatesList.get(i).getLastName().toLowerCase().contains(input)) {
                System.out.println(internCandidatesList.get(i));
                return true;
            }
        }
        return false;
    }
}
