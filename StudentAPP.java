// StudentAPP.java
// Grant Dresser
// 5/8/2026

import java.util.Scanner;

public class StudentAPP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student myStudent = null;
        int choice;

        do {
            System.out.println("\n--- Student App Menu ---");
            System.out.println("1. Create a student");
            System.out.println("2. Display student attributes");
            System.out.println("3. Change student major");
            System.out.println("4. Change student email");
            System.out.println("5. Choose an activity");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.print("Enter first name: ");
                String firstName = input.nextLine();

                System.out.print("Enter last name: ");
                String lastName = input.nextLine();

                System.out.print("Enter gender: ");
                String gender = input.nextLine();

                System.out.print("Enter age: ");
                int age = input.nextInt();

                System.out.print("Enter weight in pounds: ");
                double weight = input.nextDouble();

                System.out.print("Enter height in inches: ");
                double height = input.nextDouble();
                input.nextLine();

                System.out.print("Enter ethnic group: ");
                String ethnicGroup = input.nextLine();

                System.out.print("Enter religion: ");
                String religion = input.nextLine();

                System.out.print("Enter major: ");
                String major = input.nextLine();

                System.out.print("Enter class rank: ");
                String classRank = input.nextLine();

                System.out.print("Enter student email: ");
                String studentEmail = input.nextLine();

                myStudent = new Student(firstName, lastName, gender, age,
                        weight, height, ethnicGroup, religion,
                        major, classRank, studentEmail);

                System.out.println("Student created successfully!");
            }

            else if (choice == 2) {
                if (myStudent != null) {
                    myStudent.displaydata();
                } else {
                    System.out.println("You need to create a student first.");
                }
            }

            else if (choice == 3) {
                if (myStudent != null) {
                    System.out.print("Enter new major: ");
                    myStudent.major = input.nextLine();
                    System.out.println("Major updated.");
                } else {
                    System.out.println("You need to create a student first.");
                }
            }

            else if (choice == 4) {
                if (myStudent != null) {
                    System.out.print("Enter new student email: ");
                    myStudent.studentEmail = input.nextLine();
                    System.out.println("Student email updated.");
                } else {
                    System.out.println("You need to create a student first.");
                }
            }

            else if (choice == 5) {
                if (myStudent != null) {
                    System.out.println("\nChoose an activity:");
                    System.out.println("1. Eat something");
                    System.out.println("2. Go to class");
                    System.out.print("Enter your choice: ");

                    int activityChoice = input.nextInt();
                    input.nextLine();

                    if (activityChoice == 1) {
                        myStudent.eatSomething();
                    } else if (activityChoice == 2) {
                        myStudent.goToClass();
                    } else {
                        System.out.println("Invalid activity choice.");
                    }
                } else {
                    System.out.println("You need to create a student first.");
                }
            }

            else if (choice == 6) {
                System.out.println("Goodbye!");
            }

            else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        input.close();
    }
}