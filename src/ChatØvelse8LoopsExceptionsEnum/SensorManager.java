package ChatØvelse8LoopsExceptionsEnum;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;

public class SensorManager {

    private List<Sensor> sensorList;

    public SensorManager(List<Sensor> sensorList) {
        this.sensorList = sensorList;
    }

    public StringBuilder getCriticalSensors() {

        StringBuilder stringBuilder = new StringBuilder();

        for(Sensor s : sensorList) {

            if(s.getStatus().equals(SensorStatus.ERROR)) {
                stringBuilder.append(s).append("\n");
            }
        }
        return stringBuilder;
    }

    public int averageValue() {

        int count = 0;
        int value = 0;
        for(Sensor s : sensorList) {

            count++;
            value += s.getValue();

        }
        return value / count;
    }

    public void saveToFile(String filename) {

        try {
            PrintStream printStream = new PrintStream(new FileOutputStream(filename, true));

            for(Sensor s : sensorList) {
                printStream.println(s);
            }
            printStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found. try again");
        }
    }



}
