package Homeworkweek3;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */


public class Program_8_AlphabetFromAtoF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input alphabet
        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().charAt(0);

        // Print corresponding city name or "Invalid Entry"
        if (alphabet == 'A') {
            System.out.println("City name: Ahmedabad");
        } else if (alphabet == 'B') {
            System.out.println("City name: Bangalore");
        } else if (alphabet == 'C') {
            System.out.println("City name: Chennai");
        } else if (alphabet == 'D') {
            System.out.println("City name: Delhi");
        } else if (alphabet == 'E') {
            System.out.println("City name: Mumbai");
        } else if (alphabet == 'F') {
            System.out.println("City name: Kolkata");
        } else {
            System.out.println("Invalid Entry");
        }

        scanner.close();
    }
}