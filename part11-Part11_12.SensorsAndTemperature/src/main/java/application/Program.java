package application;

public class Program {

    public static void main(String[] args) {
        Sensor tempA = new TemperatureSensor();
        Sensor tempB = new TemperatureSensor();
        Sensor tempC = new TemperatureSensor();

        AverageSensor averageSensor = new AverageSensor();
        averageSensor.addSensor(tempA);
        averageSensor.addSensor(tempB);
        averageSensor.addSensor(tempC);

        averageSensor.setOn();
        System.out.println("temperature in Helsinki region " + averageSensor.read()
                + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + averageSensor.read()
                + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + averageSensor.read()
                + " degrees Celsius");

        System.out.println("readings: " + averageSensor.readings());
    }
}
