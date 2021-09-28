/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Reese Stowell
 */

package org.example.ex32;
import java.util.Scanner;
public class App {
    public static void Restart()
    {
        Scanner user_input = new Scanner(System.in);
        String replay;
        System.out.println("Do you wish to play again (Y/N)?");
        replay = user_input.nextLine();

        if (replay.equals("y") || replay.equals("Y"))
        {
            StartGame();
        }
        else
        {
            System.out.println("Thanks for playing!");
            System.exit(1);
        }
    }
    public static void StartGame()
    {
        Scanner user_input = new Scanner(System.in);
        int difficulty, randnum, difflvl, count = 1;
        System.out.print("\nEnter the difficulty level (1, 2, or 3): ");
        do
        {
            try {
                user_input = new Scanner(System.in);
                difficulty = user_input.nextInt();
            }
            catch (Exception ex){
                difficulty = -1;
                System.out.print("Sorry. That's not a valid input.\nEnter the difficulty level (1, 2, or 3): ");
            }
        }
        while (difficulty == -1);

        randnum = CreateRandomNumber(difficulty);

        System.out.println("I have my number. What is your guess?");
        GameTIME(randnum, count);
    }
    public static int CreateRandomNumber(int difficulty){
        int randnum, difflvl;
        difflvl = (int) Math.pow(10.0, difficulty);
        randnum = (int) Math.ceil(Math.random() * difflvl);
        return randnum;
    }
    public static void GameTIME(int randnum, int count)
    {
        Scanner user_input = new Scanner(System.in);
        int user_guess;
        do
        {
            try {
                user_input = new Scanner(System.in);
                user_guess = user_input.nextInt();
                if(user_guess<randnum)
                {
                    System.out.println("Too low. Guess again:");
                    count++;
                    GameTIME(randnum, count);
                }
                if(user_guess>randnum)
                {
                    System.out.println("Too high. Guess again:");
                    count++;
                    GameTIME(randnum, count);
                }
                if(user_guess==randnum)
                {
                    System.out.println(String.format("You got it in %d guesses!\n", count));
                    Restart();
                }
            }
            catch (Exception ex){
                user_guess = -1;
                count++;
                System.out.print("Sorry. That's not a valid input. Please enter a new guess\n");
            }
        }
        while (user_guess == -1);
    }
    public static void main(String[] args)
    {
        System.out.print("Let's play Guess the Number!\n");
        StartGame();
    }
}

