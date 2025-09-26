package com.pluralsight;

import java.util.Scanner;

public class Callingmycalculators {
    public static void choosecalculator () {
        Scanner scanner = new Scanner(System.in);


        System.out.println("==Choose a Calculator Listed Below 1 For Mortgage 2 Future Value 3 For Annuity Thank you === ");
        int choice = scanner.nextInt();

        if (choice == 1 )

        {



        System.out.println("====Welcome !! Calculate Your Mortgage Here !!===");
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

        } else if (choice == 2 ) {


            Scanner firstscanner = new Scanner(System.in);
            System.out.println("====Hello Welcome how can we help calculate your Future Value ==== ");
            System.out.println("How Much Is your Deposit ?");
            double deposit = firstscanner.nextDouble();
            System.out.println("What is the Interest Rate in (%)");
            double interestrates = firstscanner.nextDouble();
            System.out.println("Number of Years it will Stay in that Account ?");
            double timeofyears = firstscanner.nextDouble();

            double r = interestrates / 100;

            double futurevalue = deposit * Math.pow(1 + (r / 365), 365 * timeofyears);
            System.out.printf("Your future vaue is $% .2f:\n", futurevalue);

            double totalinterestearned = futurevalue - deposit;
            System.out.printf("Your total interest Earned in " + timeofyears + "Years is $%.2f ", totalinterestearned);

        } else if (choice == 3 ) {




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

        else{

        }
            System.out.println("Error Input!! Try Again Please !!!! ");

    }
    public static void main(String[] args) {
        choosecalculator();

}
}
