package exe2;

public class Light extends Vehicles{
    private int id;
    private int age;
    private int wheels;
    private String control;
    private int shew;
    private boolean is_there_motor;

    public Light(int id, int age, int wheels, String control, int shew, boolean is_there_motor) {
        super(id, age, wheels, control, shew);
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
