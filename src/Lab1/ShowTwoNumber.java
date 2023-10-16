package Lab1;                    // Trinh Viet Anh - 20214990
import javax.swing.JOptionPane;
public class ShowTwoNumber{
    public static void main (String[] arg){
        String strNum1, strNum2;
        String strNotification = "You 've just entered: ";
        strNum1 = JOptionPane.showInputDialog(null,
                "Trinh Viet Anh - 4990 Please input the first number: ",
                "Trinh Viet Anh - 4990 Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null,
                "Trinh Viet Anh - 4990 Please input the second number: ",
                "Trinh Viet Anh - 4990 Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        JOptionPane.showMessageDialog(null, strNotification,
                "Show two numbers", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}