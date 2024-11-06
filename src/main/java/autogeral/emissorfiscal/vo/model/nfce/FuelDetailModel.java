package autogeral.emissorfiscal.vo.model.nfce;

public class FuelDetailModel {

    private String codeANP;
    private double percentageNG;
    private String descriptionANP;
    private double percentageGLP;
    private double percentageNGn;
    private double percentageGNi;
    private double startingAmount;
    private String codif;
    private double amountTemp;
    private String stateBuyer;
    private CideModel cide;
    private PumpModel pump;
    private FuelOriginModel fuelOrigin;

    public String getCodeANP() {
        return codeANP;
    }

    public void setCodeANP(String codeANP) {
        this.codeANP = codeANP;
    }

    public double getPercentageNG() {
        return percentageNG;
    }

    public void setPercentageNG(double percentageNG) {
        this.percentageNG = percentageNG;
    }

    public String getDescriptionANP() {
        return descriptionANP;
    }

    public void setDescriptionANP(String descriptionANP) {
        this.descriptionANP = descriptionANP;
    }

    public double getPercentageGLP() {
        return percentageGLP;
    }

    public void setPercentageGLP(double percentageGLP) {
        this.percentageGLP = percentageGLP;
    }

    public double getPercentageNGn() {
        return percentageNGn;
    }

    public void setPercentageNGn(double percentageNGn) {
        this.percentageNGn = percentageNGn;
    }

    public double getPercentageGNi() {
        return percentageGNi;
    }

    public void setPercentageGNi(double percentageGNi) {
        this.percentageGNi = percentageGNi;
    }

    public double getStartingAmount() {
        return startingAmount;
    }

    public void setStartingAmount(double startingAmount) {
        this.startingAmount = startingAmount;
    }

    public String getCodif() {
        return codif;
    }

    public void setCodif(String codif) {
        this.codif = codif;
    }

    public double getAmountTemp() {
        return amountTemp;
    }

    public void setAmountTemp(double amountTemp) {
        this.amountTemp = amountTemp;
    }

    public String getStateBuyer() {
        return stateBuyer;
    }

    public void setStateBuyer(String stateBuyer) {
        this.stateBuyer = stateBuyer;
    }

    public CideModel getCide() {
        return cide;
    }

    public void setCide(CideModel cide) {
        this.cide = cide;
    }

    public PumpModel getPump() {
        return pump;
    }

    public void setPump(PumpModel pump) {
        this.pump = pump;
    }

    public FuelOriginModel getFuelOrigin() {
        return fuelOrigin;
    }

    public void setFuelOrigin(FuelOriginModel fuelOrigin) {
        this.fuelOrigin = fuelOrigin;
    }

    @Override
    public String toString() {
        return "FuelDetailModel{" +
                "codeANP='" + codeANP + '\'' +
                ", percentageNG=" + percentageNG +
                ", descriptionANP='" + descriptionANP + '\'' +
                ", percentageGLP=" + percentageGLP +
                ", percentageNGn=" + percentageNGn +
                ", percentageGNi=" + percentageGNi +
                ", startingAmount=" + startingAmount +
                ", codif='" + codif + '\'' +
                ", amountTemp=" + amountTemp +
                ", stateBuyer='" + stateBuyer + '\'' +
                ", cide=" + cide +
                ", pump=" + pump +
                ", fuelOrigin=" + fuelOrigin +
                '}';
    }
}
