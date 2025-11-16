package exe2;

public class Kibutz {
    private Vehicles[] vehicle;
    private int count;

    Kibutz(){
        vehicle = new Vehicles[500];
        count = 0;
    }

    public void addVehicle(Vehicles v){
        this.vehicle[count] = v;
        count++;
    }

    public void getVehicle(){
        for (Vehicles x: this.vehicle){
            if ((x.getAge() > 15) && (x.getControl().equals( "wheel"))) System.out.println(x);
        }
    }

}
