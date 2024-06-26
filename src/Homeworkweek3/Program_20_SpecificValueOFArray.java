package Homeworkweek3;

/**
 * 20. Write a Java program to test if an array contains a specific value.
 */

public class Program_20_SpecificValueOFArray {

    public static void main(String[] args) {
     //Inputs
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };

        System.out.println(contains(my_array1, 2013));
        System.out.println(contains(my_array1, 2015));
    }

    //Method
    public static boolean contains(int[] arr, int item) {

        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
}
