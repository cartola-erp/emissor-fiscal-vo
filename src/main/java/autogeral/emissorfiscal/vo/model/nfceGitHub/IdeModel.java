package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class IdeModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("cUF")
    private String uf;

    @JsonProperty("cNF")
    private String cNf;

    @JsonProperty("natOp")
    private String natOp;

    @JsonProperty("mod")
    private String mod;

    @JsonProperty("serie")
    private String serie;

    @JsonProperty("nNF")
    private String nNf;

    @JsonProperty("dhEmi")
    private String dhEmi;

    @JsonProperty("dhSaiEnt")
    private String dhSaiEnt;

    @JsonProperty("tpNF")
    private String tpNF;

    @JsonProperty("idDest")
    private String idDest;

    @JsonProperty("cMunFG")
    private String cMunFG;

    @JsonProperty("tpImp")
    private String tpImp;

    @JsonProperty("tpEmis")
    private String tpEmis;

    @JsonProperty("cDV")
    private String cDV;

    @JsonProperty("tpAmb")
    private String tpAmb;

    @JsonProperty("finNFe")
    private String finNFe;

    @JsonProperty("indFinal")
    private String indFinal;

    @JsonProperty("indPres")
    private String indPres;

    @JsonProperty("indIntermed")
    private String indIntermed;

    @JsonProperty("procEmi")
    private String procEmi;

    @JsonProperty("verProc")
    private String verProc;

    @JsonProperty("dhCont")
    private String dhCont;

    @JsonProperty("xJust")
    private String xJust;

    @JsonProperty("NFref")
    private String NFref;

}
