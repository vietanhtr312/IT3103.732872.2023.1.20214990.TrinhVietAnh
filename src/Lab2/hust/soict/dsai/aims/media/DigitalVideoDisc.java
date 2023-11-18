package Lab2.hust.soict.dsai.aims.media;                                   // Trinh Viet Anh 20214990

public class DigitalVideoDisc extends Disc{

    public DigitalVideoDisc(String title) {
        super(title);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    @Override                                       // override toString method to print info of disc
                                                    //  Trinh Viet Anh 20214990
    public String toString(){
        return "DVD - " + super.getTitle()+ " - " + category + " - " + director + " - " + length +
                " : " + cost + "$";
    }

                                                    // check if the title is match
                                                    // Trinh Viet Anh 20214990
    public boolean isMatch(String title){
        if (this.title.equalsIgnoreCase(title)) return true;
        else return false;
    }
}
