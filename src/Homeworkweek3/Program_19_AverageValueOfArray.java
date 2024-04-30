package Homeworkweek3;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */


public class Program_19_AverageValueOfArray {
    public static void main(String[] args) {

        //Inputs
        int num[] = new int[]{18, 20, 40, -25, -21, 50};

         //Sum
         int sum = 0;

         for (int i = 0; i < num.length; i++) {

             sum = sum + num[i];

            //average
            double average = sum / num.length;

            //concatenation
            System.out.println("Average value of the array elements is : " + average);
        }
    }
}



