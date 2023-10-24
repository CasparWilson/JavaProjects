import java.util.Scanner;
public class ScrabbleMain {
    public static void main(String[] args) {
        ScrabbleScore game = new ScrabbleScore();
        System.out.println("Write a word and I'll calculate its Scrabble score:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        while (!word.equals("-")) {
            System.out.println("The Scrabble score of " + word + " is " + game.getScrabbleScore(word) + ".");
            System.out.println("Would you like to try another word? type \"-\" to quit.");
            word = scanner.next();
        }
    }
}