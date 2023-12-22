package Lab2.hust.soict.dsai.aims.media;                                   // Trinh Viet Anh 20214990

import Lab2.hust.soict.dsai.exception.PlayerException;

import javax.swing.*;
import java.awt.*;

public class DigitalVideoDisc extends Disc implements Playable{
    protected static int nb;
    public DigitalVideoDisc(String title) {
        super(title);
        nb+=1;
        this.id = nb;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        nb+=1;
        this.id = nb;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
        nb+=1;
        this.id = nb;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
        nb+=1;
        this.id = nb;
    }

    @Override                                       // override toString method to print info of disc
                                                    //  Trinh Viet Anh 20214990
    public String toString(){
        return "DVD - " + super.getTitle()+ " - " + category + " - " + director + " - " + length +
                " : " + cost + "$";
    }

    @Override
    public void play() throws PlayerException {                                                    // Trinh Viet Anh - 20214990
        if (getLength() > 0) {
            JDialog dialog = new JDialog();
            dialog.setAlwaysOnTop(true);
            dialog.setTitle("Playing DVD");
            dialog.setSize(200, 150);
            dialog.setLayout(new GridLayout(3, 1, 0, 1));

            JLabel label1 = new JLabel("DVD title: " + this.getTitle());
            JLabel label2 = new JLabel("DVD length: " + this.getLength());
            dialog.add(label1);
            dialog.add(label2);
            JButton button = new JButton("OK");
            dialog.add(button);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
            button.addActionListener(e -> dialog.setVisible(false));
        } else {
            throw new PlayerException("ERROR: DVD length is non-positive");
        }
    }
}
