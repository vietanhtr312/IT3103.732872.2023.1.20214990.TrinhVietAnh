package Lab2.hust.soict.dsai.test.store;                                             // Trịnh Việt Anh 20214990

import Lab2.hust.soict.dsai.aims.media.Book;
import Lab2.hust.soict.dsai.aims.media.CompactDisc;
import Lab2.hust.soict.dsai.aims.media.DigitalVideoDisc;
import Lab2.hust.soict.dsai.aims.store.Store;
import Lab2.hust.soict.dsai.aims.screen.StoreScreen;
import Lab2.hust.soict.dsai.exception.PlayerException;

public class StoreTest {
    public static void main(String[] args) throws PlayerException {
        //Create a new cart
        Store aStore = new Store();

        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Rogers Allers", 87, 19.95f);
        aStore.addMedia(dvd1);                              // test add one disc

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        aStore.addMedia(dvd2);
        aStore.addMedia(dvd3);

        CompactDisc cd1 = new CompactDisc("Christmas", "Holiday", 100, 50f, "Michael Buble");
        aStore.addMedia(cd1);
        Book book1 = new Book("Nha gia kim", "Giao duc");
        book1.addAuthor("Paulo Coelho");
        aStore.addMedia(book1);

//        aStore.print();
    }
}
