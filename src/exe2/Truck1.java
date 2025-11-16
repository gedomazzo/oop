package exe2;

public class Truck1 extends Truck {
    private int id;
    private int age;
    private int wheels;
    private String control;
    private int trailer;
    private int weight;
    private int acceptable_weather;

    Truck1(int id, int age, int wheels, String control, int trailer, int weight, int acceptable_weather) {
        super(id, age, wheels, control, trailer, weight);
        this.acceptable_weather = acceptable_weather;
    }


}
