package com.java;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int totalAttempts = 0;
        int totalRounds = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        
        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = generateRandomNumber(minRange, maxRange);
            System.out.println("I've generated a number between " + minRange + " and " + maxRange + ". Try to guess it!" + "[Guess the number within 5 trials..]" + 
            		"            + \" within 5 trials.");
            
            int attempts = 0;
            for (int i = 1; i <= maxAttempts; i++) {
                System.out.print("Attempt " + i + "/" + maxAttempts + ": Enter your guess: ");
                int userGuess = scanner.nextInt();
                totalAttempts++;
                
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You've guessed the correct number in " + i + " attempts.");
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }
                
                if (i == maxAttempts) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + targetNumber + ".");
                }
            }
            
            totalRounds++;
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainChoice = scanner.next();
            playAgain = playAgainChoice.equalsIgnoreCase("yes");
        }
        
        System.out.println("Game over! Your total score is: " + (totalRounds * maxAttempts) + " points");
        System.out.println("Total attempts made: " + totalAttempts);
        
        scanner.close();
    }
    
    private static int generateRandomNumber(int min, int max) {
        return min + (int)(Math.random() * (max - min + 1));
    }
}
