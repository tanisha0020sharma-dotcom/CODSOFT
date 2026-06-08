import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(10000);
        ATM atm = new ATM(account);
        int choice;
        do
        {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank You For Using ATM!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}