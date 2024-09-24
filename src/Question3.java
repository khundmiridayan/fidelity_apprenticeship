public class Question3 {
    public static void main(String[] args) {
        Person person = new Person("john doe",22,"male");
        person.displayPersonDetails();
        person.setName("john ");
        System.out.println("Modified person Details");
        person.displayPersonDetails();
    }
}
