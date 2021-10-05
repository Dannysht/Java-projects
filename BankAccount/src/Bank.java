import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<BankAccount> bankAccounts = new ArrayList();

    public Bank(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAccount(BankAccount bankAccount)
    {
        bankAccounts.add(bankAccount);
    }

    public int totalValue()
    {
        int value = 0;
        for(BankAccount bankAccount : bankAccounts)
        {
            value += bankAccount.getBalance();
        }
        return value;
    }

}
