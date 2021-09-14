package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */
public class NumComparison
{
    public static void main( String[] args )
    {
        // Program finding the max int of three ints
        int max;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = input.nextInt();

        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        if (first < second)
            max = second;
        else
            max = first;

        System.out.print("Enter the third number: ");
        int third = input.nextInt();

        if (max < third)
            max = third;

        System.out.print("The larget number is " + max);
    }
}
