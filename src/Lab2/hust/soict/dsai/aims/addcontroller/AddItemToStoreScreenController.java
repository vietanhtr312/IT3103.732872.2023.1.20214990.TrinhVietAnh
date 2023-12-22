package Lab2.hust.soict.dsai.aims.addcontroller;

import Lab2.hust.soict.dsai.aims.cart.Cart;
import Lab2.hust.soict.dsai.aims.screen.CartScreen;
import Lab2.hust.soict.dsai.aims.screen.StoreScreen;
import Lab2.hust.soict.dsai.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class AddItemToStoreScreenController {                                           // Trinh Viet Anh 20214990
    protected Cart cart;
    protected Store store;
    protected StoreScreen storeScreen;
    @FXML
    protected TextField title;
    @FXML
    protected TextField category;
    @FXML
    protected TextField cost;
    public AddItemToStoreScreenController(Store store, Cart cart, StoreScreen storeScreen){
        super();
        this.cart = cart;
        this.store = store;
        this.storeScreen = storeScreen;
    }
    @FXML
    void viewStore(ActionEvent event) {
        storeScreen.dispose();
        StoreScreen storeScreen = new StoreScreen(store, cart);
    }
    @FXML
    void viewCart(ActionEvent event) {
        CartScreen cartScreen = new CartScreen(store, cart, storeScreen);
    }
}
