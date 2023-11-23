package prac17;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String mes) {
        super(mes);
    }
}