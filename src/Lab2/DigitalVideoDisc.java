package Lab2;                                   // Trinh Viet Anh 20214990

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDisc = 0;
    private int id;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }
    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title) {
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public void printInfo(){                            // print information of disc
        System.out.println(this.title + " " + this.category + " " + this.director + " " + this.length + " " + this.cost);
    }

}
