package review.services.impl;

import review.models.ExperienceCandidates;
import review.services.IExperienceCandidates;

import java.util.ArrayList;
import java.util.List;

public class ExperienceCandidateService implements IExperienceCandidates {
    List<ExperienceCandidates> experienceCandidateServiceList = new ArrayList<>();

    @Override
    public void addExperienceCandidate(ExperienceCandidates experienceCandidates) {
        experienceCandidateServiceList.add(new ExperienceCandidates());
    }

    @Override
    public void displayExperienceCandidate(List<ExperienceCandidates> experienceCandidatesList) {
        for (ExperienceCandidates expCan : experienceCandidatesList) {
            System.out.println(expCan);
        }
    }

    @Override
    public void searchExperienceCandidate(String input, List<ExperienceCandidates> list) {
        for (int i = 0; i < list.size(); i++) {
            if (input.equals(list.get(i).getFirstName())) {
                System.out.println(list.get(i));
            }
        }
    }

    public List<ExperienceCandidates> returnExp() {
        return experienceCandidateServiceList;
    }

    public boolean checkSearch(String input, List<ExperienceCandidates> experienceCandidatesList) {
        for (int i = 0; i < experienceCandidatesList.size(); i++) {
            if (experienceCandidatesList.get(i).getFirstName().toLowerCase().contains(input)) {
                System.out.println(experienceCandidatesList.get(i));
            } else if (experienceCandidatesList.get(i).getLastName().toLowerCase().contains(input)) {
                System.out.println(experienceCandidatesList.get(i));
            }
        }
        return false;
    }
}
