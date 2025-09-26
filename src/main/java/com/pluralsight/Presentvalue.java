package com.pluralsight;

import java.util.Scanner;

public class Presentvalue {
    public static void main(String[] args) {
        Scanner secondscanner = new Scanner(System.in);
        System.out.println("===== Welcome to Annuity Calculator =====");
        System.out.println("What is The Present value OR How Much Money do you need to Invest  ?");
        double payout = secondscanner.nextDouble();
        System.out.println("What is the Expected Interest Rate for this Annuity (%) ? ");
        double aninterest = secondscanner.nextDouble();
        System.out.println("Number of time Period ? ");
        double anyears = secondscanner.nextDouble();

        double conint = aninterest / 100;

        double an = payout * (1 - Math.pow (1 + conint ,- anyears ))
                / conint;

        System.out.printf("Present Value that need to be invested is  %.2f \n" , an);



    }

}
