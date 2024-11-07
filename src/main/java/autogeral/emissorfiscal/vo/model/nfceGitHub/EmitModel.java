package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class EmitModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("CNPJ")
    private String cnpj;

    @JsonProperty("CPF")
    private String cpf;

    @JsonProperty("xNome")
    private String nome;

    @JsonProperty("xFant")
    private String fant;

    @JsonProperty("enderEmit")
    private EnderEmitModel enderEmitModel;

    @JsonProperty("IE")
    private String ie;

    @JsonProperty("IEST")
    private String iest;

    @JsonProperty("IM")
    private String in;

    @JsonProperty("CNAE")
    private String cnae;

    @JsonProperty("CRT")
    private String crt;
}
