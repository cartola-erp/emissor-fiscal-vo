package br.com.autogeral.emissorfiscal.vo;

public class TotalsModel {

    private IcmsModel icms;
    private IssqnModel issqn;

    // TOTAIS REALAMENTE UTILIZADOS

    private String vBc;
    private String vIcms;
    private String vIcmsDeson;
    private String vFcp;
    private String vBcst;
    private String vSt;
    private String vFcpSt;
    private String vFcpStRet;
    private String vProd;
    private String vFrete;
    private String vSeg;
    private String vDesc;
    private String vII;
    private String vIpi;
    private String vIpiDevol;
    private String vPis;
    private String vCofins;
    private String vOutro;
    private String vTotTrib;
    private String vNf;

    public String getvTotTrib() {
        return vTotTrib;
    }

    public void setvTotTrib(String vTotTrib) {
        this.vTotTrib = vTotTrib;
    }

    public String getvBc() {
        return vBc;
    }

    public void setvBc(String vBc) {
        this.vBc = vBc;
    }

    public String getvIcms() {
        return vIcms;
    }

    public void setvIcms(String vIcms) {
        this.vIcms = vIcms;
    }

    public String getvIcmsDeson() {
        return vIcmsDeson;
    }

    public void setvIcmsDeson(String vIcmsDeson) {
        this.vIcmsDeson = vIcmsDeson;
    }

    public String getvFcp() {
        return vFcp;
    }

    public void setvFcp(String vFcp) {
        this.vFcp = vFcp;
    }

    public String getvBcst() {
        return vBcst;
    }

    public void setvBcst(String vBcst) {
        this.vBcst = vBcst;
    }

    public String getvSt() {
        return vSt;
    }

    public void setvSt(String vSt) {
        this.vSt = vSt;
    }

    public String getvFcpSt() {
        return vFcpSt;
    }

    public void setvFcpSt(String vFcpSt) {
        this.vFcpSt = vFcpSt;
    }

    public String getvFcpStRet() {
        return vFcpStRet;
    }

    public void setvFcpStRet(String vFcpStRet) {
        this.vFcpStRet = vFcpStRet;
    }

    public String getvProd() {
        return vProd;
    }

    public void setvProd(String vProd) {
        this.vProd = vProd;
    }

    public String getvFrete() {
        return vFrete;
    }

    public void setvFrete(String vFrete) {
        this.vFrete = vFrete;
    }

    public String getvSeg() {
        return vSeg;
    }

    public void setvSeg(String vSeg) {
        this.vSeg = vSeg;
    }

    public String getvDesc() {
        return vDesc;
    }

    public void setvDesc(String vDesc) {
        this.vDesc = vDesc;
    }

    public String getvII() {
        return vII;
    }

    public void setvII(String vII) {
        this.vII = vII;
    }

    public String getvIpi() {
        return vIpi;
    }

    public void setvIpi(String vIpi) {
        this.vIpi = vIpi;
    }

    public String getvIpiDevol() {
        return vIpiDevol;
    }

    public void setvIpiDevol(String vIpiDevol) {
        this.vIpiDevol = vIpiDevol;
    }

    public String getvPis() {
        return vPis;
    }

    public void setvPis(String vPis) {
        this.vPis = vPis;
    }

    public String getvCofins() {
        return vCofins;
    }

    public void setvCofins(String vCofins) {
        this.vCofins = vCofins;
    }

    public String getvOutro() {
        return vOutro;
    }

    public void setvOutro(String vOutro) {
        this.vOutro = vOutro;
    }

    public String getvNf() {
        return vNf;
    }

    public void setvNf(String vNf) {
        this.vNf = vNf;
    }

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
                ", vBc='" + vBc + '\'' +
                ", vIcms='" + vIcms + '\'' +
                ", vIcmsDeson='" + vIcmsDeson + '\'' +
                ", vFcp='" + vFcp + '\'' +
                ", vBcst='" + vBcst + '\'' +
                ", vSt='" + vSt + '\'' +
                ", vFcpSt='" + vFcpSt + '\'' +
                ", vFcpStRet='" + vFcpStRet + '\'' +
                ", vProd='" + vProd + '\'' +
                ", vFrete='" + vFrete + '\'' +
                ", vSeg='" + vSeg + '\'' +
                ", vDesc='" + vDesc + '\'' +
                ", vII='" + vII + '\'' +
                ", vIpi='" + vIpi + '\'' +
                ", vIpiDevol='" + vIpiDevol + '\'' +
                ", vPis='" + vPis + '\'' +
                ", vCofins='" + vCofins + '\'' +
                ", vOutro='" + vOutro + '\'' +
                ", vNf='" + vNf + '\'' +
                '}';
    }
}
