public class CheckingAccount extends BankAccount {
    private double limit;

    CheckingAccount(double openingBalance){
        balance = openingBalance;
        limit = 500.00;
    }

    public double getLimit(){
        return limit;
    }

}
