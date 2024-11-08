package autogeral.emissorfiscal.vo;

import java.util.List;

public class PaymentModel {

    private List<PaymentsDetailsModel> paymentDetail;
    private double payBack;

    public List<PaymentsDetailsModel> getPaymentDetail() {
        return paymentDetail;
    }

    public void setPaymentDetail(List<PaymentsDetailsModel> paymentDetail) {
        this.paymentDetail = paymentDetail;
    }

    public double getPayBack() {
        return payBack;
    }

    public void setPayBack(double payBack) {
        this.payBack = payBack;
    }

    @Override
    public String toString() {
        return "PaymentsModel{" +
                "paymentDetail=" + paymentDetail +
                ", payBack=" + payBack +
                '}';
    }
}
