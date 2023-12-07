package Lab2.hust.soict.dsai.test.store;                                             // Trịnh Việt Anh 20214990

import Lab2.hust.soict.dsai.aims.media.DigitalVideoDisc;
import Lab2.hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        //Create a new cart
        Store aStore = new Store();

        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Rogers Allers", 87, 19.95f);
        aStore.addDVD(dvd1);                            // test add one disc

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        DigitalVideoDisc list[] = {dvd2, dvd3};         //test add list of disc
        aStore.addDVD(list);

        aStore.removeDVD(dvd2);                         //test remove disc
    }
}
