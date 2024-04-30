package Homeworkweek3;

/**
 * 18. Write a Java program to sum values of an array.
 */

public class Program_18_SumValueOfArray {

    public static void main(String[] args) {

        //Input
        int num[] = {10, 20, 30, 40, 50};

        //Sum
        int sum = 0;
        for (int i : num)
            sum += i;

        //concatenation
        System.out.println("The sum is " + sum);
    }
}
