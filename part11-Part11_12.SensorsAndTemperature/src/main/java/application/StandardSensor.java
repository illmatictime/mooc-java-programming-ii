package application;

public class StandardSensor implements Sensor {

    private int sensorTime;

    public StandardSensor(int sensorTime) {
        this.sensorTime = sensorTime;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        return;
    }

    @Override
    public void setOff() {
        return;
    }

    @Override
    public int read() {
        return this.sensorTime;
    }

}
