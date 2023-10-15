package Lab1;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] m = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String month;
        month = sc.next();
        if (m[0].contains(month)) System.out.println("1");
        else System.out.println("0");
    }
}
