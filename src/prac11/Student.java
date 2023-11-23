package prac11;
public class Student {
    private static long[] iDNumber;
    public Student(int size) {
        iDNumber = new long[size];
    }
    public void add_value(long value) {
        for (int i = 0; i < iDNumber.length; i++) {
            if (iDNumber[i] == 0) {
                iDNumber[i] = value;
                break;
            }
        }
    }
    public void del_to_index(int index) {
        if (index < iDNumber.length) {
            iDNumber[index] = 0;
            for (int i = index; i < iDNumber.length - 1; i++) {
                iDNumber[i] = iDNumber[i+1];

            }
            iDNumber[iDNumber.length - 1] = 0;
        }
        else {
            System.out.println("Index out of range");
        }
    }
    public void sort() {
        long[] temp = new long[iDNumber.length];
        temp[0] = iDNumber[0];
        for (long l : iDNumber) {
            for (int j = 0; j < temp.length; j++) {
                if (l < temp[j] && j != temp.length - 1) {
                    temp[j + 1] = temp[j];
                    temp[j] = l;
                    break;
                }
            }
        }
        iDNumber = temp;
    }
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (long i: iDNumber) {
            text.append(i);
            text.append(' ');
        }
        return text.toString();
    }
}