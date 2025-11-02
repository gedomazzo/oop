package exe1;

public class Book extends Product{

    private String author;

    Book(String name, double price, String description, String author) {
        super(name, price, description);
        this.author = author;
    }
    public String get_author() {
        return author;
    }
    public void set_author(String author) {
        this.author = author;
    }

    @Override
    public String get_description() {
        return super.get_description() + "and its written by and author named " + this.author;
    }
}
