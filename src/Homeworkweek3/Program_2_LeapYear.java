package Homeworkweek3;
//import scanner class

import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class Program_2_LeapYear {
    public static void main(String[] args) {

        //To call the scanner class creating object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = scanner.nextInt();
        //Close scanner class
        scanner.close();

        //Calculating leap year
        boolean A = (year % 4) == 0;
        boolean B = (year % 100) != 0;
        boolean C = ((year % 100 == 0) && (year % 400 == 0));

        if (A && (B || C)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
