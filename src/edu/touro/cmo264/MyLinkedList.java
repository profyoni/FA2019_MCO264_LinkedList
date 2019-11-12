package edu.touro.cmo264;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Node
{
    String data;
    Node prev, next;
}

public class MyLinkedList implements List<String> {

    private Node head;
    private int size = 0;

    public MyLinkedList()
    {
        head = new Node(); // dummy node to simplify / clean up code
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(String s) {
        Node newNode = new Node();
        newNode.data = s;
        newNode.next = null;

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
        size=0;
    }

    @Override
    public String get(int index) {
        return getNode(index).data;
    }

    @Override
    public String set(int index, String element) {
        return null;
    }

    void checkIndexInRange(int index, boolean isSizeLegal)
    {
        int maxLegalValue = isSizeLegal ? size() : size()-1;
        if (index > maxLegalValue || index < 0)
            throw new IndexOutOfBoundsException(String.format("Index [%d] is greater than maximum value[%d] List size [&d]", index, maxLegalValue, size()));
    }

    Node getNode(int index) {
        checkIndexInRange(index, false);
        Node current = head;
        int counter = 0;
        while (counter < index) {
            current = current.next;
            counter++;
        }
        return current;
    }

    @Override
    public void add(int index, String element) {
        checkIndexInRange(index, true);

        Node newNode = new Node();
        newNode.data = element;

        if (head == null) { // no need to check index = 0, since checkIndexInRange did that
            head = newNode;
        }
        else {
            if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node spliceNode = getNode(index - 1);

                newNode.next = spliceNode.next; // newNode next must point to whatever followed the spliceNode
                spliceNode.next = newNode;
            }
        }
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return null;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return null;
    }
}
