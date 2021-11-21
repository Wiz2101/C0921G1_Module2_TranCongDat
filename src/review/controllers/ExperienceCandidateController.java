package review.controllers;

import review.models.Candidates;
import review.models.ExperienceCandidates;
import review.services.impl.ExperienceCandidateService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceCandidateController {
    ExperienceCandidateService experienceCandidateService = new ExperienceCandidateService();
    List<ExperienceCandidates> experienceCandidatesList = new ArrayList<>();
    static List<Candidates> candidatesList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static void addExperienceCandidate(){
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
//        System.out.println("Enter the number of year experiences");
//        double expInYear = Double.parseDouble(scanner.nextLine());
//        System.out.println("Enter the professional skills of candidate");
//        String proSkill = scanner.nextLine();
//        experienceCandidatesList.add(new ExperienceCandidates(id,firstName,lastName,dob,address,phoneNumber,email,candidateType,expInYear,proSkill));
        candidatesList.add(new ExperienceCandidates("E1","Aelbrecht","Stefan","1991","London",612811,"sas@gmail.com",0,2.5,"acb"));
        candidatesList.add(new ExperienceCandidates("E2","Aguirre","Eva","1990","Sao paulo",940394,"eva@asante.com",0,2.5,"abc"));
        candidatesList.add(new ExperienceCandidates("E3","Ahlgren","Maria","1987","Paris",682172,"sas@gmail.com",0,2.5,"acb"));
        candidatesList.add(new ExperienceCandidates("E4","Antošová","Adeleva","1989","Rio de janero",984933,"sadelave@janeo.com",0,2.5,"abc"));
    }


    public void displayExperienceCandidate(){
        experienceCandidateService.displayExperienceCandidate(experienceCandidatesList);
    }

    public List<ExperienceCandidates> returnExpCanList(){
        return experienceCandidatesList;
    }
    }

