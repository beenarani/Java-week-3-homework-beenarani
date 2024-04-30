package Homeworkweek3;
//import scanner class
import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */

public class Program_17_NumericAndStringArray {
    public static void main(String[] args) {

        //Input
        int[] numbers = {15, 3, 11, 12, 2};
        String[] name = {"Beena", "Renee", "Rani", "Aman"};


        System.out.println("Original numeric array : " + Arrays.toString(numbers));
        //Sort
        Arrays.sort(numbers);
        System.out.println("Sorted numeric array : " + Arrays.toString(numbers));


        System.out.println("Original string array : " + Arrays.toString(name));
        //sort
        Arrays.sort(name);
        System.out.println("Sorted string array : " + Arrays.toString(name));

    }
}
