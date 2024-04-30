package Homeworkweek3;

import java.util.Scanner;

/**
 * 9. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * using switch statement
 */

public class Program_9_SwitchMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input alphabet
        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().charAt(0);

        // Print corresponding city name or "Invalid Entry"
        switch (alphabet) {
            case 'A':
                System.out.println("City name: Ahmedabad");
                break;
            case 'B':
                System.out.println("City name: Baroda");
                break;
            case 'C':
                System.out.println("City name: Chennai");
                break;
            case 'D':
                System.out.println("City name: Delhi");
                break;
            case 'E':
                System.out.println("City name: Edmonton");
                break;
            case 'F':
                System.out.println("City name: Faridabad");
                break;
            default:
                System.out.println("Invalid Entry");
        }

        scanner.close();
    }
}
