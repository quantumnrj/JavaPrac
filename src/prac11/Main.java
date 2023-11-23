package prac11;
import java.util.Scanner;

public class Main {
    private static void num1() {
        TestStudent obj = new TestStudent();
        obj.test();
    }
    private static void num2() {
        System.out.println("How many students?");
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        SortingStudentsByGPA obj = new SortingStudentsByGPA(size);
        for (int i = 0; i < size; i++) {
            obj.add_data();
        }
        System.out.println("Array");
        obj.print();
        System.out.println("Array sort");
        obj.sort();
        obj.print();
    }
    private static void num3() {
        System.out.println("How many students?");
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        SortedNum3 obj = new SortedNum3(size);
        for (int i = 0; i < size; i++) {
            obj.add_data();
        }
        System.out.println("Array");
        obj.print();
        System.out.println("Array sort");
        obj.sort();
        obj.print();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        do {
            System.out.print("Choice (0 - exit) -> ");
            num = sc.nextInt();
            if (num == 1) num1();
            if (num == 2) num2();
            if (num == 3) num3();
        } while (num != 0);
    }
}
