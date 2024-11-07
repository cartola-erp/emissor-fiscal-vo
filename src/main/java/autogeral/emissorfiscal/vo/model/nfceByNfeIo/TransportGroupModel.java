package autogeral.emissorfiscal.vo.model.nfceByNfeIo;

public class TransportGroupModel {

    private String accountId;
    private String id;
    private String name;
    private long federalTaxNumber;
    private String email;
    private AddressModel address;
    private String type;
    private String stateTaxNumber;
    private String transportRetention;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getFederalTaxNumber() {
        return federalTaxNumber;
    }

    public void setFederalTaxNumber(long federalTaxNumber) {
        this.federalTaxNumber = federalTaxNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStateTaxNumber() {
        return stateTaxNumber;
    }

    public void setStateTaxNumber(String stateTaxNumber) {
        this.stateTaxNumber = stateTaxNumber;
    }

    public String getTransportRetention() {
        return transportRetention;
    }

    public void setTransportRetention(String transportRetention) {
        this.transportRetention = transportRetention;
    }

    @Override
    public String toString() {
        return "TransportGroupModel{" +
                "accountId='" + accountId + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", federalTaxNumber=" + federalTaxNumber +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", type='" + type + '\'' +
                ", stateTaxNumber='" + stateTaxNumber + '\'' +
                ", transportRetention='" + transportRetention + '\'' +
                '}';
    }
}
