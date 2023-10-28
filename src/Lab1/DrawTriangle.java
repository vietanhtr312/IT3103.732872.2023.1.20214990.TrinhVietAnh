package Lab1;                // Trinh Viet Anh - 20214990
import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Nhap x: ");             // Input height of triangle
        x = sc.nextInt();
        for(int i = 0; i < x; i++){
            for (int j = x; j > i; j--)
                System.out.print(" ");
            for (int k = 1; k <= (2*i +1) ; k++)
                System.out.print("*");
            System.out.println();
        }

    }
}
