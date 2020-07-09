import java.util.Scanner;

public class ExerciseFindMin {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the size: ");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("The length array too large");
            }
        } while (size > 20);
        array = new int[size];
        int i =0;
        while (i < array.length){
            System.out.println("Enter element " +i+ " ");
            array[i] = scanner.nextInt();
            i++;
        }
        int min =array[0];
        for (int j =0;j<array.length;j++){
            if (min>array[j]){
                min =array[j];
                System.out.println("The smallest value is" + array[j]);
            }
        }
    }
}
