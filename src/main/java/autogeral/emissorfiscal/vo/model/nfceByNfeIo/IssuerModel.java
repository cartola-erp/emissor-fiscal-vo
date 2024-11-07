package autogeral.emissorfiscal.vo.model.nfceByNfeIo;

public class IssuerModel {

    private String stStateTaxNumber;

    public String getStStateTaxNumber() {
        return stStateTaxNumber;
    }

    public void setStStateTaxNumber(String stStateTaxNumber) {
        this.stStateTaxNumber = stStateTaxNumber;
    }

    @Override
    public String toString() {
        return "IssuerModel{" +
                "stStateTaxNumber='" + stStateTaxNumber + '\'' +
                '}';
    }
}
