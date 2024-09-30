public class LifInsurance extends Insurance {
    private int policyTerm;
    private float benefitPercent;

    public LifInsurance(String insuranceNo,String insuranceName,double amountCovered,int policyTerm,float benefitPercent) {
        super(insuranceNo,insuranceName,amountCovered);
        this.policyTerm = policyTerm;
        this.benefitPercent = benefitPercent;

    }

    public int getPolicyTerm() {
        return policyTerm;
    }
    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }
    public float getBenefitPercent() {
        return benefitPercent;
    }
    public void setBenefitPercent(float benefitPercent) {
        this.benefitPercent = benefitPercent;
    }

    public double calculatePremium(){
        double benefitAmount = getAmountCovered() - ((getAmountCovered() * benefitPercent) / 100);
        return benefitAmount / policyTerm;
    }
}
