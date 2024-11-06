package autogeral.emissorfiscal.vo.model.nfce;

public class TotalsModel {

    private IcmsModel icms;
    private IssqnModel issqn;

    public IcmsModel getIcms() {
        return icms;
    }

    public void setIcms(IcmsModel icms) {
        this.icms = icms;
    }

    public IssqnModel getIssqn() {
        return issqn;
    }

    public void setIssqn(IssqnModel issqn) {
        this.issqn = issqn;
    }

    @Override
    public String toString() {
        return "TotalsModel{" +
                "icms=" + icms +
                ", issqn=" + issqn +
                '}';
    }
}
