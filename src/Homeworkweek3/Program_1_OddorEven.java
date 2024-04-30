package Homeworkweek3;
//import scanner class

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Program_1_OddorEven {

    public static void main(String[] args) {
        //To call the scanner class creating object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = scanner.nextInt();
        //Close scanner class
        scanner.close();
        //Calculating even and odd
        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + evenOdd);
    }

}

