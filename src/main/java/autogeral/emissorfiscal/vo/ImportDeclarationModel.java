package autogeral.emissorfiscal.vo;

import java.util.List;

public class ImportDeclarationModel {

    private String code;
    private String registeredOn;
    private String customsClearanceName;
    private String customsClearanceState;
    private String customsClearancedOn;
    private List<AdditionModel> additions;
    private String exporter;
    private String internationalTransport;
    private String intermediation;
    private String acquirerFederalTaxNumber;
    private String stateThird;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRegisteredOn() {
        return registeredOn;
    }

    public void setRegisteredOn(String registeredOn) {
        this.registeredOn = registeredOn;
    }

    public String getCustomsClearanceName() {
        return customsClearanceName;
    }

    public void setCustomsClearanceName(String customsClearanceName) {
        this.customsClearanceName = customsClearanceName;
    }

    public String getCustomsClearanceState() {
        return customsClearanceState;
    }

    public void setCustomsClearanceState(String customsClearanceState) {
        this.customsClearanceState = customsClearanceState;
    }

    public String getCustomsClearancedOn() {
        return customsClearancedOn;
    }

    public void setCustomsClearancedOn(String customsClearancedOn) {
        this.customsClearancedOn = customsClearancedOn;
    }

    public List<AdditionModel> getAdditions() {
        return additions;
    }

    public void setAdditions(List<AdditionModel> additions) {
        this.additions = additions;
    }

    public String getExporter() {
        return exporter;
    }

    public void setExporter(String exporter) {
        this.exporter = exporter;
    }

    public String getInternationalTransport() {
        return internationalTransport;
    }

    public void setInternationalTransport(String internationalTransport) {
        this.internationalTransport = internationalTransport;
    }

    public String getIntermediation() {
        return intermediation;
    }

    public void setIntermediation(String intermediation) {
        this.intermediation = intermediation;
    }

    public String getAcquirerFederalTaxNumber() {
        return acquirerFederalTaxNumber;
    }

    public void setAcquirerFederalTaxNumber(String acquirerFederalTaxNumber) {
        this.acquirerFederalTaxNumber = acquirerFederalTaxNumber;
    }

    public String getStateThird() {
        return stateThird;
    }

    public void setStateThird(String stateThird) {
        this.stateThird = stateThird;
    }

    @Override
    public String toString() {
        return "ImportDeclarationModel{" +
                "code='" + code + '\'' +
                ", registeredOn='" + registeredOn + '\'' +
                ", customsClearanceName='" + customsClearanceName + '\'' +
                ", customsClearanceState='" + customsClearanceState + '\'' +
                ", customsClearancedOn='" + customsClearancedOn + '\'' +
                ", additions=" + additions +
                ", exporter='" + exporter + '\'' +
                ", internationalTransport='" + internationalTransport + '\'' +
                ", intermediation='" + intermediation + '\'' +
                ", acquirerFederalTaxNumber='" + acquirerFederalTaxNumber + '\'' +
                ", stateThird='" + stateThird + '\'' +
                '}';
    }
}
