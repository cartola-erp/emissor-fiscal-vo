package autogeral.emissorfiscal.vo.model.nfce;

public class FuelOriginModel {

    private Integer indImport;
    private Integer cUFOrig;
    private double pOrig;

    public Integer getIndImport() {
        return indImport;
    }

    public void setIndImport(Integer indImport) {
        this.indImport = indImport;
    }

    public Integer getcUFOrig() {
        return cUFOrig;
    }

    public void setcUFOrig(Integer cUFOrig) {
        this.cUFOrig = cUFOrig;
    }

    public double getpOrig() {
        return pOrig;
    }

    public void setpOrig(double pOrig) {
        this.pOrig = pOrig;
    }

    @Override
    public String toString() {
        return "FuelOriginModel{" +
                "indImport=" + indImport +
                ", cUFOrig=" + cUFOrig +
                ", pOrig=" + pOrig +
                '}';
    }
}
