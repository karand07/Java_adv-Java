package Bank;

public class Bank {
    private int id ;
    private String name ;
    private double balance;

    public Bank(){
        System.out.println("Default bank Account");
        id = 1;
        name="Default";
        balance=0.0;
    }
    public Bank(int id, String name){
        this.id = id;
        this.name= name;
        balance=5000;
    }
    public void getAccDetails() {
        System.out.println("-------------Account Details------------");
        System.out.println("Account Id"+id);
        System.out.println("Name"+name);
    }
    public void deposite(double amount) {
        System.out.println("--------------Deposite Money------------");
        System.out.println("Deposite amount"+amount );
        balance +=amount;
        System.out.println("Total Balance after Deposite"+balance);
    }
    public void withdraw(double amount) {
        System.out.println("--------------Withdraw Money------------");
        System.out.println("Withdraw amount:"+amount );
        balance -=amount;
        System.out.println("Total Balance after withdraw"+balance);
    }
    public void getBalance(){
        System.out.println("--------------Balance------------");
        System.out.println("Balance"+balance);
    }
}
