import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Account account = new Account(12345,"john doe",10000.00);

        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Banking System Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter amount to deposit");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                    case 2:
                        System.out.println("Enter amount to withdraw");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                        case 3:
                            account.checkBalance();
                            break;
                            case 4:
                                account.displayAccountDetails();
                                break;
                                case 5:
                                    System.out.println("Exit the System");
                                    break;
                                    default:
                                        System.out.println("Invalid choice");
            }
        } while (choice !=5);

        scanner.close();
    }
}
