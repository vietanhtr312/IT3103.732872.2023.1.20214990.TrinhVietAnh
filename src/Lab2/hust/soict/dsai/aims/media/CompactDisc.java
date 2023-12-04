package Lab2.hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc {
    private String artist;
    private ArrayList<Track> tracks;

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

    public CompactDisc(String title, String category, String director, float cost, String artist) {
        super(title, category, director, cost);
        this.artist = artist;
    }

    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }
    public void addTrack(Track newTrack){
        if (this.tracks.contains(newTrack))                         // to check if the disc has been added
            System.out.println("The disc has been added");          // notify
        else {                                                      // If not
            this.tracks.add(newTrack);                              // add new track to arraylist
            System.out.println("Add successful");}                  // notify success
        }
    public void removeTrack(Track aTrack){
        if (this.tracks.contains(aTrack)){                          // to check if the disc has been added
            this.tracks.add(aTrack);                                // remove the track
            System.out.println("Remove successful");}               // notify success
        else                                                        // If not
            System.out.println("The disc has not been added");      // notify
    }
    public float getLength(){
        float totalLength = 0;
        for (Track track : tracks) totalLength += track.getLength();
        return totalLength;
    }
    }

