package com.bridgelabz.practiceproblems;
import java.util.Scanner;
public class stackAccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStocks;
        double totalValue = 0;
        System.out.print("Enter the number of stocks you want to add: ");
        numberOfStocks = sc.nextInt();

        String[] stockNames = new String[numberOfStocks];
        int[] numberOfShares = new int[numberOfStocks];
        double[] sharePrices = new double[numberOfStocks];

        for (int i = 0; i < numberOfStocks; i++) {
            System.out.print("Enter the name of stock " + (i + 1) + ": ");
            stockNames[i] = sc.next();
            System.out.print("Enter the number of shares for stock " + (i + 1) + ": ");
            numberOfShares[i] = sc.nextInt();
            System.out.print("Enter the share price for stock " + (i + 1) + ": ");
            sharePrices[i] = sc.nextDouble();
        }

        System.out.println("Stock Report");
        System.out.println("------------");
        for (int i = 0; i < numberOfStocks; i++) {
            double stockValue = numberOfShares[i] * sharePrices[i];
            totalValue += stockValue;
            System.out.println("Stock Name: " + stockNames[i]);
            System.out.println("Number of Shares: " + numberOfShares[i]);
            System.out.println("Share Price is " + sharePrices[i] + "Rs");
            System.out.println("Total Price Of Stock is " + stockValue + "Rs");
            System.out.println();
        }

        System.out.println("Total Value of Stocks: " + totalValue);
    }
}
