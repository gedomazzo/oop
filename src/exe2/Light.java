package exe2;

public class Light extends Vehicles{
    private int id;
    private int age;
    private int wheels;
    private String control;
    private boolean is_there_motor;

    public Light(int id, int age, int wheels, String control, boolean is_there_motor) {
        super(id, age, wheels, control);
        this.is_there_motor = is_there_motor;
    }

    public boolean getIs_there_motor() {
        return this.is_there_motor;
    }

    public void setIs_there_motor(boolean is_there_motor) {
        this.is_there_motor = is_there_motor;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +
                "is there a motor: " + is_there_motor + "\n";
    }
}
