import java.util.Random;
import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;
        int userGuess = 0;
        boolean validInput;

        do {
            System.out.print("Guess the number (between 1 and 10): ");
            if (input.hasNextInt()) {
                userGuess = input.nextInt();
                validInput = userGuess >= 1 && userGuess <= 10;
            } else {
                System.out.println("Invalid input. Please enter a valid integer between 1 and 10.");
                input.next();
                validInput = false;
            }
        } while (!validInput);

        System.out.println("The random number was: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("Congratulations! Your guess was correct!");
        } else if (userGuess < randomNumber) {
            System.out.println("Your guess was too low.");
        } else {
            System.out.println("Your guess was too high.");
        }

        input.close();
    }
}
