public class RandomlySelectMovie {
private String randomMovie;
private int randomNumber;
//private int titleLength;
//Default Constructor
    RandomlySelectMovie(){
        randomMovie = null;
    }

    //Actual Constructor
    RandomlySelectMovie(String[] movieArray, int listlength) {
        //How objects' attributes determined from arguments
        randomNumber = (int) (Math.random() * listlength);
        randomMovie = movieArray[randomNumber];
        //titleLength = randomMovie.length();
    }

    //Classes methods for using in main
    public String selectedMovie(){
        return this.randomMovie;
    }

    //public int titleLength(){
       // return this.titleLength;
   // }
}
