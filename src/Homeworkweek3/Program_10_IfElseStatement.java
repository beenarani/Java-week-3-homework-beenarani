package Homeworkweek3;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */


public class Program_10_IfElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.println("Enter the first number : ");
        System.out.println("Enter the Second number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //use the symbol
        System.out.print("Choose and Enter the type of operation you want to perform (+, -, *, /, %) = ");
        char op = sc.next().charAt(0);

        //calling static method in main method
        solve(a, b, op);
    }

    //static method
    public static int solve(int a, int b, char op) {
        int ans = 0;
        //calculation
        if (op == '+') {
            ans = a + b;
        } else if (op == '-') {
            ans = a - b;
        } else if (op == '*') {
            ans = a * b;
        } else if (op == '%') {
            ans = a % b;
            // division
        }
        System.out.println("Your answer is = " + ans);
        return ans;
    }
}