package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ProdModel implements Serializable {

    private static final long serialVersionUID = 1L;

    //39
    @JsonProperty("cProd")
    private String cProd;

    @JsonProperty("cEAN")
    private String cEAN;

    @JsonProperty("cBarra")
    private String cBarra;

    @JsonProperty("xProd")
    private String xProd;

    @JsonProperty("NCM")
    private String ncm;

    @JsonProperty("NVE")
    private String nve;

    @JsonProperty("CEST")
    private String cest;

    @JsonProperty("indEscala")
    private String indEscala;

    @JsonProperty("CNPJFab")
    private String cnpjFab;

    @JsonProperty("cBenef")
    private String cBenef;

    @JsonProperty("EXTIPI")
    private String extTipi;

    @JsonProperty("CFOP")
    private String cfop;

    @JsonProperty("uCom")
    private String uCom;

    @JsonProperty("qCom")
    private String qCom;

    @JsonProperty("vUnCom")
    private String vUnCom;

    @JsonProperty("vProd")
    private String vProd;

    @JsonProperty("cEANTrib")
    private String cEANTrib;

    @JsonProperty("cBarraTrib")
    private String cBarraTrib;

    @JsonProperty("uTrib")
    private String uTrib;

    @JsonProperty("qTrib")
    private String qTrib;

    @JsonProperty("vUnTrib")
    private String vUnTrib;

    @JsonProperty("vFrete")
    private String vFrete;

    @JsonProperty("vSeg")
    private String vSeg;

    @JsonProperty("vDesc")
    private String vDesc;

    @JsonProperty("vOutro")
    private String vOutro;

    @JsonProperty("indTot")
    private String indTot;

    @JsonProperty("DI")
    private String di;

    @JsonProperty("detExport")
    private String detExport;

    @JsonProperty("xPed")
    private String xPed;

    @JsonProperty("nItemPed")
    private String nItemPed;

    @JsonProperty("nFCI")
    private String nFCI;

    @JsonProperty("rastro")
    private String rastro;

    @JsonProperty("infProdNFF")
    private String infProdNFF;

    @JsonProperty("infProdEmb")
    private String infProdEmb;

    @JsonProperty("veicProd")
    private String veicProd;

    @JsonProperty("med")
    private String med;

    @JsonProperty("arma")
    private String arma;

    @JsonProperty("comb")
    private String comb;

    @JsonProperty("nRECOPI")
    private String nRECOPI;

    public String getcProd() {
        return cProd;
    }

    public void setcProd(String cProd) {
        this.cProd = cProd;
    }

    public String getcEAN() {
        return cEAN;
    }

    public void setcEAN(String cEAN) {
        this.cEAN = cEAN;
    }

    public String getcBarra() {
        return cBarra;
    }

    public void setcBarra(String cBarra) {
        this.cBarra = cBarra;
    }

    public String getxProd() {
        return xProd;
    }

    public void setxProd(String xProd) {
        this.xProd = xProd;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getNve() {
        return nve;
    }

    public void setNve(String nve) {
        this.nve = nve;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    public String getIndEscala() {
        return indEscala;
    }

    public void setIndEscala(String indEscala) {
        this.indEscala = indEscala;
    }

    public String getCnpjFab() {
        return cnpjFab;
    }

    public void setCnpjFab(String cnpjFab) {
        this.cnpjFab = cnpjFab;
    }

    public String getcBenef() {
        return cBenef;
    }

    public void setcBenef(String cBenef) {
        this.cBenef = cBenef;
    }

    public String getExtTipi() {
        return extTipi;
    }

    public void setExtTipi(String extTipi) {
        this.extTipi = extTipi;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getuCom() {
        return uCom;
    }

    public void setuCom(String uCom) {
        this.uCom = uCom;
    }

    public String getqCom() {
        return qCom;
    }

    public void setqCom(String qCom) {
        this.qCom = qCom;
    }

    public String getvUnCom() {
        return vUnCom;
    }

    public void setvUnCom(String vUnCom) {
        this.vUnCom = vUnCom;
    }

    public String getvProd() {
        return vProd;
    }

    public void setvProd(String vProd) {
        this.vProd = vProd;
    }

    public String getcEANTrib() {
        return cEANTrib;
    }

    public void setcEANTrib(String cEANTrib) {
        this.cEANTrib = cEANTrib;
    }

    public String getcBarraTrib() {
        return cBarraTrib;
    }

    public void setcBarraTrib(String cBarraTrib) {
        this.cBarraTrib = cBarraTrib;
    }

    public String getuTrib() {
        return uTrib;
    }

    public void setuTrib(String uTrib) {
        this.uTrib = uTrib;
    }

    public String getqTrib() {
        return qTrib;
    }

    public void setqTrib(String qTrib) {
        this.qTrib = qTrib;
    }

    public String getvUnTrib() {
        return vUnTrib;
    }

    public void setvUnTrib(String vUnTrib) {
        this.vUnTrib = vUnTrib;
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

    public String getvOutro() {
        return vOutro;
    }

    public void setvOutro(String vOutro) {
        this.vOutro = vOutro;
    }

    public String getIndTot() {
        return indTot;
    }

    public void setIndTot(String indTot) {
        this.indTot = indTot;
    }

    public String getDi() {
        return di;
    }

    public void setDi(String di) {
        this.di = di;
    }

    public String getDetExport() {
        return detExport;
    }

    public void setDetExport(String detExport) {
        this.detExport = detExport;
    }

    public String getxPed() {
        return xPed;
    }

    public void setxPed(String xPed) {
        this.xPed = xPed;
    }

    public String getnItemPed() {
        return nItemPed;
    }

    public void setnItemPed(String nItemPed) {
        this.nItemPed = nItemPed;
    }

    public String getnFCI() {
        return nFCI;
    }

    public void setnFCI(String nFCI) {
        this.nFCI = nFCI;
    }

    public String getRastro() {
        return rastro;
    }

    public void setRastro(String rastro) {
        this.rastro = rastro;
    }

    public String getInfProdNFF() {
        return infProdNFF;
    }

    public void setInfProdNFF(String infProdNFF) {
        this.infProdNFF = infProdNFF;
    }

    public String getInfProdEmb() {
        return infProdEmb;
    }

    public void setInfProdEmb(String infProdEmb) {
        this.infProdEmb = infProdEmb;
    }

    public String getVeicProd() {
        return veicProd;
    }

    public void setVeicProd(String veicProd) {
        this.veicProd = veicProd;
    }

    public String getMed() {
        return med;
    }

    public void setMed(String med) {
        this.med = med;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getComb() {
        return comb;
    }

    public void setComb(String comb) {
        this.comb = comb;
    }

    public String getnRECOPI() {
        return nRECOPI;
    }

    public void setnRECOPI(String nRECOPI) {
        this.nRECOPI = nRECOPI;
    }

    @Override
    public String toString() {
        return "ProdModel{" +
                "cProd='" + cProd + '\'' +
                ", cEAN='" + cEAN + '\'' +
                ", cBarra='" + cBarra + '\'' +
                ", xProd='" + xProd + '\'' +
                ", ncm='" + ncm + '\'' +
                ", nve='" + nve + '\'' +
                ", cest='" + cest + '\'' +
                ", indEscala='" + indEscala + '\'' +
                ", cnpjFab='" + cnpjFab + '\'' +
                ", cBenef='" + cBenef + '\'' +
                ", extTipi='" + extTipi + '\'' +
                ", cfop='" + cfop + '\'' +
                ", uCom='" + uCom + '\'' +
                ", qCom='" + qCom + '\'' +
                ", vUnCom='" + vUnCom + '\'' +
                ", vProd='" + vProd + '\'' +
                ", cEANTrib='" + cEANTrib + '\'' +
                ", cBarraTrib='" + cBarraTrib + '\'' +
                ", uTrib='" + uTrib + '\'' +
                ", qTrib='" + qTrib + '\'' +
                ", vUnTrib='" + vUnTrib + '\'' +
                ", vFrete='" + vFrete + '\'' +
                ", vSeg='" + vSeg + '\'' +
                ", vDesc='" + vDesc + '\'' +
                ", vOutro='" + vOutro + '\'' +
                ", indTot='" + indTot + '\'' +
                ", di='" + di + '\'' +
                ", detExport='" + detExport + '\'' +
                ", xPed='" + xPed + '\'' +
                ", nItemPed='" + nItemPed + '\'' +
                ", nFCI='" + nFCI + '\'' +
                ", rastro='" + rastro + '\'' +
                ", infProdNFF='" + infProdNFF + '\'' +
                ", infProdEmb='" + infProdEmb + '\'' +
                ", veicProd='" + veicProd + '\'' +
                ", med='" + med + '\'' +
                ", arma='" + arma + '\'' +
                ", comb='" + comb + '\'' +
                ", nRECOPI='" + nRECOPI + '\'' +
                '}';
    }
}
