package bttrienkhaicacphuongthuccualinkedlisttheothuvien;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public void setNumNodes(int numNodes) {
        this.numNodes = numNodes;
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp= head;
        for (int i = 0 ; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", numNodes=" + numNodes +
                '}';
    }
}
