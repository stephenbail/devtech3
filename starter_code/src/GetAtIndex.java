/**
 * @author Max Hubenko
 */
public class GetAtIndex<E> extends DoublyLinkedList<E> {
    @Override
    public E get(int index) {
        // FAILS - returns first element, ignores index
        return super.get(0); 
    }
}
