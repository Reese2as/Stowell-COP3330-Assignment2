
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Reese Stowell
 */

package org.example.ex34;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class App {

    public static String printlist(List Employees)
    {
        int numemployees;
        String result = "";
        numemployees = Employees.size();

        System.out.print(String.format("\nThere are %d employees:\n",numemployees));

        for(int i=0; i < numemployees; i++)
        {
            result += String.format("%s\n",Employees.get(i));
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        String removal;

        List<String> Employees = new ArrayList<String>();

        Employees.add("John Smith");
        Employees.add("Jackie Jackson");
        Employees.add("Chris Jones");
        Employees.add("Amanda Cullen");
        Employees.add("Jeremy Goodwin");

        System.out.println(printlist(Employees));

        System.out.print("Enter an employee name to remove: ");

        removal = user_input.nextLine();

        if (removal.equals("John Smith"))
        {
            Employees.remove("John Smith");
            System.out.println(printlist(Employees));
        }
        if (removal.equals("Jackie Jackson"))
        {
            Employees.remove("Jackie Jackson");
            System.out.println(printlist(Employees));
        }
        if (removal.equals("Chris Jones"))
        {
            Employees.remove("Chris Jones");
            System.out.println(printlist(Employees));
        }
        if (removal.equals("Amanda Cullen"))
        {
            Employees.remove("Amanda Cullen");
            System.out.println(printlist(Employees));
        }
        if (removal.equals("Jeremy Goodwin"))
        {
            Employees.remove("Jeremy Goodwin");
            System.out.println(printlist(Employees));
        }

    }
}