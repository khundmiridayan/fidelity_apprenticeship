public class Account {
    private int accNo;
    private String Name;
    private double balance;

    public Account(int accNo, String Name, double balance) {
        this.accNo = accNo;
        this.Name = Name;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
            System.out.println("succesfully deposited" + amount);
        }
        else{
            System.out.println("failed to deposit");
        }
    }
    public void withdraw(double amount) {
        if(amount > 0 && balance <= amount){
            balance -= amount;
            System.out.println("successfully withdrawn" + amount);
        } else if(amount > balance){
            System.out.println("Insufficient balance withdrawal failed.");
        } else {
            System.out.println("Invalid withdrawn amount");
        }
    }
    public void checkBalance(){
        System.out.println("Current Balance: " + balance);
    }
    public void displayAccountDetails(){
        System.out.println("Account No: " + accNo);
        System.out.println("Account Holder: " + Name);
        System.out.println("Balance: " + balance);
        System.out.println("-------------------");

    }
}
