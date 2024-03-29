package Lab2.hust.soict.dsai.test.cart;                                       // // Trinh Viet Anh 20214990

import Lab2.hust.soict.dsai.aims.cart.Cart;
import Lab2.hust.soict.dsai.aims.media.DigitalVideoDisc;

import javax.naming.LimitExceededException;

public class CartTest {
    public static void main(String[] args) throws LimitExceededException {
        //Create a new cart
        Cart anOrder = new Cart();

        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Rogers Allers", 87, 19.95f);
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        anOrder.addMedia(dvd3);

        // Test the print method
        anOrder.print();

        // Test the search method
        anOrder.searchById(4);
        anOrder.searchById(3);
        anOrder.searchByTitle("avengers");
        anOrder.searchByTitle("Star Wars");
    }
}
