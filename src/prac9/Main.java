package prac9;
import java.util.Scanner;

public class Main {
    private static void num2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size shop");
        int size = sc.nextInt();
        if (size > 0) {
            Num2 obj = new Num2(size);
            int price;
            String name;
            Product temp;
            for (int i = 0; i < size; i++) {
                System.out.println("Input data from product " + (i+1) + "/" + size);
                System.out.println("price");
                price = sc.nextInt();
                System.out.println("name of product");
                name = sc.next();
                temp = new Product(price, name);
                obj.add_to_end(temp);
            }
            obj.print();
        }
    }
    private static void num1() {
        Num1 obj = new Num1();
        System.out.println(obj.getName());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        do {
            System.out.println("number");
            num = sc.nextInt();
            if (num == 1) num1();
            if (num == 2) num2();
        } while (num != 0);
    }
}