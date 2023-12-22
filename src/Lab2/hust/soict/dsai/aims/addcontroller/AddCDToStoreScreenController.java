package Lab2.hust.soict.dsai.aims.addcontroller;

import Lab2.hust.soict.dsai.aims.addscreen.AddBookToStoreScreen;
import Lab2.hust.soict.dsai.aims.addscreen.AddDVDToStoreScreen;
import Lab2.hust.soict.dsai.aims.cart.Cart;
import Lab2.hust.soict.dsai.aims.media.CompactDisc;
import Lab2.hust.soict.dsai.aims.screen.StoreScreen;
import Lab2.hust.soict.dsai.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddCDToStoreScreenController extends AddItemToStoreScreenController{           // Trinh Viet Anh 20214990
    @FXML
    private TextField artists;
    @FXML
    private TextField length;

    public AddCDToStoreScreenController(Store store, Cart cart, StoreScreen storeScreen) {
        super( store, cart, storeScreen);
    }
    @FXML
    void addMedia(ActionEvent event) {
        store.addMedia(new CompactDisc(title.getText(), category.getText(), Integer.parseInt(length.getText()),
                Float.parseFloat(cost.getText()), artists.getText()));
        storeScreen.dispose();
        StoreScreen storeScreen = new StoreScreen(store, cart);
    }
    @FXML
    void addDVD(ActionEvent event) {
        AddDVDToStoreScreen addDvdToStoreScreen = new AddDVDToStoreScreen(store, cart, storeScreen);
    }
    @FXML
    void addBook(ActionEvent event) {
        AddBookToStoreScreen addBookToStoreScreen = new AddBookToStoreScreen(store, cart, storeScreen);
    }

}
