package review.controllers;

import java.util.Scanner;

public class MenuController {
    public void displayMenu(){
        ExperienceCandidateController experienceCandidateController = new ExperienceCandidateController();
        FresherCandidateController fresherCandidateController = new FresherCandidateController();
        InternCandidateController internCandidateController = new InternCandidateController();
        CandidatesController candidatesController = new CandidatesController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        int subChoice;

        do {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM\n" +
                    "1.\tExperience\n" +
                    "2.\tFresher\n" +
                    "3.\tInternship\n" +
                    "4.\tSearching\n" +
                    "5.\tExit\n");
            System.out.println("Please enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Create an Experience Candidate");
                    experienceCandidateController.addExperienceCandidate();
                    experienceCandidateController.displayExperienceCandidate();
                    break;
                case 2:
                    System.out.println("Create a Fresher Candidate");
                    fresherCandidateController.addExperienceCandidate();
                    fresherCandidateController.displayExperienceCandidate();
                    break;
                case 3:
                    System.out.println("Create an Intern Candidate");
                    internCandidateController.addInternCandidate();
                    internCandidateController.displayInternCandidate();
                    break;
                case 4:
                    System.out.println("Searching");
                    experienceCandidateController.displayExperienceCandidate();
                    fresherCandidateController.displayExperienceCandidate();
                    internCandidateController.displayInternCandidate();
                    System.out.println("Enter the name would like to find");
                    String input = scanner.nextLine();
                    CandidatesController.searchCandidates(input);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please choose the number from 1-5");
            }
        } while (choice != 5);

    }
}
