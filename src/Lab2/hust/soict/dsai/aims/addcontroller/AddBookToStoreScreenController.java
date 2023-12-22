package Lab2.hust.soict.dsai.aims.addcontroller;

import Lab2.hust.soict.dsai.aims.addscreen.AddCDToStoreScreen;
import Lab2.hust.soict.dsai.aims.addscreen.AddDVDToStoreScreen;
import Lab2.hust.soict.dsai.aims.cart.Cart;
import Lab2.hust.soict.dsai.aims.screen.StoreScreen;
import Lab2.hust.soict.dsai.aims.store.Store;
import Lab2.hust.soict.dsai.aims.media.Book;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class AddBookToStoreScreenController extends AddItemToStoreScreenController{             // Trinh Viet Anh 20214990
    public AddBookToStoreScreenController(Store store, Cart cart, StoreScreen storeScreen) {
        super(store, cart, storeScreen);
    }
    @FXML
    private TextField authors;
    @FXML
    void addMedia(ActionEvent event) {
        List<String> authorList = new ArrayList<String>();
        Book book = new Book(title.getText(), category.getText(), Float.parseFloat(cost.getText()));
        book.addAuthor(authors.getText());
        store.addMedia(book);
        storeScreen.dispose();
        StoreScreen storeScreen = new StoreScreen(store, cart);
    }
    @FXML
    void addCD(ActionEvent event) {
        AddCDToStoreScreen addCDToStoreScreen = new AddCDToStoreScreen(store, cart, storeScreen);
    }

    @FXML
    void addDVD(ActionEvent event) {
        AddDVDToStoreScreen addDvdToStoreScreen = new AddDVDToStoreScreen(store, cart, storeScreen);
    }

}
