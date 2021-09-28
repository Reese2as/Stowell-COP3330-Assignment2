/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Reese Stowell
 */

package org.example.ex30;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        int i, j, k;
        for (i = 1; i <= 12; i++)
        {
            System.out.print("\n");
            for (j = 1; j <= 12; j++)
            {
                k = (i*j);
                System.out.print(String.format("%4d ",k));
            }
        }
    }
}
