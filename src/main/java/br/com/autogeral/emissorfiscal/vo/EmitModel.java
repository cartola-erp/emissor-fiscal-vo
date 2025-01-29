package br.com.autogeral.emissorfiscal.vo;

public class EmitModel {

    private String nomeEmitente;

    private String cpnjEmitente;

    private String regimeTributario;

    private String inscricaoEstadual;

    private String logradouroEmitente;

    private String numeroLogradouroEmitente;

    private String complementoEdenrecoEmitente;

    private String bairroEmitente;

    private String municipioEmitente;

    private String codIbgeMunicipioEmitente;

    private String ufEmitente;

    private String cepEmitente;

    private String codigoPaisEmitente;

    private String telefoneEmitente;

    public String getCpnjEmitente() {
        return cpnjEmitente;
    }

    public void setCpnjEmitente(String cpnjEmitente) {
        this.cpnjEmitente = cpnjEmitente;
    }

    public String getNomeEmitente() {
        return nomeEmitente;
    }

    public void setNomeEmitente(String nomeEmitente) {
        this.nomeEmitente = nomeEmitente;
    }

    public String getLogradouroEmitente() {
        return logradouroEmitente;
    }

    public void setLogradouroEmitente(String logradouroEmitente) {
        this.logradouroEmitente = logradouroEmitente;
    }

    public String getNumeroLogradouroEmitente() {
        return numeroLogradouroEmitente;
    }

    public void setNumeroLogradouroEmitente(String numeroLogradouroEmitente) {
        this.numeroLogradouroEmitente = numeroLogradouroEmitente;
    }

    public String getComplementoEdenrecoEmitente() {
        return complementoEdenrecoEmitente;
    }

    public void setComplementoEdenrecoEmitente(String complementoEdenrecoEmitente) {
        this.complementoEdenrecoEmitente = complementoEdenrecoEmitente;
    }

    public String getBairroEmitente() {
        return bairroEmitente;
    }

    public void setBairroEmitente(String bairroEmitente) {
        this.bairroEmitente = bairroEmitente;
    }

    public String getMunicipioEmitente() {
        return municipioEmitente;
    }

    public void setMunicipioEmitente(String municipioEmitente) {
        this.municipioEmitente = municipioEmitente;
    }

    public String getCodIbgeMunicipioEmitente() {
        return codIbgeMunicipioEmitente;
    }

    public void setCodIbgeMunicipioEmitente(String codIbgeMunicipioEmitente) {
        this.codIbgeMunicipioEmitente = codIbgeMunicipioEmitente;
    }

    public String getUfEmitente() {
        return ufEmitente;
    }

    public void setUfEmitente(String ufEmitente) {
        this.ufEmitente = ufEmitente;
    }

    public String getCepEmitente() {
        return cepEmitente;
    }

    public void setCepEmitente(String cepEmitente) {
        this.cepEmitente = cepEmitente;
    }

    public String getCodigoPaisEmitente() {
        return codigoPaisEmitente;
    }

    public void setCodigoPaisEmitente(String codigoPaisEmitente) {
        this.codigoPaisEmitente = codigoPaisEmitente;
    }

    public String getTelefoneEmitente() {
        return telefoneEmitente;
    }

    public void setTelefoneEmitente(String telefoneEmitente) {
        this.telefoneEmitente = telefoneEmitente;
    }

    public String getRegimeTributario() {
        return regimeTributario;
    }

    public void setRegimeTributario(String regimeTributario) {
        this.regimeTributario = regimeTributario;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "EmitModel{" +
                "nomeEmitente='" + nomeEmitente + '\'' +
                ", cpnjEmitente='" + cpnjEmitente + '\'' +
                ", regimeTributario='" + regimeTributario + '\'' +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                ", logradouroEmitente='" + logradouroEmitente + '\'' +
                ", numeroLogradouroEmitente='" + numeroLogradouroEmitente + '\'' +
                ", complementoEdenrecoEmitente='" + complementoEdenrecoEmitente + '\'' +
                ", bairroEmitente='" + bairroEmitente + '\'' +
                ", municipioEmitente='" + municipioEmitente + '\'' +
                ", codIbgeMunicipioEmitente='" + codIbgeMunicipioEmitente + '\'' +
                ", ufEmitente='" + ufEmitente + '\'' +
                ", cepEmitente='" + cepEmitente + '\'' +
                ", codigoPaisEmitente='" + codigoPaisEmitente + '\'' +
                ", telefoneEmitente='" + telefoneEmitente + '\'' +
                '}';
    }
}
