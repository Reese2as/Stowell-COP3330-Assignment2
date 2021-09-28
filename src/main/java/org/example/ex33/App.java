/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Reese Stowell
 */

package org.example.ex33;
import java.util.*;

public class App {
    public static int CreateRandomNumber(){
        int rand;
        rand = (int)Math.ceil(Math.random()*4);
        return rand;
    }
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        String question;
        List<String> Response = new ArrayList<String>();

        Response.add("Yes");
        Response.add("No");
        Response.add("Maybe");
        Response.add("Ask again later.");

        System.out.print("What's your question?\n> ");
        question = user_input.nextLine();

        int num = CreateRandomNumber();

        System.out.println(Response.get(num));
    }
}
