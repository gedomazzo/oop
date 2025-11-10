package exe2;

public class Bicycle extends Light{
    private int id;
    private int age;
    private int wheels;
    private String control;
    private boolean is_there_motor;
    private boolean is_there_battery;

    Bicycle(int id, int age, int wheels, String control, boolean is_there_motor, boolean is_there_battery) {
        super(id, age, wheels, control, is_there_motor);
        this.is_there_battery = is_there_battery;
    }


    public boolean get_is_there_battery() {
        return is_there_battery;
    }

    public boolean set_is_there_battery() {
        return is_there_battery;
    }



    @Override
    public String toString() {
        return super.toString() + "\n" +
                "is there a battery: " + this.is_there_battery + "\n";
    }

}
