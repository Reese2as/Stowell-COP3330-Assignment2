/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Reese Stowell
 */

package org.example.ex37;
import java.util.*;

public class App {
    public static ArrayList RandLetters(int TotalLetters)
    {
        Random Rand = new Random();

        ArrayList<Character> Letters = new ArrayList<>();
        ArrayList<Character> RetLetters = new ArrayList<>();

        Collections.addAll(Letters,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

        for(int i = 0; i < TotalLetters; i++)
        {
            RetLetters.add(Letters.get(Rand.nextInt(26)));
        }
        return RetLetters;
    }
    public static ArrayList RandChar(int Amt_Special_Char)
    {
        Random Rand = new Random();

        ArrayList<Character> Special_char = new ArrayList<>();
        ArrayList<Character> RetSpecial_char = new ArrayList<>();

        Collections.addAll(Special_char, '!','$','@','#','%','^','&','*','+','-');

        for(int i = 0; i < Amt_Special_Char; i++)
        {
            RetSpecial_char.add(Special_char.get(Rand.nextInt(10)));
        }
        return RetSpecial_char;
    }

    public static ArrayList RandNum(int amt_numbers)
    {
        Random Rand = new Random();

        ArrayList<Character> Numbers = new ArrayList<>();
        ArrayList<Character> RetNumbers = new ArrayList<>();

        Collections.addAll(Numbers,'0','1','2','3','4','5','6','7','8','9');

        for(int i = 0; i < amt_numbers; i++)
        {
            RetNumbers.add(Numbers.get(Rand.nextInt(10)));
        }
        return RetNumbers;
    }
    public static String GeneratePassword(List Chars, List Nums, List Letters){
        ArrayList<Character> Password = new ArrayList<>();
        Password.addAll(Letters);
        Password.addAll(Chars);
        Password.addAll(Nums);
        Collections.shuffle(Password);
        String Password_string = Password.toString();
        return Password_string;
    }
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        Random Rand = new Random();
        int Min_Length, Amt_Special_Char, Amt_Numbers;

        ArrayList<Character> Chars = new ArrayList<>();
        ArrayList<Character> Nums = new ArrayList<>();
        ArrayList<Character> Letters = new ArrayList<>();


        System.out.print("What's the minimum length? ");
        Min_Length = user_input.nextInt();
        System.out.print("How many special characters? ");
        Amt_Special_Char = user_input.nextInt();
        System.out.print("How many numbers? ");
        Amt_Numbers = user_input.nextInt();

        int TotalLetters = Amt_Special_Char + Amt_Numbers;

        if(Min_Length > TotalLetters)
        {
            TotalLetters = Min_Length - TotalLetters;
        }
        else if(TotalLetters > Min_Length)
        {
            TotalLetters = Amt_Special_Char + Amt_Numbers;
        }
        TotalLetters = TotalLetters + Rand.nextInt(4);

        Chars = RandChar(Amt_Special_Char);
        Nums = RandNum(Amt_Numbers);
        Letters = RandLetters(TotalLetters);



        String Password = GeneratePassword(Chars, Nums, Letters);
        Password = Password.replace("[", "").replace("]", "").replace(",","").replace(" ","");

        System.out.println("Your password is " + Password);
    }
}
