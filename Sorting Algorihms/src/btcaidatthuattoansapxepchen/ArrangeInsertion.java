package btcaidatthuattoansapxepchen;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeInsertion {
    public static void insertionSort(int[] list){
        for (int i =1; i<list.length;i++){
            int currentElement = list[i];
            int k;
            for (k=i-1; k>=0 && list[k] >currentElement; k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + "values: ");
        for (int i = 0; i < list.length; i++){
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i ++){
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
