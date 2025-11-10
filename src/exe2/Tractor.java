package exe2;

public class Tractor extends Heavy{
    private int id;
    private int age;
    private int wheels;
    private String control;
    private int trailer;
    private String trailer_type;

    Tractor(int id, int age, int wheels, String control, int trailer, String trailer_type) {
        super(id, age, wheels, control, trailer);
        this.trailer_type = trailer_type;
    }


    public String get_trailer_type() {
        return this.trailer_type;
    }

    public void set_trailer_type(String trailer_type) {
        this.trailer_type = trailer_type;
    }



}
