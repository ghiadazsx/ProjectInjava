package CalculateGPA;

import java.util.Scanner;

public class CalculatesGPA {

    //Program calculates the GPAs of a class of students and get the highst GPA
    public static void main(String[] args) {
//make object to user input3
        Scanner s = new Scanner(System.in);
        //inistlize two varible 
        double GPA = 0;
        String heist_GPA_Name = "";
        //message to user to show what to need to enter
        System.out.print("Enter Number of Students: ");
        int num = s.nextInt();
        //check the number of user input for students
        while (true) {
            if (num < 10) {
                System.out.println("Invalid input, The minimum number of student is 10");
                System.out.print("Enter Number of Students:");
                num = s.nextInt();
            } else if (num > 9) {
                break;
            }
        }
        //make loop to enter student Name and Number of Courses
        for (int i = 0; i < num; i++) {
            double student_GPA = 0;
            int Total_Credits = 0;
            System.out.print("Enter the Name and Number of Courses of Student Number  "
                    + (i + 1) + ": ");
            Scanner x = new Scanner(System.in);
            String name = x.next();

            int num2 = x.nextInt();
            for (int j = 0; j < num2; j++) {
                // int sum = 0;
                System.out.print("For Student " + name + ", Enter course "
                        + (j + 1) + " Mark and Credit Hours: ");
                int marks = s.nextInt();
                int Gredits = s.nextInt();
                if (marks >= 90) {
                    student_GPA += 4 * Gredits;
                } else if (marks >= 82) {
                    student_GPA += 3.5 * Gredits;
                } else if (marks >= 74) {
                    student_GPA += 3 * Gredits;
                } else if (marks >= 66) {
                    student_GPA += 2.5 * Gredits;
                } else if (marks >= 58) {
                    student_GPA += 2 * Gredits;
                } else if (marks >= 50) {
                    student_GPA += 1.5 * Gredits;
                } else if (marks < 50) {
                    student_GPA += 0 * Gredits;
                }
                Total_Credits += Gredits;

            }
            //claculate student gpa 
            student_GPA = student_GPA / Total_Credits;
            System.out.printf("Student %s GPA is %.2f \n", name, student_GPA);
            //claulate th heist gpa 
            if (student_GPA > GPA) {
                GPA = student_GPA;
                double GPA_Round = Math.round(student_GPA * 100.0) / 100.0;
                heist_GPA_Name = "Student " + name + " Got the heist GPA Which is " + GPA_Round + ".";

            }

        }
        //print heist GPA
        System.out.println(heist_GPA_Name);
    }
}
