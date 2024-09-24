import java.sql.PseudoColumnUsage;

public class Question5 {
    public static double calculateAverage(int[] numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return (double)sum/numbers.length;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);

    }
}
