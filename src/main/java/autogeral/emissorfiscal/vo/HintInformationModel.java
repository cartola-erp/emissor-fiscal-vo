package autogeral.emissorfiscal.vo;

public class HintInformationModel {

    private String registryId;
    private String accessKey;
    private Integer quantity;

    public String getRegistryId() {
        return registryId;
    }

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "HintInformationModel{" +
                "registryId='" + registryId + '\'' +
                ", accessKey='" + accessKey + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
