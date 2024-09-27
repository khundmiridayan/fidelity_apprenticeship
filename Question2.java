import java.util.Scanner;

public class Question2 {
    static double FindSquare(double num){
        return num*num;
    }
    static double FindCube(double num){
        return num*num*num;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double number = input.nextDouble();
        System.out.println("Square of " + number + " is " + FindSquare(number));
        System.out.println("Cube of " + number + " is " + FindCube(number));
    }
}
