package autogeral.emissorfiscal.vo.model.nfceGitHub;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class EnderEmitModel implements Serializable {


    private static final long serialVersionUID = 1L;

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
    private String uf;

    @JsonProperty("CEP")
    private String cep ;

    @JsonProperty("cPais")
    private String cpais ;

    @JsonProperty("xPais")
    private String xpais ;

    @JsonProperty("fone")
    private String fone;
}
