/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Reese Stowell
 */

package org.example.ex29;
import java.util.Scanner;

public class App {
    public static int calc(int ror){
        int years;
        years = 72/ror;
        return years;
    }
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        int ror, dividebyzero;
        System.out.print("What is the rate of return? ");

        do
        {
            try {
                user_input = new Scanner(System.in);
                ror = user_input.nextInt();
                if(ror == 0){
                    dividebyzero = 1/ror;
                }
            }
            catch (Exception ex){
                ror = -1;
                System.out.print("Sorry. That's not a valid input.\nWhat is the rate of return? ");
            }
        }
        while (ror == -1);

        int years = calc(ror);
        System.out.println(String.format("It will take %d years to double your initial investment.", years));
    }
}

