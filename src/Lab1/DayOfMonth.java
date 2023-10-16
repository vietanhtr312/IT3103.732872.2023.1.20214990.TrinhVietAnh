package Lab1;
import java.util.Scanner;


public class DayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        String strYear, strMonth;
        int month = 0;

        do {
            String[] m = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            System.out.println("Nhap nam: ");
            strYear = sc.next();
            if (Character.isLetter(strYear.charAt(1))) {
                System.out.println("Hay nhap lai");
                continue;}
            year = Integer.parseInt(strYear);
            System.out.println("Nhap thang: ");
            strMonth = sc.next();
            if (strMonth.length() > 1) {
                if (strMonth.endsWith(".")) strMonth = strMonth.substring(0, 3);
                for (int i = 0; i < 12; i++)
                    if (m[i].contains(strMonth)) month = i + 1;

            } else month = Integer.parseInt(strMonth);
            if (month == 0) System.out.println("Hay nhap lai");
        } while (month == 0 );
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("So ngay trong thang " + month + " nam " + year + " la 31");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("So ngay trong thang " + month + " nam " + year + " la 30");
                break;
            case 2:
                if (year%4 != 0 || (year %100 == 0 && year %400 != 0)) System.out.println("So ngay trong thang 2 nam " + year + " la 28");
                else System.out.println("So ngay trong thang 2 nam " + year + " la 29");

        }
        System.exit(0);
    }
}
