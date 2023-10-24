import java.util.Scanner;

public class CalcMain{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        Boolean moreOperation = true;
        System.out.println("Please enter an integer:");
        int result = scanner.nextInt();
        while(moreOperation){
            System.out.println("What operation would you like to perform on " + result + " ? (a or s, or x to exit):");
            String choice = scanner.next();
            if(choice.equals("a") || (choice.equals("s") || choice.equals("x")))
            {if (choice.equals("a")) {
                System.out.println("Please enter the number you would like to add:");
                int secondNumber = scanner.nextInt();
                result = calc.add(result, secondNumber);
                System.out.println("The result is: " + result);47
            } else if (choice.equals("s")) {
                System.out.println("Please enter the number you would like to subtract:");
                int secondNumber = scanner.nextInt();
                result = calc.subtract(result, secondNumber);
                System.out.println("The result is: " + result);
            } else {
                System.out.println("Your final result is:" + result);
                moreOperation = false;
            }
            } else {
                System.out.println("invalid operation, please try again.");
            }
        }
    }
}
