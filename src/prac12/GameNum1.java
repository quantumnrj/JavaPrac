package prac12;
import java.util.Stack;

public class GameNum1 {
    private String[] names;
    private int round;
    private Stack<Integer> deck_1 = new Stack<>();
    private Stack<Integer> deck_2 = new Stack<>();
    private int StrToInt(char temp) {
        if (temp == '0') return 0;
        if (temp == '1') return 1;
        if (temp == '2') return 2;
        if (temp == '3') return 3;
        if (temp == '4') return 4;
        if (temp == '5') return 5;
        if (temp == '6') return 6;
        if (temp == '7') return 7;
        if (temp == '8') return 8;
        if (temp == '9') return 9;
        return -1;
    }
    public GameNum1(String name1, String name2, String data) {
        names = new String[2];
        names[0] = name1;
        names[1] = name2;
        boolean f = false;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == ' ') {
                f = true;
                continue;
            }
            if (f) deck_2.add(StrToInt(data.charAt(i)));
            if (!f) deck_1.add(StrToInt(data.charAt(i)));
        }
    }
    public void start() {
        System.out.println("game start");
        System.out.println(names[0] + " " + deck_1);
        System.out.println(names[1] + " " + deck_2);
        setRound(0);
        int val1, val2, temp;
        while (!deck_1.isEmpty() && !deck_2.isEmpty() && round < 106) {
            setRound(round + 1);
            System.out.println("round " + round);
            System.out.println("decks:");
            System.out.println(deck_1);
            System.out.println(deck_2);
            val1 = deck_1.get(0);
            val2 = deck_2.get(0);
            System.out.println(val1);
            System.out.println(val2);
            if (val1 == -1 || val2 == -1) {
                System.out.println("Error");
                break;
            }
            else if (val1 == 0 && val2 == 9) {
                deck_1.add(val2);
                temp = val1;
                deck_1.remove(0);
                deck_1.add(temp);
                deck_2.remove(0);
                System.out.println("Players decks:");
                System.out.println(deck_1);
                System.out.println(deck_2);
                System.out.println(names[0] + " won");
            }
            else if (val2 == 0 && val1 == 9) {
                deck_2.add(val1);
                temp = val2;
                deck_2.remove(0);
                deck_2.add(temp);
                deck_1.remove(0);
                System.out.println("players decks:");
                System.out.println(deck_1);
                System.out.println(deck_2);
                System.out.println(names[1] + " won");
            }
            else if (val1 > val2) {
                deck_1.add(val2);
                temp = val1;
                deck_1.remove(0);
                deck_1.add(temp);
                deck_2.remove(0);
                System.out.println("players decks:");
                System.out.println(deck_1);
                System.out.println(deck_2);
                System.out.println(names[0] + " won");
            }
            else if (val1 < val2) {
                deck_2.add(val1);
                temp = val2;
                deck_2.remove(0);
                deck_2.add(temp);
                deck_1.remove(0);
                System.out.println("players decks:");
                System.out.println(deck_1);
                System.out.println(deck_2);
                System.out.println(names[1] + " won");
            }
            else break;
        }
        if (deck_2.isEmpty()) System.out.println(names[0] + " " + round);
        if (deck_1.isEmpty()) System.out.println(names[1] + " " + round);
        if (round == 106) System.out.println("botva");
    }

    public void setRound(int round) {
        this.round = round;
    }

}
