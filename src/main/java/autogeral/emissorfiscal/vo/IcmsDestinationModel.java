package autogeral.emissorfiscal.vo;

public class IcmsDestinationModel {

    private double vBCUFDest;
    private double pFCPUFDest;
    private double pICMSUFDest;
    private double pICMSInter;
    private double pICMSInterPart;
    private double vFCPUFDest;
    private double vICMSUFDest;
    private double vICMSUFRemet;
    private double vBCFCPUFDest;

    public double getvBCUFDest() {
        return vBCUFDest;
    }

    public void setvBCUFDest(double vBCUFDest) {
        this.vBCUFDest = vBCUFDest;
    }

    public double getpFCPUFDest() {
        return pFCPUFDest;
    }

    public void setpFCPUFDest(double pFCPUFDest) {
        this.pFCPUFDest = pFCPUFDest;
    }

    public double getpICMSUFDest() {
        return pICMSUFDest;
    }

    public void setpICMSUFDest(double pICMSUFDest) {
        this.pICMSUFDest = pICMSUFDest;
    }

    public double getpICMSInter() {
        return pICMSInter;
    }

    public void setpICMSInter(double pICMSInter) {
        this.pICMSInter = pICMSInter;
    }

    public double getpICMSInterPart() {
        return pICMSInterPart;
    }

    public void setpICMSInterPart(double pICMSInterPart) {
        this.pICMSInterPart = pICMSInterPart;
    }

    public double getvFCPUFDest() {
        return vFCPUFDest;
    }

    public void setvFCPUFDest(double vFCPUFDest) {
        this.vFCPUFDest = vFCPUFDest;
    }

    public double getvICMSUFDest() {
        return vICMSUFDest;
    }

    public void setvICMSUFDest(double vICMSUFDest) {
        this.vICMSUFDest = vICMSUFDest;
    }

    public double getvICMSUFRemet() {
        return vICMSUFRemet;
    }

    public void setvICMSUFRemet(double vICMSUFRemet) {
        this.vICMSUFRemet = vICMSUFRemet;
    }

    public double getvBCFCPUFDest() {
        return vBCFCPUFDest;
    }

    public void setvBCFCPUFDest(double vBCFCPUFDest) {
        this.vBCFCPUFDest = vBCFCPUFDest;
    }

    @Override
    public String toString() {
        return "IcmsDestinationModel{" +
                "vBCUFDest=" + vBCUFDest +
                ", pFCPUFDest=" + pFCPUFDest +
                ", pICMSUFDest=" + pICMSUFDest +
                ", pICMSInter=" + pICMSInter +
                ", pICMSInterPart=" + pICMSInterPart +
                ", vFCPUFDest=" + vFCPUFDest +
                ", vICMSUFDest=" + vICMSUFDest +
                ", vICMSUFRemet=" + vICMSUFRemet +
                ", vBCFCPUFDest=" + vBCFCPUFDest +
                '}';
    }
}
