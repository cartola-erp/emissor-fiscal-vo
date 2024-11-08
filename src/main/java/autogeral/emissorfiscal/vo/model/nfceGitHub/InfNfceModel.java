package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

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

    @JsonProperty("imposto")
    private ImpostoModel imposto;

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
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

    public String getAvulsa() {
        return avulsa;
    }

    public void setAvulsa(String avulsa) {
        this.avulsa = avulsa;
    }

    public DestModel getDest() {
        return dest;
    }

    public void setDest(DestModel dest) {
        this.dest = dest;
    }

    public String getRetirada() {
        return retirada;
    }

    public void setRetirada(String retirada) {
        this.retirada = retirada;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public String getAutXml() {
        return autXml;
    }

    public void setAutXml(String autXml) {
        this.autXml = autXml;
    }

    public List<DetModel> getDet() {
        return det;
    }

    public void setDet(List<DetModel> det) {
        this.det = det;
    }

    public ImpostoModel getImposto() {
        return imposto;
    }

    public void setImposto(ImpostoModel imposto) {
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return "InfNfceModel{" +
                "chaveAcesso='" + chaveAcesso + '\'' +
                ", ide=" + ide +
                ", emit=" + emit +
                ", avulsa='" + avulsa + '\'' +
                ", dest=" + dest +
                ", retirada='" + retirada + '\'' +
                ", entrega='" + entrega + '\'' +
                ", autXml='" + autXml + '\'' +
                ", det=" + det +
                ", imposto=" + imposto +
                '}';
    }
}
