/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example.ex35;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static int CreateRandomNumber(List Names){
        Random rand = new Random();
        int randnum = rand.nextInt(Names.size());
        return randnum;
    }
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        String currentname;

        boolean b = true;
        List<String> Names = new ArrayList<String>();

        while(b == true){

            System.out.print("Enter a name: ");
            currentname = user_input.nextLine();
            if(currentname.equals(""))
            {
                b = false;
                continue;
            }
            Names.add(currentname);
        }

        int randnum = CreateRandomNumber(Names);

        System.out.println("The winner is... " + Names.get(randnum));

    }
}
