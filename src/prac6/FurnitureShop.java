package prac6;

public class FurnitureShop {
    private Furniture[] stock;
    public FurnitureShop(){
        stock = new Furniture[]{
                new Table(10, 1, "wooden", 2000),
                new Table(20, 2, "steel", 2000),
                new Chair(2, 1, "wooden", 1000),
                new Chair(5, 2, "wooden", 1300)
        };
    }
    public void printStock(){
        for (int i = 0; i < stock.length; i++) {
            System.out.println(stock[i].toString());
        }
    }
}
