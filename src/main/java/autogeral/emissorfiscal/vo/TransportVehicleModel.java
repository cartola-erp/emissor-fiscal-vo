package autogeral.emissorfiscal.vo;

public class TransportVehicleModel {

    private String plate;
    private String state;
    private String rntc;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRntc() {
        return rntc;
    }

    public void setRntc(String rntc) {
        this.rntc = rntc;
    }

    @Override
    public String toString() {
        return "TransportVehicleModel{" +
                "plate='" + plate + '\'' +
                ", state='" + state + '\'' +
                ", rntc='" + rntc + '\'' +
                '}';
    }
}
