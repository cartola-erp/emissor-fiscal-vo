package autogeral.emissorfiscal.vo.model.nfceByNfeIo;

public class TaxDeterminationModel {

    private Integer operationCode;
    private String issuerTaxProfile;
    private String buyerTaxProfile;
    private String origin;
    private String acquisitionPurpose;

    public Integer getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(Integer operationCode) {
        this.operationCode = operationCode;
    }

    public String getIssuerTaxProfile() {
        return issuerTaxProfile;
    }

    public void setIssuerTaxProfile(String issuerTaxProfile) {
        this.issuerTaxProfile = issuerTaxProfile;
    }

    public String getBuyerTaxProfile() {
        return buyerTaxProfile;
    }

    public void setBuyerTaxProfile(String buyerTaxProfile) {
        this.buyerTaxProfile = buyerTaxProfile;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getAcquisitionPurpose() {
        return acquisitionPurpose;
    }

    public void setAcquisitionPurpose(String acquisitionPurpose) {
        this.acquisitionPurpose = acquisitionPurpose;
    }

    @Override
    public String toString() {
        return "TaxDeterminationModel{" +
                "operationCode=" + operationCode +
                ", issuerTaxProfile='" + issuerTaxProfile + '\'' +
                ", buyerTaxProfile='" + buyerTaxProfile + '\'' +
                ", origin='" + origin + '\'' +
                ", acquisitionPurpose='" + acquisitionPurpose + '\'' +
                '}';
    }
}
