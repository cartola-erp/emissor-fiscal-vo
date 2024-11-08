package autogeral.emissorfiscal.vo;

public class CofinsModel {

    private String cst;
    private double baseTax;
    private double rate;
    private double amount;
    private double baseTaxProductQuantity;
    private double productRate;

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public double getBaseTax() {
        return baseTax;
    }

    public void setBaseTax(double baseTax) {
        this.baseTax = baseTax;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBaseTaxProductQuantity() {
        return baseTaxProductQuantity;
    }

    public void setBaseTaxProductQuantity(double baseTaxProductQuantity) {
        this.baseTaxProductQuantity = baseTaxProductQuantity;
    }

    public double getProductRate() {
        return productRate;
    }

    public void setProductRate(double productRate) {
        this.productRate = productRate;
    }

    @Override
    public String toString() {
        return "CofinsModel{" +
                "cst='" + cst + '\'' +
                ", baseTax=" + baseTax +
                ", rate=" + rate +
                ", amount=" + amount +
                ", baseTaxProductQuantity=" + baseTaxProductQuantity +
                ", productRate=" + productRate +
                '}';
    }
}
