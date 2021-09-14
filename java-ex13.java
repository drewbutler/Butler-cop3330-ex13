/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the principal amount? ");
        int principal= myObj.nextInt();

        System.out.println("Enter the rate? ");
        double rateInterest = myObj.nextDouble();

        System.out.println("Enter the number of years? ");
        int years = myObj.nextInt();

        System.out.println("What is the number of times the interest is compunded per year? ");
        int times = myObj.nextInt();

        double  percentage = rateInterest / 100;

        double totalFirst = (1 + percentage / times);
        double totalSecond = (times * years);

        double Amount  = Math.pow(totalFirst, totalSecond);
        double finalAmount = principal * Amount;


        System.out.printf("$%d invested at %.2f%% for %d years compounded %d times per year is $%.2f.", principal, rateInterest, years, times, finalAmount);

        myObj.close();
    }
}