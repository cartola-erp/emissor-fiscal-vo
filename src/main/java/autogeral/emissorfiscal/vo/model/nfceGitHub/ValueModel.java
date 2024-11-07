package autogeral.emissorfiscal.vo.model.nfceGitHub;

public class ValueModel {

    private Icms00Model ICMS00;
    private PisAliqModel PISAliq;
    private CofinsAliqModel COFINSAliq;

    public Icms00Model getICMS00() {
        return ICMS00;
    }

    public void setICMS00(Icms00Model ICMS00) {
        this.ICMS00 = ICMS00;
    }

    public PisAliqModel getPISAliq() {
        return PISAliq;
    }

    public void setPISAliq(PisAliqModel PISAliq) {
        this.PISAliq = PISAliq;
    }

    public CofinsAliqModel getCOFINSAliq() {
        return COFINSAliq;
    }

    public void setCOFINSAliq(CofinsAliqModel COFINSAliq) {
        this.COFINSAliq = COFINSAliq;
    }

    @Override
    public String toString() {
        return "ValueModel{" +
                "ICMS00=" + ICMS00 +
                ", PISAliq=" + PISAliq +
                ", COFINSAliq=" + COFINSAliq +
                '}';
    }
}
