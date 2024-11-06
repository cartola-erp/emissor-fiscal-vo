package autogeral.emissorfiscal.vo.model.nfce;

public class IiModel {

    private String baseTax;
    private String customsExpenditureAmount;
    private double amount;
    private double iofAmount;
    private double vEnqCamb;

    public String getBaseTax() {
        return baseTax;
    }

    public void setBaseTax(String baseTax) {
        this.baseTax = baseTax;
    }

    public String getCustomsExpenditureAmount() {
        return customsExpenditureAmount;
    }

    public void setCustomsExpenditureAmount(String customsExpenditureAmount) {
        this.customsExpenditureAmount = customsExpenditureAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getIofAmount() {
        return iofAmount;
    }

    public void setIofAmount(double iofAmount) {
        this.iofAmount = iofAmount;
    }

    public double getvEnqCamb() {
        return vEnqCamb;
    }

    public void setvEnqCamb(double vEnqCamb) {
        this.vEnqCamb = vEnqCamb;
    }

    @Override
    public String toString() {
        return "IiModel{" +
                "baseTax='" + baseTax + '\'' +
                ", customsExpenditureAmount='" + customsExpenditureAmount + '\'' +
                ", amount=" + amount +
                ", iofAmount=" + iofAmount +
                ", vEnqCamb=" + vEnqCamb +
                '}';
    }
}
