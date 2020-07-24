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
        System.out.println(book1.getName().compareTo(book3.getName()));
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
        //BubbleSort
//        boolean needNextPass = true;
//        for (int k=1;k<store.length && needNextPass;k++){
//            needNextPass=false;
//            for (int i=0; i <store.length-k;i++){
//                if (store[i].getPrice() > store[i + 1].getPrice()) {
//                    Book temp = store[i];
//                    store[i] = store[i + 1];
//                    store[i + 1] = temp;
//                    needNextPass = true;
//                }
//            }
//        }

//        BubbleSort
        boolean needNextPass = true;
        for (int k=1;k<store.length && needNextPass;k++){
            needNextPass=false;
            for (int i=0; i <store.length-k;i++){
                if (store[i].getName().compareTo(store[i + 1].getName()) > 0) {
                    Book temp = store[i];
                    store[i] = store[i + 1];
                    store[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }

        //InsertionSort
//        for (int i=1;i<store.length;i++){
//            Book currentElement = store[i];
//            int k;
//            for (k=i-1; k>=0 && store[k].getPrice() > currentElement.getPrice();k--){
//                store[k+1] = store[k];
//            }
//            store[k+1] = currentElement;
//        }

        //SelectionSort
//        for (int i =0; i < store.length-1;i++){
//            double minPrice = store[i].getPrice();
//            int minPriceIndex = i;
//            for (int j=i+1; j<store.length; j++){
//                if (minPrice > store[j].getPrice()){
//                    minPrice = store[j].getPrice();
//                    minPriceIndex = j;
//                }
//            }
//            if (minPriceIndex != i){
//                Book temp = store[i];
//                store[i] = store[minPriceIndex];
//                store[minPriceIndex] = temp;
//            }
//        }
        for (Book value : store)
            System.out.println("Name: " + value.getName() + "Price: " + value.getPrice());


        System.out.println("Nhập giá của của cuốn sách để ra tên của cuốn sách tại đây");
//        double price = sc.nextDouble();
//        int low=0;
//        int high= store.length-1;
//        boolean checker = false;
//        while(!checker && high>= low){
//            int mid = (low +high)/2;
//            if (price < store[mid].getPrice())
//                high = mid-1;
//            else if (price == store[mid].getPrice()) {
//                System.out.println("The book is: " + store[mid].getName());
//                checker = true;
//            }
//            else low = mid +1;
//        }
//        sc.nextLine();
        String name1 = sc.next();
        int low=0;
        int high= store.length-1;
        boolean checkName = false;
        while(!checkName && high>= low){
            int mid = (low +high)/2;
            if (name1.compareTo(store[mid].getName()) < 0 )
                high = mid-1;
            else if (name1.compareTo(store[mid].getName()) == 0) {
                System.out.println("The price of book is: " + store[mid].getPrice());
                checkName = true;
            }
            else low = mid +1;
        }
//        return -1;
    }

}
