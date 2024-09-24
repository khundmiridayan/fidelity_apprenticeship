import java.util.Scanner;

public class Question4 {
    public static boolean isEligibleToVote(int age){
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(isEligibleToVote(age)){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }

    }

}
