package review.controllers;

import review.models.Candidates;
import review.models.InternCandidates;
import review.services.impl.InternCandidateService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternCandidateController {
    InternCandidateService internCandidateService = new InternCandidateService();
    List<InternCandidates> internCandidatesList = new ArrayList<>();
    static List<Candidates> candidatesList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addInternCandidate() {
//        System.out.println("Enter an id of Intern Candidate");
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
//        System.out.println("Enter the major");
//        String major = scanner.nextLine();
//        System.out.println("Enter the semester");
//        String semester = scanner.nextLine();
//        System.out.println("Enter the university");
//        String university = scanner.nextLine();
//        internCandidatesList.add(new InternCandidates(id,firstName,lastName,dob,address,phoneNumber,email,candidateType,major,semester,university));

        candidatesList.add(new InternCandidates("1", "b", "c"));
        candidatesList.add(new InternCandidates("2", "b", "c"));
        candidatesList.add(new InternCandidates("3", "b", "c"));
    }

    public void displayInternCandidate() {
        internCandidateService.displayInternCandidate(internCandidatesList);
    }

    public List<InternCandidates> returnIntCanList() {
        return internCandidatesList;
    }

    public boolean checkSearchInt() {
        String input = scanner.nextLine();
        return internCandidateService.checkSearch(input, internCandidatesList);
    }
}
