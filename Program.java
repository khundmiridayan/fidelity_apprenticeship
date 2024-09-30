import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Insurance number: ");
        String insuranceNo = scanner.nextLine();
        System.out.println("Enter Insurance Name: ");
        String insuranceName = scanner.nextLine();
        System.out.println("Enter Amount Covered: ");
        double amountCovered = scanner.nextDouble();

        System.out.println("Enter Insurance Type: ");
        System.out.println("1. Life Insurance");
        System.out.println("2. Motor Insurance");
        int option = scanner.nextInt();


        double calculatedPremium =0;
        if (option == 1) {
            System.out.println("Enter the Policy Term: ");
            int policyTerm = scanner.nextInt();
            System.out.println("Enter the Benefit Percent: ");
            double benefitPercent = scanner.nextFloat();
            LifInsurance lifInsurance =new LifInsurance(insuranceNo,insuranceName,amountCovered,policyTerm, (float) benefitPercent);
            calculatedPremium = lifInsurance.calculatePremium();




        } else if (option == 2) {
            System.out.println("Enter the Depreciation Percent: ");
            float depPercent = scanner.nextFloat();

            MotorInsurance motorInsurance = new MotorInsurance(insuranceNo,insuranceName,amountCovered,depPercent);
            calculatedPremium = motorInsurance.calculatePremium();


        }

        System.out.println("Calculated Premium: " + calculatedPremium);
    }
}
