package review.services.impl;

import review.models.Candidates;
import review.models.ExperienceCandidates;
import review.services.IExperienceCandidates;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceCandidateService implements IExperienceCandidates {
    //Create
    @Override
    public void addExperienceCandidateService(List<ExperienceCandidates> list) {
        list.add(new ExperienceCandidates());
    }

    //Remove
    @Override
    public void removeExperienceCandidateService(String id, List<ExperienceCandidates> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdCandidate().equals(id)) {
                list.remove(i);
                break;
            }
        }
    }

    //Update
    @Override
    public void updateExperienceCandidatesService(String input, List<ExperienceCandidates> list) {
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
                        "\t9. Year Experience\n" +
                        "\t10. Professional Skill\n"
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
                        System.out.println("Enter Year Experience: ");
                        double yearExp = Double.parseDouble(scanner.nextLine());
                        list.get(i).setExpInYear(yearExp);
                        break;
                    case 10:
                        System.out.println("Enter Professional Skill");
                        String proSkill = scanner.nextLine();
                        list.get(i).setProSkill(proSkill);
                        break;
                    default:
                        System.out.println("Please enter the number from 1-10");
                }
            }
        }
    }


    //Display
    @Override
    public void displayExperienceCandidateService(List<ExperienceCandidates> list) {
        for (Candidates expCan : list) {
            System.out.println(expCan);
        }
    }

    //Read File
    @Override
    public List<String> readCSVExperienceCandidateService(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
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
    public void writeCSVExperienceCandidateService(String path, List<ExperienceCandidates> list) {
        final String COMMA = ",";

        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (ExperienceCandidates epxCan : list) {
                bufferedWriter.write(epxCan.getIdCandidate() + COMMA + epxCan.getFirstName() + COMMA + epxCan.getLastName() + COMMA + epxCan.getdOB() + COMMA + epxCan.getAddress() + COMMA + epxCan.getPhoneNum() + COMMA + epxCan.getEmail() + COMMA + epxCan.getCandidateType() + COMMA + epxCan.getExpInYear() + COMMA + epxCan.getProSkill() + "\n");
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
