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
    public void addLast(Object  data){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
            temp.next = new Node(data);
            numNodes++;
        }
    }

    public void  add(int index , Object data){
        Node temp = head;
        Node holder;
        if (index == 0){
            addFirst(data);
        } else  if (index ==numNodes){
            addLast(data);
        } else for (int i =0; i<index -1 && temp.next ==null;i++ ){
            temp=temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void removeFirst(){
        head = head.next;
        numNodes--;
    }
    public void removeLast(){
        Node temp = head;
        int i =0;
        while (i < numNodes-1){
            temp = temp.next;
            i++;
        }
        temp.next=null;
        numNodes--;
    }

    public void remove(int index){
        Node removeElement;
        if (index ==0){
            removeFirst();
        } else if (index==numNodes){
            removeLast();
        } else {
            removeElement = head;
            int i = 0;
            while (i < index -1){
                removeElement = removeElement.next;
                i++;
            }
            removeElement.next = removeElement.next.next;
            numNodes--;
        }
    }

    public Node get(int index) {
        Node temp= head;
        for (int i = 0 ; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
    public int size(){
        Node temp = head;
        int i = 1;
        while (temp.next != null){
            temp = temp.next;
            i++;
        }
        return i;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public boolean contains(Object element){
        Node temp = head;
        while (temp.next != null){
            if (element.equals(temp.data))
                return true;
            temp=temp.next;
        }
        return  false;
    }

    public int indexOf(Object element){
        int index =0;
        Node temp = head;
        while (temp != null){
            if (temp.data == element){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return index;
    }
    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", numNodes=" + numNodes +
                '}';
    }
}
