package autogeral.emissorfiscal.vo.model.nfce;

import java.time.LocalDateTime;

public class PaymentsDetailsModel {

    private String method;
    private String methodDescription;
    private String paymentType;
    private double amount;
    private CardModel card;
    private LocalDateTime paymentDate;
    private String federalTaxNumberPag;
    private String statePag;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getMethodDescription() {
        return methodDescription;
    }

    public void setMethodDescription(String methodDescription) {
        this.methodDescription = methodDescription;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getFederalTaxNumberPag() {
        return federalTaxNumberPag;
    }

    public void setFederalTaxNumberPag(String federalTaxNumberPag) {
        this.federalTaxNumberPag = federalTaxNumberPag;
    }

    public String getStatePag() {
        return statePag;
    }

    public void setStatePag(String statePag) {
        this.statePag = statePag;
    }

    @Override
    public String toString() {
        return "PaymentsDetailsModel{" +
                "method='" + method + '\'' +
                ", methodDescription='" + methodDescription + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", amount=" + amount +
                ", card=" + card +
                ", paymentDate=" + paymentDate +
                ", federalTaxNumberPag='" + federalTaxNumberPag + '\'' +
                ", statePag='" + statePag + '\'' +
                '}';
    }
}
