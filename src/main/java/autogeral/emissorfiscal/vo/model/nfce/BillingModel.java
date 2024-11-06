package autogeral.emissorfiscal.vo.model.nfce;

import java.util.List;

public class BillingModel {

    private BillModel bill;
    private List<DuplicateModel> duplicates;

    public BillModel getBill() {
        return bill;
    }

    public void setBill(BillModel bill) {
        this.bill = bill;
    }

    public List<DuplicateModel> getDuplicates() {
        return duplicates;
    }

    public void setDuplicates(List<DuplicateModel> duplicates) {
        this.duplicates = duplicates;
    }

    @Override
    public String toString() {
        return "BillingModel{" +
                "bill=" + bill +
                ", duplicates=" + duplicates +
                '}';
    }
}
