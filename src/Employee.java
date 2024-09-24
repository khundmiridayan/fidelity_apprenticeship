public class Employee{
   private String name;
   private int age;
   private String department;
   
   public Employee(String name, int age, String department){
       this.name = name;
       this.age = age;
       this.department = department;
   }
 public void displayEmployeeInfo(){
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("Department: " + department);
 }
}
class Faculty extends Employee{
    private String subject;

    public Faculty(String name,int age,String department,String subject){
        super(name,age,department);
        this.subject = subject;
    }
    public void displayFacultyInfo(){
        displayEmployeeInfo();
        System.out.println("Subject: "+ subject);
    }
}
 class Staff extends Employee{
    private String jobTitle;
    public Staff(String name,int age, String department,String jobTitle){
        super(name,age,department);
        this.jobTitle=jobTitle;
    }
    public void displayStaffInfo(){
        displayEmployeeInfo();
        System.out.println("Job Title: "+jobTitle);
    }
}


