package br.com.autogeral.emissorfiscal.vo;

public class ReboqueModel {

    private String plate;
    private String uf;
    private String rntc;
    private String wagon;
    private String ferry;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getRntc() {
        return rntc;
    }

    public void setRntc(String rntc) {
        this.rntc = rntc;
    }

    public String getWagon() {
        return wagon;
    }

    public void setWagon(String wagon) {
        this.wagon = wagon;
    }

    public String getFerry() {
        return ferry;
    }

    public void setFerry(String ferry) {
        this.ferry = ferry;
    }

    @Override
    public String toString() {
        return "ReboqueModel{" +
                "plate='" + plate + '\'' +
                ", uf='" + uf + '\'' +
                ", rntc='" + rntc + '\'' +
                ", wagon='" + wagon + '\'' +
                ", ferry='" + ferry + '\'' +
                '}';
    }
}
