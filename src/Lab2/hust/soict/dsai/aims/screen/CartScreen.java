package Lab2.hust.soict.dsai.aims.screen;

import Lab2.hust.soict.dsai.aims.cart.Cart;
import Lab2.hust.soict.dsai.aims.store.Store;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

public class CartScreen extends JFrame {                                        // Trinh Viet Anh 20214990
    private Cart cart;

    public CartScreen(Store store, Cart cart, StoreScreen storeScreen) {
        super();
        this.cart = cart;
        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);
        this.setSize(1024, 768);
        this.setTitle("Cart");
        this.setVisible(true);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    CartScreenController controller = new CartScreenController(store, cart, storeScreen);
                    FXMLLoader loader = new FXMLLoader(new URL("file:" +
                            "C:\\Users\\admin\\IdeaProjects\\untitled\\src\\Lab2\\hust\\soict\\dsai\\aims\\screen\\Cart.fxml"));
                    loader.setController(controller);
                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root));
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        });
    }
}
