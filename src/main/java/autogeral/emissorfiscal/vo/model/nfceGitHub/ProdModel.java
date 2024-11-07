package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class ProdModel implements Serializable {

    private static final long serialVersionUID = 1L;

    //39

    @JsonProperty("cProd")
    private String cProd;

    @JsonProperty("cEAN")
    private String cEAN;

    @JsonProperty("cBarra")
    private String cBarra;

    @JsonProperty("xProd")
    private String xProd;

    @JsonProperty("NCM")
    private String ncm;

    @JsonProperty("NVE")
    private String nve;

    @JsonProperty("CEST")
    private String cest;

    @JsonProperty("indEscala")
    private String indEscala;

    @JsonProperty("CNPJFab")
    private String cnpjFab;

    @JsonProperty("cBenef")
    private String cBenef;

    @JsonProperty("EXTIPI")
    private String extTipi;

    @JsonProperty("CFOP")
    private String cfop;

    @JsonProperty("uCom")
    private String uCom;

    @JsonProperty("qCom")
    private String qCom;

    @JsonProperty("vUnCom")
    private String vUnCom;

    @JsonProperty("vProd")
    private String vProd;

    @JsonProperty("cEANTrib")
    private String cEANTrib;

    @JsonProperty("cBarraTrib")
    private String cBarraTrib;

    @JsonProperty("uTrib")
    private String uTrib;

    @JsonProperty("qTrib")
    private String qTrib;

    @JsonProperty("vUnTrib")
    private String vUnTrib;

    @JsonProperty("vFrete")
    private String vFrete;

    @JsonProperty("vSeg")
    private String vSeg;

    @JsonProperty("vDesc")
    private String vDesc;

    @JsonProperty("vOutro")
    private String vOutro;

    @JsonProperty("indTot")
    private String indTot;

    @JsonProperty("DI")
    private String di;

    @JsonProperty("detExport")
    private String detExport;

    @JsonProperty("xPed")
    private String xPed;

    @JsonProperty("nItemPed")
    private String nItemPed;

    @JsonProperty("nFCI")
    private String nFCI;

    @JsonProperty("rastro")
    private String rastro;

    @JsonProperty("infProdNFF")
    private String infProdNFF;

    @JsonProperty("infProdEmb")
    private String infProdEmb;

    @JsonProperty("veicProd")
    private String veicProd;

    @JsonProperty("med")
    private String med;

    @JsonProperty("arma")
    private String arma;

    @JsonProperty("comb")
    private String comb;

    @JsonProperty("nRECOPI")
    private String nRECOPI;

}
