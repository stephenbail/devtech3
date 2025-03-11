import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// import java.util.NoSuchElementException;


public class DoublyLinkedListTest {
    /**
     * Use this to toggle between using the DoublyLinkedList class and your broken classes
     * You may submit with either true or false.
     */
    boolean SHOULD_FAIL = false;

    private DoublyLinkedList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new DoublyLinkedList<>();
    }

    // Tests for get

    /**
     * @author grayson_replace_this
     * @see AddAtIndexOutOfBoundsThrowsException
     */
    @Test
    public void testGetAtOutOfBoundsThrowsException() {
        if (SHOULD_FAIL) list = new AddAtIndexOutOfBoundsThrowsException<>();

        list.addLast(1);
        list.addLast(2);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    /**
     * @author Stephen Bail
     * @see GetAtIndex
     */
    @Test
    public void testGetAtIndex() {
        if (SHOULD_FAIL) list = new GetAtIndex<>();
        
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
    
        assertEquals(1, list.get(0));
        assertEquals(4, list.get(list.size() - 1));

        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(4));
    }

    // Tests for getFirst
    /**
     * @author Stephen Bail
     * @see GetFirst
     */
    @Test
    public void testGetFirst() {
        if (SHOULD_FAIL) list = new GetFirst<>();

        list.addLast(1);
        list.addLast(2);

        assertEquals(1, list.getFirst());
    }
    
    // Tests for getLast
    /**
     * @author Stephen Bail
     * @see GetLast
     */
    @Test
    public void testGetLast() {
        if (SHOULD_FAIL) list = new GetLast<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        assertEquals(3, list.getLast());
    }

    // Tests for isEmpty
    /**
     * @author Stephen Bail
     * @see IsEmpty
     */
    @Test
    public void testIsEmpty() {
        if (SHOULD_FAIL) list = new IsEmpty<>();

        assertTrue(list.isEmpty());

        list.addLast(1);
        assertFalse(list.isEmpty());

        list.removeLast();
        assertTrue(list.isEmpty());
    }

    // Tests for add

    /**
     * @author Stephen Bail
     * @see AddAtIndexOutOfBoundsThrowsExceptions
     */
    @Test
    public void testAddAtIndexOutOfBoundsThrowsException() {
        if (SHOULD_FAIL) list = new AddAtIndexOutOfBoundsThrowsExceptions<>();

        list.addLast(1);
        list.addLast(2);

        assertThrows(IndexOutOfBoundsException.class, () -> list.add(5, 10));
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(-1, 20));
    }

    // Tests for addFirst

    /**
     * @author Stephen Bail
     * @see AddFirstAddsElement
     */
    @Test
    public void testAddFirstAddsElement() {
        if (SHOULD_FAIL) list = new AddFirstAddsElement<>();

        list.addFirst(1);
        assertEquals(1, list.getFirst());

        list.addFirst(2);
        assertEquals(2, list.getFirst());
    }
}

    // Tests for addLast

    /**
     * @author 
     * @see
     */
    /*@Test
    public void testAddLastAddsElement() {
        fail("Not yet implemented");
    }

    // Tests for remove

    /**
     * @author 
     * @see
     */
    /*@Test
    public void testRemoveAtIndex() {
        fail("Not yet implemented");
    } */

    // Tests for removeFirst

    // Tests for removeLast

    // Tests for size

    // Tests for set

//} 