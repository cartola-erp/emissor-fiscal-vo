package autogeral.emissorfiscal.vo.model.nfceByNfeIo;

public class DuplicateModel {

    private String number;
    private String expirationOn;
    private double amount;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpirationOn() {
        return expirationOn;
    }

    public void setExpirationOn(String expirationOn) {
        this.expirationOn = expirationOn;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "DuplicateModel{" +
                "number='" + number + '\'' +
                ", expirationOn='" + expirationOn + '\'' +
                ", amount=" + amount +
                '}';
    }
}
