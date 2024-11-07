package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
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

}
