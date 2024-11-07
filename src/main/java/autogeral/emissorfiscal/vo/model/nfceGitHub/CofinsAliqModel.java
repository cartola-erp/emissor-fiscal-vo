package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CofinsAliqModel {

    @JsonProperty("CST")
    private String cst;

    @JsonProperty("vBC")
    private String vBC;

    @JsonProperty("pCOFINS")
    private String pCOFINS;

    @JsonProperty("vCOFINS")
    private String vCOFINS;
}
