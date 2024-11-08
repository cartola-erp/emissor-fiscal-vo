package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFant() {
        return fant;
    }

    public void setFant(String fant) {
        this.fant = fant;
    }

    public EnderEmitModel getEnderEmitModel() {
        return enderEmitModel;
    }

    public void setEnderEmitModel(EnderEmitModel enderEmitModel) {
        this.enderEmitModel = enderEmitModel;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getIest() {
        return iest;
    }

    public void setIest(String iest) {
        this.iest = iest;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    public String getCrt() {
        return crt;
    }

    public void setCrt(String crt) {
        this.crt = crt;
    }

    @Override
    public String toString() {
        return "EmitModel{" +
                "cnpj='" + cnpj + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", fant='" + fant + '\'' +
                ", enderEmitModel=" + enderEmitModel +
                ", ie='" + ie + '\'' +
                ", iest='" + iest + '\'' +
                ", in='" + in + '\'' +
                ", cnae='" + cnae + '\'' +
                ", crt='" + crt + '\'' +
                '}';
    }
}
