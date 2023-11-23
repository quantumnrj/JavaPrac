package prac16;
import java.util.Scanner;

public class Main {
    private static void num1() {
        Exception1 e = new Exception1();
        e.exceptionDemo();
    }
    private static void num2() {
        Exception2 e = new Exception2();
        e.exceptionDemo();
    }
    private static void num3() {
        Exception3 e = new Exception3();
        e.exceptionDemo();
    }
    private static void num4() {
        Exception4 e = new Exception4();
        e.exceptionDemo();
    }
    private static void num5() {
        ThrowsDemo1 e = new ThrowsDemo1();
        e.printMessage("hi"); // replace const to null
    }
    private static void num6() {
        ThrowsDemo1 e = new ThrowsDemo1();
        try {
            e.printMessage(null); // replace const to null
        } catch (NullPointerException err) {
            System.out.println(err.toString());
        }
    }
    private static void num7() {
        ThrowsDemo2 e = new ThrowsDemo2();
        e.printDetails("hi");
    }
    private static void num8() {
        ThrowsDemo3 e = new ThrowsDemo3();
        e.printDetails(null);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        do {
            num = sc.nextInt();
            if (num == 1) num1();
            if (num == 2) num2();
            if (num == 3) num3();
            if (num == 4) num4();
            if (num == 5) num5();
            if (num == 6) num6();
            if (num == 7) num7();
            if (num == 8) num8();
        } while (num!= 0);
    }
}