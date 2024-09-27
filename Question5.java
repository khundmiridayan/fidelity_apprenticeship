import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account = new Account();
        System.out.println("Enter Account ID: ");
        account.setId(scanner.nextInt());
        System.out.println("Enter Account Type: ");
        account.setAccountType(scanner.next());
        System.out.println("Enter account balance");
        account.setBalance(scanner.nextDouble());


        System.out.println("Enter amount to withdraw");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Withdraw Successful. New Balance: " + account.getBalance());
        }
        else {
            System.out.println("Insufficient balance..");

        }
        }
    }

