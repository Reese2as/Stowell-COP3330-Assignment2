/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example.ex28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static int calc(List Numbers){

        int sum;
        int total = 0;
        for(int i = 0; i < Numbers.size(); i++) {
            sum = (int) Numbers.get(i);
            total += sum;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int result = 0, i;
        List<Integer> Numbers = new ArrayList<>();
        for(i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            Numbers.add(user_input.nextInt());
        }
        result = calc(Numbers);
        System.out.println("The total is " + result + ".");
    }
}
