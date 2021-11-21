package review.controllers;

import java.util.Scanner;

public class MenuController {
    public void displayMenu() {
        ExperienceCandidateController experienceCandidateController = new ExperienceCandidateController();
        FresherCandidateController fresherCandidateController = new FresherCandidateController();
        InternCandidateController internCandidateController = new InternCandidateController();
        CandidatesController candidatesController = new CandidatesController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        String subChoice;

        do {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM\n" +
                    "1.\tExperience\n" +
                    "2.\tFresher\n" +
                    "3.\tInternship\n" +
                    "4.\tSearching\n" +
                    "5.\tExit\n");
            System.out.println("Please enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("===========EXPERIENCE CANDIDATE============");
                    experienceCandidateController.addExperienceCandidate();
                    experienceCandidateController.displayExperienceCandidate();
                    System.out.println("Do you want to continue (Y/N)?");
                    scanner.skip("\\R");
                    subChoice = scanner.nextLine().toLowerCase();
                    switch (subChoice) {
                        case "y":
                            experienceCandidateController.addExperienceCandidate();
                        case "n":
                            break;
                    }
                    break;
                case 2:
                    System.out.println("==========FRESHER CANDIDATE==============   ");
                    fresherCandidateController.addFresherCandidate();
                    fresherCandidateController.displayFresherCandidate();
                    System.out.println("Do you want to continue (Y/N)?");
                    scanner.skip("\\R");
                    subChoice = scanner.nextLine().toLowerCase();
                    switch (subChoice) {
                        case "y":
                            fresherCandidateController.addFresherCandidate();
                        case "n":
                            break;
                    }
                    break;
                case 3:
                    System.out.println("===========INTERN CANDIDATE==============");
                    internCandidateController.addInternCandidate();
                    internCandidateController.displayInternCandidate();
                    System.out.println("Do you want to continue (Y/N)?");
                    scanner.skip("\\R");
                    subChoice = scanner.nextLine().toLowerCase();
                    switch (subChoice) {
                        case "y":
                            internCandidateController.addInternCandidate();
                        case "n":
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Searching");
                    System.out.println("===========EXPERIENCE CANDIDATE============");
                    experienceCandidateController.displayExperienceCandidate();
                    System.out.println("==========FRESHER CANDIDATE==============   ");
                    fresherCandidateController.displayFresherCandidate();
                    System.out.println("===========INTERN CANDIDATE==============");
                    internCandidateController.displayInternCandidate();
                    CandidatesController.searchCandidates();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please choose the number from 1-5");
            }
        } while (choice != 5);

    }
}
