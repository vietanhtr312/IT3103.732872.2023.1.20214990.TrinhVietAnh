package Lab2.hust.soict.dsai.aims.addscreen;

import Lab2.hust.soict.dsai.aims.addcontroller.AddBookToStoreScreenController;
import Lab2.hust.soict.dsai.aims.cart.Cart;
import Lab2.hust.soict.dsai.aims.screen.StoreScreen;
import Lab2.hust.soict.dsai.aims.store.Store;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

public class AddBookToStoreScreen extends JFrame {                                      // Trinh Viet Anh 20214990
    public AddBookToStoreScreen(Store store, Cart cart, StoreScreen storeScreen) {
        super();
        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);
        this.setResizable(false);
        this.setSize(1024, 768);
        this.setTitle("Add Book");
        this.setVisible(true);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    AddBookToStoreScreenController controller = new AddBookToStoreScreenController(store, cart, storeScreen);
                    FXMLLoader loader = new FXMLLoader(new URL("file:" + "C:\\Users\\admin\\IdeaProjects\\untitled\\src\\Lab2\\hust\\soict\\dsai\\aims\\fxml\\AddBook.fxml"));
                    loader.setController(controller);
                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });

    }
}
