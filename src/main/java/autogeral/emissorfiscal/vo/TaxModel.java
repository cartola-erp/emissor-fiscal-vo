package autogeral.emissorfiscal.vo;

public class TaxModel {

    private double totalTax;
    private IcmsModel icms;
    private IpiModel ipi;
    private IiModel ii;
    private PisModel pis;
    private CofinsModel cofins;
    private IcmsDestinationModel icmsDestination;

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }

    public IcmsModel getIcms() {
        return icms;
    }

    public void setIcms(IcmsModel icms) {
        this.icms = icms;
    }

    public IpiModel getIpi() {
        return ipi;
    }

    public void setIpi(IpiModel ipi) {
        this.ipi = ipi;
    }

    public IiModel getIi() {
        return ii;
    }

    public void setIi(IiModel ii) {
        this.ii = ii;
    }

    public PisModel getPis() {
        return pis;
    }

    public void setPis(PisModel pis) {
        this.pis = pis;
    }

    public CofinsModel getCofins() {
        return cofins;
    }

    public void setCofins(CofinsModel cofins) {
        this.cofins = cofins;
    }

    public IcmsDestinationModel getIcmsDestination() {
        return icmsDestination;
    }

    public void setIcmsDestination(IcmsDestinationModel icmsDestination) {
        this.icmsDestination = icmsDestination;
    }

    @Override
    public String toString() {
        return "TaxModel{" +
                "totalTax=" + totalTax +
                ", icms=" + icms +
                ", ipi=" + ipi +
                ", ii=" + ii +
                ", pis=" + pis +
                ", cofins=" + cofins +
                ", icmsDestination=" + icmsDestination +
                '}';
    }
}
