package exe2;

public class Main {

    public static double total_shew(Vehicles[] arr){
        double total = 0.0;

        for (Vehicles x : arr) {
            total += x.exhaust();
        }
        return total;
    }


    public void totsl_sound(Vehicles[] arr){
        for (Vehicles x : arr) {
            if (x instanceof Regular){
                 ((Regular)x).noise();
            }
        }
    }


    public static void main(String[] args) {}
}
