package prac4;

public class Leg extends Human{
    private int shoeSize;
    public Leg(String humanName, int humanAge, int shoeSize){
        super(humanName, humanAge);
        this.shoeSize = shoeSize;
    }

    public int getShoeSize() {
        return shoeSize;
    }
    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }
}
