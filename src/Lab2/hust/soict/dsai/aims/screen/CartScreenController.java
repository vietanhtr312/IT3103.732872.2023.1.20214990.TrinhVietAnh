package Lab2.hust.soict.dsai.aims.screen;

import Lab2.hust.soict.dsai.aims.addscreen.AddBookToStoreScreen;
import Lab2.hust.soict.dsai.aims.addscreen.AddCDToStoreScreen;
import Lab2.hust.soict.dsai.aims.addscreen.AddDVDToStoreScreen;
import Lab2.hust.soict.dsai.aims.cart.Cart;
import Lab2.hust.soict.dsai.aims.media.Media;
import Lab2.hust.soict.dsai.aims.media.Playable;
import Lab2.hust.soict.dsai.aims.store.Store;
import Lab2.hust.soict.dsai.exception.PlayerException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.*;
import java.awt.*;


public class CartScreenController {                                     // Trinh Viet Anh 20214990
    private Cart cart;
    private Store store;
    private StoreScreen storeScreen;
    @FXML
    private Button btnPlay;
    @FXML
    private Button btnRemove;
    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private TableColumn<Media, String> colMediaTitle;
    @FXML
    private ToggleGroup filterCategory;
    @FXML
    private TableView<Media> tblMedia;
    @FXML
    void btnRemovePressed(ActionEvent event) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
        if(cart.getItemsOrdered().isEmpty()) {
            totalCost.setText("0.00 $");
        }
    }
    CartScreenController(Store store, Cart cart, StoreScreen storeScreen) {
        super();
        this.store = store;
        this.cart = cart;
        this.storeScreen = storeScreen;
    }
    public void initialize(){                                                   // Trinh Viet Anh 20214990
        colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String> ("title"));
        colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
        tblMedia.setItems(this.cart.getItemsOrdered());

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);
        totalCost.setText(cart.totalCost() + "$");

        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                (observableValue, oldValue, newValue) -> {
                    if(newValue!=null){
                        updateButtonBar(newValue);
                        Float total = cart.totalCost();
                        totalCost.setText(total + " $");
                    }
                }
        );
    }
    void updateButtonBar(Media media) {
        btnRemove.setVisible(true);
        if(media instanceof Playable){
            btnPlay.setVisible(true);
        } else btnPlay.setVisible(false);
    }
    @FXML
    private Label totalCost;                                                        // Trinh Viet Anh 20214990
    @FXML
    void placeOrder(ActionEvent event) {
        cart.clearCart();
        totalCost.setText("0.00 $");
        JDialog dialog = new JDialog();
        dialog.setSize(200, 150);
        dialog.setTitle("Place order");
        dialog.setLayout(new FlowLayout());
        JLabel jLabel = new JLabel("Order has been placed!");
        dialog.add(jLabel, BorderLayout.CENTER);
        JButton button = new JButton("OK");

        dialog.add(button, BorderLayout.SOUTH);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        button.addActionListener(e -> dialog.setVisible(false));
    }
    @FXML
    void btnPlayPressed() throws PlayerException {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
            media.play();
    }
    @FXML
    void viewStore(ActionEvent event) {
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

    @FXML
    void addDVD(ActionEvent event) {
        AddDVDToStoreScreen addDvdToStoreScreen = new AddDVDToStoreScreen(store, cart, storeScreen);
    }

}
