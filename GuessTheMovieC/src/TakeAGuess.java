public class TakeAGuess {
    private String updatedBoard;
    private char[] userInputChar;

    private char[] lastGuessArray;
    private char [] correctAnswerArray;

    TakeAGuess(String lastGuess, String correctAnswer, String userInput){

        //converting arguments of class constructors into arrays
   lastGuessArray = lastGuess.toCharArray();
   correctAnswerArray = correctAnswer.toCharArray();
   userInputChar = userInput.toCharArray();

        //Loop updating guessArray if any element is the same as userInput
        for (int i = 0; i < lastGuess.length(); i++) {
            if(correctAnswerArray[i] == userInputChar[0]) {
                lastGuessArray[i] = userInputChar[0];
            }
        }
        updatedBoard = new String(lastGuessArray);
    }

public String getUpdatedBoard()
{return updatedBoard;
}

}
