package Lab2.hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {                  // Trinh Viet Anh - 20214990
    @Override
    public int compare(Media o1, Media o2) {
        if (o1.getTitle() == o2.getTitle()) {
            return (int)(o1.getCost() - o2.getCost());
        }
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
