package review.controllers;

import review.models.Candidates;
import review.models.ExperienceCandidates;
import review.services.impl.ExperienceCandidateService;

import java.util.*;

public class ExperienceCandidateController {
    ExperienceCandidateService experienceCandidateService = new ExperienceCandidateService();
    static List<ExperienceCandidates> experienceCandidatesList = new ArrayList<>();
    static List<Candidates> candidatesList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void addExperienceCandidate(){
        int dob;
        long phoneNumber;
        double expInYear;
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
        do {
            System.out.println("Enter the number of year experiences");
            expInYear = Double.parseDouble(scanner.nextLine());
        } while (!(expInYear>=0 && expInYear<100));
        System.out.println("Enter the professional skills of candidate");
        String proSkill = scanner.nextLine();
        candidatesList.add(new ExperienceCandidates(id,firstName,lastName,dob,address,phoneNumber,email,candidateType,expInYear,proSkill));
        experienceCandidatesList.add(new ExperienceCandidates(id,firstName,lastName,dob,address,phoneNumber,email,candidateType,expInYear,proSkill));
        candidatesList.add(new ExperienceCandidates("E1","Aelbrecht","Stefan",1991,"London",612811,"sas@gmail.com",0,2.5,"acb"));
        candidatesList.add(new ExperienceCandidates("E2","Aguirre","Eva",1990,"Sao paulo",940394,"eva@asante.com",0,2.5,"abc"));
        candidatesList.add(new ExperienceCandidates("E3","Ahlgren","Maria",1987,"Paris",682172,"sas@gmail.com",0,2.5,"acb"));
        candidatesList.add(new ExperienceCandidates("E4","Antošová","Adeleva",1989,"Rio de janero",984933,"sadelave@janeo.com",0,2.5,"abc"));
        experienceCandidatesList.add(new ExperienceCandidates("E1","Aelbrecht","Stefan",1991,"London",612811,"sas@gmail.com",0,2.5,"acb"));
        experienceCandidatesList.add(new ExperienceCandidates("E2","Aguirre","Eva",1990,"Sao paulo",940394,"eva@asante.com",0,2.5,"abc"));
        experienceCandidatesList.add(new ExperienceCandidates("E3","Ahlgren","Maria",1987,"Paris",682172,"sas@gmail.com",0,2.5,"acb"));
        experienceCandidatesList.add(new ExperienceCandidates("E4","Antošová","Adeleva",1989,"Rio de janero",984933,"sadelave@janeo.com",0,2.5,"abc"));
    }


    public void displayExperienceCandidate(){
        experienceCandidateService.displayExperienceCandidate(experienceCandidatesList);
    }

    public List<ExperienceCandidates> returnExpCanList() {
        return experienceCandidatesList;
    }
}

