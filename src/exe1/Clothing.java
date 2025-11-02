package exe1;

public class Clothing extends Product{
    private String brand;

    Clothing(String brand, String name, String description, double price) {
        super(name, price, description);
        this.brand = brand;
    }

    public String get_brand() {
        return brand;
    }
    public void set_brand(String brand) {
        this.brand = brand;
    }


    @Override
    public String get_description()  {
        return super.get_description() + "and its brand is " + brand;
    }
}

