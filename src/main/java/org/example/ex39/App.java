/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Reese Stowell
 */

package org.example.ex39;
import java.util.*;

public class App {
    public static List<Map<String, String>> SortingRecords()
    {
        List<Map<String, String>> Map = new ArrayList<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("First Name", "John"); map1.put("Last Name","Johnson");
        map1.put("Position","Manager"); map1.put("Separation Date","2016-12-31");

        Map<String, String> map2 = new HashMap<>();
        map2.put("First Name", "Tou"); map2.put("Last Name","Xiong");
        map2.put("Position","Software Engineer"); map2.put("Separation Date","2016-10-05");

        Map<String, String> map3 = new HashMap<>();
        map3.put("First Name", "Michaela"); map3.put("Last Name","Michaelson");
        map3.put("Position","District Manager"); map3.put("Separation Date","2015-12-19");

        Map<String, String> map4 = new HashMap<>();
        map4.put("First Name", "Jake"); map4.put("Last Name","Jacobson");
        map4.put("Position","Programmer"); map4.put("Separation Date","");

        Map<String, String> map5 = new HashMap<>();
        map5.put("First Name", "Jacquelyn"); map5.put("Last Name","Jackson");
        map5.put("Position","DBA"); map5.put("Separation Date","");

        Map<String, String> map6 = new HashMap<>();
        map6.put("First Name", "Sally"); map6.put("Last Name","Webber");
        map6.put("Position","Web Developer"); map6.put("Separation Date","2015-12-18");

        Map.add(map1);
        Map.add(map2);
        Map.add(map3);
        Map.add(map4);
        Map.add(map5);
        Map.add(map6);

        return Map;
    }
    public static Comparator<Map<String, String>> Comparator = new Comparator<Map<String, String>>()
    {
        public int compare(Map<String, String> Map, Map<String, String> Map2)
        {
            return Map.get("Last Name").compareTo(Map2.get("Last Name"));
        }
    };
    public static void main(String[] args)
    {
        List<Map<String, String>> Map;
        Map<String, String> Map2;
        Map = SortingRecords();

        Collections.sort(Map, Comparator);

        System.out.println("Name                | Position          | Separation Date\n--------------------|-------------------|----------------");

        for (int i = 0; i < Map.size(); i++)
        {
            Map2 = Map.get(i);
            String First_Name = Map2.get("First Name");
            String Last_Name = Map2.get("Last Name");
            String Name = First_Name +" "+ Last_Name;
            String Posistion = Map2.get("Position");
            String SD = Map2.get("Separation Date");
            System.out.format("%-20s| %-18s| %-20s\n", Name, Posistion, SD);
        }
    }
}
