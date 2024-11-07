package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DestModel {
    @JsonProperty("CNPJ")
    private String cnpj;

    @JsonProperty("CPF")
    private String cpf;

    @JsonProperty("idEstrangeiro")
    private String idEstrangeiro;

    @JsonProperty("xNome")
    private String xNome;

    @JsonProperty("enderDest")
    private EnderDestModel enderDest;

    @JsonProperty("indIEDest")
    private String indIEDest;

    @JsonProperty("IE")
    private String ie;

    @JsonProperty("ISUF")
    private String isuf;

    @JsonProperty("IM")
    private String im;

    @JsonProperty("email")
    private String email;

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

    public String getIdEstrangeiro() {
        return idEstrangeiro;
    }

    public void setIdEstrangeiro(String idEstrangeiro) {
        this.idEstrangeiro = idEstrangeiro;
    }

    public String getxNome() {
        return xNome;
    }

    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    public EnderDestModel getEnderDest() {
        return enderDest;
    }

    public void setEnderDest(EnderDestModel enderDest) {
        this.enderDest = enderDest;
    }

    public String getIndIEDest() {
        return indIEDest;
    }

    public void setIndIEDest(String indIEDest) {
        this.indIEDest = indIEDest;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getIsuf() {
        return isuf;
    }

    public void setIsuf(String isuf) {
        this.isuf = isuf;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DestModel{" +
                "cnpj='" + cnpj + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idEstrangeiro='" + idEstrangeiro + '\'' +
                ", xNome='" + xNome + '\'' +
                ", enderDest=" + enderDest +
                ", indIEDest='" + indIEDest + '\'' +
                ", ie='" + ie + '\'' +
                ", isuf='" + isuf + '\'' +
                ", im='" + im + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
