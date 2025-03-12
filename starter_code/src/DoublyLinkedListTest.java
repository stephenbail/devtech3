import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;


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
     * @author grayson
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
     * @author Max Hubenko
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
     * @author Max Hubenko
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
     * @author Max Hubenko
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

    /**
     * @author Stephen Bail
     * @see GetAddLastAddsElementIncorrectPosition
     */
    @Test
    public void testAddLastAddsElement() {
        if (SHOULD_FAIL) list = new GetAddLastAddsElementIncorrectPosition<>();

        list.addLast(1);
        list.addLast(2);
        assertEquals(2 , list.get(1));

        list.addLast(3);

        assertEquals(3, list.get(2));
    }

    // Tests for remove

    /**
     * @author Max Hubenko
     * @see GetRemoveAtIndexIncorrectRemoval
     */
    @Test
    public void testRemoveAtIndex() {
        if (SHOULD_FAIL) list = new GetRemoveAtIndexIncorrectRemoval<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        int removedItem = list.remove(0); 

        assertEquals(1, removedItem);
        assertEquals(3, list.size()); 
        assertEquals(3, list.get(1));  
        assertEquals(4, list.get(2));  
        
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3)); 
    }


    // Tests for removeFirst

    /**
     * @author Stephen Bail
     * @see GetRemoveFirstBroken
     */
    @Test
    public void testRemoveFirst() {
        if (SHOULD_FAIL) list = new GetRemoveFirstBroken<>();


        assertThrows(NoSuchElementException.class, () -> list.removeFirst());

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        int removedItem = list.removeFirst();
        assertEquals(1, removedItem);      
        assertEquals(2, list.size());       
        assertEquals(2, list.getFirst());    

        list.removeFirst(); 
        list.removeFirst(); 
        assertTrue(list.isEmpty());       
        assertThrows(NoSuchElementException.class, () -> list.removeFirst());
    }




    // Tests for removeLast


    /**
     * @author Max Hubenko
     * @see GetRemoveLastBroken
     */
    @Test
    public void testRemoveLast() {
        if (SHOULD_FAIL) list = new GetRemoveLastBroken<>();


        assertThrows(NoSuchElementException.class, () -> list.removeLast());

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        int removedItem = list.removeLast();
        assertEquals(3, removedItem);     
        assertEquals(2, list.size());     
        assertEquals(2, list.getLast());      

        list.removeLast(); 
        list.removeLast(); 
        assertTrue(list.isEmpty()); 

        assertThrows(NoSuchElementException.class, () -> list.removeLast());
    }

    // Tests for size

    /**
     * @author Stephen Bail
     * @see GetSizeIncorrect
     */
    @Test
    public void testSize() {
        if (SHOULD_FAIL) list = new GetSizeIncorrect<>();

        assertEquals(0, list.size());

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        assertEquals(3, list.size());

        list.remove(1);
        assertEquals(2, list.size());

        list.removeFirst(); 
        assertEquals(1, list.size());

        list.removeLast();
        assertEquals(0, list.size());
    }

    // Tests for set

    /**
     * @author Max Hubenko
     * @see GetSetIncorrect
     */
    @Test
    public void testSet() {
        if (SHOULD_FAIL) list = new GetSetIncorrect<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        int replacedItem = list.set(0, 100);
        assertEquals(1, replacedItem);
        assertEquals(100, list.get(0));

        assertThrows(IndexOutOfBoundsException.class, () -> list.set(3, 100));
    }
}