package prac6;

public class Plate extends Dish{
    private int radius;
    private String color;
    public Plate(int radius, int weight, String color, int price) {
        super(weight, price);
        this.radius = radius;
        this.color = color;
    }
    public String toString(){
        return "Plate with radius: " + this.radius + ", " + this.color + " color, weight is " +
                this.weight + ",price is " + this.price;
    }
}
