import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Math;

public class GuessTheMovie {
    public static void main(String[] args) throws FileNotFoundException {
        // Creates a new scanner to count the number of movies on the list movies.txt

        File file = new File("movies.txt");

        //Scanner determines length of list
        Scanner scanner = new Scanner(file);
        int numberOfMovies = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            numberOfMovies++;
        }

        //Creates new scanner to create an array of movie titles
        Scanner scanner2 = new Scanner(file);
        String[] listOfMovies = new String[numberOfMovies];
        for (int i = 0; i < numberOfMovies; i++) {
            listOfMovies[i] = scanner2.nextLine();
        }

        // Generates a random integer and uses it to select a movie from movies.txt

        int RandomNumber = (int) (Math.random() * numberOfMovies);
        String randomMovie = listOfMovies[RandomNumber];
        // System.out.println(randomMovie);

        //The length of the movie title comes up a lot.
        int titleLength = randomMovie.length();

        // Loop to generate a string of underscores representing the number of letters in the movie to guess
        String blanks = "";
        for (int i = 0; i < titleLength; i++) {
            blanks = blanks + "_";
        }

        //turning blanks and randomMovie into arrays of characters
        String[] randomMovieArray = randomMovie.split("");
        String[] guessArray = blanks.split("");



        //Loop updating the guessArray with any spaces in the randomMovieArray
        int numberOfSpaces = 0;
        for (int i = 0; i < titleLength; i++) {
            if (randomMovieArray[i].equals(" ")) {
                guessArray[i] = " ";
                numberOfSpaces++;
                // }
            }
        }

        //Loop converting guessArray into a string
        String guess = "";
        for (int i = 0; i < titleLength; i++) {
            guess = guess + guessArray[i];
        }

        System.out.println("Let's play a guessing game!");
        System.out.println("I'll pick a movie, and you guess letters in it's title.");
        System.out.println("If you can guess all the movie's letters, before guessing incorrectly 10 times, you win!");
        System.out.println("There are " + (titleLength- numberOfSpacese) + " letters in the title.");

        System.out.println(guess);

        System.out.println("Let the guessing commence!");

//Initalising variables for while loop
        String incorrectGuesses = "";
        int incorrectGuessesLeft = 10;
        String lastGuess = guess;

        //While loop for user input to play the game
        while (incorrectGuessesLeft > 1) {
            Scanner scanner3 = new Scanner(System.in);

            String turn = scanner3.nextLine();

            //Loop updating guessArray if any element is the same as turn
            for (int i = 0; i < titleLength; i++) {
                if (randomMovieArray[i].equals(turn)) {
                    guessArray[i] = turn;
                }
            }

            //Loop generating playerGuess from guessArray.
            String playerGuess = "";
            for (int i = 0; i < titleLength; i++) {
                playerGuess = playerGuess + guessArray[i];
            }

            if (playerGuess.equals(lastGuess)) {
                System.out.println("Oof... sorry, no '" + turn + "'s.");
                incorrectGuessesLeft--;
                incorrectGuesses = incorrectGuesses + "'" + turn + "', ";
                System.out.println(playerGuess);
                System.out.println("Incorrect guesses: " + incorrectGuesses + incorrectGuessesLeft + " incorrect guesses left...");
                System.out.println("Have another go.");
            } else if (playerGuess.equals(randomMovie)) {
                break;
            } else {
                System.out.println("Good guess!");
                System.out.println(playerGuess);
                lastGuess = playerGuess;
                if (incorrectGuessesLeft == 10) {
                    System.out.println("No incorrect guesses so far!");
                } else {
                    System.out.println("Incorrect guesses: " + incorrectGuesses + " " + incorrectGuessesLeft + " wrong guesses left.");
                }
                System.out.println("Guess again!");
            }

        }

//While loop should finish if gameover.  If condition checks if player won or loss.
        if (incorrectGuessesLeft == 1) {
            System.out.println("Sorry, you're all out of guesses.  Better Luck next time");
            System.out.println("The answer was '"+randomMovie+ ".'");
            System.out.println("Better Luck next time.");
        } else {
            System.out.println("We have a winner! Congratualations, and play again soon.");
        }

    }
}



      //  Scanner scanner3 = new Scanner(System.in);


