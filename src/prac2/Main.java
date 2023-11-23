package prac2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static int fact(int x){
        if (x <= 1) return 1;
        return x * fact(x - 1);
    }
    public static void main(String[] args) {
//----------------------------------------------------------------
        int[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int cnt = 0;
        for (int i = 0; i < mas.length; i++) cnt += mas[i];
        System.out.println("for: " + cnt);
        cnt = 0;
        int pos = 0;
        while(pos < mas.length){
            cnt += mas[pos];
            pos++;
        }
        System.out.println("while: " + cnt);
        cnt = 0;
        pos = 0;
        do{
            cnt += mas[pos];
            pos++;
        } while(pos < mas.length);
        System.out.println("do-while: " + cnt);
//----------------------------------------------------------------
        System.out.println("\nargs are: \n");
        for (int i = 0; i < args.length; i++){
            System.out.print(args[i]);
        }
//----------------------------------------------------------------
        Random rand = new Random();
        int len = 10 + rand.nextInt(30);
        ArrayList<Integer> array = new ArrayList<>(len);
        for (int i = 0; i < len; i++){
            array.add(i, rand.nextInt(100));
        }
        System.out.println("length: " + len + "\n" + array);
        Collections.sort(array);
        System.out.println(array);
//----------------------------------------------------------------
        System.out.println("\nfactorial is " + Main.fact(5));
    }
}
