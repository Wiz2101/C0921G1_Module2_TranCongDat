package review.controllers;

import review.models.Candidates;
import review.models.FresherCandidates;
import review.services.impl.FresherCandidateService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FresherCandidateController {
    FresherCandidateService fresherCandidateService = new FresherCandidateService();
    List<FresherCandidates> fresherCandidatesList = new ArrayList<>();
    static List<Candidates> candidatesList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addExperienceCandidate() {
//        System.out.println("Enter an id of Experience Candidate");
//        String id = scanner.nextLine();
//        System.out.println("Enter the first name");
//        String firstName = scanner.nextLine();
//        System.out.println("Enter the last name");
//        String lastName = scanner.nextLine();
//        System.out.println("Enter the day of birth");
//        String dob = scanner.nextLine();
//        System.out.println("Enter the address");
//        String address = scanner.nextLine();
//        System.out.println("Enter the phone number");
//        int phoneNumber = Integer.parseInt(scanner.nextLine());
//        System.out.println("Enter the email");
//        String email = scanner.nextLine();
//        System.out.println("Enter the type of candidate");
//        int candidateType = Integer.parseInt(scanner.nextLine());
//        System.out.println("Enter the graduated date");
//        String graduatedDate = scanner.nextLine();
//        System.out.println("Enter the graduatedRank");
//        String graduatedRank = scanner.nextLine();
//        System.out.println("Enter the education");
//        String education = scanner.nextLine();
//        fresherCandidatesList.add(new FresherCandidates(id,firstName,lastName,dob,address,phoneNumber,email,candidateType,graduatedDate,graduatedRank,education));
        candidatesList.add(new FresherCandidates("s", "2", "ab"));
        candidatesList.add(new FresherCandidates("s", "3", "ab"));
        candidatesList.add(new FresherCandidates("s", "4", "ab"));
    }

    public void displayExperienceCandidate() {
        fresherCandidateService.displayFresherCandidate(fresherCandidatesList);
    }

    public List<FresherCandidates> returnFreCanList() {
        return fresherCandidatesList;
    }

    public boolean checkSearchFre() {
        String input = scanner.nextLine();
        return fresherCandidateService.checkSearch(input, fresherCandidatesList);
    }
}

