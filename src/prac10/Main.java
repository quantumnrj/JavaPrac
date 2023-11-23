package prac10;

public class Main {
    public static void rec1(int n, int limiter) {
        if (n > limiter) {
            System.out.println();
            return;
        }
        else {
            for (int i = 0; i < n; i++) {
                System.out.print(n);
            }
            rec1(n + 1, limiter);
        }
    }

    public static void rec_un(int A, int B, boolean positiveStep) {
        if (positiveStep) {
            if (A > B) {
                System.out.println();
                return;
            }
            else {
                System.out.print(A);
                rec_un(A + 1, B, positiveStep);
            }
        }
        else {
            if (B > A) {
                System.out.println();
                return;
            }
            else {
                System.out.print(A);
                rec_un(A - 1, B, positiveStep);
            }
        }
    }

    public static void main(String[] args) {
        rec1(0,5);
        rec_un(1, 8, true);
        rec_un(9, 3, false);
    }
}
