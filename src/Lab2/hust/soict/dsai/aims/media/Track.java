package Lab2.hust.soict.dsai.aims.media;

import Lab2.hust.soict.dsai.exception.PlayerException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Track implements Playable{                                                 // Trinh Viet Anh - 20214990
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Track(String title) {
        this.title = title;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public void play() throws PlayerException {                         // Trinh Viet Anh 20214990
        if(getLength()>0) {
            JDialog dialog = new JDialog();
            dialog.setAlwaysOnTop(true);
            dialog.setSize(400, 300);
            dialog.setLayout(new FlowLayout());
            dialog.setLocationRelativeTo(null);
            JButton button = new JButton("OK");
            dialog.add(button);
            dialog.setVisible(true);
            JLabel jLabel = new JLabel("Playing track: " + this.getTitle() + "\n" +
                    "Track length: " + this.getLength());
            dialog.add(jLabel);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dialog.setVisible(false);
                }
            });
        }else {
            throw new PlayerException("ERROR: Track length is non-positive!");
        }
    }


    boolean equals(Track track){
        return (this.title.equals(track.title) && this.length == track.length);
    }
    @Override
    public String toString(){
        return "Track - " + getTitle()+ " - " + length;}

}


