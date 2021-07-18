package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Verapen
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: " );
        int firstNum = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNum = scanner.nextInt();
        compareInput compareInput = new compareInput();
        compareInput.getLargest(firstNum, secondNum, thirdNum);
    }
}
