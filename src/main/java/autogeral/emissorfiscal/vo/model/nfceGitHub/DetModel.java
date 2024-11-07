package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class DetModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("prod")
    private ProdModel prod;
}
