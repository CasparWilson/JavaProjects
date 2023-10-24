import org.jetbrains.annotations.NotNull;

public class AlreadyGuessedCheck {
    private char[] previousGuessesArray;
    private char[] userArray;
    private boolean alreadyGuessed;

    AlreadyGuessedCheck(String previousGuesses, String userInput) {
        alreadyGuessed = false;
        previousGuessesArray = previousGuesses.toCharArray();
        userArray = userInput.toCharArray();
        for (int i = 0; i < previousGuesses.length(); i++) {
            if (previousGuessesArray[i] == userArray[0]) {
                alreadyGuessed = true;
                break;
            }
        }
    }
public boolean getAlreadyGuessed(){
        return alreadyGuessed;
    }
}
