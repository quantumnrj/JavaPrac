package prac9;

public class Product implements Priceable {
    private int price;
    private String name;
    public Product(int price, String name) {
        setName(name);
        setPrice(price);
    }
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product\n" + getName() + "\n" + getPrice();
    }
}