import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Determines size of lists and orders into an array
        OrderFile movieList = new OrderFile("moviesC.txt");
        //System.out.println(movieList.listLength());
        //Selects Movie at random from movieList
        RandomlySelectMovie moviePick = new RandomlySelectMovie(movieList.orderedList(), movieList.listLength());
        //  System.out.println(moviePick.selectedMovie());
        // System.out.println(moviePick.titleLength());

        InitialiseGame newGame = new InitialiseGame(moviePick.selectedMovie());

        System.out.println("Let's play a guessing game!");
        System.out.println("I'll pick a movie, and you guess letters in it's title.");
        System.out.println("If you can guess all the movie's letters, before guessing incorrectly 10 times, you win!");
        System.out.println("There are " + (moviePick.selectedMovie().length() - newGame.getNumberOfSpaces()) + " letters in the title.");

        String theBoard = new String(newGame.getBoardArray());

        System.out.println("Let the guessing commence!");

        int incorrectGuessesLeft = 10;
        String incorrectGuesses = "";
        String previousGuesses = "";
        Scanner scanner = new Scanner(System.in);

        while (incorrectGuessesLeft > 0) {
            System.out.println(theBoard);
            if (incorrectGuessesLeft != 10) {
                System.out.println("Incorrect guesses: " + incorrectGuesses + " " + incorrectGuessesLeft + " incorrect guesses left.");
            }
            String userInput = scanner.nextLine();
            ValidInput inputCheck = new ValidInput("lowercasealphabetC.txt", userInput);

            if (!(inputCheck.getValidinput())) {
                System.out.println("Hmmmm... I'm not sure you put the right input there.");
                System.out.println("Make sure to only guess one letter, no numbers or other symbols, and don't put a space.");
            } else {
                AlreadyGuessedCheck guessCheck = new AlreadyGuessedCheck(previousGuesses, userInput);
                if (guessCheck.getAlreadyGuessed()) {
                    System.out.println("You've already guessed '" + userInput + "'!");
                    System.out.println("Don't worry, I won't count it as a guess.");
                } else {
                    previousGuesses = previousGuesses + userInput;
                    TakeAGuess turn = new TakeAGuess(theBoard, moviePick.selectedMovie(), userInput);
                    System.out.println(turn.getUpdatedBoard());
                    if (theBoard.equals(turn.getUpdatedBoard())) {
                        System.out.println("Oof... sorry, no '" + userInput + "'s.");
                        incorrectGuessesLeft--;
                        incorrectGuesses = incorrectGuesses + "'" + userInput + "', ";
                    } else if (turn.getUpdatedBoard().equals(moviePick.selectedMovie())) {
                        break;
                    } else {
                        System.out.println("Good guess! There is a '" + userInput + "'.");
                        theBoard = turn.getUpdatedBoard();
                        if (incorrectGuessesLeft == 10) {
                            System.out.println("No incorrect guesses so far!");

                        }
                        System.out.println("Guess again!");
                    }
                }
            }
        }
            if (incorrectGuessesLeft == 0) {
                System.out.println("Sorry, you're all out of guesses.  Better Luck next time");
                System.out.println("The answer was '" + moviePick.selectedMovie() + ".'");
                System.out.println("Better Luck next time.");
            } else {
                System.out.println("We have a winner! Congratualations, and play again soon.");
            }

        }
    }
