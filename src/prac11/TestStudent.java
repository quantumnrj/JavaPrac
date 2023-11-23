package prac11;
import java.util.Scanner;

public class TestStudent {
    public TestStudent() {}
    public void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter iDNumber array size");
        int size;
        size = sc.nextInt();
        Student arr = new Student(size);
        int num2;
        long val;
        int index;
        do {
            System.out.println("1 - add, 2 - delete, 3 - print, 4 - sort, 0 - exit");
            num2 = sc.nextInt();
            if (num2 == 1) {
                //System.out.println("Save ID by value");
                val = sc.nextLong();
                arr.add_value(val);
                continue;
            }
            if (num2 == 2) {
                //System.out.println("Delete index by value");
                index = sc.nextInt();
                arr.del_to_index(index);
                continue;
            }
            if (num2 == 3) System.out.println(arr);
            if (num2 == 4) {
                arr.sort();
                System.out.println(arr);
            }
        } while (num2 != 0);
    }
}
