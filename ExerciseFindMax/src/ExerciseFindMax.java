import java.util.Scanner;

public class ExerciseFindMax {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số hàng: ");
        m = sc.nextInt();
        System.out.println(" Nhập số cột: ");
        n = sc.nextInt();
        int A[][] = new int[m][n];
        for (int i = 0;i < m;i++){
            for (int j =0;j<n; j++){
                System.out.println("[A" +i +"][" +j +"]=");
                A[i][j] = sc.nextInt();
            }
        }
        int max = A[0][0];
        for (int i =0; i<m; i++){
            for (int j=0;j<n;j++){
                if (max < A[i][j]){
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất của mảng 2 chiều là: " + max);
    }

}
