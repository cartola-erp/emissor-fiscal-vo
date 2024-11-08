package autogeral.emissorfiscal.vo;

public class DocumentInvoiceReferenceModel {

    private int state;
    private String yearMonth;
    private String federalTaxNumber;
    private String model;
    private String series;
    private String number;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public String getFederalTaxNumber() {
        return federalTaxNumber;
    }

    public void setFederalTaxNumber(String federalTaxNumber) {
        this.federalTaxNumber = federalTaxNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "DocumentInvoiceReferenceModel{" +
                "state=" + state +
                ", yearMonth='" + yearMonth + '\'' +
                ", federalTaxNumber='" + federalTaxNumber + '\'' +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
