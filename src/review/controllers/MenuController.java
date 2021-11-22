package review.controllers;

import java.util.Scanner;

public class MenuController {
    public void displayMenu() {
        ExperienceCandidateController experienceCandidateController = new ExperienceCandidateController();
        FresherCandidateController fresherCandidateController = new FresherCandidateController();
        InternCandidateController internCandidateController = new InternCandidateController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        int subMenuChoice;
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
                    System.out.println(
                            "1.\tCreate an Experience Candidate\n" +
                                    "2.\tRemove an Experience Candidate\n" +
                                    "3.\tUpdate an Experience Candidates\n" +
                                    "4.\tDisplay all Experience Candidates\n" +
                                    "5.\tRead to File\n" +
                                    "5.\tWrite to File\n"
                    );
                    System.out.println("Please enter your choice: ");
                    subMenuChoice = scanner.nextInt();
                    switch (subMenuChoice) {
                        case 1:
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
                            experienceCandidateController.removeExperienceCandidate();
                            break;
                        case 3:
                            experienceCandidateController.updateExperienceCandidate();
                            break;
                        case 4:
                            experienceCandidateController.displayExperienceCandidate();
                            break;
                        case 5:
                            experienceCandidateController.readCSVExperienceCandidate();
                            break;
                        case 6:
                            experienceCandidateController.writeCSVExperienceCandidate();
                            break;
                        default:
                            System.out.println("Please choose the number from 1-6");
                    }
                    break;
                case 2:
                    System.out.println(
                            "1.\tCreate a Fresher Candidate\n" +
                                    "2.\tRemove a Fresher Candidate\n" +
                                    "3.\tUpdate a Fresher Candidates\n" +
                                    "4.\tDisplay all Fresher Candidates\n" +
                                    "5.\tRead to File\n" +
                                    "5.\tWrite to File\n"
                    );
                    System.out.println("Please enter your choice: ");
                    subMenuChoice = scanner.nextInt();
                    switch (subMenuChoice) {
                        case 1:
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
                        case 2:
                            fresherCandidateController.removeFresherCandidate();
                            break;
                        case 3:
                            fresherCandidateController.updateFresherCandidate();
                            break;
                        case 4:
                            fresherCandidateController.displayFresherCandidate();
                            break;
                        case 5:
                            fresherCandidateController.readCSVFresherCandidate();
                            break;
                        case 6:
                            fresherCandidateController.writeCSVFresherCandidate();
                            break;
                        default:
                            System.out.println("Please choose the number from 1-6");
                    }
                    break;
                case 3:
                    System.out.println(
                            "1.\tCreate an Intern Candidate\n" +
                                    "2.\tRemove an Intern Candidate\n" +
                                    "3.\tUpdate an Intern Candidates\n" +
                                    "4.\tDisplay all Intern Candidates\n" +
                                    "5.\tRead to File\n" +
                                    "5.\tWrite to File\n"
                    );
                    System.out.println("Please enter your choice: ");
                    subMenuChoice = scanner.nextInt();
                    switch (subMenuChoice) {
                        case 1:
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
                        case 2:
                            internCandidateController.removeInternCandidate();
                            break;
                        case 3:
                            internCandidateController.updateInternCandidate();
                            break;
                        case 4:
                            internCandidateController.displayInternCandidate();
                            break;
                        case 5:
                            internCandidateController.readCSVInternCandidate();
                            break;
                        case 6:
                            internCandidateController.writeCSVInternCandidate();
                            break;
                        default:
                            System.out.println("Please choose the number from 1-6");
                    }
                    break;
                case 4:
                    experienceCandidateController.displayExperienceCandidate();
                    fresherCandidateController.displayFresherCandidate();
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
