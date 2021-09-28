/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Reese Stowell
 */

package org.example.ex31;
import java.util.Scanner;
public class App {
    public static double calc(int Age, int RP, int intensity){
        double TargetHeartRate;
        TargetHeartRate = (((220 - Age) - RP) * ((double)intensity/100))+ RP;
        return TargetHeartRate;
    }
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int RP, Age;
        double TargetHeartRate;

        System.out.print("What is your Resting Pulse: ");
        do
        {
            try {
                user_input = new Scanner(System.in);
                RP = user_input.nextInt();
            }
            catch (Exception ex){
                RP = -1;
                System.out.print("Sorry. That's not a valid input.\nWhat is your Resting Pulse: ");
            }
        }
        while (RP == -1);

        System.out.print("What is your Age: ");
        do
        {
            try {
                user_input = new Scanner(System.in);
                Age = user_input.nextInt();
            }
            catch (Exception ex){
                Age = -1;
                System.out.print("Sorry. That's not a valid input.\nWhat is your Resting Pulse: ");
            }
        }
        while (Age == -1);

        System.out.println("Intensity    | Rate   \n-------------|--------");
        for(int intensity = 55; intensity <=95; intensity+=5)
        {
            TargetHeartRate = calc(Age, RP, intensity);
            System.out.println(String.format("%d%%          | %3.0f bpm",intensity,TargetHeartRate));
        }

    }
}

