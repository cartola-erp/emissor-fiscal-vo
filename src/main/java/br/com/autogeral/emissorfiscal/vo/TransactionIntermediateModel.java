package br.com.autogeral.emissorfiscal.vo;

public class TransactionIntermediateModel {

    private long federalTaxNumber;
    private String identifier;

    public long getFederalTaxNumber() {
        return federalTaxNumber;
    }

    public void setFederalTaxNumber(long federalTaxNumber) {
        this.federalTaxNumber = federalTaxNumber;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "TransactionIntermediateModel{" +
                "federalTaxNumber=" + federalTaxNumber +
                ", identifier='" + identifier + '\'' +
                '}';
    }
}
