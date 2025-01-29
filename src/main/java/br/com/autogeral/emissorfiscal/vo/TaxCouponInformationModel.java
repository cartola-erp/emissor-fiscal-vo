package br.com.autogeral.emissorfiscal.vo;

public class TaxCouponInformationModel {

    private String modelDocumentFiscal;
    private String orderECF;
    private int orderCountOperation;

    public String getModelDocumentFiscal() {
        return modelDocumentFiscal;
    }

    public void setModelDocumentFiscal(String modelDocumentFiscal) {
        this.modelDocumentFiscal = modelDocumentFiscal;
    }

    public String getOrderECF() {
        return orderECF;
    }

    public void setOrderECF(String orderECF) {
        this.orderECF = orderECF;
    }

    public int getOrderCountOperation() {
        return orderCountOperation;
    }

    public void setOrderCountOperation(int orderCountOperation) {
        this.orderCountOperation = orderCountOperation;
    }

    @Override
    public String toString() {
        return "TaxCouponInformationModel{" +
                "modelDocumentFiscal='" + modelDocumentFiscal + '\'' +
                ", orderECF='" + orderECF + '\'' +
                ", orderCountOperation=" + orderCountOperation +
                '}';
    }
}
