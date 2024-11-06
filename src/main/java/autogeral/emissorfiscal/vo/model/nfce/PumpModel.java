package autogeral.emissorfiscal.vo.model.nfce;

public class PumpModel {

    private Integer spoutNumber;
    private Integer number;
    private Integer tankNumber;
    private double beginningAmount;
    private double endAmount;
    private double percentageBio;

    public int getSpoutNumber() {
        return spoutNumber;
    }

    public void setSpoutNumber(int spoutNumber) {
        this.spoutNumber = spoutNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTankNumber() {
        return tankNumber;
    }

    public void setTankNumber(int tankNumber) {
        this.tankNumber = tankNumber;
    }

    public double getBeginningAmount() {
        return beginningAmount;
    }

    public void setBeginningAmount(double beginningAmount) {
        this.beginningAmount = beginningAmount;
    }

    public double getEndAmount() {
        return endAmount;
    }

    public void setEndAmount(double endAmount) {
        this.endAmount = endAmount;
    }

    public double getPercentageBio() {
        return percentageBio;
    }

    public void setPercentageBio(double percentageBio) {
        this.percentageBio = percentageBio;
    }

    @Override
    public String toString() {
        return "PumpModel{" +
                "spoutNumber=" + spoutNumber +
                ", number=" + number +
                ", tankNumber=" + tankNumber +
                ", beginningAmount=" + beginningAmount +
                ", endAmount=" + endAmount +
                ", percentageBio=" + percentageBio +
                '}';
    }
}
