package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class DestModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("CNPJ")
    private String cnpj;

    @JsonProperty("CPF")
    private String cpf;

    @JsonProperty("idEstrangeiro")
    private String idEstrangeiro;

    @JsonProperty("xNome")
    private String xNome;

    @JsonProperty("enderDest")
    private EnderDestModel enderDest;

    @JsonProperty("indIEDest")
    private String indIEDest;

    @JsonProperty("IE")
    private String ie;

    @JsonProperty("ISUF")
    private String isuf;

    @JsonProperty("IM")
    private String ime;

    @JsonProperty("email")
    private String email;
}
