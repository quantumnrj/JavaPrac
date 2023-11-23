package prac11;

public class Comparator {
    private String name;
    private double score;
    public double getScore() {
        return score;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Student: " + getName() + ", " + getScore();
    }
    public Comparator(String n, double b) {
        name = n;
        score = b;
    }
    public int compareTo(Comparator otherStudent) {
        if (score < otherStudent.score) {
            return 1;
        } else if (score > otherStudent.score) {
            return -1;
        } else {
            return 0;
        }
    }
}
