package prac14;

public class UnfairWaitList<E> extends WaitList<E> {
    UnfairWaitList() {}
    public void remove(E element) {content.remove(element);}
    public void moveToBack(E element) {
        remove(element);
        add(element);
    }
}
