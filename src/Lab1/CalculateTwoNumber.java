package Lab1;                   // Trinh Viet Anh - 20214990
import javax.swing.JOptionPane;
public class CalculateTwoNumber{
        public static void main (String[] arg){
            String strNum1, strNum2;
            double num2;

            // Input two number
            strNum1 = JOptionPane.showInputDialog(null,
                    "Please input the first number: ", "Input the first number",
                    JOptionPane.INFORMATION_MESSAGE);
            double num1 = Double.parseDouble(strNum1);
            do{
            strNum2 = JOptionPane.showInputDialog(null,
                    "Please input the second number: ", "Input the second number",
                    JOptionPane.INFORMATION_MESSAGE);
            num2 = Double.parseDouble(strNum2);
            if (num2 == 0)                             // check if num2 = 0 then request to enter again
                JOptionPane.showMessageDialog(null,"Hay nhap lai so khac 0");}
            while (num2 == 0);

            double sum = num1 + num2;                   // calculate sum
            double dif = num1 - num2;                   // difference
            double pro = num1 * num2;                   // product
            double quo = num1 / num2;                   // quotient

            // Print result
            System.out.println("Tong cua 2 so: " + sum);
            System.out.println("Hieu cua 2 so: " + dif);
            System.out.println("Tich cua 2 so: " + pro);
            System.out.println("Thuong cua 2 so: " + quo);
            System.exit(0);
        }
}