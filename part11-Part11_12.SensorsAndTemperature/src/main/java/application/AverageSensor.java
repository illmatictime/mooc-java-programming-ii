package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (sensor.isOn()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!this.isOn()) {
            throw new IllegalStateException();
        }

        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }

        int reading = sum / sensors.size();
        this.readings.add(reading);

        return reading;
    }

    public List<Integer> readings() {
        return this.readings;
    }
}
