package Homeworkweek3;

import java.util.Scanner;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */

public class Program_6_AnyNumberOddAndEven {
    public static void main(String[] args) {
        //Create the scanner object
        Scanner scanner = new Scanner(System.in);
        //Provide the input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        //Scanner class close
        scanner.close();
      //Calculate odd,even
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}


