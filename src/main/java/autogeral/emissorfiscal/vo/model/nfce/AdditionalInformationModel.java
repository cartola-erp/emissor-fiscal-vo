package autogeral.emissorfiscal.vo.model.nfce;

import java.util.List;

public class AdditionalInformationModel {

    private String fisco;
    private String taxpayer;
    private List<Integer> xmlAuthorized;
    private String effort;
    private String order;
    private String contract;
    private List<TaxDocumentsReferenceModel> taxDocumentsReference;
    private List<TaxpayerCommentsModel> taxpayerComments;
    private List<ReferencedProcessModel> referencedProcess;

    public String getFisco() {
        return fisco;
    }

    public void setFisco(String fisco) {
        this.fisco = fisco;
    }

    public String getTaxpayer() {
        return taxpayer;
    }

    public void setTaxpayer(String taxpayer) {
        this.taxpayer = taxpayer;
    }

    public List<Integer> getXmlAuthorized() {
        return xmlAuthorized;
    }

    public void setXmlAuthorized(List<Integer> xmlAuthorized) {
        this.xmlAuthorized = xmlAuthorized;
    }

    public String getEffort() {
        return effort;
    }

    public void setEffort(String effort) {
        this.effort = effort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public List<TaxDocumentsReferenceModel> getTaxDocumentsReference() {
        return taxDocumentsReference;
    }

    public void setTaxDocumentsReference(List<TaxDocumentsReferenceModel> taxDocumentsReference) {
        this.taxDocumentsReference = taxDocumentsReference;
    }

    public List<TaxpayerCommentsModel> getTaxpayerComments() {
        return taxpayerComments;
    }

    public void setTaxpayerComments(List<TaxpayerCommentsModel> taxpayerComments) {
        this.taxpayerComments = taxpayerComments;
    }

    public List<ReferencedProcessModel> getReferencedProcess() {
        return referencedProcess;
    }

    public void setReferencedProcess(List<ReferencedProcessModel> referencedProcess) {
        this.referencedProcess = referencedProcess;
    }

    @Override
    public String toString() {
        return "AdditionalInformationModel{" +
                "fisco='" + fisco + '\'' +
                ", taxpayer='" + taxpayer + '\'' +
                ", xmlAuthorized=" + xmlAuthorized +
                ", effort='" + effort + '\'' +
                ", order='" + order + '\'' +
                ", contract='" + contract + '\'' +
                ", taxDocumentsReference=" + taxDocumentsReference +
                ", taxpayerComments=" + taxpayerComments +
                ", referencedProcess=" + referencedProcess +
                '}';
    }
}
