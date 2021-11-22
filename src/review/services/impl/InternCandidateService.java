package review.services.impl;

import review.models.InternCandidates;
import review.services.IInternCandidates;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternCandidateService implements IInternCandidates {

    //Create
    @Override
    public void addInternCandidateService(List<InternCandidates> list) {
        list.add(new InternCandidates());
    }

    //Remove
    @Override
    public void removeInternCandidateService(String id, List<InternCandidates> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdCandidate().equals(id)) {
                list.remove(i);
                break;
            }
        }
    }

    //Update
    @Override
    public void updateInternCandidatesService(String input, List<InternCandidates> list) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        for (int i = 0; i < list.size(); i++) {
            if (input.toLowerCase().equals(list.get(i).getIdCandidate().toLowerCase())) {
                System.out.println(
                        "\t1. Candidate ID\n" +
                                "\t2. First Name\n" +
                                "\t3. Last Name\n" +
                                "\t4. DOB\n" +
                                "\t5. Address\n" +
                                "\t6. Phone Number\n" +
                                "\t7. Email\n" +
                                "\t8. Type of Candidate\n" +
                                "\t9. Major\n" +
                                "\t10. Semester\n" +
                                "\t11. University\n"
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
                        System.out.println("Enter Major: ");
                        String major = scanner.nextLine();
                        list.get(i).setMajor(major);
                        break;
                    case 10:
                        System.out.println("Enter Semester: ");
                        String semester = scanner.nextLine();
                        list.get(i).setSemester(semester);
                        break;
                    case 11:
                        System.out.println("Enter University: ");
                        String university = scanner.nextLine();
                        list.get(i).setUniversityName(university);
                        break;
                    default:
                        System.out.println("Please enter the number from 1-11");
                }
            }
        }
    }

    //Display
    @Override
    public void displayInternCandidateService(List<InternCandidates> list) {
        for (InternCandidates intCan : list) {
            System.out.println(intCan);
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
    public void writeCSVExperienceCandidateService(String path, List<InternCandidates> list) {
        final String COMMA = ",";

        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (InternCandidates intCan : list) {
                bufferedWriter.write(intCan.getIdCandidate() + COMMA + intCan.getFirstName() + COMMA + intCan.getLastName() + COMMA + intCan.getdOB() + COMMA + intCan.getAddress() + COMMA + intCan.getPhoneNum() + COMMA + intCan.getEmail() + COMMA + intCan.getCandidateType() + COMMA + intCan.getMajor() + COMMA + intCan.getSemester() + COMMA + intCan.getUniversityName() + "\n");
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
