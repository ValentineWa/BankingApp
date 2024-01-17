import java.util.Scanner;

//
//1. Welcome message to user
//2. Deposit
//3. Withdraw
//4. Get previous transactions.
//5. Show menu.
//6. Execute our code.

public class BankingApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome User");
    }

}
class BankAccount{
    int balance;
    int previousTransaction;

//deposit method
    void deposit(int amount){
        if(amount != 0 ){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
//    withdraw method
    void withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransaction = amount;
        }
    }

//    Get previous tansactions
    void getPreviousTransaction(){
        if (previousTransaction > 0){
            System.out.println("Deposited: "+ previousTransaction);
        }
        else if(previousTransaction < 0){
            System.out.println("Withdrawn: "+ Math.abs(previousTransaction));
        }
        else {
            System.out.println("No transaction has occurred!");
        }
    }
//    Show menu
    void showMenu(){
        char option = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println();

    }


}