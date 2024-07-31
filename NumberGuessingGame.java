import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minNum = 1;
        int maxNum = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int score = 0;
        String playAgain;

        do {
            int randomNumber = random.nextInt(maxNum - minNum + 1) + minNum;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;
            rounds++;

            System.out.println("\nRound " + rounds);
            System.out.println("Guess a number between " + minNum + " and " + maxNum + ":");

            while (attempts < maxAttempts && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < randomNumber) {
                    System.out.println("Too low! Guess something higher");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Guess something lower");
                } else {
                    System.out.println("Congratulations! You guessed the correct number " + randomNumber + " in " + attempts + " attempts.");
                    score += (maxAttempts - attempts + 1);
                    hasGuessedCorrectly = true;
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've reached the maximum attempts. The correct number was " + randomNumber + ".");
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Your final score after " + rounds + " rounds is " + score + ". Thank you for playing!");
        scanner.close();
    }
}