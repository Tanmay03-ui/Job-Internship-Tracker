import java.util.Arrays;
import java.util.Scanner;

public class ApplicationManager {
    Application[] applications = new Application[5];
    Scanner sc = new Scanner(System.in);
    void addApplication(){
        for (int i = 0; i < applications.length; i++) {
            if (applications[i] == null){
                System.out.println("Enter Company: ");
                 String company = sc.next();
                System.out.println("Enter role: ");
                String role = sc.next();
                System.out.println("Enter location: ");
                String location = sc.next();
                System.out.println("Enter Salary: ");
                int salary = sc.nextInt();
                System.out.println("Enter Status: ");
                String status = sc.next();

                applications[i] = new Application(company,role,location,salary,status);
                break;
            }
        }
    }
        void viewApplication(){
            for (int i = 0; i < applications.length; i++) {
                if (applications[i]!= null){
                    System.out.println(applications[i]);
                }
            }
        }
    void searchApplication(){
            System.out.println("Enter the index: ");
            int index = sc.nextInt();

            if (index >=0 && index < applications.length){
                if (applications[index]!= null){
                    System.out.println(applications[index]);
                }else {
                    System.out.println("No application found");
                }
            }
                else {
                System.out.println("Invalid Index");
            }
    }
    void deleteApplication(){

            System.out.println("Enter the index: ");
            int del = sc.nextInt();

            if (del >=0 && del < applications.length){
                if (applications[del]!= null){
                    applications[del] = null;
                }else {
                    System.out.println("No Application found: ");
                }

            }else {
                System.out.println("Invalid syntax: ");
            }
        }
    void updateApplication() {
        System.out.println("Enter the index to change between 0 - 4 ");
        int index = sc.nextInt();
     if (index>=0 && index< applications.length){
         if (applications[index] == null) {
             System.out.println("No application found at the index: " + index);
             return;
         }
     }else {
         System.out.println("Invalid index");
         return;
     }

            System.out.println("Enter your options: ");
           String option = sc.next();
            System.out.println("A. Company              B.Role         C. Salary              D.Location      E. Status     ");

        if (option.equals("A")) {
            System.out.println("Enter new company: ");
            String newCompany = sc.next();

            applications[index].setCompany(newCompany);
            System.out.println("Company Updated Successfully ");
        } else if (option.equals("B")) {
            System.out.println("Enter new role: ");
            String newRole = sc.next();

            applications[index].setRole(newRole);
            System.out.println("Role Updated Successfully ");
        } else if (option.equals("C")) {
            System.out.println("Enter new Salary: ");
            int newSalary = sc.nextInt();

            applications[index].setSalary(newSalary);
            System.out.println("Salary Updated Successfully ");
        } else if (option.equals("D")) {
            System.out.println("Enter new Location: ");
            String newLocation = sc.next();

            applications[index].setLocation(newLocation);
            System.out.println("Location Updated Successfully ");
        } else if (option.equals("E")) {
            System.out.println("Enter new Status: ");
            String newStatus = sc.next();

            applications[index].setStatus(newStatus);
            System.out.println("Status Updated Successfully ");
        }
    }
}
