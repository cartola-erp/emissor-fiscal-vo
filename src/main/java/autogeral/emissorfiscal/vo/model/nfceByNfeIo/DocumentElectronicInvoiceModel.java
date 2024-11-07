package autogeral.emissorfiscal.vo.model.nfceByNfeIo;

public class DocumentElectronicInvoiceModel {
    private String accessKey;

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    @Override
    public String toString() {
        return "DocumentElectronicInvoiceModel{" +
                "accessKey='" + accessKey + '\'' +
                '}';
    }
}
