package edu.touro.cmo264;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    MyLinkedList list = new MyLinkedList();
    @Test
    void size() {
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(list.size(),3);
    }

    @Test
    void isEmpty() {
    }

    @Test
    void add0() {
        list.add(0,"A");
        assertEquals(list.size(),1);
        assertEquals(list.get(0),"A");
    }

    @Test
    void add1() {

        list.add(0,"B");
        assertEquals(list.size(),2);
        assertEquals(list.get(0),"B");
        assertEquals(list.get(1),"A");


    }    @Test
    void add3() {

        list.add(0,"A");
        list.add(0,"B");
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