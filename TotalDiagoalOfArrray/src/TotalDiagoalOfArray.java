import java.util.Scanner;

public class TotalDiagoalOfArray {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng hoặc số cột vào đây");
        n = sc.nextInt();
        int A[][] =new int[n][n];
        System.out.println("Nhập các phần từ của ma trận ");
        for (int i =0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.println("A=[" +i+"]["+ j +"]:");
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Ma trân vừa nhập là: ");
        for (int i =0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.println(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i =0;i<n;i++){
            for (int j=0;j<n;j++) {
                if (i==j){
                    sum += A[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo của ma trân vuông là: " + sum);
    }
}
