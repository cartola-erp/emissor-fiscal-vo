package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class DetModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("prod")
    private ProdModel prod;

    public ProdModel getProd() {
        return prod;
    }

    public void setProd(ProdModel prod) {
        this.prod = prod;
    }

    @Override
    public String toString() {
        return "DetModel{" +
                "prod=" + prod +
                '}';
    }
}
