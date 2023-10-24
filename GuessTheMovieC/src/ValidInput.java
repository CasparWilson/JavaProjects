import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ValidInput {
    private Boolean validInput;
   private int numberOfValidInputs;
    private String[] arrayOfValidInputs;

    //Scanner determines length of list

    public ValidInput(String alphabet, String userInput) throws FileNotFoundException{
        File alpha = new File(alphabet);

            numberOfValidInputs=0;
            validInput = false;
            Scanner scanner = new Scanner(alpha);
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                numberOfValidInputs++;

                arrayOfValidInputs = new String[numberOfValidInputs];
                Scanner scanner1 = new Scanner(alpha);
                for(int i = 0; i < numberOfValidInputs; i++) {
                    arrayOfValidInputs[i] = scanner1.nextLine();
                }

                    for(int i = 0; i < numberOfValidInputs; i++){
                    if(arrayOfValidInputs[i].equals(userInput.toLowerCase())){
                        validInput = true;
                        break;
                    }
                }

        }
    }

    public boolean getValidinput(){
        return validInput;
    }
    public int getNumberOfValidInputs(){
        return numberOfValidInputs;
    }

    public String getArrayOfValidInputs(){
        return arrayOfValidInputs[5];
    }
}
