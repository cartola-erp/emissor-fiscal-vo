package autogeral.emissorfiscal.vo.model.nfce;

import java.util.List;

public class ItemModel {

    private String code;
    private String codeGTIN;
    private String description;
    private String ncm;
    private List<String> nve;
    private String exTipi;
    private int cfop;
    private String unit;
    private int quantity;
    private double unitAmount;
    private double totalAmount;
    private String codeTaxGTIN;
    private String unitTax;
    private int quantityTax;
    private double taxUnitAmount;
    private double freightAmount;
    private double insuranceAmount;
    private double discountAmount;
    private double othersAmount;
    private boolean totalIndicator;
    private String cest;
    private TaxModel tax;
    private String additionalInformation;
    private String numberOrderBuy;
    private int itemNumberOrderBuy;
    private String importControlSheetNumber;
    private FuelDetailModel fuelDetail;
    private String benefit;
    private List<ImportDeclarationModel> importDeclarations;
    private List<ExportDetailModel> exportDetails;
    private TaxDeterminationModel taxDetermination;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeGTIN() {
        return codeGTIN;
    }

    public void setCodeGTIN(String codeGTIN) {
        this.codeGTIN = codeGTIN;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public List<String> getNve() {
        return nve;
    }

    public void setNve(List<String> nve) {
        this.nve = nve;
    }

    public String getExTipi() {
        return exTipi;
    }

    public void setExTipi(String exTipi) {
        this.exTipi = exTipi;
    }

    public int getCfop() {
        return cfop;
    }

    public void setCfop(int cfop) {
        this.cfop = cfop;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(double unitAmount) {
        this.unitAmount = unitAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCodeTaxGTIN() {
        return codeTaxGTIN;
    }

    public void setCodeTaxGTIN(String codeTaxGTIN) {
        this.codeTaxGTIN = codeTaxGTIN;
    }

    public String getUnitTax() {
        return unitTax;
    }

    public void setUnitTax(String unitTax) {
        this.unitTax = unitTax;
    }

    public int getQuantityTax() {
        return quantityTax;
    }

    public void setQuantityTax(int quantityTax) {
        this.quantityTax = quantityTax;
    }

    public double getTaxUnitAmount() {
        return taxUnitAmount;
    }

    public void setTaxUnitAmount(double taxUnitAmount) {
        this.taxUnitAmount = taxUnitAmount;
    }

    public double getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(double freightAmount) {
        this.freightAmount = freightAmount;
    }

    public double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getOthersAmount() {
        return othersAmount;
    }

    public void setOthersAmount(double othersAmount) {
        this.othersAmount = othersAmount;
    }

    public boolean isTotalIndicator() {
        return totalIndicator;
    }

    public void setTotalIndicator(boolean totalIndicator) {
        this.totalIndicator = totalIndicator;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    public TaxModel getTax() {
        return tax;
    }

    public void setTax(TaxModel tax) {
        this.tax = tax;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getNumberOrderBuy() {
        return numberOrderBuy;
    }

    public void setNumberOrderBuy(String numberOrderBuy) {
        this.numberOrderBuy = numberOrderBuy;
    }

    public int getItemNumberOrderBuy() {
        return itemNumberOrderBuy;
    }

    public void setItemNumberOrderBuy(int itemNumberOrderBuy) {
        this.itemNumberOrderBuy = itemNumberOrderBuy;
    }

    public String getImportControlSheetNumber() {
        return importControlSheetNumber;
    }

    public void setImportControlSheetNumber(String importControlSheetNumber) {
        this.importControlSheetNumber = importControlSheetNumber;
    }

    public FuelDetailModel getFuelDetail() {
        return fuelDetail;
    }

    public void setFuelDetail(FuelDetailModel fuelDetail) {
        this.fuelDetail = fuelDetail;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public List<ImportDeclarationModel> getImportDeclarations() {
        return importDeclarations;
    }

    public void setImportDeclarations(List<ImportDeclarationModel> importDeclarations) {
        this.importDeclarations = importDeclarations;
    }

    public List<ExportDetailModel> getExportDetails() {
        return exportDetails;
    }

    public void setExportDetails(List<ExportDetailModel> exportDetails) {
        this.exportDetails = exportDetails;
    }

    public TaxDeterminationModel getTaxDetermination() {
        return taxDetermination;
    }

    public void setTaxDetermination(TaxDeterminationModel taxDetermination) {
        this.taxDetermination = taxDetermination;
    }

    @Override
    public String toString() {
        return "ItemModel{" +
                "code='" + code + '\'' +
                ", codeGTIN='" + codeGTIN + '\'' +
                ", description='" + description + '\'' +
                ", ncm='" + ncm + '\'' +
                ", nve=" + nve +
                ", exTipi='" + exTipi + '\'' +
                ", cfop=" + cfop +
                ", unit='" + unit + '\'' +
                ", quantity=" + quantity +
                ", unitAmount=" + unitAmount +
                ", totalAmount=" + totalAmount +
                ", codeTaxGTIN='" + codeTaxGTIN + '\'' +
                ", unitTax='" + unitTax + '\'' +
                ", quantityTax=" + quantityTax +
                ", taxUnitAmount=" + taxUnitAmount +
                ", freightAmount=" + freightAmount +
                ", insuranceAmount=" + insuranceAmount +
                ", discountAmount=" + discountAmount +
                ", othersAmount=" + othersAmount +
                ", totalIndicator=" + totalIndicator +
                ", cest='" + cest + '\'' +
                ", tax=" + tax +
                ", additionalInformation='" + additionalInformation + '\'' +
                ", numberOrderBuy='" + numberOrderBuy + '\'' +
                ", itemNumberOrderBuy=" + itemNumberOrderBuy +
                ", importControlSheetNumber='" + importControlSheetNumber + '\'' +
                ", fuelDetail=" + fuelDetail +
                ", benefit='" + benefit + '\'' +
                ", importDeclarations=" + importDeclarations +
                ", exportDetails=" + exportDetails +
                ", taxDetermination=" + taxDetermination +
                '}';
    }
}
