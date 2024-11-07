package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmitModel {

    @JsonProperty("CNPJ")
    private String cnpj;

    @JsonProperty("CPF")
    private String cpf;

    @JsonProperty("xNome")
    private String xNome;

    @JsonProperty("xFant")
    private String xFant;

    @JsonProperty("enderEmit")
    private EnderEmitModel enderEmit;

    @JsonProperty("IE")
    private String ie;

    @JsonProperty("IEST")
    private String iest;

    @JsonProperty("IM")
    private String im;

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

    public String getxNome() {
        return xNome;
    }

    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    public String getxFant() {
        return xFant;
    }

    public void setxFant(String xFant) {
        this.xFant = xFant;
    }

    public EnderEmitModel getEnderEmit() {
        return enderEmit;
    }

    public void setEnderEmit(EnderEmitModel enderEmit) {
        this.enderEmit = enderEmit;
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

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
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
                ", xNome='" + xNome + '\'' +
                ", xFant='" + xFant + '\'' +
                ", enderEmit=" + enderEmit +
                ", ie='" + ie + '\'' +
                ", iest='" + iest + '\'' +
                ", im='" + im + '\'' +
                ", cnae='" + cnae + '\'' +
                ", crt='" + crt + '\'' +
                '}';
    }
}