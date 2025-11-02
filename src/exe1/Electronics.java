package exe1;

public class Electronics extends Product{
    private String charger;

    Electronics(String name, double price, String description, String charger) {
        super(name, price, description);
        this.charger = charger;

    }

    public String get_harger() {
        return charger;
    }

    public void set_harger(String charger) {
        this.charger = charger;
    }


    @Override
    public String get_description() {
        return super.get_description() + "and you need a charger " + charger;
    }
}
