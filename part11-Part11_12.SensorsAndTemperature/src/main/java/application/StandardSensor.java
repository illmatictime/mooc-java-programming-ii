package application;

public class StandardSensor implements Sensor {

    private int sensor;

    public StandardSensor(int sensor) {
        this.sensor = sensor;
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
        return this.sensor;
    }

}
