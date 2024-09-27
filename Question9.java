import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.println("Enter First Name: ");
        person.setFirstName(scanner.nextLine());

        System.out.println("Enter Last Name: ");
        person.setLastName(scanner.nextLine());
        System.out.println("Enter DOB in yyyy-mm-dd Format: ");
        String dob = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            person.setDob(LocalDate.parse(dob, formatter));
        } catch (DateTimeParseException e) {
            System.out.println("Invalid Date Format");
            return;
        }
        person.displayDetails();
    }
}
