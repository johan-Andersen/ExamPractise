package ChatØvelse8LoopsExceptionsEnum;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Sensor> sensorsList = new ArrayList<>();
        sensorsList.add(new Sensor("tomas", 1, SensorStatus.OK));
        sensorsList.add(new Sensor("Jakob", 22, SensorStatus.ERROR));
        sensorsList.add(new Sensor("Janne", 32, SensorStatus.ERROR));
        sensorsList.add(new Sensor("Fatima", 0, SensorStatus.WARNING));
        sensorsList.add(new Sensor("Kristi", 92, SensorStatus.OK));

        SensorManager manager = new SensorManager(sensorsList);

        System.out.println(manager.averageValue());
        System.out.println(manager.getCriticalSensors());
        manager.saveToFile("sensor.txt");

    }


}
