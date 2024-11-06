package autogeral.emissorfiscal.vo.model.nfce;

public class CardModel {
    private String federalTaxNumber;
    private String flag;
    private String authorization;
    private String integrationPaymentType;
    private String federalTaxNumberRecipient;
    private String idPaymentTerminal;

    public String getFederalTaxNumber() {
        return federalTaxNumber;
    }

    public void setFederalTaxNumber(String federalTaxNumber) {
        this.federalTaxNumber = federalTaxNumber;
    }

    public String isFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public String getIntegrationPaymentType() {
        return integrationPaymentType;
    }

    public void setIntegrationPaymentType(String integrationPaymentType) {
        this.integrationPaymentType = integrationPaymentType;
    }

    public String getFederalTaxNumberRecipient() {
        return federalTaxNumberRecipient;
    }

    public void setFederalTaxNumberRecipient(String federalTaxNumberRecipient) {
        this.federalTaxNumberRecipient = federalTaxNumberRecipient;
    }

    public String getIdPaymentTerminal() {
        return idPaymentTerminal;
    }

    public void setIdPaymentTerminal(String idPaymentTerminal) {
        this.idPaymentTerminal = idPaymentTerminal;
    }

    @Override
    public String toString() {
        return "CardModel{" +
                "federalTaxNumber='" + federalTaxNumber + '\'' +
                ", flag=" + flag +
                ", authorization='" + authorization + '\'' +
                ", integrationPaymentType='" + integrationPaymentType + '\'' +
                ", federalTaxNumberRecipient='" + federalTaxNumberRecipient + '\'' +
                ", idPaymentTerminal='" + idPaymentTerminal + '\'' +
                '}';
    }
}
