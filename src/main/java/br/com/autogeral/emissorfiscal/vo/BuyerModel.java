package br.com.autogeral.emissorfiscal.vo;

public class BuyerModel {

        private String accountId;
        private String id;
        private String name;
        private long federalTaxNumber;
        private String email;
        private AddressModel address;
        private String type;
        private String stateTaxNumberIndicator;
        private String tradeName;
        private boolean taxRegime;
        private String stateTaxNumber;

        // getters and setters\
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

        public String getStateTaxNumberIndicator() {
                return stateTaxNumberIndicator;
        }

        public void setStateTaxNumberIndicator(String stateTaxNumberIndicator) {
                this.stateTaxNumberIndicator = stateTaxNumberIndicator;
        }

        public String getTradeName() {
                return tradeName;
        }

        public void setTradeName(String tradeName) {
                this.tradeName = tradeName;
        }

        public boolean isTaxRegime() {
                return taxRegime;
        }

        public void setTaxRegime(boolean taxRegime) {
                this.taxRegime = taxRegime;
        }

        public String getStateTaxNumber() {
                return stateTaxNumber;
        }

        public void setStateTaxNumber(String stateTaxNumber) {
                this.stateTaxNumber = stateTaxNumber;
        }

        @Override
        public String toString() {
                return "BuyerModel{" +
                        "accountId='" + accountId + '\'' +
                        ", id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", federalTaxNumber=" + federalTaxNumber +
                        ", email='" + email + '\'' +
                        ", address=" + address +
                        ", type='" + type + '\'' +
                        ", stateTaxNumberIndicator='" + stateTaxNumberIndicator + '\'' +
                        ", tradeName='" + tradeName + '\'' +
                        ", taxRegime=" + taxRegime +
                        ", stateTaxNumber='" + stateTaxNumber + '\'' +
                        '}';
        }
}
