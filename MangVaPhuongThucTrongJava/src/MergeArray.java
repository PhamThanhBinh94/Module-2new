import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        int[] array1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        }   while (size > 20);
        array = new int[size];
        array1 = new int[size];
        int i =0;
        int j=0;
        while (i < array.length) {
            System.out.print("Enter element" + i + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        while (j < array1.length) {
            System.out.print("Enter element" + j + " : ");
            array1[j] = scanner.nextInt();
            j++;
        }
        int[] array2= new int[array.length+array1.length];
        for (int n=0;n<array.length;n++){
            array2[n] =array[n];
        }
        for (int n=0;n<array1.length;n++){
            array2[array.length +n] =array1[n];
        }
        System.out.println("Các phần tử của mảng mới là: ");
        for (int n=0;n<array2.length;n++){
            System.out.print(array2[n] + " ");
        }
    }
}
