package br.com.autogeral.emissorfiscal.response.vo;

public class InvoiceResponse {
    private int serie;
    private int numero;
    private String chave;
    private String xml;
    private String pdf;

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    @Override
    public String toString() {
        return "InvoiceResponse{" +
                "serie=" + serie +
                ", numero=" + numero +
                ", chave='" + chave + '\'' +
                ", xml='" + xml + '\'' +
                ", pdf='" + pdf + '\'' +
                '}';
    }
}
