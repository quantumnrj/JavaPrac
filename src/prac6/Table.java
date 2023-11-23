package prac6;

public class Table extends Furniture{
    private int size;
    private String material;
    public Table(int weight, int size, String material, int price) {
        super(weight, price);
        this.material = material;
        this.size = size;
    }
    public String toString(){
        return this.material + " table, size " + this.size + ", weight " +
                this.weight + ", price " + this.price;
    }
}
