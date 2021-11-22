package review.controllers;

import review.models.Candidates;
import review.models.InternCandidates;
import review.services.impl.InternCandidateService;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class InternCandidateController {
    InternCandidateService internCandidateService = new InternCandidateService();
    static List<InternCandidates> internCandidatesList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    //Create
    public void addInternCandidate() {
        int dob;
        long phoneNumber;
        String graduatedRank;
        System.out.println("Enter an id of Intern Candidate");
        String id = scanner.nextLine();
        System.out.println("Enter the first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter the last name");
        String lastName = scanner.nextLine();
        do {
            System.out.println("Enter the day of birth");
            dob = scanner.nextInt();
        } while (!(dob > 1900 && dob <= Calendar.getInstance().get(Calendar.YEAR)));
        scanner.skip("\\R");
        System.out.println("Enter the address");
        String address = scanner.nextLine();
        do {
            System.out.println("Enter the phone number");
            phoneNumber = Long.parseLong(scanner.nextLine());
        } while (!(phoneNumber >= 1000000000));
        System.out.println("Enter the email");
        String email = scanner.nextLine();
        System.out.println("Enter the type of candidate");
        int candidateType = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the major");
        String major = scanner.nextLine();
        System.out.println("Enter the semester");
        String semester = scanner.nextLine();
        System.out.println("Enter the university");
        String university = scanner.nextLine();
        internCandidatesList.add(new InternCandidates("I1", "Maria", "Madeleine", 1997, "London", 612811, "Madeleine@gmail.com", 2, "AI", "2", "London University"));
        internCandidatesList.add(new InternCandidates("I2", "Csokán", "Babett", 2003, "Durham", 612811, "Babett@gmail.com", 2, "IT", "2", "Durham University"));
        internCandidatesList.add(new InternCandidates("I3", "Joana", "Filipa", 2000, "Bath", 612811, "Filipa@gmail.com", 2, "IT", "2", "Bath University"));
        internCandidatesList.add(new InternCandidates("I4", "Patricia", "Carine", 1999, "London", 612811, "Carine@gmail.com", 2, "AI", "2", "KingCross University"));
        internCandidatesList.add(new InternCandidates(id, firstName, lastName, dob, address, phoneNumber, email, candidateType, major, semester, university));

    }

    //Remove
    public void removeInternCandidate() {
        System.out.println("Enter the id of candidate would like to remove");
        String id = scanner.nextLine();
        internCandidateService.removeInternCandidateService(id, internCandidatesList);
        displayInternCandidate();
    }

    //Update
    public void updateInternCandidate() {
        System.out.println("Enter the id of candidate would like to update");
        String id = scanner.nextLine();
        internCandidateService.updateInternCandidatesService(id, internCandidatesList);
    }

    //Display
    public void displayInternCandidate() {
        System.out.println("===========INTERN CANDIDATE============");
        internCandidateService.displayInternCandidateService(internCandidatesList);
    }

    //ReturnList
    public static List<InternCandidates> returnIntCanList() {
        return internCandidatesList;
    }

    //Read File
    public void readCSVInternCandidate(){
        System.out.println("Enter a path to read the file");
        String path = scanner.nextLine();
        internCandidateService.readCSVExperienceCandidateService(path);
    }

    //Write File
    public void writeCSVInternCandidate() {
        System.out.println("Enter a path to write CSV file");
        String path = scanner.nextLine();
        internCandidateService.writeCSVExperienceCandidateService(path, internCandidatesList);
        System.out.println("Successful Write!");
    }

}
