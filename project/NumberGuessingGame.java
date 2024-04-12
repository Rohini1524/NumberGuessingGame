import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(100) + 1; 
        int attempts = 0;
        boolean guessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the secret number between 1 and 100.");

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You've guessed the correct number (" + secretNumber + ") in " + attempts + " attempts.");
                guessedCorrectly = true;
            } else if (guess < secretNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }
        
        scanner.close();
    }
}
