package Lab1;
import javax.swing.JOptionPane;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class SolveEquation{
        public static void main (String[] arg) {
            Scanner sc = new Scanner(System.in);
            int choose;
            choose = sc.nextInt();
            if (choose == 1) {
                int a, b;

                System.out.println("Nhap a: ");

                a = sc.nextInt();
                System.out.println("Nhap b: ");

                b = sc.nextInt();
                if (a == 0 && b == 0) System.out.println("Phuong trinh co vo so nghiem");
                else if (a == 0 && b != 0) System.out.println("Phuong trinh vo nghiem");
                else {
                    double x = (-b )/ a;
                    System.out.println("Nghiem cua phuong trinh la: x = " + x);
                }
            }
            if (choose == 2) {
                System.out.println("Nhap cac he so: ");
                int a11 = sc.nextInt();
                int a12 = sc.nextInt();
                int a21 = sc.nextInt();
                int a22 = sc.nextInt();

                System.out.println("Nhap :");
                int b1 = sc.nextInt();
                int b2 = sc.nextInt();
                int D = a11 * a22 - a21 * a12;
                int D1 = b1 * a22 - b2 * a12;
                int D2 = a11 * b2 - a21 * b1;

                if (D == 0) {
                    if (D1 == 0 && D2 == 0) System.out.println("He phuong trinh vo so nghiem");
                    else if (D1 != 0 || D2 != 0) System.out.println("He phuong trinh vo nghiem");
                } else System.out.println("He phuong trinh co nghiem duy nhat x1 = " + D1 / D + "va x2 = " + D2 / D);
            }
            if (choose == 3) {
                int a, b, c;
                System.out.println("Nhap cac he so: ");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                int del = b * b - 4 * a * c;
                if (del < 0) System.out.println("Phuong trinh vo nghiem");
                else if (del == 0) System.out.println("Phuong trinh co nghiem kep: x = " + -b / (2*a));
                else
                    System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + (-b - sqrt(del)) / (2 * a) + "va x2 = " + (-b + sqrt(del)) / (2 * a));
            }
            System.exit(0);
        }

}