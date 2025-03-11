/**
 * @author Max Hubenko
 */
public class AddAtIndexOutOfBoundsThrowsExceptions<E> extends DoublyLinkedList<E> {
    @Override
    public boolean isEmpty() {
        // FAILS - returns false
        return false; 
    }
}
