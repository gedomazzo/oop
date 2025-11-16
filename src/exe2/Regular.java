package exe2;

public class Regular extends Vehicles {
    private int id;
    private int age;
    private int wheels;
    private String control;
    private int pasagers;

    Regular(int id, int age, int wheels, String control, int pasagers) {
        super(id, age, wheels, control);
        this.pasagers = pasagers;
    }
    
    public int getPasagers() {
        return this.pasagers;
    }
    public void setPasagers(int pasagers) {
        this.pasagers = pasagers;
    }


    @Override
    public double exhaust(){
        return super.exhaust() * pasagers;
    }


    public void noise(){
        System.out.println(wheels * 100 + "; decibel");
    }


    public int hitchhikers(int actual_passers){
        return this.pasagers - actual_passers;
    }


    @Override
    public String toString() {
        return super.toString() + "\n"
                + "pasagers: " + this.pasagers + "\n";
    }
}
