package exe1;

public class Shopping_card {
    Product[] product;

    public Shopping_card(Product[] product) {
        this.product = product;
    }


    public double calculate_total() {
        double total = 0;

        for (Product i: product){
            total += i.get_price();
        }

        return total;
    }

    public Product[] getProduct() {
        return this.product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }


}
