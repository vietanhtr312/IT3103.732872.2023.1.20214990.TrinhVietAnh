package Lab2.hust.soict.dsai.aims.store;                                               // Trịnh Việt Anh 20214990
import Lab2.hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Store {
    public static final int MAX_NUMBERS_ITEM = 200;
    private ArrayList<Media> itemInStore = new ArrayList<Media>();;

                                                                    // method to add media
    public void addMedia(Media newMedia) {
        if (itemInStore.size() == MAX_NUMBERS_ITEM) {                       // check if the store is full
            System.out.println("The STORE is almost full");
        } else {
            if (itemInStore.contains(newMedia))                             // to check if the disc has been added
                System.out.println("The disc has been added");
            else {                                                          //If not
            itemInStore.add(newMedia);
            System.out.println("Store add successful");
            }
        }
    }

                                                                    // method to add a list of media
    public void  addMedia(Media[] mediaList){
        for (Media media : mediaList) {
            addMedia(media);
            if (itemInStore.size() == MAX_NUMBERS_ITEM) break;
        }
    }

                                                                    // method to remove media
    public void removeMedia(Media aMedia){
        if (itemInStore.contains(aMedia)){                                  // to check if the media has been added
            itemInStore.remove(aMedia);                                     // remove the media
            System.out.println("Remove successful");}                       // notify success
        else                                                                // If not
            System.out.println("The disc has not been added");              // notify
    }

}
