public class BankAccount
{
    private String name;
    private int balance;

    public BankAccount()
    {
        name = "Unknown";
        balance = 0;
    }

    public BankAccount(String name, int balance)
    {
        setName(name);
        setBalance(balance);
    }

    public void deposit(int depositMoney)
    {
        balance += depositMoney;
        System.out.println("You have successfully deposited: " + depositMoney);
        System.out.println("Your current balance is: " + balance + "\n");
    }

    public void withdraw(int withdrawalMoney)
    {
        balance -= withdrawalMoney;
        System.out.println("You have successfully withdrawn: " + withdrawalMoney);
        System.out.println("Your current balance is: " + balance + "\n");
    }

    void printBalance()
    {
        System.out.println("The balance of the account is: " + balance + "\n");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }
}
