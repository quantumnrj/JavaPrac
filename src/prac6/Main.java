package prac6;

public class Main {
    public static void main(String[] args) {
        Glass g1 = new Glass(10, 150, "blue", 200);
        Glass g2 = new Glass(15, 230, "white", 300);
        Plate p1 = new Plate(20, 400, "red", 350);
        Plate p2 = new Plate(30, 600, "black", 500);
        System.out.println(g1.toString());
        System.out.println(g2.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        FurnitureShop app = new FurnitureShop();
        app.printStock();
    }
}
