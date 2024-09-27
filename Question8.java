import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the operator: ");
        String operator = scanner.nextLine();
        System.out.println("Enter the opeerands");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double result = 0;
        double[] reminders = new double[1];

        switch (operator) {
            case "+":
                result = calculator.Addition(a, b);
                break;
                case "-":
                    result = calculator.Subtraction(a, b);
                    break;
                    case "*":
                        result = calculator.Multiplication(a, b);
                        break;
                        case "/":
                            result = calculator.Division(a, b, reminders);
                            break;
                            default:
                                System.out.println("Invalid operator");
                                return;
        }
        System.out.println("The result of : " + a + operator + b + result);
    }
}
