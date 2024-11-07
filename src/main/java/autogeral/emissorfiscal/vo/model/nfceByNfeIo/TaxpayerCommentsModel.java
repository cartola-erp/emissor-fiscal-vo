package autogeral.emissorfiscal.vo.model.nfceByNfeIo;

public class TaxpayerCommentsModel {

    private String field;
    private String text;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "TaxpayerCommentsModel{" +
                "field='" + field + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
