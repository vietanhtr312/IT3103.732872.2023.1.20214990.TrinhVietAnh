package Lab1;

import javax.swing.*;

public class CustomizeChoosingOption {
    public static void main(String[] args) {
        Object[] availableOptions = {"I do", "I don't"};        // new option
        int option = JOptionPane.showOptionDialog(null, "Do you like the movie", "Survey",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, availableOptions,
                availableOptions[0]);

        JOptionPane.showMessageDialog(null,
                "You have chosen: " + (option==JOptionPane.YES_OPTION?"I do":"I don't"));
    }
}
