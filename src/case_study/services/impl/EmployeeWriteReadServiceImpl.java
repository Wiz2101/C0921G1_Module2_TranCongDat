package case_study.services.impl;

import case_study.models.Employee;
import case_study.services.EmployeeService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeWriteReadServiceImpl {
    static final String EMPLOYEE_SOURCE = "src/case_study/data/Employee.csv";
    static final String EMPLOYEE_DESTINATION = "src/case_study/data/Employee.csv";
    static final String COMMA = ",";

    public static void writeCSV(List<Employee> list, boolean append) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        File file = new File(EMPLOYEE_DESTINATION);
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee li : list) {
                bufferedWriter.write(li.getId() + COMMA + li.getFullName() + COMMA + li.getDob() + COMMA + li.getIdCard() + COMMA + li.getPhoneNumber() + COMMA + li.getEmail() + COMMA + li.getDegree() + COMMA + li.getPosition() + COMMA + li.getSalary());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> readCSV() {
        List<String> stringList = new ArrayList<>();
        File file = new File(EMPLOYEE_SOURCE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line=bufferedReader.readLine()) != null){
                stringList.add(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return stringList;
    }

    public static List<Employee> convertStringToEmployee(){
        List<String>stringList = readCSV();
        List<Employee> employeeList = new ArrayList<>();
        String[] employee;
        for (String st:stringList){
            employee = st.split(",");
            employeeList.add(new Employee(employee[0],employee[1],employee[2],Long.parseLong(employee[3]),employee[4],employee[5],employee[6],employee[7], Integer.parseInt(employee[8])));
        }
        return employeeList;
    }

    public static List<String> covertEmployeeToString() {
        List<String> listString = new ArrayList<>();
        List<Employee> employeeList = null;
        for (Employee employee : employeeList) {
            listString.add(employee.toString());
        }
        return listString;
    }
}
