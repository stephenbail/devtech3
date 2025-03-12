/**
 * @author Max Hubenko
 */
public class GetAddLastAddsElementIncorrectPosition<E> extends DoublyLinkedList<E> {

    @Override
    public void addLast(E item) {
        super.linkFirst(item);
    }
}
