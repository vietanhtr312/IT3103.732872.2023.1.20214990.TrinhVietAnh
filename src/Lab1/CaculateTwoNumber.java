package Lab1;
import javax.swing.JOptionPane;
public class CaculateTwoNumber{
        public static void main (String[] arg){
            String strNum1, strNum2;
            String strNotification = "You just have entered: ";

            strNum1 = JOptionPane.showInputDialog(null,
                    "Please input the first number: ", "Input the first number",
                    JOptionPane.INFORMATION_MESSAGE);
            double num1 = Double.parseDouble(strNum1);

            strNum2 = JOptionPane.showInputDialog(null,
                    "Please input the second number: ", "Input the second number",
                    JOptionPane.INFORMATION_MESSAGE);
            double num2 = Double.parseDouble(strNum2);

            double sum = num1 + num2;
            double dif = num1 - num2;
            double pro = num1 * num2;
            double quo = num1 / num2;

            System.out.println("Tong cua 2 so: " + sum);
            System.out.println("Hieu cua 2 so: " + dif);
            System.out.println("Tich cua 2 so: " + pro);
            System.out.println("Thuong cua 2 so: " + quo);
            System.exit(0);
        }
}