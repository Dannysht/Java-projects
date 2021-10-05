public class Main
{
    public static void main(String[] args)
    {

        BankAccount me = new BankAccount("Daniel Shterev", 585000);
        BankAccount kev = new BankAccount("Kevin Williams", 600000);
        BankAccount vents = new BankAccount("Ventsislav Iliev", 650000);
        BankAccount vick = new BankAccount("Victoria Velichkova", 700000);
        BankAccount dad = new BankAccount("Ivaylo Shterev", 1000000);
        System.out.println("The name of the owner of the bank account is: " + me.getName());
        me.printBalance();
        me.deposit(10000);
        me.withdraw(5000);
        Bank danskeBank = new Bank("Danske Bank");
        danskeBank.addAccount(me);
        danskeBank.addAccount(kev);
        danskeBank.addAccount(vents);
        danskeBank.addAccount(vick);
        danskeBank.addAccount(dad);
        System.out.println("Total amount in bank is: " + danskeBank.totalValue());
    }
}
