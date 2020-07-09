import java.util.Scanner;

public class AddElements {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size+1];
        int i = 0;
        while (i < size){
            System.out.print("Enter element" + i + " : ");
            array[i] =scanner.nextInt();
            i++;
        }
        System.out.println("Nhập X là số cần chèn vào đây: ");
        int X = scanner.nextInt();
        System.out.println("Nhập index của X vào đây: ");
        int index = scanner.nextInt();
        if (index <  0 || index > array.length -1) {
            System.out.println("Do not add element to the array");
        } else {
            for(int j = array.length-1; j >index; j--){
                array[j] = array[j-1];
            }
            array[index] = X;
            for (int j =0;j < array.length; j ++){
                System.out.println(array[j] + " ");
            }
        }
    }
}
