package Lab2.hust.soict.dsai.aims.media;

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

    @Override
    public void play() {                                                            // Trinh Viet Anh - 20214990
        System.out.println("Playing CompactDisc of artist: " + artist);
        System.out.println("Number of tracks: " + tracks.size());
        int i = 1;
        for (Track track : tracks) {
            System.out.println("Play track number " + i);
            System.out.println("Track title: " + track.getTitle());
            System.out.println("Track length: " + track.getLength());
            i++;
        }
    }
    @Override
    public String toString(){
        return "CD - " + super.getTitle()+ " - " + category + " - " + getArtist() + " - " + length +
                " : " + cost + "$";
    }
}

