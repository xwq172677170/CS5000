package com.cs5000.a2.p2;

import java.util.Random;
import java.util.Scanner;

public class Recursion {
    private static final Random rand = new Random();
    private static final Integer TOTAL_TRIALS = 3;

    public static void main(String[] args) {
        System.out.println("Welcome to the game of Guess It!\n" +
                "I will choose a number between 0 and 9.\n" +
                "You will try to guess that number. If your guess wrong, I will tell you if you guessed too high or too low.\n" +
                "You have 3 tries to guess the number.\n" +
                "OK, I am thinking of a number. Try to guess it.\n");  // print welcome message and instruction

        int answer = rand.nextInt(10);
        Scanner input = new Scanner(System.in);
        guess(input, answer, 1);
        System.out.println("Thanks for Playing!!");
    }

    private static void guess(Scanner input, int answer, int trial) {
        System.out.println("Your guess?" );
        int guess = input.nextInt();   //ask user for the input
        if(trial == TOTAL_TRIALS) { //3rd time
            if(guess == answer){
                System.out.println("CORRECT!");
            } else {
                System.out.println("INCORRECT , Answer is " + answer);
            }
            return;
        } else { // 1st and 2nd time
            if(guess == answer){
                System.out.println("That’s correct! Congratulations!");
            } else {
                System.out.println("Too " + ( guess > answer ? "high!" : "low!") );
                guess(input, answer, ++trial);
            }
        }

    }


}
