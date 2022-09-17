package com.cs5000.a2.p2;

import java.util.Random;
import java.util.Scanner;

public class IfElse {
    private static final Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Welcome to the game of Guess It!\n" +
                "I will choose a number between 0 and 9.\n" +
                "You will try to guess that number. If your guess wrong, I will tell you if you guessed too high or too low.\n" +
                "You have 3 tries to guess the number.\n" +
                "OK, I am thinking of a number. Try to guess it.\n");  // print welcome message and instruction

        int answer = rand.nextInt(10);
        Scanner input = new Scanner(System.in);

        System.out.println("Your guess?" );
        int guess = input.nextInt();   //ask user for the 1st time input
        if(guess == answer){
            System.out.println("That’s correct! Congratulations!");
        } else {
            System.out.println("Too " + ( guess > answer ? "high!" : "low!") );
            System.out.println("Your guess?");
            guess = input.nextInt();   //ask user for the 2nd time input
            if(guess == answer){
                System.out.println("That’s correct! Congratulations!");
            } else {
                System.out.println("Too " + ( guess > answer ? "high!" : "low!") );
                System.out.println("Your guess?");
                guess = input.nextInt();   //ask user for the 3rd time input
                if(guess == answer){
                    System.out.println("CORRECT");
                } else {
                    System.out.println("INCORRECT, Answer is " + answer);
                }
            }
        }
        System.out.println("Thanks for Playing!!");
    }
}