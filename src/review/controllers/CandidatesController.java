package review.controllers;

import review.models.Candidates;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidatesController {
    static List<Candidates> listCandidates = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void searchCandidates(){
        listCandidates.addAll(ExperienceCandidateController.candidatesList);
        listCandidates.addAll(FresherCandidateController.candidatesList);
        listCandidates.addAll(InternCandidateController.candidatesList);
        System.out.println("Enter the name would like to find: ");
        String inputName = scanner.nextLine();
        System.out.println("The result of your search: ");
        int inputType = scanner.nextInt();
        for (int i = 0; i < listCandidates.size() ; i++) {
            if(listCandidates.get(i).getFirstName().toLowerCase().contains(inputName) || listCandidates.get(i).getLastName().toLowerCase().contains(inputName) && listCandidates.get(i).getCandidateType() == inputType){
                System.out.println(listCandidates.get(i));
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(listCandidates);
    }

}
