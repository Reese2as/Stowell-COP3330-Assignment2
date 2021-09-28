/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Reese Stowell
 */

package org.example.ex38;
import java.util.*;

public class App {
    public static Integer[] filterEvenNumbers(String [] Input_Array)
    {
        List<Integer> Even_List = new ArrayList<>();
        Integer[] Evens;
        int[] Arr= new int[Input_Array.length];

        for( int i = 0; i < Input_Array.length; i++)
        {
            Arr[i] = Integer.parseInt(Input_Array[i]);
        }

        for(int i = 0; i < Input_Array.length; i++)
        {
            if ((Arr[i]) % 2 == 0)
            {
                Even_List.add(Integer.valueOf(Input_Array[i]));
            }
        }
        Evens = Even_List.toArray(new Integer[Even_List.size()]);
        return Evens;
    }
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        String Input;
        String[] Input_Array;
        Integer[] Evens;

        System.out.print("Enter a list of numbers, separated by spaces: ");
        Input = user_input.nextLine();

        Input_Array = Input.split(" ");

        Evens = filterEvenNumbers(Input_Array);

        for(int i = 0; i< Evens.length;i++)
        {
            System.out.print(Evens[i]+ " ");
        }
    }
}
