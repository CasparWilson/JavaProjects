import java.io.File;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) throws Exception {
File file = new File("AnnaK.txt");
Scanner scanner = new Scanner(file);

int words = 0;
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            words += line.split(" ").length;
        }
            System.out.println("This file has " + words + " words. ");
        }

    }
