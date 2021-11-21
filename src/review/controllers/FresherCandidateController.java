package review.controllers;

import review.models.Candidates;
import review.models.FresherCandidates;
import review.services.impl.FresherCandidateService;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class FresherCandidateController {
    FresherCandidateService fresherCandidateService = new FresherCandidateService();
    static List<FresherCandidates> fresherCandidatesList = new ArrayList<>();
    static List<Candidates> candidatesList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addFresherCandidate() {
        int dob;
        long phoneNumber;
        String graduatedRank;
        System.out.println("Enter an id of Experience Candidate");
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
        } while (!(phoneNumber>=1000000000));
        System.out.println("Enter the email");
        String email = scanner.nextLine();
        System.out.println("Enter the type of candidate");
        int candidateType = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the graduated date");
        String graduatedDate = scanner.nextLine();
        do {
            System.out.println("Enter the graduatedRank");
            graduatedRank = scanner.nextLine();
        }while (!(graduatedRank.toLowerCase().equals("excellent") || graduatedRank.toLowerCase().equals("good") || graduatedRank.toLowerCase().equals("fair") || graduatedRank.toLowerCase().equals("poor")));
        System.out.println("Enter the education");
        String education = scanner.nextLine();
        candidatesList.add(new FresherCandidates(id,firstName,lastName,dob,address,phoneNumber,email,candidateType,graduatedDate,graduatedRank,education));
        fresherCandidatesList.add(new FresherCandidates(id,firstName,lastName,dob,address,phoneNumber,email,candidateType,graduatedDate,graduatedRank,education));
        candidatesList.add(new FresherCandidates("F1", "Barbosa De", "Souza", 1981, "London", 612811, "Souza@gmail.com", 1, "2021", "B", "Cambridge University"));
        candidatesList.add(new FresherCandidates("F2", "Cabrera", "Cornide", 1993, "Birmingham", 612811, "Cornide@gmail.com", 1, "2020", "A-", "Birmingham University"));
        candidatesList.add(new FresherCandidates("F3", "Calderon", "Cuevas", 1994, "Newcastle", 612811, "Cuevas@gmail.com", 1, "2019", "A+", "Northumbria University"));
        candidatesList.add(new FresherCandidates("F4", "Casulari", "Motta", 1996, "York", 612811, "Motta@gmail.com", 1, "2021", "A", "York University"));
        fresherCandidatesList.add(new FresherCandidates("F1", "Barbosa De", "Souza", 1981, "London", 612811, "Souza@gmail.com", 1, "2021", "B", "Cambridge University"));
        fresherCandidatesList.add(new FresherCandidates("F2", "Cabrera", "Cornide", 1993, "Birmingham", 612811, "Cornide@gmail.com", 1, "2020", "A-", "Birmingham University"));
        fresherCandidatesList.add(new FresherCandidates("F3", "Calderon", "Cuevas", 1994, "Newcastle", 612811, "Cuevas@gmail.com", 1, "2019", "A+", "Northumbria University"));
        fresherCandidatesList.add(new FresherCandidates("F4", "Casulari", "Motta", 1996, "York", 612811, "Motta@gmail.com", 1, "2021", "A", "York University"));
    }

    public void displayFresherCandidate() {
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

