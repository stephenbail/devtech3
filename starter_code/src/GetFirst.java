/**
 * @author Max Hubenko
 */
public class GetFirst<E> extends DoublyLinkedList<E> {
    @Override
    public E getFirst() {
        // FAILS - returns last not first
        return super.getLast();
    }
}
