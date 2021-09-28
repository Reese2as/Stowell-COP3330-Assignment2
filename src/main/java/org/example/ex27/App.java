
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example.ex27;
import java.util.Scanner;

public class App {
    public static String FirstNameValidate(String First_Name)
    {
        String result1 = ("");

        if(First_Name.length() < 2)
        {
            result1 = "The first name must be at least 2 characters long.\n";
        }
        if(First_Name == "")
        {
            result1 = "The first name must be filled in.\n";
        }
        return result1;
    }

    public static String LastNameValidate(String Last_Name)
    {
        String result2 = ("");

        if(Last_Name.length() < 2)
        {
            result2 = "The last name must be at least 2 characters long.\n";
        }
        if(Last_Name == "")
        {
            result2 = "The last name must be filled in.\n";
        }
        return result2;
    }
    public static String Emp_IDValidate(String Emp_ID)
    {
        String result3 = ("");
        char[] ch = Emp_ID.toCharArray();

        if(Emp_ID.length() != 7)
        {
            result3 ="The Employee ID must be in the format of AA-1234\n";
        }

        for(int i = 0; i < Emp_ID.length(); i++)
        {
            if(i < 2)
            {
                if(!Character.isAlphabetic(ch[i]))
                {
                    result3 ="The Employee ID must be in the format of AA-1234\n";
                }
            }
            if(i == 2)
            {
                if(ch[i] != '-')
                {
                    result3 ="The Employee ID must be in the format of AA-1234\n";
                }
            }
            if(i > 2)
            {
                if(!Character.isDigit(ch[i]))
                {
                    result3 ="The Employee ID must be in the format of AA-1234\n";
                }
            }
        }
        return result3;
    }

    public static String ZIPValidate(String ZIP)
    {
        String result4 = ("");

        if(ZIP.length() != 5)
        {
            result4 = "The zipcode must be a five digit number\n";
        }
        for(char c : ZIP.toCharArray())
        {
            if(!Character.isDigit(c))
            {
                result4 = "The zipcode must be a five digit number\n";
            }
        }

        return result4;
    }
    public static void validateInput(String First,String Last, String ZIP, String Emp_ID)
    {
        String Firstname_result  = FirstNameValidate(First);
        String Lastname_result = LastNameValidate(Last);
        String Emp_ID_result = Emp_IDValidate(Emp_ID);
        String ZIP_result = ZIPValidate(ZIP);

        String Final = Firstname_result + Lastname_result + Emp_ID_result + ZIP_result;

        if(Final == "")
        {
            Final = ("There were no errors found.");
        }
        System.out.println(Final);
    }
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        String First_Name, Last_Name, ZIP, Emp_ID;

        System.out.print("Enter the first name: ");
        First_Name = user_input.nextLine();
        System.out.print("Enter the last name: ");
        Last_Name = user_input.nextLine();
        System.out.print("Enter the ZIP code: ");
        ZIP = user_input.nextLine();
        System.out.print("Enter the employee ID: ");
        Emp_ID = user_input.nextLine();

        validateInput(First_Name,Last_Name,ZIP,Emp_ID);
    }
}
