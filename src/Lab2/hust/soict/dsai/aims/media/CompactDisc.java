package Lab2.hust.soict.dsai.aims.media;

import Lab2.hust.soict.dsai.exception.PlayerException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {                             // Trinh Viet Anh - 20214990
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public CompactDisc(String title, String artist) {
        super(title);
        this.artist = artist;
    }

    public CompactDisc(String title, String category, float cost, String artist) {
        super(title, category, cost);
        this.artist = artist;
    }

    public CompactDisc(String title, String category, int length, float cost, String artist) {
        super(title, category, length, cost);
        this.artist = artist;
    }
    public void addTrack(Track newTrack){
        if (tracks.contains(newTrack))                              // to check if the track has been added
            System.out.println("The disc has been added");          // notify
        else {                                                      // If not
            tracks.add(newTrack);                                   // add new track to arraylist
            System.out.println("Add successful");}                  // notify success
        }
    public void removeTrack(Track aTrack){
        if (tracks.contains(aTrack)){                               // to check if the track has been added
            tracks.remove(aTrack);                                  // remove the track
            System.out.println("Remove successful");}               // notify success
        else                                                        // If not
            System.out.println("The disc has not been added");      // notify
    }
    public float getLength(){
        float totalLength = 0;
        for (Track track : tracks) totalLength += track.getLength();
        return totalLength;
    }


    public void play() throws PlayerException {                                 // Trinh Viet Anh 20214990
        if (this.getLength() > 0) {
            JDialog dialog = new JDialog();
            dialog.setTitle("Playing CD " + this.title);
            dialog.setSize(250, 150 + (tracks.size() - 1) * 40);
            dialog.setLayout(new GridLayout(2 * (tracks.size()) + 1, 1, 0, 1));
            for (int i = 0; i < tracks.size(); i++) {
                if (tracks.get(i).getLength() > 0) {
                    JLabel label1 = new JLabel("Playing track: " + tracks.get(i).getTitle());
                    JLabel label2 = new JLabel("Track length: " + tracks.get(i).getLength());
                    dialog.add(label1);
                    dialog.add(label2);
                } else {
                    throw new PlayerException("ERROR: Track length is non-positive");
                }
            }
            JButton button = new JButton("OK");
            dialog.add(button);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dialog.setVisible(false);
                }
            });
        } else {
            throw new PlayerException("ERROR: CD length is non-positive");
        }
    }
    @Override
    public String toString(){
        return "CD - " + super.getTitle()+ " - " + category + " - " + getArtist() + " - " + length +
                " : " + cost + "$";
    }
}

