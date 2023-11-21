import org.junit.Test;

import java.util.ArrayList;
import java.util. LinkedList;
import java.util.List;
import static org.junit.Assert.*;
public class TimeTesterTest {
    private static int SIZE=10000;
    @Test
    public void testAddListArrayList() {
        List<Integer> list = new ArrayList<>();
        long time = TimeTester.addList(list, SIZE);
        assertEquals(SIZE, list.size());
        assertTrue(time > 0);
    }
    @Test
    public void testRemoveListArrayList() {
        List<Integer> list = new ArrayList<>();
        TimeTester.addList(list, SIZE);
        long time = TimeTester.removeList(list, SIZE);
        assertEquals(0, list.size());
        assertTrue(time > 0);
    }
    @Test
    public void testAddListLinkedList() {
        List<Integer> list = new  LinkedList<>();
        long time = TimeTester.addList(list, SIZE);
        assertEquals(SIZE, list.size());
        assertTrue(time > 0);
    }
    @Test
    public void testRemoveListLinkedList() {
        List<Integer> list = new  LinkedList<>();
        TimeTester.addList(list, SIZE);
        long time = TimeTester.removeList(list, SIZE);
        assertEquals(0, list.size());
        assertTrue(time > 0);
    }
}
