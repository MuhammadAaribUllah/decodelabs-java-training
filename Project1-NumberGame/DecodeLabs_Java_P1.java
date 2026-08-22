import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DecodeLabs_Java_P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("=== Welcome to the DecodeLabs Number Guessing Game ===");

        do {
            int target = random.nextInt(100) + 1; // 1 to 100
            boolean won = false;
            int attempts = 0;
            int maxAttempts = 7; // optional attempt limiter

            System.out.println("\nI'm thinking of a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts. Good luck!");

            while (!won && attempts < maxAttempts) {
                int guess = -1;
                boolean validInput = false;

                // Input validation loop
                while (!validInput) {
                    System.out.print("Enter your guess: ");
                    try {
                        guess = sc.nextInt();
                        validInput = true;
                    } catch (InputMismatchException e) {
                        System.out.println("That's not a valid number. Try again.");
                        sc.next(); // clear the bad token
                    }
                }

                attempts++;

                if (guess == target) {
                    won = true;
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                } else if (guess > target) {
                    System.out.println("Too High! Attempts left: " + (maxAttempts - attempts));
                } else {
                    System.out.println("Too Low! Attempts left: " + (maxAttempts - attempts));
                }
            }

            if (!won) {
                System.out.println("Out of attempts! The number was: " + target);
            }

            System.out.print("\nPlay again? (Y/N): ");
            sc.nextLine(); // flush leftover newline from nextInt()
            String response = sc.nextLine();
            playAgain = response.equalsIgnoreCase("Y");

        } while (playAgain);

        System.out.println("\nThanks for playing! Goodbye.");
        sc.close();
    }
}