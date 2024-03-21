import java.util.*;
class Atmmachine{
    static double balance = 0;
    public static void main(String[] args) {
        
        Scanner a=new Scanner(System.in);
        while(true){
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice=a.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withDraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
        
    }
    public static void checkBalance(){
        System.out.println("The Balance In Your Account is: $"+ balance);
    }
    public static void deposit(){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the amount to deposit: $");
        double money=a.nextDouble();

        balance=balance+money;
        System.out.println("Your money got successfully deposited in your account, Your balance is: $"+balance);

    }
    public static void withDraw(){
        Scanner a=new Scanner(System.in);
        if(balance==0){
            System.out.println("You have Zero balance in your account");
        }
        else{
            System.out.print("Enter the withdraw amount:");
            int amount=a.nextInt();
            if(amount>balance){
                System.out.println("Insufficient balance");
            }
            else{
                balance=balance-amount;
                System.out.println("the amount $"+amount+"is withdrawn, the balance amount is $"+balance);
            }
        }
    }
}