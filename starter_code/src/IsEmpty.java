/**
 * @author Stephen Bail
 */
public class IsEmpty<E> extends DoublyLinkedList<E> {
    @Override
    public boolean isEmpty() {
        // FAILS - always returns false
        return false;
    }
}
