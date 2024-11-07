package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class InfNfceModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Id")
    private String chaveAcesso;

    @JsonProperty("ide")
    private IdeModel ide;

    @JsonProperty("emit")
    private EmitModel emit;

    @JsonProperty("avulsa")
    private String avulsa;

    @JsonProperty("dest")
    private DestModel dest;

    @JsonProperty("retirada")
    private String retirada;

    @JsonProperty("entrega")
    private String entrega;

    @JsonProperty("autXML")
    private String autXml;

    @JsonProperty("det")
    private List<DetModel> det;
}
