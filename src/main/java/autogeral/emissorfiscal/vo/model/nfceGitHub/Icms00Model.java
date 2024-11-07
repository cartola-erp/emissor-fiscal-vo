package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Icms00Model {

    @JsonProperty("orig")
    private String orig;

    @JsonProperty("CST")
    private String cst;

    @JsonProperty("modBC")
    private String modBC;

    @JsonProperty("vBC")
    private String vBC;

    @JsonProperty("pICMS")
    private String pICMS;

    @JsonProperty("vICMS")
    private String vICMS;

    @JsonProperty("pFCP")
    private String pFCP;

    @JsonProperty("vFCP")
    private String vFCP;

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getModBC() {
        return modBC;
    }

    public void setModBC(String modBC) {
        this.modBC = modBC;
    }

    public String getvBC() {
        return vBC;
    }

    public void setvBC(String vBC) {
        this.vBC = vBC;
    }

    public String getpICMS() {
        return pICMS;
    }

    public void setpICMS(String pICMS) {
        this.pICMS = pICMS;
    }

    public String getvICMS() {
        return vICMS;
    }

    public void setvICMS(String vICMS) {
        this.vICMS = vICMS;
    }

    public String getpFCP() {
        return pFCP;
    }

    public void setpFCP(String pFCP) {
        this.pFCP = pFCP;
    }

    public String getvFCP() {
        return vFCP;
    }

    public void setvFCP(String vFCP) {
        this.vFCP = vFCP;
    }

    @Override
    public String toString() {
        return "Icms00Model{" +
                "orig='" + orig + '\'' +
                ", cst='" + cst + '\'' +
                ", modBC='" + modBC + '\'' +
                ", vBC='" + vBC + '\'' +
                ", pICMS='" + pICMS + '\'' +
                ", vICMS='" + vICMS + '\'' +
                ", pFCP='" + pFCP + '\'' +
                ", vFCP='" + vFCP + '\'' +
                '}';
    }
}
