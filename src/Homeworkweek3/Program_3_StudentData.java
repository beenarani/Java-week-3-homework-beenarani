package Homeworkweek3;

import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

public class Program_3_StudentData {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter Math marks: ");
        int mathMarks = scanner.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        System.out.print("Enter Science marks: ");
        int scienceMarks = scanner.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        System.out.print("Enter English marks: ");
        int englishMarks = scanner.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 3.0);

        System.out.println("___________________________________");
        System.out.println("|                                 |");
        System.out.println("|         Mark Sheet              |");
        System.out.println("|_________________________________|");
        System.out.println("| Name:"+" :                       "+"  |");
        System.out.println("| Roll No"+":                      "+"  |");
        System.out.println("|_________________________________|");
        System.out.println("| Subjects  : Marks               |");
        System.out.println("|_________________________________|");
        System.out.println("| Math"+"      :                    |");
        System.out.println("| Science"+"   :                   "+"  |");
        System.out.println("| English"+"   :                   "+"  |");
        System.out.println("|_________________________________|");
        System.out.println("| Total"+"     :                   "+"  |");
        System.out.println("|_________________________________|");
        System.out.printf("| Percentage : %.1f%%              |%n", percentage);

        if (percentage >= 80) {
            System.out.println("| Result :   Pass                    |");
            System.out.println("| Grade :     A+                     |");
        } else if (percentage >= 60) {
            System.out.println("| Result : Pass                  |");
            System.out.println("| Grade : A                      |");
        } else if (percentage >= 50) {
            System.out.println("| Result : Pass                  |");
            System.out.println("| Grade : B                      |");
        } else if (percentage >= 35) {
            System.out.println("| Result : Pass                  |");
            System.out.println("| Grade : C                      |");
        } else {
            System.out.println("| Result : Fail                 |");
            System.out.println("| Grade : -                     |");
        }
        System.out.println("|________________________________|");

        scanner.close();
    }
    }
