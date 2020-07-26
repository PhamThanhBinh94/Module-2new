package bttrienkhaicacphuongthuccualinkedlisttheothuvien;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(1);
        System.out.println(myLinkedList);
        myLinkedList.addFirst(2);
        System.out.println(myLinkedList);
        myLinkedList.printList();
    }
}
