package com.pluralsight;

import java.util.Scanner;

public class mortagecalculator {
    public static void main(String[] args) {

        //Here is the user input where the user interacts //
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Welcome !! Calculate Your Mortage Here !!===");
        System.out.println("What is your principal loan Ammount ?");
        double principal = scanner.nextDouble();
        System.out.println("What is your Interest Rate (%) ?");
        double interestrate = scanner.nextDouble();
        System.out.println("What is your loan Length Example 15 , 20 , 30 Years? ");
        double loanlength = scanner.nextDouble();


        // changing intrest rate to decimal after user in

        double decimal = interestrate / 100 / 12 ;
        double years = loanlength * 12;

         // missed decimal took me nearly an hour to figure that out :{///


        double monthlypayment = principal *
                ( decimal * (Math.pow((1 + decimal),years)) /
                        (Math.pow(1 + decimal,years) - 1 ));

        System.out.printf("Monthly payment is $%.2f\n ",monthlypayment);

        double totalinterest = (monthlypayment * years) - principal;

        System.out.printf("Loan total interest Paid is $%.2f \n :" , totalinterest);

        scanner.close ();

    }
}

