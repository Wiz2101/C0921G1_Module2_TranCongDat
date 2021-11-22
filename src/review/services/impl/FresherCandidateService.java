package review.services.impl;

import review.models.FresherCandidates;
import review.services.IFresherCandidates;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FresherCandidateService implements IFresherCandidates {

    //Create
    @Override
    public void addFresherCandidateService(List<FresherCandidates> list) {
        list.add(new FresherCandidates());
    }

    //Remove
    @Override
    public void removeFresherCandidateService(String id, List<FresherCandidates> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdCandidate().equals(id)) {
                list.remove(i);
                break;
            }
        }
    }

    //Update
    @Override
    public void updateFresherCandidatesService(String input, List<FresherCandidates> list) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        for (int i = 0; i < list.size(); i++) {
            if (input.toLowerCase().equals(list.get(i).getIdCandidate().toLowerCase())) {
                System.out.println("\t1. Candidate ID\n" +
                        "\t1. Candidate ID\n" +
                        "\t2. First Name\n" +
                        "\t3. Last Name\n" +
                        "\t4. DOB\n" +
                        "\t5. Address\n" +
                        "\t6. Phone Number\n" +
                        "\t7. Email\n" +
                        "\t8. Type of Candidate\n" +
                        "\t9. Graduated Date\n" +
                        "\t10. Graduated Rank\n" +
                        "\t11. Education\n"
                );
                System.out.println("Enter the component would like to update");
                choice = scanner.nextInt();
                scanner.skip("\\R");
                switch (choice) {
                    case 1:
                        System.out.println("Enter Canđiate ID: ");
                        String id = scanner.nextLine();
                        list.get(i).setIdCandidate(id);
                        break;
                    case 2:
                        System.out.println("Enter First Name: ");
                        String firstName = scanner.nextLine();
                        list.get(i).setFirstName(firstName);
                        break;
                    case 3:
                        System.out.println("Enter Last Name: ");
                        String lastName = scanner.nextLine();
                        list.get(i).setLastName(lastName);
                        break;
                    case 4:
                        System.out.println("Enter Year of Birth: ");
                        int dob = Integer.parseInt(scanner.nextLine());
                        list.get(i).setdOB(dob);
                        break;
                    case 5:
                        System.out.println("Enter Address: ");
                        String address = scanner.nextLine();
                        list.get(i).setAddress(address);
                        break;
                    case 6:
                        System.out.println("Enter Phone Number: ");
                        Long phoneNum = Long.parseLong(scanner.nextLine());
                        list.get(i).setPhoneNum(phoneNum);
                        break;
                    case 7:
                        System.out.println("Enter Email: ");
                        String email = scanner.nextLine();
                        list.get(i).setEmail(email);
                        break;
                    case 8:
                        System.out.println("Enter Type of Candidate: ");
                        int typeCan = Integer.parseInt(scanner.nextLine());
                        list.get(i).setCandidateType(typeCan);
                        break;
                    case 9:
                        System.out.println("Enter Graduated Date: ");
                        String graDate = scanner.nextLine();
                        list.get(i).setGraduatedDate(graDate);
                        break;
                    case 10:
                        System.out.println("Enter Graduated Rank: ");
                        String graRank = scanner.nextLine();
                        list.get(i).setGraduatedRank(graRank);
                        break;
                    case 11:
                        System.out.println("Enter University: ");
                        String education = scanner.nextLine();
                        list.get(i).setUniversity(education);
                        break;
                    default:
                        System.out.println("Please enter the number from 1-11");
                }
            }
        }
    }

    //Display
    @Override
    public void displayFresherCandidateService(List<FresherCandidates> list) {
        for (FresherCandidates freCan : list) {
            System.out.println(freCan);
        }
    }

    //Read File
    @Override
    public List<String> readCSVExperienceCandidateService(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(String.valueOf(path));
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringList;
    }

    //Write File
    @Override
    public void writeCSVExperienceCandidateService(String path, List<FresherCandidates> list) {
        final String COMMA = ",";

        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (FresherCandidates freCan : list) {
                bufferedWriter.write(freCan.getIdCandidate() + COMMA + freCan.getFirstName() + COMMA + freCan.getLastName() + COMMA + freCan.getdOB() + COMMA + freCan.getAddress() + COMMA + freCan.getPhoneNum() + COMMA + freCan.getEmail() + COMMA + freCan.getCandidateType() + COMMA + freCan.getGraduatedDate() + COMMA + freCan.getGraduatedRank() + COMMA + freCan.getUniversity() + "\n");
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
