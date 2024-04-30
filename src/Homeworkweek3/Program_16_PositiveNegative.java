package Homeworkweek3;
//Import scanner class
import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */


public class Program_16_PositiveNegative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Input
        System.out.println("Input Number");
        int number = scanner.nextInt();

        //close the scanner class
        scanner.close();

        //Declare the logic number1
        if (number > 0) {
            System.out.println("Number is positive");

            //Declare the logic number2
        } else if (number < 0) {
            System.out.println("Number is negative");

            //Declare the logic number3
        } else {
            System.out.println("Number is zero");

        }
    }
}