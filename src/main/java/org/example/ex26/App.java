
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example.ex26;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        int Balance,monthly_payment;
        double APR;
        System.out.print("What is your balance? ");
        Balance = user_input.nextInt();
        System.out.print("What is the APR on the card (as a percent)? ");
        APR = user_input.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        monthly_payment = user_input.nextInt();

        PaymentCalculator Calc = new PaymentCalculator();
        int Months = Calc.calculateMonthsUntilPaidOff(Balance, APR, monthly_payment);

        System.out.println(String.format("It will take you %d months to pay off this card.", Months));
    }
}
class PaymentCalculator
{
    public int calculateMonthsUntilPaidOff(int Bal, double APR, int payment)
    {
        double q = APR/100.0;
        double i = q/365.0;

        double n = (-(1.0/30.0) * ((Math.log(1.0 + Bal/payment * (1.0 -  Math.pow((1.0 + i), 30.0)))) / Math.log(1.0 + i)));
        int result = (int) Math.ceil(n);
        return result;
    }
}