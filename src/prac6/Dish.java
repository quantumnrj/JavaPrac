package prac6;

public abstract class Dish {
    protected int weight;
    protected int price;
    public Dish(int weight, int price){
        this.weight = weight;
        this.price = price;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getPrice(){
        return this.price;
    }
    abstract public String toString();
}
