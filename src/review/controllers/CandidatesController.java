package review.controllers;

import review.models.Candidates;

import java.util.ArrayList;
import java.util.List;

public class CandidatesController {
    static List<Candidates> listCandidates = new ArrayList<>();

    public static void searchCandidates(String input){
        listCandidates.addAll(ExperienceCandidateController.candidatesList);
        listCandidates.addAll(FresherCandidateController.candidatesList);
        listCandidates.addAll(InternCandidateController.candidatesList);
        for (int i = 0; i < listCandidates.size() ; i++) {
            if(listCandidates.get(i).getFirstName().contains(input) || listCandidates.get(i).getLastName().contains(input)){
                System.out.println(listCandidates.get(i));
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(listCandidates);
    }

}
