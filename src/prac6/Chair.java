package prac6;

public class Chair extends Furniture{
    private int size;
    private String material;
    public Chair(int weight, int size, String material, int price) {
        super(weight, price);
        this.material = material;
        this.size = size;
    }
    public String toString(){
        return this.material + " chair, size " + this.size + ", weight " +
                this.weight + ", price " + this.price;
    }
}
