/**
 * @author grayson_replace_this
 */
public class AddAtIndexOutOfBoundsThrowsException<E> extends DoublyLinkedList<E> {
    @Override
    public E get(int index) {
        // Forces all gets to be within the bounds of the list
        return super.get(Math.min(super.size() - 1, Math.max(0, index)));
    }
}
