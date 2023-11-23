package prac12;
public class GameNum3 {
    private String[] names;
    private int round;
    private DequeueList deck_1 = new DequeueList();
    private DequeueList deck_2 = new DequeueList();
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
    public GameNum3(String name1, String name2, String data) {
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
        System.out.println(getNames()[0] + " " + getDeck_1());
        System.out.println(getNames()[1] + " " + getDeck_2());
        setRound(0);
        int val1, val2, temp;
        while (!getDeck_1().isEmpty() && !getDeck_2().isEmpty() && getRound() < 106) {
            setRound(getRound()+1);
            System.out.println("round " + getRound());
            System.out.println("decks:");
            System.out.println(getDeck_1());
            System.out.println(getDeck_2());
            val1 = getDeck_1().element();
            val2 = getDeck_2().element();
            System.out.println(val1);
            System.out.println(val2);
            if (val1 == -1 || val2 == -1) {
                System.out.println("Error");
                break;
            }
            else if (val1 == 0 && val2 == 9) {
                deck_1.add(val2);
                temp = val1;
                deck_1.removeIndex(0);
                deck_1.add(temp);
                deck_2.removeIndex(0);
                System.out.println("decks:");
                System.out.println(getDeck_1());
                System.out.println(getDeck_2());
                System.out.println(getNames()[0] + " won");
            }
            else if (val2 == 0 && val1 == 9) {
                deck_2.add(val1);
                temp = val2;
                deck_2.removeIndex(0);
                deck_2.add(temp);
                deck_1.removeIndex(0);
                System.out.println("decks:");
                System.out.println(getDeck_1());
                System.out.println(getDeck_2());
                System.out.println(getNames()[1] + " won");
            }
            else if (val1 > val2) {
                deck_1.add(val2);
                temp = val1;
                deck_1.removeIndex(0);
                deck_1.add(temp);
                deck_2.removeIndex(0);
                System.out.println("decks:");
                System.out.println(getDeck_1());
                System.out.println(getDeck_2());
                System.out.println(getNames()[0] + " won");
            }
            else if (val1 < val2) {
                deck_2.add(val1);
                temp = val2;
                deck_2.removeIndex(0);
                deck_2.add(temp);
                deck_1.removeIndex(0);
                System.out.println("decks:");
                System.out.println(getDeck_1());
                System.out.println(getDeck_2());
                System.out.println(getNames()[1] + " won");
            }
            else break;
        }
        if (getDeck_2().isEmpty()) System.out.println(getNames()[0] + " " + getRound());
        if (getDeck_1().isEmpty()) System.out.println(getNames()[1] + " " + getRound());
        if (getRound() == 106) System.out.println("botva");
    }
    public int getRound() {
        return round;
    }
    public DequeueList getDeck_1() {
        return deck_1;
    }
    public DequeueList getDeck_2() {
        return deck_2;
    }
    public String[] getNames() {
        return names;
    }

    public void setRound(int round) {
        this.round = round;
    }
}
