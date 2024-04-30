package Homeworkweek3;
//import scanner class
import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */


public class Program_12_InputValue {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //input
        System.out.println("Enter any Input : ");
       char ch = scanner.next().charAt(0);

        //close scanner class
       scanner.close();

       //Calculate the input value is number or an alphabet or symbol.
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

        System.out.println(ch + " is A ALPHABET.");
        } else if(ch >= '0' && ch <= '9') {
        System.out.println(ch + " is A DIGIT.");
       } else {
        System.out.println(ch + " is A SPECIAL CHARACTER.");
    }

}
}

