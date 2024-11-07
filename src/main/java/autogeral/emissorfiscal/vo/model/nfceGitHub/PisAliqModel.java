package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PisAliqModel {

    @JsonProperty("CST")
    private String cst;

    @JsonProperty("vBC")
    private String vBC;

    @JsonProperty("pPIS")
    private String pPIS;

    @JsonProperty("vPIS")
    private String vPIS;

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getvBC() {
        return vBC;
    }

    public void setvBC(String vBC) {
        this.vBC = vBC;
    }

    public String getpPIS() {
        return pPIS;
    }

    public void setpPIS(String pPIS) {
        this.pPIS = pPIS;
    }

    public String getvPIS() {
        return vPIS;
    }

    public void setvPIS(String vPIS) {
        this.vPIS = vPIS;
    }

    @Override
    public String toString() {
        return "PisAliqModel{" +
                "cst='" + cst + '\'' +
                ", vBC='" + vBC + '\'' +
                ", pPIS='" + pPIS + '\'' +
                ", vPIS='" + vPIS + '\'' +
                '}';
    }
}
