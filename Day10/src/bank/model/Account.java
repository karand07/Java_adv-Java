package bank.model;

public class Account {
    private int account_no;
    private String name , email ,password;
    private double balance ;

    public Account(int account_no, String name, String email, String password, double balance) {
        this.account_no = account_no;
        this.name = name;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "acc no: " + account_no + ", name: " + name + ", email: " + email + ", balance: " + balance ;
    }
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public int getAccount_no() {
//        return account_no;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
}
