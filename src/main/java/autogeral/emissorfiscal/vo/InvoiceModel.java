package autogeral.emissorfiscal.vo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;
import java.util.List;

@XmlRootElement
public class InvoiceModel {

    private String id;
    private List<PaymentModel> payment;
    private Integer serie;
    private Integer number;
    private LocalDateTime operationOn;
    private String operationNature;
    private String operationType;
    private String destination;
    private String printType;
    private String purposeType;
    private String consumerType;
    private String presenceType;
    private LocalDateTime contingencyOn;
    private String contingencyJustification;
    private BuyerModel buyer;
    private TransportModel transport;
    private AdditionalInformationModel additionalInformation;
    private List<ItemModel> items;
    private TotalsModel totals;
    private BillingModel billing;
    private IssuerModel issuer;
    private TransactionIntermediateModel transactionIntermediate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement
    public List<PaymentModel> getPayment() {
        return payment;
    }

    public void setPayment(List<PaymentModel> payment) {
        this.payment = payment;
    }


    @XmlElement
    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    @XmlElement
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @XmlElement
    public LocalDateTime getOperationOn() {
        return operationOn;
    }

    public void setOperationOn(LocalDateTime operationOn) {
        this.operationOn = operationOn;
    }

    @XmlElement
    public String getOperationNature() {
        return operationNature;
    }

    public void setOperationNature(String operationNature) {
        this.operationNature = operationNature;
    }

    @XmlElement
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    @XmlElement
    public String getIsDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @XmlElement
    public String getIsPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    @XmlElement
    public String getIsPurposeType() {
        return purposeType;
    }

    public void setPurposeType(String purposeType) {
        this.purposeType = purposeType;
    }

    @XmlElement
    public String getConsumerType() {
        return consumerType;
    }

    public void setConsumerType(String consumerType) {
        this.consumerType = consumerType;
    }

    @XmlElement
    public String getIsPresenceType() {
        return presenceType;
    }

    public void setPresenceType(String presenceType) {
        this.presenceType = presenceType;
    }

    @XmlElement
    public LocalDateTime getContingencyOn() {
        return contingencyOn;
    }

    public void setContingencyOn(LocalDateTime contingencyOn) {
        this.contingencyOn = contingencyOn;
    }

    @XmlElement
    public String getContingencyJustification() {
        return contingencyJustification;
    }

    public void setContingencyJustification(String contingencyJustification) {
        this.contingencyJustification = contingencyJustification;
    }

    @XmlElement
    public BuyerModel getBuyer() {
        return buyer;
    }

    public void setBuyer(BuyerModel buyer) {
        this.buyer = buyer;
    }

    @XmlElement
    public TransportModel getTransport() {
        return transport;
    }

    public void setTransport(TransportModel transport) {
        this.transport = transport;
    }

    @XmlElement
    public AdditionalInformationModel getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(AdditionalInformationModel additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    @XmlElement
    public List<ItemModel> getItems() {
        return items;
    }

    public void setItems(List<ItemModel> items) {
        this.items = items;
    }

    @XmlElement
    public TotalsModel getTotals() {
        return totals;
    }

    public void setTotals(TotalsModel totals) {
        this.totals = totals;
    }

    @XmlElement
    public BillingModel getBilling() {
        return billing;
    }

    public void setBilling(BillingModel billing) {
        this.billing = billing;
    }

    @XmlElement
    public IssuerModel getIssuer() {
        return issuer;
    }

    public void setIssuer(IssuerModel issuer) {
        this.issuer = issuer;
    }

    @XmlElement
    public TransactionIntermediateModel getTransactionIntermediate() {
        return transactionIntermediate;
    }

    public void setTransactionIntermediate(TransactionIntermediateModel transactionIntermediate) {
        this.transactionIntermediate = transactionIntermediate;
    }

    @Override
    public String toString() {
        return "PaymentModel{" +
                "id='" + id + '\'' +
                ", payment=" + payment +
                ", serie=" + serie +
                ", number=" + number +
                ", operationOn=" + operationOn +
                ", operationNature='" + operationNature + '\'' +
                ", operationType='" + operationType + '\'' +
                ", destination=" + destination +
                ", printType=" + printType +
                ", purposeType=" + purposeType +
                ", consumerType='" + consumerType + '\'' +
                ", presenceType=" + presenceType +
                ", contingencyOn=" + contingencyOn +
                ", contingencyJustification='" + contingencyJustification + '\'' +
                ", buyer=" + buyer +
                ", transport=" + transport +
                ", additionalInformation=" + additionalInformation +
                ", items=" + items +
                ", totals=" + totals +
                ", billing=" + billing +
                ", issuer=" + issuer +
                ", transactionIntermediate=" + transactionIntermediate +
                '}';
    }
}
