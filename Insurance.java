public class Insurance {
    private String insuranceNo;
    private String insuranceName;
    private double amountCovered;

    public Insurance(String insuranceNo, String insuranceName, double amountCovered) {
        this.insuranceNo = insuranceNo;
        this.insuranceName = insuranceName;
        this.amountCovered = amountCovered;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }
    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }
    public String getInsuranceName() {
        return insuranceName;
    }
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    public double getAmountCovered() {
        return amountCovered;
    }
    public void setAmountCovered(double amountCovered) {
        this.amountCovered = amountCovered;
    }
}