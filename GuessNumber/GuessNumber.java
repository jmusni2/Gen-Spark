import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public void main(String[] args) {
        Count();
    }

    public void Count() {
        Scanner scanner = new Scanner (System.in);
        int numOfGuesses = 0;

        ////Player gives name; instructions are then given
        System.out.println("Hello! What is your name?");
        String name = scanner.nextLine();
        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.");
        System.out.println("You have 6 guesses");

        ////Generates a random number
        Random num = new Random();
        int number = 1 + num.nextInt(20);

        do {
            System.out.println("take a guess");
            int guess = scanner.nextInt();
            if (guess == number) {
                System.out.println("Nice one, " + name + "! It took you " + numOfGuesses + "guesses!");
                break;
            } else if (guess < 0 || guess > 20) {
                System.out.println("NO YOU DUMB DUMB! 1-20!");
            } else if (guess > number) {
                System.out.println("Too low! Guess again");
                numOfGuesses++;
            } else if (guess < number) {
                System.out.println("Too High! Guesss again");
                numOfGuesses++;
            } else {
                System.out.println("That's not a number...");
            }
        } while (numOfGuesses < 6);
            System.out.println("Do you wish to try again? Y/N");
            String playAgain = scanner.nextLine();
            if (playAgain == "Y") {
                Count();
            } else {
                return "Thanks for Playing!";
            }
        }
    }

