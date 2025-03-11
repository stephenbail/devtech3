/**
 * @author Max Hubenko
 */
public class GetLast<E> extends DoublyLinkedList<E> {
    @Override
    public E getLast() {
        // FAILS - returns first not last
        return super.getFirst();
    }
}
