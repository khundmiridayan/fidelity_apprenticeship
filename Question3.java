import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ente the value of x: ");
        int x = scanner.nextInt();

        System.out.println("Ente the value of y: ");
        int y = scanner.nextInt();

        boolean result = x < y;
        System.out.println("The result of whether x is less than y is" + result);
    }
}
