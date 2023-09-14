import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1; // Define the lower bound of the random number
        int upperBound = 100; // Define the upper bound of the random number
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound);
        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;
            
            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a number between " + lowerBound + " and " + upperBound);
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + numberOfTries + " tries.");
            }
        }
        
        scanner.close();
    }
}
