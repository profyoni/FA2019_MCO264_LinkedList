package edu.touro.cmo264;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void size() {
        MyLinkedList list = new MyLinkedList();
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(list.size(),3);
    }

    @Test
    void isEmpty() {
    }

    @Test
    void add() {
        MyLinkedList list = new MyLinkedList();
        list.add(0,"A");
        assertEquals(list.size(),1);
        assertEquals(list.get(0),"A");

        list.add(0,"B");
        assertEquals(list.size(),2);
        assertEquals(list.get(0),"B");
        assertEquals(list.get(1),"A");

        list.add(1,"C");

        assertEquals(list.size(),3);
        assertEquals(list.get(0),"B");
        assertEquals(list.get(1),"C");
        assertEquals(list.get(2),"A");
    }

    @Test
    void get() {
    }

    @Test
    void set() {
    }

    @Test
    void addAtIndex() {
    }
}