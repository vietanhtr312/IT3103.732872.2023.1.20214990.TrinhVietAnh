package Lab2.hust.soict.dsai.aims.media;

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

    @Override
    public void play() {                                                // Trinh Viet Anh - 20214990
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }


    boolean equals(Track track){
        return (this.title.equals(track.title) && this.length == track.length);
    }
    @Override
    public String toString(){
        return "Track - " + getTitle()+ " - " + length;}

}

