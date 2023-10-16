package Lab1;                // Trinh Viet Anh - 20214990
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        int n = sc.nextInt();
        int[] A = new int[n];
        int sum = 0;
        System.out.println("Nhap tung phan tu cua mang");
        for( int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int next = A[i];
            int j;
            for (j = i - 1; j >= 0 && next < A[j]; j--) A[j + 1] = A[j];
            A[j + 1] = next;
        }
        System.out.println("Mang sau khi duoc sap xep");
            for (int i = 0; i < n; i++){
                System.out.print(A[i] + " ");
                sum += A[i];
            }
        System.out.println("\nGia tri trung binh cac phan tu trong mang: " + (float)sum/n);
        System.exit(0);
    }
}
