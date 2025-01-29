package br.com.autogeral.emissorfiscal.vo;

public class IpiModel {

    private String cst;
    private String classificationCode;
    private String classification;
    private String producerCNPJ;
    private String stampCode;
    private Integer stampQuantity;
    private double base;
    private double rate;
    private Integer unitQuantity;
    private double unitAmount;
    private double amount;

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getClassificationCode() {
        return classificationCode;
    }

    public void setClassificationCode(String classificationCode) {
        this.classificationCode = classificationCode;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getProducerCNPJ() {
        return producerCNPJ;
    }

    public void setProducerCNPJ(String producerCNPJ) {
        this.producerCNPJ = producerCNPJ;
    }

    public String getStampCode() {
        return stampCode;
    }

    public void setStampCode(String stampCode) {
        this.stampCode = stampCode;
    }

    public Integer getStampQuantity() {
        return stampQuantity;
    }

    public void setStampQuantity(Integer stampQuantity) {
        this.stampQuantity = stampQuantity;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Integer getUnitQuantity() {
        return unitQuantity;
    }

    public void setUnitQuantity(Integer unitQuantity) {
        this.unitQuantity = unitQuantity;
    }

    public double getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(double unitAmount) {
        this.unitAmount = unitAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "IpiModel{" +
                "cst='" + cst + '\'' +
                ", classificationCode='" + classificationCode + '\'' +
                ", classification='" + classification + '\'' +
                ", producerCNPJ='" + producerCNPJ + '\'' +
                ", stampCode='" + stampCode + '\'' +
                ", stampQuantity=" + stampQuantity +
                ", base=" + base +
                ", rate=" + rate +
                ", unitQuantity=" + unitQuantity +
                ", unitAmount=" + unitAmount +
                ", amount=" + amount +
                '}';
    }
}
