package Lab1;               // Trinh Viet Anh - 20214990
import java.util.Scanner;
public class AddMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thuoc cua mang");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m], B = new int[n][m], C = new int[n][m];
        System.out.println("Nhap tung phan tu cua mang A");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                A[i][j] = sc.nextInt();
        System.out.println("Nhap tung phan tu cua mang B");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                B[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                C[i][j] = A[i][j] + B[i][j];
        System.out.println("Mang C: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }
        System.exit(0);
    }
}
