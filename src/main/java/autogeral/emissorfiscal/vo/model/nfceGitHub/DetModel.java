package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetModel {

    @JsonProperty("prod")
    private ProdModel prod;
    @JsonProperty("imposto")
    private ImpostoModel imposto;
    @JsonProperty("nItem")
    private String nItem;

    public ProdModel getProd() {
        return prod;
    }

    public void setProd(ProdModel prod) {
        this.prod = prod;
    }

    public ImpostoModel getImposto() {
        return imposto;
    }

    public void setImposto(ImpostoModel imposto) {
        this.imposto = imposto;
    }

    public String getnItem() {
        return nItem;
    }

    public void setnItem(String nItem) {
        this.nItem = nItem;
    }

    @Override
    public String toString() {
        return "DetModel{" +
                "prod=" + prod +
                ", imposto=" + imposto +
                ", nItem='" + nItem + '\'' +
                '}';
    }
}
