package Lab1;                    // Trinh Viet Anh - 20214990
import java.util.Scanner;
public class DayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] m = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int year = 0, month = 0;
        String strYear, strMonth;
        do {                                    // Input year
            System.out.println("Nhap nam: ");
            strYear = sc.nextLine();
            // check if year is letter
            if (Character.isLetter(strYear.charAt(0))) { System.out.println("Hay nhap lai");
                continue;}
            year = Integer.parseInt(strYear);
            if (year < 0){ System.out.println("Hay nhap lai");          // check valid year
                continue;}

            System.out.println("Nhap thang: "); // Input month
            strMonth = sc.nextLine();
            if (strMonth.length() > 2) {                // if month is not a number
                if (strMonth.endsWith(".")) strMonth = strMonth.substring(0, 3);    // remove '.' if it appears
                for (int i = 0; i < 12; i++)
                    if (m[i].contains(strMonth)) month = i + 1;                     // change to number
            } else month = Integer.parseInt(strMonth);
            if (month == 0 || month < 0) System.out.println("Hay nhap lai");        // check valid month
        } while (month == 0 || month < 0);
        // Print result
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                    System.out.println("So ngay trong thang " + month + " nam " + year + " la 31");
            case 4, 6, 9, 11 -> System.out.println("So ngay trong thang " + month + " nam " + year + " la 30");
            case 2 -> {
                if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))          // check if year is a leap year
                    System.out.println("So ngay trong thang 2 nam " + year + " la 28");
                else System.out.println("So ngay trong thang 2 nam " + year + " la 29");
            }
        }
        System.exit(0);
    }
}
