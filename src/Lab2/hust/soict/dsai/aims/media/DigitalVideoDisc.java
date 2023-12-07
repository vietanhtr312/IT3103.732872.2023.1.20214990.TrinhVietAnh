package Lab2.hust.soict.dsai.aims.media;                                   // Trinh Viet Anh 20214990

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
    public void play() {                                                    // Trinh Viet Anh - 20214990
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
