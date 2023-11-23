package prac6;

public class Glass extends Dish{
    private int volume;
    private String color;
    public Glass(int volume, int weight, String color, int price){
        super(weight, price);
        this.color = color;
        this.volume = volume;
    }
    public String getColor(){
        return this.color;
    }
    public int getVolume(){
        return this.volume;
    }
    public String toString(){
        return "Glass with volume: " + this.volume + ", " + this.color + " color, weight is " +
                this.weight + ",price is " + this.price;
    }
}
