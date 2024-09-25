class Employee{
    int id;
    String name;
    float basicSalary;
    float bonus;
    float netSalary;

    public Employee(int id, String name, float basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus Salary: " + bonus);
        System.out.println("Net Salary: " + netSalary);
    }
}

class PermanentEmployee extends Employee{
    int pf;

    public PermanentEmployee(int id, String name, Float basicSalary, int pf){
        super(id, name, basicSalary);
        this.pf = pf;
        calculateNetSalary();
        calculateBonus();
    }

    private void calculateNetSalary(){
        netSalary = basicSalary - pf;
    }

    private void calculateBonus(){
        if (pf < 1000){
            bonus = 0.10f * basicSalary;
        } else if (pf >= 1000 && pf <1500) {
            bonus = 0.155f * basicSalary;
        } else if (pf >= 1500 && pf< 1800) {
            bonus = 0.12f * basicSalary;
        } else if (pf >= 1800) {
            bonus = 0.15f * basicSalary;
        }
        netSalary += bonus;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("PF: " + pf);
    }
}

class TemporaryEmployee extends Employee{
    int dailyWages;
    int noOfDays;

    public TemporaryEmployee(int id, String name,int dailyWages, int noOfDays){
        super(id,name, dailyWages * noOfDays);
        this.dailyWages = dailyWages;
        this.noOfDays = noOfDays;
        calculateSalary();
        calculateBonus();
    }
    private  void calculateSalary(){
        netSalary = dailyWages * noOfDays;
    }
    private void calculateBonus(){
        if (dailyWages < 1000){
            bonus = 0.15f * netSalary;
        } else if (dailyWages >= 1000 && dailyWages < 1500) {
            bonus = 0.12f * netSalary;
        } else if (dailyWages >= 1500 && dailyWages < 1700) {
            bonus = 0.11f * netSalary;
        } else if (dailyWages >= 1750 ) {
            bonus = 0.08f * netSalary;
        }
        netSalary += bonus;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Daily Wages: " + dailyWages);
        System.out.println("No. of Days: " + noOfDays);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("The details are");
        PermanentEmployee esther = new PermanentEmployee(101, "esther", 25000F,1500);
        esther.displayDetails();
        System.out.println("-------------------");

        System.out.println("The deatils are");
        TemporaryEmployee ganesh = new TemporaryEmployee(102,"ganesh",1500,20);
        ganesh.displayDetails();
    }
}