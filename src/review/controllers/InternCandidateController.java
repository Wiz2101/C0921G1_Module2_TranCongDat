package review.controllers;

import review.models.Candidates;
import review.models.InternCandidates;
import review.services.impl.InternCandidateService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternCandidateController {
    InternCandidateService internCandidateService = new InternCandidateService();
    static List<InternCandidates> internCandidatesList = new ArrayList<>();
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

        candidatesList.add(new InternCandidates("I1","Maria","Madeleine","1997","London",612811,"Madeleine@gmail.com",2,"AI", "2", "London University"));
        candidatesList.add(new InternCandidates("I2","Csokán","Babett","2003","Durham",612811,"Babett@gmail.com",2,"IT", "2", "Durham University"));
        candidatesList.add(new InternCandidates("I3","Joana","Filipa","2000","Bath",612811,"Filipa@gmail.com",2,"IT", "2", "Bath University"));
        candidatesList.add(new InternCandidates("I4","Patricia","Carine","1999","London",612811,"Carine@gmail.com",2,"AI", "2", "KingCross University"));
        internCandidatesList.add(new InternCandidates("I1","Maria","Madeleine","1997","London",612811,"Madeleine@gmail.com",2,"AI", "2", "London University"));
        internCandidatesList.add(new InternCandidates("I2","Csokán","Babett","2003","Durham",612811,"Babett@gmail.com",2,"IT", "2", "Durham University"));
        internCandidatesList.add(new InternCandidates("I3","Joana","Filipa","2000","Bath",612811,"Filipa@gmail.com",2,"IT", "2", "Bath University"));
        internCandidatesList.add(new InternCandidates("I4","Patricia","Carine","1999","London",612811,"Carine@gmail.com",2,"AI", "2", "KingCross University"));

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
