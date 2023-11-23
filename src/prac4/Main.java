package prac4;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(12, 5, 6);
        Circle c2 = new Circle(20);
        c1.setRadius(10);
        c2.setCenterX(2.5);
        System.out.println(c1);
        System.out.println(c2);

        Book b = new Book("Neznayka on the moon", "Nikolay Nosov", 900);
        b.setPages(950);
        System.out.println(b);
    }
}
