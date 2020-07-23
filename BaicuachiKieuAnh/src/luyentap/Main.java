package luyentap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        ProgrammingBook book1 = new ProgrammingBook("mot", "java", 900.000, "Tuyen", "Java", "Angular" );
        ProgrammingBook book2 = new ProgrammingBook("hai", "java1", 400.000, "Hung", "Php", "Laravel" );
        ProgrammingBook book3 = new ProgrammingBook("ba", "java2", 500.000, "Minh", "Javascript", "Vue.js" );
        ProgrammingBook book4 = new ProgrammingBook("tu", "java3", 3400.000, "Vinh", "Java", "Angular" );
        ProgrammingBook book5 = new ProgrammingBook("nam", "java4", 780.000, "Trung", "Ruby", "Angular" );
        FictionBook book6 = new FictionBook("sau", "java5", 800.000, "Trung" , "trinhtham");
        FictionBook book7 = new FictionBook("bay", "java6", 900.000, "Hien" , "trinhtham1");
        FictionBook book8 = new FictionBook("tam", "java7", 550.000, "Thang" , "trinhtham2");
        FictionBook book9 = new FictionBook("chin", "java8", 760.000, "Phuc" , "trinhtham3");
        FictionBook book10 = new FictionBook("muoi", "java9", 800.000, "Quang" , "trinhtham4");
        Book[] store = new Book[10];
        store[0] = book1;
        store[1] = book2;
        store[2] = book3;
        store[3] = book4;
        store[4] = book5;
        store[5] = book6;
        store[6] = book7;
        store[7] = book8;
        store[8] = book9;
        store[9] = book10;
        double sum =0;
        int count =0;
        for (int i=0;i <store.length;i++){
            sum += store[i].getPrice();
        }
        System.out.println(sum);
        for (int i = 0; i<store.length;i++){
            if (store[i] instanceof ProgrammingBook){
                ProgrammingBook search = (ProgrammingBook) store[i];
                if (search.getLanguage() == "Java") count++;
            }
        }
        System.out.println(count);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên cuốn sách vào đây: ");
        String name = sc.next();

        for (int i =0; i< store.length;i++) {
            if (name.equals(store[i].getName()))
                System.out.println(store[i].getPrice());
        }

        boolean needNextPass = true;
        for (int k=1;k<store.length && needNextPass;k++){
            needNextPass=false;
            for (int i=0; i <store.length;i++){
                if (store[i].getPrice() > store[i + 1].getPrice()) {
//                    System.out.println("Swap " +store[i] + "with" + store[i+1]);
                    Book temp = store[i];
                    store[i] = store[i + 1];
                    store[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
        for (Book value : store)
            System.out.println("Name: " + value.getName() + "Price: " + value.getPrice());
    }
}
