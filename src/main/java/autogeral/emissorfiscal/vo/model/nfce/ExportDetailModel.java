package autogeral.emissorfiscal.vo.model.nfce;

public class ExportDetailModel {

    private String drawback;
    private HintInformationModel hintInformsation;

    public String getDrawback() {
        return drawback;
    }

    public void setDrawback(String drawback) {
        this.drawback = drawback;
    }

    public HintInformationModel getHintInformsation() {
        return hintInformsation;
    }

    public void setHintInformsation(HintInformationModel hintInformsation) {
        this.hintInformsation = hintInformsation;
    }

    @Override
    public String toString() {
        return "ExportDetailModel{" +
                "drawback='" + drawback + '\'' +
                ", hintInformsation=" + hintInformsation +
                '}';
    }
}
