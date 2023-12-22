package Lab2.hust.soict.dsai.aims.media;                                                    // Trinh Viet Anh - 20214990

import Lab2.hust.soict.dsai.exception.PlayerException;

import java.util.Comparator;

public abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public float getCost() {
        return cost;
    }

    public String getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Media(String title) {
        this.title = title;
    }
    public Media(String title, String category) {
        this.title = title;
        this.category = category;
    }
    public Media(String title, String category, float cost) throws IllegalArgumentException{        // Trinh Viet Anh 20214990
        this.title = title;
        this.category = category;
        if(cost >= 0)
        this.cost = cost;
        else {
            throw new IllegalArgumentException("ERROR: The cost can not be negative");
        }

    }
    @Override
    public boolean equals(Object obj) {                                     // Trinh Viet Anh 2021990
        boolean check = false;
        if(obj instanceof Media objMedia) {
            if(objMedia.getTitle().equals(this.getTitle())) {
                check = true;
            }
        }
        return check;
    }
    public void play() throws PlayerException{}
}
