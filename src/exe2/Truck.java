package exe2;

public class Truck extends Heavy{
    private int id;
    private int age;
    private int wheels;
    private String control;
    private int shew;
    private int trailer;
    private int weight;

    Truck(int id, int age, int wheels, String control, int shew, int trailer, int weight) {
        super(id, age, wheels, control, shew, trailer);
        this.weight = weight;
    }

    public int get_weight() {
        return this.weight;
    }
    public void set_weight(int weight) {
        this.weight = weight;
    }


    @Override
    public double exhaust() {
        return super.exhaust() * 1.5;
    }


    public int hitchhikers(int actual_passers){
        return this.wheels - actual_passers;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +
                "weight: " + this.weight + "\n";
    }

}
