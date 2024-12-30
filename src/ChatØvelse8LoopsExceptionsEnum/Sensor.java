package ChatØvelse8LoopsExceptionsEnum;

public class Sensor {

    private String id;
    private int value;
    private SensorStatus status;

    public Sensor(String id, int value, SensorStatus status) {
        this.id = id;
        this.value = value;
        this.status = status;
    }

    public SensorStatus getStatus() {
        return status;
    }
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Value: " + value + ", Status: " + status;
    }

}
