package GuessNumber.src;

import java.util.Random;
import java.util.Scanner;

class GuessNumber{
    public static void main(String[] args){
        boolean game = true;
        final int range = 20;
        final int guessLimit = 6;
        if (range<=0||guessLimit<=0)
            throw new IllegalArgumentException("Guess limit and range should be greater than 0.");
        while(game){
            try{
                System.out.println("Hello! What is your name?");
                String name = getName();
                System.out.println("Well, "+name+", I am thinking of a number between 1 and "+range+".");
                System.out.println("You have "+ guessLimit+" guesses.");
                System.out.println("Take a guess.");
                int num = getRandomNumber(range);
                playGame(guessLimit,num,name);
                System.out.println("Would you like to play again? (y or n)");
                Scanner g = new Scanner(System.in);
                String input = g.nextLine();
                game = newGameRequested(input);
            } catch(Exception e){
                System.out.println("Invalid number input. Restarting the game.");
            }
        }

    }
    public static String getName(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
    public static int getRandomNumber(int i){
        Random r = new Random();
        return r.nextInt(i)+1;
    }
    public static int getUserGuess(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
    public static boolean newGameRequested(String input){

        if (input.equals("n") || input.equals("N"))
            return false;
        else
            return true;
    }
    public static boolean playGame(int guessLimit,int num,String name){
        int cnt = 1;
        while (cnt <= guessLimit) {
            int guess = getUserGuess();
            if (guess > num) {
                System.out.println("Your guess is too high");
                cnt++;
            } else if (guess < num) {
                System.out.println("Your guess is too low.");
                cnt++;
            } else {
                System.out.println("Good job, " + name + "! You guessed my number in " + cnt + " guesses!");
                return true;
            }}

        if (cnt > guessLimit)
            System.out.println("You are out of guesses. You lost.");
        return false;
    }
}