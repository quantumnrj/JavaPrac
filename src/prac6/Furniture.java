package prac6;

abstract public class Furniture {
    protected int weight;
    protected int price;
    public Furniture(int weigth, int price) {
        this.weight = weight;
        this.price = price;
    }
    abstract public String toString();
}
