package Lab1;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class SolveEquation{
        public static void main (String[] arg) {
            Scanner sc = new Scanner(System.in);
            int choose;
            choose = sc.nextInt();
            if (choose == 1) {
                int a, b;
                System.out.println("Phuong trinh bac nhat");
                System.out.println("Nhap a: ");
                a = sc.nextInt();
                System.out.println("Nhap b: ");
                b = sc.nextInt();
                if (a == 0){
                    if (b == 0) System.out.println("Phuong trinh co vo so nghiem");
                    else System.out.println("Phuong trinh vo nghiem");}
                else {
                    double x = (float) -b/ a;
                    System.out.println("Nghiem cua phuong trinh la: x = " + x);
                }
            }
            if (choose == 2) {
                System.out.println("He phuong trinh bac nhat");
                System.out.println("Nhap cac he so phuong trinh 1: ");
                System.out.print("a11 = ");
                int a11 = sc.nextInt();
                System.out.print("a12 = ");
                int a12 = sc.nextInt();
                System.out.print("b1 = ");
                int b1 = sc.nextInt();
                System.out.println("Nhap cac he so phuong trinh 2: ");
                System.out.print("a21 = ");
                int a21 = sc.nextInt();
                System.out.print("a22 = ");
                int a22 = sc.nextInt();
                System.out.print("b2 = ");
                int b2 = sc.nextInt();
                int D = a11 * a22 - a21 * a12;
                int D1 = b1 * a22 - b2 * a12;
                int D2 = a11 * b2 - a21 * b1;

                if (D == 0) {
                    if (D1 == 0 && D2 == 0) System.out.println("He phuong trinh vo so nghiem");
                    if (D1 != 0 || D2 != 0) System.out.println("He phuong trinh vo nghiem");
                } else System.out.println("He phuong trinh co nghiem duy nhat x1 = " + (float)D1 / D + " va x2 = " + (float)D2 / D);
            }
            if (choose == 3) {
                int a, b, c;
                System.out.println("Nhap cac he so: ");
                System.out.print("a = ");
                a = sc.nextInt();
                System.out.print("b = ");
                b = sc.nextInt();
                System.out.print("c = ");
                c = sc.nextInt();
                int delta = b * b - 4 * a * c;
                if (delta < 0) System.out.println("Phuong trinh vo nghiem");
                else if (delta == 0) System.out.println("Phuong trinh co nghiem kep: x = " + (float)-b / (2*a));
                else
                    System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + (float)(-b - sqrt(delta)) / (2 * a) + " va x2 = " + (float)(-b + sqrt(delta)) / (2 * a));
            }
            System.exit(0);
        }

}