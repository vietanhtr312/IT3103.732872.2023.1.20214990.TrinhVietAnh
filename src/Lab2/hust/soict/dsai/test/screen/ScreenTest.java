package Lab2.hust.soict.dsai.test.screen;

import Lab2.hust.soict.dsai.aims.cart.Cart;
import Lab2.hust.soict.dsai.aims.media.CompactDisc;
import Lab2.hust.soict.dsai.aims.media.DigitalVideoDisc;
import Lab2.hust.soict.dsai.aims.screen.StoreScreen;
import Lab2.hust.soict.dsai.aims.store.Store;

public class ScreenTest {
    public static void main(String[] args) {
        Store store1 = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Rogers Allers", 87, 19.95f);
        store1.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        store1.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        store1.addMedia(dvd3);

        CompactDisc cd1 = new CompactDisc("Christmas", "Jazz", 20f, "Michael Buble");
        store1.addMedia(cd1);
        CompactDisc cd2 = new CompactDisc("Gorillaz", "Rock", 14.99f, "Gorillaz");
        store1.addMedia(cd2);
        CompactDisc cd3 = new CompactDisc("Blur", "Rock", 18.99f, "Blur");
        store1.addMedia(cd3);
        Cart cart1 = new Cart();
        new StoreScreen(store1, cart1);
    }
}
