package Homeworkweek3;
//Import the scanner class
import java.util.Scanner;

/**
 * 13. Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */


public class Program_13_DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input
        System.out.print("Input number: ");
        int Day = scanner.nextInt();
      // Calling the method to main method
        System.out.println(getDayName(Day));
        //close the scanner class
        scanner.close();
    }

    //Static method create
    public static String getDayName(int Day) {
        String dayName = "";
        switch (Day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Week contains 1 to 7 days";
        }
        return dayName;
    }
}

