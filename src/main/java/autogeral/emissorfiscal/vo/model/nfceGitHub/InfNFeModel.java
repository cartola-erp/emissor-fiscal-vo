package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InfNFeModel {

    @JsonProperty("Id")
    private String id;

    @JsonProperty("ide")
    private IdeModel ide;

    @JsonProperty("emit")
    private EmitModel emit;

    @JsonProperty("dest")
    private DestModel dest;

    @JsonProperty("det")
    private List<DetModel> det;

    @JsonProperty("total")
    private TotalModel total;

    @JsonProperty("transp")
    private TranspModel transp;

    @JsonProperty("pag")
    private PagModel pag;

    @JsonProperty("versao")
    private String versao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IdeModel getIde() {
        return ide;
    }

    public void setIde(IdeModel ide) {
        this.ide = ide;
    }

    public EmitModel getEmit() {
        return emit;
    }

    public void setEmit(EmitModel emit) {
        this.emit = emit;
    }

    public DestModel getDest() {
        return dest;
    }

    public void setDest(DestModel dest) {
        this.dest = dest;
    }

    public List<DetModel> getDet() {
        return det;
    }

    public void setDet(List<DetModel> det) {
        this.det = det;
    }

    public TotalModel getTotal() {
        return total;
    }

    public void setTotal(TotalModel total) {
        this.total = total;
    }

    public TranspModel getTransp() {
        return transp;
    }

    public void setTransp(TranspModel transp) {
        this.transp = transp;
    }

    public PagModel getPag() {
        return pag;
    }

    public void setPag(PagModel pag) {
        this.pag = pag;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    @Override
    public String toString() {
        return "InfNFeModel{" +
                "id='" + id + '\'' +
                ", ide=" + ide +
                ", emit=" + emit +
                ", dest=" + dest +
                ", det=" + det +
                ", total=" + total +
                ", transp=" + transp +
                ", pag=" + pag +
                ", versao='" + versao + '\'' +
                '}';
    }
}
