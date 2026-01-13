package org.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class ListManagerTest {

    ListManager manager = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();

        manager.addElement(list, 10);
        manager.addElement(list, 20);

        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
        assertEquals(2, manager.getSize(list));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        boolean removed = manager.removeElement(list, 20);

        assertTrue(removed);
        assertFalse(list.contains(20));
        assertEquals(2, manager.getSize(list));
    }

    @Test
    void testSizeUpdate() {
        List<Integer> list = new ArrayList<>();

        manager.addElement(list, 5);
        manager.addElement(list, 15);
        manager.removeElement(list, 5);

        assertEquals(1, manager.getSize(list));
    }
}
