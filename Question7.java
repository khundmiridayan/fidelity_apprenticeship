import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String inputSentence = scanner.nextLine();

        String reversedSentence = reverseSentence(inputSentence);
        System.out.println("Reversed Sentence: "+ reversedSentence);
    }
    public static String reverseSentence(String Sentence) {
        String[] words = Sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        return reversedSentence.toString().trim();
    }
}
