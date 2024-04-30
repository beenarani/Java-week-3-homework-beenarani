package Homeworkweek3;
//import the scanner class
import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */


public class Program_7_SalesData {
    public static void main(String[] args) {

        //inputs
        double CommissionRate = 0;
        double TotalSales, Commission;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter total sales ");
        TotalSales=scanner.nextDouble();

        //calculate the sales and commission in if else statement
        if (TotalSales>=50000)
            CommissionRate=0.35;
        else if (TotalSales>=30000 && TotalSales <50000)
            CommissionRate=0.20;
        else if (TotalSales>=20000 && TotalSales <30000)
            CommissionRate=0.10;
        else if (TotalSales>=10000 && TotalSales <20000)
            CommissionRate=0.05;
        else if (TotalSales<10000)
            CommissionRate=0.02;
        Commission = CommissionRate * TotalSales;
        System.out.println("The Commision is: "+ Commission);

    }

}


