package simplelinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }
//    @Test
//    void getData() {
//    }
//
//    @Test
//    void add() {
//    }
//
//    @Test
//    void addFirst() {
//    }
//
//    @Test
//    void get() {
//    }
//
//    @Test
//    void printList() {
//    }
}