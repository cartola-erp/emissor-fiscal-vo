package br.com.autogeral.emissorfiscal.vo;

public class CideModel {

    private double bc;
    private double rate;
    private double cideAmount;

    public double getBc() {
        return bc;
    }

    public void setBc(double bc) {
        this.bc = bc;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getCideAmount() {
        return cideAmount;
    }

    public void setCideAmount(double cideAmount) {
        this.cideAmount = cideAmount;
    }

    @Override
    public String toString() {
        return "CideModel{" +
                "bc=" + bc +
                ", rate=" + rate +
                ", cideAmount=" + cideAmount +
                '}';
    }
}
