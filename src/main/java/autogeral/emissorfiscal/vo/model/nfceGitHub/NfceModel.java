package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NfceModel {

    @JsonProperty("infNFe")
    private InfNFeModel infNFe;

    @JsonProperty("infNFeSupl")
    private InfNFeSuplModel infNFeSupl;

    @JsonProperty("Signature")
    private SignatureModel signature;

    public InfNFeModel getInfNFe() {
        return infNFe;
    }

    public void setInfNFe(InfNFeModel infNFe) {
        this.infNFe = infNFe;
    }

    public InfNFeSuplModel getInfNFeSupl() {
        return infNFeSupl;
    }

    public void setInfNFeSupl(InfNFeSuplModel infNFeSupl) {
        this.infNFeSupl = infNFeSupl;
    }

    public SignatureModel getSignature() {
        return signature;
    }

    public void setSignature(SignatureModel signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "NfceModel{" +
                "infNFe=" + infNFe +
                ", infNFeSupl=" + infNFeSupl +
                ", signature=" + signature +
                '}';
    }
}
