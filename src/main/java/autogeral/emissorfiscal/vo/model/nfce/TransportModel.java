package autogeral.emissorfiscal.vo.model.nfce;

public class TransportModel {

    private String freightModality;
    private TransportGroupModel transportGroup;
    private ReboqueModel reboque;
    private VolumeModel volume;
    private TransportVehicleModel transportVehicle;
    private String sealNumber;
    private TranspRateModel transpRate;

    public String getFreightModality() {
        return freightModality;
    }

    public void setFreightModality(String freightModality) {
        this.freightModality = freightModality;
    }

    public TransportGroupModel getTransportGroup() {
        return transportGroup;
    }

    public void setTransportGroup(TransportGroupModel transportGroup) {
        this.transportGroup = transportGroup;
    }

    public ReboqueModel getReboque() {
        return reboque;
    }

    public void setReboque(ReboqueModel reboque) {
        this.reboque = reboque;
    }

    public VolumeModel getVolume() {
        return volume;
    }

    public void setVolume(VolumeModel volume) {
        this.volume = volume;
    }

    public TransportVehicleModel getTransportVehicle() {
        return transportVehicle;
    }

    public void setTransportVehicle(TransportVehicleModel transportVehicle) {
        this.transportVehicle = transportVehicle;
    }

    public String getSealNumber() {
        return sealNumber;
    }

    public void setSealNumber(String sealNumber) {
        this.sealNumber = sealNumber;
    }

    public TranspRateModel getTranspRate() {
        return transpRate;
    }

    public void setTranspRate(TranspRateModel transpRate) {
        this.transpRate = transpRate;
    }

    @Override
    public String toString() {
        return "TransportModel{" +
                "freightModality='" + freightModality + '\'' +
                ", transportGroup=" + transportGroup +
                ", reboque=" + reboque +
                ", volume=" + volume +
                ", transportVehicle=" + transportVehicle +
                ", sealNumber='" + sealNumber + '\'' +
                ", transpRate=" + transpRate +
                '}';
    }
}
