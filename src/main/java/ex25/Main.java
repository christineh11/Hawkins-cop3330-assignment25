package ex25;
import org.junit.Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void PasswordValidator(String input)
    {

        boolean Letter = false, Digit = false, special = false;
        Set<Character> string = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));

        for (char i : input.toCharArray())
        {
            if (Character.isLetter(i))
                Letter = true;
            if (Character.isDigit(i))
                Digit = true;
            if (string.contains(i))
                special = true;
        }

        int n = input.length();
        if (Digit && Letter && special && (n >= 8))
            System.out.printf("The password '%s' is a very strong password", input);
        else if (Letter && Digit && (n >= 8))
            System.out.printf("The password '%s' is a strong password", input);
        else if (Letter && (n<8))
            System.out.printf("The password '%s' is a weak password", input);
        else if (Digit && (n<8))
            System.out.printf("The password '%s' is a very weak password", input);

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter Password: ");
        String str=input.nextLine();

        PasswordValidator(str);


    }
}
