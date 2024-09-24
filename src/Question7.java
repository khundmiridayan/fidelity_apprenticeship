public class Question7 {
    public static void main(String[] args) {
        Faculty faculty1 = new Faculty("john",22,"Computer science","Java Programming");
        Staff staff1 = new Staff("smith",32,"Administration","HR Manager");

        faculty1.displayFacultyInfo();
        System.out.println();
        staff1.displayStaffInfo();
    }
}
