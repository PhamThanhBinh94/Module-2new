package bttrienkhaicacphuongthuccuaarraylisttheothuvien;

import org.omg.CORBA.Object;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static int DEFAULT_CAPACITY = 10;
    private E [] elements;

    public MyList() {
         elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = (E[]) new Object[capacity];
    }
    public E remove(int i){
        if (i<0 || i >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        return elements[i]= null;
    }
    public E[] clone(){
        E[] clone = (E[]) new Object[size];
        for (int i =0; i<size;i++){
            clone[i] = elements[i];
        }
        return clone;
    }
    public boolean contains(E o){
        for (int i=0; i<size; i++){
            if (elements[i] == o){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o){
        for (int i =0; i<size; i++){
            if (elements[i] == o)
                return i;
        }
        return -1;
    }
    public void add(E o){
        ensureCapacity();
        elements[0] = o;
        size++;
    }
    public void  ensureCapacity(){
        if (size == elements.length){
            int newSize = elements.length*2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }
    public E get(int i){
        if (i<0 || i >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        return elements[i];
    }
    public void clear(){
        elements = null;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
