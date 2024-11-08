package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class EnderDestModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("xLgr")
    private String lrg;

    @JsonProperty("nro")
    private String nro;

    @JsonProperty("xCpl")
    private String cpl;

    @JsonProperty("xBairro")
    private String bairro;

    @JsonProperty("cMun")
    private String mun;

    @JsonProperty("UF")
    private String uf;

    @JsonProperty("CEP")
    private String cep;

    @JsonProperty("cPais")
    private String cPais;

    @JsonProperty("xPais")
    private String xPais;

    @JsonProperty("fone")
    private String fone;

    public String getLrg() {
        return lrg;
    }

    public void setLrg(String lrg) {
        this.lrg = lrg;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getCpl() {
        return cpl;
    }

    public void setCpl(String cpl) {
        this.cpl = cpl;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMun() {
        return mun;
    }

    public void setMun(String mun) {
        this.mun = mun;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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
                "lrg='" + lrg + '\'' +
                ", nro='" + nro + '\'' +
                ", cpl='" + cpl + '\'' +
                ", bairro='" + bairro + '\'' +
                ", mun='" + mun + '\'' +
                ", uf='" + uf + '\'' +
                ", cep='" + cep + '\'' +
                ", cPais='" + cPais + '\'' +
                ", xPais='" + xPais + '\'' +
                ", fone='" + fone + '\'' +
                '}';
    }
}
