package autogeral.emissorfiscal.vo.model.nfceByNfeIo;

public class BillModel {

    private String number;
    private double originalAmount;
    private double discountAmount;
    private double netAmount;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(double originalAmount) {
        this.originalAmount = originalAmount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

    @Override
    public String toString() {
        return "BillModel{" +
                "number='" + number + '\'' +
                ", originalAmount=" + originalAmount +
                ", discountAmount=" + discountAmount +
                ", netAmount=" + netAmount +
                '}';
    }
}
