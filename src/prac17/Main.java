package prac17;
import java.util.Scanner;

public class Main {
    private static boolean in(char l, char[] list) {
        for (int i = 0; i < list.length; i++) {
            if (l == list[i]) {
                return true;
            }
        }
        return false;
    }
    private static void num2() {
        LabClassDriver driver_app = new LabClassDriver("fff");
        driver_app.hide();
        driver_app.show();
    }
    private static void num1() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Your name:");
            String name;
            String inn;
            name = sc.nextLine();
            System.out.println("Your INN in int format: xxxx xxx xxx xxx");
            inn = sc.nextLine();
            if (inn.length() != 16) {
                throw new ExceptionNum1("Length inn is not 16");
            } else {
                boolean f = false;
                int count_space = 0;
                int count_numbers = 0;
                char check_list[] = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
                char inn_list[] = inn.toCharArray();
                for (int i = 0; i < inn_list.length; i++) {
                    if (inn_list[i] == ' ') {
                        count_space += 1;
                    }
                    else if (in(inn_list[i], check_list)) {
                        count_numbers += 1;
                    }
                }
                //System.out.println(count_numbers);
                //System.out.println(count_space);
                if (count_numbers != 13) f = true;
                if (count_space != 3) f = true;
                if (f) throw new ExceptionNum1("Error input inn");
            }
        } catch (ExceptionNum1 err) {
            System.out.println(err.toString());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        do {
            num = sc.nextInt();
            switch (num) {
                case 1 -> num1();
                case 2 -> num2();
            }
        } while (num != 0);
    }
}
