package autogeral.emissorfiscal.vo.model.nfceByNfeIo;

import java.time.LocalDateTime;
import java.util.List;

public class PaymentModel {

    private String id;
    private List<PaymentsModel> payment;
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

    public List<PaymentsModel> getPayment() {
        return payment;
    }

    public void setPayment(List<PaymentsModel> payment) {
        this.payment = payment;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDateTime getOperationOn() {
        return operationOn;
    }

    public void setOperationOn(LocalDateTime operationOn) {
        this.operationOn = operationOn;
    }

    public String getOperationNature() {
        return operationNature;
    }

    public void setOperationNature(String operationNature) {
        this.operationNature = operationNature;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String isDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String isPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String isPurposeType() {
        return purposeType;
    }

    public void setPurposeType(String purposeType) {
        this.purposeType = purposeType;
    }

    public String getConsumerType() {
        return consumerType;
    }

    public void setConsumerType(String consumerType) {
        this.consumerType = consumerType;
    }

    public String isPresenceType() {
        return presenceType;
    }

    public void setPresenceType(String presenceType) {
        this.presenceType = presenceType;
    }

    public LocalDateTime getContingencyOn() {
        return contingencyOn;
    }

    public void setContingencyOn(LocalDateTime contingencyOn) {
        this.contingencyOn = contingencyOn;
    }

    public String getContingencyJustification() {
        return contingencyJustification;
    }

    public void setContingencyJustification(String contingencyJustification) {
        this.contingencyJustification = contingencyJustification;
    }

    public BuyerModel getBuyer() {
        return buyer;
    }

    public void setBuyer(BuyerModel buyer) {
        this.buyer = buyer;
    }

    public TransportModel getTransport() {
        return transport;
    }

    public void setTransport(TransportModel transport) {
        this.transport = transport;
    }

    public AdditionalInformationModel getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(AdditionalInformationModel additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public List<ItemModel> getItems() {
        return items;
    }

    public void setItems(List<ItemModel> items) {
        this.items = items;
    }

    public TotalsModel getTotals() {
        return totals;
    }

    public void setTotals(TotalsModel totals) {
        this.totals = totals;
    }

    public BillingModel getBilling() {
        return billing;
    }

    public void setBilling(BillingModel billing) {
        this.billing = billing;
    }

    public IssuerModel getIssuer() {
        return issuer;
    }

    public void setIssuer(IssuerModel issuer) {
        this.issuer = issuer;
    }

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
