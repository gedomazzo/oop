package exe2;

public class Cart extends Light {
    private int id;
    private int age;
    private int wheels;
    private String control;
    private boolean is_there_motor;
    private int charge_time;

    Cart(int id, int age, int wheels, String control, boolean is_there_motor,  int charge_time) {
        super(id, age, wheels, control, is_there_motor);
        this.charge_time = charge_time;
    }

    public int get_charge_time() {
        return charge_time;
    }
    public void set_charge_time(int charge_time) {
        this.charge_time = charge_time;
    }


    @Override
    public double exhaust(){
        if (is_there_motor) return super.exhaust() * charge_time;
        else return 0;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +
                "time to charge: " + this.charge_time + "\n";
    }
}


