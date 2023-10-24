import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try and guess it in 7 guesses.");
        System.out.println("If you guess incorrectly, I will tell you whether it was too high, or too low.");

        Scanner scanner = new Scanner(System.in);
        Boolean winner = false;

        for (int i = 7; i > 0; i--) {
            int guess = scanner.nextInt();
            System.out.println("You guessed " + guess + ".");
            if(guess < 0 || guess > 100){
                System.out.println("I said the number was between 1 and 100.  You can have your guess back.");
                i = i+1;
            }
            else if (guess > randomNumber) {
                System.out.println("That's too high...");
            } else if (guess < randomNumber) {
                System.out.println("That's too low...");
            } else {
                winner = true;
                break;
            }
            System.out.println("You have " + (i-1) + " guesses left.");

        }
        if (winner) {
            System.out.println("Congratulations! You're a winner!");
        } else {
            System.out.println("Hard luck. The answer was " + randomNumber + ". Come play again soon.");
        }
    }
}

