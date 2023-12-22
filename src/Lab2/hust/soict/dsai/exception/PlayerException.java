package Lab2.hust.soict.dsai.exception;
import javax.swing.*;
import java.awt.*;
import java.lang.Exception;

public class PlayerException extends Exception{             // Trinh Viet Anh 20214990
    public PlayerException() {
    }

    public PlayerException(String message) {
        JDialog dialog = new JDialog();
        dialog.setTitle("Illegal Length");
        dialog.setAlwaysOnTop(true);
        dialog.setSize(300, 150);
        dialog.setLayout(new BorderLayout());
        dialog.setLocationRelativeTo(null);
        dialog.add(new JLabel(message), BorderLayout.CENTER);
        JButton button = new JButton("OK");
        dialog.add(button, BorderLayout.SOUTH);
        dialog.setVisible(true);
        button.addActionListener(e -> dialog.setVisible(false));
    }

    public PlayerException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayerException(Throwable cause) {
        super(cause);
    }

    public PlayerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
