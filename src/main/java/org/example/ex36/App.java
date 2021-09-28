/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example.ex36;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static double average(List<Integer> Numbers)
    {
        double total = 0, avg;
        for(int i=0;i < Numbers.size(); i++)
        {
            total += Numbers.get(i);
        }
        avg = (total/Numbers.size());
        return avg;
    }
    public static int max(List<Integer> Numbers)
    {
        int max = Numbers.get(0);
        for(int i = 1; i < Numbers.size();i++)
        {
            if(max < Numbers.get(i))
            {
                max = Numbers.get(i);
            }
        }
        return max;
    }
    public static int min(List<Integer>Numbers)
    {
        int min = Numbers.get(0);
        for(int i = 1; i < Numbers.size();i++)
        {
            if(min > Numbers.get(i))
            {
                min = Numbers.get(i);
            }
        }
        return min;
    }
    public static double std(List<Integer>Numbers)
    {
        List<Double> differences = new ArrayList<Double>();
        double average = average(Numbers);
        double total = 0;

        for(int i = 0; i < Numbers.size();i++)
        {
            differences.add(Math.pow((double)Numbers.get(i)-average,2));
        }
        for(int i = 0; i < differences.size(); i++)
        {
            total += differences.get(i);
        }
        total = total/ differences.size();
        return Math.sqrt(total);
    }
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        String number_String;
        int currentnumber = 0;
        boolean b = true;
        List<Integer> Numbers = new ArrayList<Integer>();

        while(b == true){

            System.out.print("Enter a number: ");
            do
            {
                try {
                    number_String = user_input.nextLine();
                    if(number_String.equals("done") || number_String.equals("Done"))
                    {
                        b = false;
                        continue;
                    }
                    currentnumber = Integer.parseInt(number_String);
                    Numbers.add(currentnumber);
                }
                catch (Exception ex){
                    currentnumber = -1;
                    System.out.print("Sorry. That's not a valid input.\nEnter a number: ");
                }
            }
            while (currentnumber == -1);
        }

        System.out.print("Number: ");
        for(int i=0;i < Numbers.size(); i++)
        {
            System.out.print(Numbers.get(i));
            if(i != Numbers.size()-1)
            {
                System.out.print(", ");
            }
        }
        double avg = average(Numbers);
        int max = max(Numbers);
        int min = min(Numbers);
        double std = std(Numbers);
        System.out.println(String.format("\nThe average is %.1f\nThe minimum is %d\nThe maximum is %d\nThe standard deviation is %.2f ", avg, min, max, std));

    }

}
