package prac1;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog();
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        Ball ball1 = new Ball("black", 20);
        Ball ball2 = new Ball("blue");
        Ball ball3= new Ball();
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);

        Book book1 = new Book("Neznayka on the moon", 900);
        Book book2 = new Book(350);
        Book book3 = new Book();
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
