package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class LoteNfce implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("idLote")
    private String idLote;

    @JsonProperty("indSinc")
    private String indSinc;

    @JsonProperty("NFe")
    private List<InfNfceModel> infNfe;

    public String getIdLote() {
        return idLote;
    }

    public void setIdLote(String idLote) {
        this.idLote = idLote;
    }

    public String getIndSinc() {
        return indSinc;
    }

    public void setIndSinc(String indSinc) {
        this.indSinc = indSinc;
    }

    public List<InfNfceModel> getInfNfe() {
        return infNfe;
    }

    public void setInfNfe(List<InfNfceModel> infNfe) {
        this.infNfe = infNfe;
    }

    @Override
    public String toString() {
        return "LoteNfce{" +
                "idLote='" + idLote + '\'' +
                ", indSinc='" + indSinc + '\'' +
                ", infNfe=" + infNfe +
                '}';
    }
}
