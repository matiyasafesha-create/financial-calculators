package com.pluralsight;

import java.util.Scanner;

public class futurevalue {
    public static void main(String[] args) {
        Scanner firstscanner = new Scanner(System.in);
        System.out.println("====Hello Welcome how can we help calculate your Future Value ==== ");
        System.out.println("How Much Is your Deposit ?");
        double deposit = firstscanner.nextDouble();
        System.out.println("What is the Interest Rate in (%)");
        double interestrate = firstscanner.nextDouble();
        System.out.println("Number of Years it will Stay in that Account ?");
        double timeofyears = firstscanner.nextDouble();

        double r  = interestrate / 100;

        double futurevalue = deposit * Math.pow(1 + (r/365), 365 * timeofyears);
        System.out.printf("Your future vaue is $% .2f:\n" , futurevalue);

        double totalinterestearned = futurevalue - deposit;
        System.out.printf("Your total interest Earned in "+ timeofyears + "Years is $%.2f ", totalinterestearned);



    }
}
