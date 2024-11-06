package autogeral.emissorfiscal.vo.model.nfce;

public class AdditionModel {

    private Integer code;
    private String manufacturer;
    private double amount;
    private double drawback;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDrawback() {
        return drawback;
    }

    public void setDrawback(double drawback) {
        this.drawback = drawback;
    }

    @Override
    public String toString() {
        return "AdditionModel{" +
                "code=" + code +
                ", manufacturer='" + manufacturer + '\'' +
                ", amount=" + amount +
                ", drawback=" + drawback +
                '}';
    }
}
