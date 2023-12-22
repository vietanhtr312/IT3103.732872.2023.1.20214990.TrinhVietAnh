package Lab2.hust.soict.dsai.aims.addcontroller;

import Lab2.hust.soict.dsai.aims.addscreen.AddBookToStoreScreen;
import Lab2.hust.soict.dsai.aims.addscreen.AddCDToStoreScreen;
import Lab2.hust.soict.dsai.aims.cart.Cart;
import Lab2.hust.soict.dsai.aims.media.DigitalVideoDisc;
import Lab2.hust.soict.dsai.aims.screen.StoreScreen;
import Lab2.hust.soict.dsai.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddDVDToStoreScreenController extends AddItemToStoreScreenController{          // Trinh Viet Anh 20214990
    @FXML
    private TextField director;
    @FXML
    private TextField length;
    public AddDVDToStoreScreenController(Store store, Cart cart, StoreScreen storeScreen) {
        super(store, cart, storeScreen);
    }
    @FXML
    void addMedia(ActionEvent event) {
        store.addMedia(new DigitalVideoDisc(title.getText(), category.getText(), director.getText(),
                Integer.parseInt(length.getText()), Float.parseFloat(cost.getText())));
        storeScreen.dispose();
        StoreScreen storeScreen = new StoreScreen(store, cart);
    }
    @FXML
    void addBook(ActionEvent event) {
        AddBookToStoreScreen addBookToStoreScreen = new AddBookToStoreScreen(store, cart, storeScreen);
    }

    @FXML
    void addCD(ActionEvent event) {
        AddCDToStoreScreen addCDToStoreScreen = new AddCDToStoreScreen(store, cart, storeScreen);
    }


}
