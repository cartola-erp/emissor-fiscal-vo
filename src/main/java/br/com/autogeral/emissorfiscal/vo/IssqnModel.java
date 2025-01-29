package br.com.autogeral.emissorfiscal.vo;

public class IssqnModel {

    private double totalServiceNotTaxedICMS;
    private double baseRateISS;
    private double totalISS;
    private double valueServicePIS;
    private double valueServiceCOFINS;
    private String provisionService;
    private double deductionReductionBC;
    private double valueOtherRetention;
    private double discountUnconditional;
    private double discountConditioning;
    private double totalRetentionISS;
    private Integer codeTaxRegime;

    public double getTotalServiceNotTaxedICMS() {
        return totalServiceNotTaxedICMS;
    }

    public void setTotalServiceNotTaxedICMS(double totalServiceNotTaxedICMS) {
        this.totalServiceNotTaxedICMS = totalServiceNotTaxedICMS;
    }

    public double getBaseRateISS() {
        return baseRateISS;
    }

    public void setBaseRateISS(double baseRateISS) {
        this.baseRateISS = baseRateISS;
    }

    public double getTotalISS() {
        return totalISS;
    }

    public void setTotalISS(double totalISS) {
        this.totalISS = totalISS;
    }

    public double getValueServicePIS() {
        return valueServicePIS;
    }

    public void setValueServicePIS(double valueServicePIS) {
        this.valueServicePIS = valueServicePIS;
    }

    public double getValueServiceCOFINS() {
        return valueServiceCOFINS;
    }

    public void setValueServiceCOFINS(double valueServiceCOFINS) {
        this.valueServiceCOFINS = valueServiceCOFINS;
    }

    public String getProvisionService() {
        return provisionService;
    }

    public void setProvisionService(String provisionService) {
        this.provisionService = provisionService;
    }

    public double getDeductionReductionBC() {
        return deductionReductionBC;
    }

    public void setDeductionReductionBC(double deductionReductionBC) {
        this.deductionReductionBC = deductionReductionBC;
    }

    public double getValueOtherRetention() {
        return valueOtherRetention;
    }

    public void setValueOtherRetention(double valueOtherRetention) {
        this.valueOtherRetention = valueOtherRetention;
    }

    public double getDiscountUnconditional() {
        return discountUnconditional;
    }

    public void setDiscountUnconditional(double discountUnconditional) {
        this.discountUnconditional = discountUnconditional;
    }

    public double getDiscountConditioning() {
        return discountConditioning;
    }

    public void setDiscountConditioning(double discountConditioning) {
        this.discountConditioning = discountConditioning;
    }

    public double getTotalRetentionISS() {
        return totalRetentionISS;
    }

    public void setTotalRetentionISS(double totalRetentionISS) {
        this.totalRetentionISS = totalRetentionISS;
    }

    public Integer getCodeTaxRegime() {
        return codeTaxRegime;
    }

    public void setCodeTaxRegime(Integer codeTaxRegime) {
        this.codeTaxRegime = codeTaxRegime;
    }

    @Override
    public String toString() {
        return "IssqnModel{" +
                "totalServiceNotTaxedICMS=" + totalServiceNotTaxedICMS +
                ", baseRateISS=" + baseRateISS +
                ", totalISS=" + totalISS +
                ", valueServicePIS=" + valueServicePIS +
                ", valueServiceCOFINS=" + valueServiceCOFINS +
                ", provisionService='" + provisionService + '\'' +
                ", deductionReductionBC=" + deductionReductionBC +
                ", valueOtherRetention=" + valueOtherRetention +
                ", discountUnconditional=" + discountUnconditional +
                ", discountConditioning=" + discountConditioning +
                ", totalRetentionISS=" + totalRetentionISS +
                ", codeTaxRegime=" + codeTaxRegime +
                '}';
    }
}
