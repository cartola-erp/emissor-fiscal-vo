package autogeral.emissorfiscal.vo.model.nfce;

public class ReferencedProcessModel {

    private String identifierConcessory;
    private int identifierOrigin;
    private int concessionActType;

    public String getIdentifierConcessory() {
        return identifierConcessory;
    }

    public void setIdentifierConcessory(String identifierConcessory) {
        this.identifierConcessory = identifierConcessory;
    }

    public int getIdentifierOrigin() {
        return identifierOrigin;
    }

    public void setIdentifierOrigin(int identifierOrigin) {
        this.identifierOrigin = identifierOrigin;
    }

    public int getConcessionActType() {
        return concessionActType;
    }

    public void setConcessionActType(int concessionActType) {
        this.concessionActType = concessionActType;
    }

    @Override
    public String toString() {
        return "ReferencedProcessModel{" +
                "identifierConcessory='" + identifierConcessory + '\'' +
                ", identifierOrigin=" + identifierOrigin +
                ", concessionActType=" + concessionActType +
                '}';
    }
}
