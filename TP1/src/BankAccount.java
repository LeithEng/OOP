import java.util.Scanner;
public class BankAccount {
    private int accountNumber;
    private String accountHoldername;
    private int balance;
    public BankAccount(int a, String n, int b)
    {accountNumber=a;
    accountHoldername=n;
    balance=b;}

    int getAccountNumber()
    {return (accountNumber);}
    int getBalance()
    {return balance;}
    String getAccountHoldername()
    {return accountHoldername;}

    void deposit(int amount)
    {balance+=amount;}

    void withdraw(int amount)
    {if(balance<amount) {System.out.println("Insufficient balance");}
    else balance=balance-amount;}

    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Give the account holder's name: ");
     String name= sc.nextLine();
     System.out.println("Give an account number: ");
     int an=sc.nextInt();
     System.out.println("Give the account's balance: ");
     int b= sc.nextInt();
     BankAccount ba=new BankAccount(an,name,b);
     System.out.println("Please type the amount you want to deposit: ");
     int d= sc.nextInt();
     ba.deposit(d);
     System.out.println("Please type the amount you want to withdraw: ");
     int w= sc.nextInt();
     ba.withdraw(w);
     System.out.println("Your new balance is "+ ba.balance);

    }
}
