public class ATM
{
    private BankAccount account;
    public ATM(BankAccount account)
    {
        this.account = account;
    }
    public void withdraw(double amount)
    {
        if (amount <= 0)
        {
            System.out.println("Invalid amount!");
            return;
        }
        if (account.withdraw(amount))
        {
            System.out.println("Withdrawal Successful!");
        }
        else
        {
            System.out.println("Insufficient Balance!");
        }
    }
    public void deposit(double amount)
    {
        if (amount <= 0)
        {
            System.out.println("Invalid amount!");
            return;
        }
        account.deposit(amount);
        System.out.println("Deposit Successful!");
    }
    public void checkBalance()
    {
        System.out.println("Current Balance:" + account.getBalance());
    }
}