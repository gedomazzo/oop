package exe1;

public class Product {
    private String name;
    private double price;
    private String description;

    Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String name) {
        this.name = name;
    }



    public double get_price() {
        return price;
    }

    public void set_price(double price) {
        this.price = price;
    }



    public String get_description() {
        return description;
    }

    public void set_description(String description) {
        this.description = description;
    }

}
