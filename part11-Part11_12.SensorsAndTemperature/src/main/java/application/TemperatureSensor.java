package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean sensorStatus;

    public TemperatureSensor() {
        this.sensorStatus = false;
    }

    @Override
    public boolean isOn() {

        return this.sensorStatus;
    }

    @Override
    public void setOn() {
        this.sensorStatus = true;
        return;
    }

    @Override
    public void setOff() {
        this.sensorStatus = false;
        return;
    }

    @Override
    public int read() {
        if (this.sensorStatus == false) {
            throw new UnsupportedOperationException("Unimplemented method 'read'");
        }
        int random = new Random().nextInt(61) - 30;
        return random;
    }

}
