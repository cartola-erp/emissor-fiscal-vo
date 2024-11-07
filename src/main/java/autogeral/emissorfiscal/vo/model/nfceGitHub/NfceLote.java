package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class NfceLote {

    private static final long serialVersionUID = 1L;

    @JsonProperty("idLote")
    private String idLote;

    @JsonProperty("indSinc")
    private String indSinc;

    @JsonProperty("NFe")
    private List<NfceModel> nfe;

}
