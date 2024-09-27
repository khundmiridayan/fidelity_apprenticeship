import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getAdult(){
        int age =getAge(dob);
        return age >+ 18 ? "Adult" : "Child";
    }
    public int getAge(LocalDate dob){
        LocalDate today = LocalDate.now();
        int age = (int) ChronoUnit.YEARS.between(dob, today);
        return age;
    }
    public void displayDetails(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Dob: " + getAge(dob));
        System.out.println("Adult: " + getAdult());


    }
}
