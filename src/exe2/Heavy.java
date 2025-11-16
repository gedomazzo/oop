package exe2;

import exe1.Product;

public class Heavy extends Vehicles {
    private int id;
    private int age;
    private int wheels;
    private String control;
    private int shew;
    private int trailer;

    public Heavy(int id, int age, int wheels, String control, int shew, int trailer) {
       super(id, age, wheels, control, shew);
       this.trailer =  trailer;
    }

    public int getTrailer() {
        return this.trailer;
    }
    public void setTrailer(int trailer) {
        this.trailer = trailer;
    }


    @Override
    public double exhaust(){
        return super.exhaust() + 500;
    }



    @Override
    public String toString() {
        return super.toString() + "\n" +
                "trailer: " + trailer + "\n";
    }
}
