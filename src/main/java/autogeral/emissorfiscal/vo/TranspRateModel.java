package autogeral.emissorfiscal.vo;

public class TranspRateModel {

    private double serviceAmount;
    private double bcRetentionAmount;
    private double icmsRetentionRate;
    private double icmsRetentionAmount;
    private int cfop;
    private int cityGeneratorFactCode;

    public double getServiceAmount() {
        return serviceAmount;
    }

    public void setServiceAmount(double serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    public double getBcRetentionAmount() {
        return bcRetentionAmount;
    }

    public void setBcRetentionAmount(double bcRetentionAmount) {
        this.bcRetentionAmount = bcRetentionAmount;
    }

    public double getIcmsRetentionRate() {
        return icmsRetentionRate;
    }

    public void setIcmsRetentionRate(double icmsRetentionRate) {
        this.icmsRetentionRate = icmsRetentionRate;
    }

    public double getIcmsRetentionAmount() {
        return icmsRetentionAmount;
    }

    public void setIcmsRetentionAmount(double icmsRetentionAmount) {
        this.icmsRetentionAmount = icmsRetentionAmount;
    }

    public int getCfop() {
        return cfop;
    }

    public void setCfop(int cfop) {
        this.cfop = cfop;
    }

    public int getCityGeneratorFactCode() {
        return cityGeneratorFactCode;
    }

    public void setCityGeneratorFactCode(int cityGeneratorFactCode) {
        this.cityGeneratorFactCode = cityGeneratorFactCode;
    }

    @Override
    public String toString() {
        return "TranspRateModel{" +
                "serviceAmount=" + serviceAmount +
                ", bcRetentionAmount=" + bcRetentionAmount +
                ", icmsRetentionRate=" + icmsRetentionRate +
                ", icmsRetentionAmount=" + icmsRetentionAmount +
                ", cfop=" + cfop +
                ", cityGeneratorFactCode=" + cityGeneratorFactCode +
                '}';
    }
}
