package autogeral.emissorfiscal.vo.model.nfceByNfeIo;

public class VolumeModel {

    private int volumeQuantity;
    private String species;
    private String brand;
    private String volumeNumeration;
    private double netWeight;
    private double grossWeight;

    public int getVolumeQuantity() {
        return volumeQuantity;
    }

    public void setVolumeQuantity(int volumeQuantity) {
        this.volumeQuantity = volumeQuantity;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVolumeNumeration() {
        return volumeNumeration;
    }

    public void setVolumeNumeration(String volumeNumeration) {
        this.volumeNumeration = volumeNumeration;
    }

    public double getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(double netWeight) {
        this.netWeight = netWeight;
    }

    public double getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }

    @Override
    public String toString() {
        return "VolumeModel{" +
                "volumeQuantity=" + volumeQuantity +
                ", species='" + species + '\'' +
                ", brand='" + brand + '\'' +
                ", volumeNumeration='" + volumeNumeration + '\'' +
                ", netWeight=" + netWeight +
                ", grossWeight=" + grossWeight +
                '}';
    }
}
