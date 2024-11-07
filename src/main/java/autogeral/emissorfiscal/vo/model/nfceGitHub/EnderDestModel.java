package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnderDestModel {

    @JsonProperty("xLgr")
    private String xLgr;

    @JsonProperty("nro")
    private String nro;

    @JsonProperty("xCpl")
    private String xCpl;

    @JsonProperty("xBairro")
    private String xBairro;

    @JsonProperty("cMun")
    private String cMun;

    @JsonProperty("xMun")
    private String xMun;

    @JsonProperty("UF")
    private String UF;

    @JsonProperty("CEP")
    private String CEP;

    @JsonProperty("cPais")
    private String cPais;

    @JsonProperty("xPais")
    private String xPais;

    @JsonProperty("fone")
    private String fone;

    public String getxLgr() {
        return xLgr;
    }

    public void setxLgr(String xLgr) {
        this.xLgr = xLgr;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getxCpl() {
        return xCpl;
    }

    public void setxCpl(String xCpl) {
        this.xCpl = xCpl;
    }

    public String getxBairro() {
        return xBairro;
    }

    public void setxBairro(String xBairro) {
        this.xBairro = xBairro;
    }

    public String getcMun() {
        return cMun;
    }

    public void setcMun(String cMun) {
        this.cMun = cMun;
    }

    public String getxMun() {
        return xMun;
    }

    public void setxMun(String xMun) {
        this.xMun = xMun;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getcPais() {
        return cPais;
    }

    public void setcPais(String cPais) {
        this.cPais = cPais;
    }

    public String getxPais() {
        return xPais;
    }

    public void setxPais(String xPais) {
        this.xPais = xPais;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public String toString() {
        return "EnderDestModel{" +
                "xLgr='" + xLgr + '\'' +
                ", nro='" + nro + '\'' +
                ", xCpl='" + xCpl + '\'' +
                ", xBairro='" + xBairro + '\'' +
                ", cMun='" + cMun + '\'' +
                ", xMun='" + xMun + '\'' +
                ", UF='" + UF + '\'' +
                ", CEP='" + CEP + '\'' +
                ", cPais='" + cPais + '\'' +
                ", xPais='" + xPais + '\'' +
                ", fone='" + fone + '\'' +
                '}';
    }
}