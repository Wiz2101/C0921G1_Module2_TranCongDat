package review.controllers;

import review.models.Candidates;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidatesController {
    static List<Candidates> listCandidates = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void searchCandidates() {
        listCandidates.addAll(ExperienceCandidateController.returnExpList());
        listCandidates.addAll(FresherCandidateController.returnFreCanList());
        listCandidates.addAll(InternCandidateController.returnIntCanList());
        System.out.println("Enter the name would like to find: ");
        String inputName = scanner.nextLine();
        System.out.println("The result of your search: ");
        int inputType = scanner.nextInt();
        scanner.skip("\\R");
        for (int i = 0; i < listCandidates.size(); i++) {
            if (listCandidates.get(i).getFirstName().toLowerCase().contains(inputName) || listCandidates.get(i).getLastName().toLowerCase().contains(inputName) && listCandidates.get(i).getCandidateType() == inputType) {
                System.out.println(listCandidates.get(i));
            }
        }
    }
}
