package autogeral.emissorfiscal.vo;

import java.time.LocalDateTime;
import java.util.List;

public class InvoiceModel {

    private String modeloNota;

    private String finalidadeNota;

    private String codigoLoja;

    private String ufOrigem;

    private String numeroDeSerie;

    private String chaveDaNota;

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

    private EmitModel emitente;

    private TransactionIntermediateModel transactionIntermediate;

    public String getModeloNota() {
        return modeloNota;
    }

    public void setModeloNota(String modeloNota) {
        this.modeloNota = modeloNota;
    }

    public String getFinalidadeNota() {
        return finalidadeNota;
    }

    public void setFinalidadeNota(String finalidadeNota) {
        this.finalidadeNota = finalidadeNota;
    }

    public String getCodigoLoja() {
        return codigoLoja;
    }

    public void setCodigoLoja(String codigoLoja) {
        this.codigoLoja = codigoLoja;
    }

    public List<PaymentModel> getPayment() {
        return payment;
    }

    public void setPayment(List<PaymentModel> payment) {
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


    public String getIsDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    public String getIsPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }


    public String getIsPurposeType() {
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


    public String getIsPresenceType() {
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


    public EmitModel getEmitente() {
        return emitente;
    }

    public void setEmitente(EmitModel emitente) {
        this.emitente = emitente;
    }


    public TransactionIntermediateModel getTransactionIntermediate() {
        return transactionIntermediate;
    }

    public void setTransactionIntermediate(TransactionIntermediateModel transactionIntermediate) {
        this.transactionIntermediate = transactionIntermediate;
    }

    public String getUfOrigem() {
        return ufOrigem;
    }

    public void setUfOrigem(String ufOrigem) {
        this.ufOrigem = ufOrigem;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getChaveDaNota() {
        return chaveDaNota;
    }

    public void setChaveDaNota(String chaveDaNota) {
        this.chaveDaNota = chaveDaNota;
    }

    @Override
    public String toString() {
        return "InvoiceModel{" +
                "modeloNota='" + modeloNota + '\'' +
                ", finalidadeNota='" + finalidadeNota + '\'' +
                ", codigoLoja='" + codigoLoja + '\'' +
                ", ufOrigem='" + ufOrigem + '\'' +
                ", numeroDeSerie='" + numeroDeSerie + '\'' +
                ", chaveDaNota='" + chaveDaNota + '\'' +
                ", payment=" + payment +
                ", serie=" + serie +
                ", number=" + number +
                ", operationOn=" + operationOn +
                ", operationNature='" + operationNature + '\'' +
                ", operationType='" + operationType + '\'' +
                ", destination='" + destination + '\'' +
                ", printType='" + printType + '\'' +
                ", purposeType='" + purposeType + '\'' +
                ", consumerType='" + consumerType + '\'' +
                ", presenceType='" + presenceType + '\'' +
                ", contingencyOn=" + contingencyOn +
                ", contingencyJustification='" + contingencyJustification + '\'' +
                ", buyer=" + buyer +
                ", transport=" + transport +
                ", additionalInformation=" + additionalInformation +
                ", items=" + items +
                ", totals=" + totals +
                ", billing=" + billing +
                ", emitente=" + emitente +
                ", transactionIntermediate=" + transactionIntermediate +
                '}';
    }
}
