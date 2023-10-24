public class InitialiseGame {
    private int titleLength;
    private char[] selectedMovieArray;
    private String theBoard;
    private char[] theBoardArray;
    private int numberOfSpaces;

    //InitialiseGame() {
    //  null;
    //}


    InitialiseGame(String selectedMovie) {
        titleLength = selectedMovie.length();
        String theBoard = "";
        for (int i = 0; i < titleLength; i++) {
            theBoard = theBoard + "_";
        }
        theBoardArray = theBoard.toCharArray();
        selectedMovieArray = selectedMovie.toCharArray();
        numberOfSpaces = 0;
        for (int i = 0; i < titleLength; i++) {
            if (selectedMovieArray[i] == ' ') {
                theBoardArray[i] = ' ';
                numberOfSpaces = numberOfSpaces + 1;
            }
        }
    }
    public char[] getSelectedMovieArray(){
        return selectedMovieArray;
    }
    public char[] getBoardArray(){
        return theBoardArray;
    }

    public int getNumberOfSpaces(){
        return numberOfSpaces;
    }
}