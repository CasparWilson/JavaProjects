import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OrderFile {
    private int numberOfMovies;
 private String [] movieArray;

//defaultconstructor
    OrderFile(){
        this.numberOfMovies = 0;
        this.movieArray = new String[0];
    }
    //actualconstructor
OrderFile(String list) throws FileNotFoundException {
    File file = new File(list);
    //initialise list length
   this.numberOfMovies = 0;
    //Scanner determines length of list
    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine()) {
        scanner.nextLine();
        this.numberOfMovies++;
    }
    //initialise ListofMovie array
   this.movieArray = new String[this.numberOfMovies];
    //Creates new scanner to create an array of movie titles
    Scanner scanner2 = new Scanner(file);
    for (int i = 0; i < this.numberOfMovies; i++) {
        this.movieArray[i] = scanner2.nextLine();
    }
}

public int listLength(){
           return this.numberOfMovies;
        }

      public String[] orderedList(){
        return this.movieArray;
        }
    }