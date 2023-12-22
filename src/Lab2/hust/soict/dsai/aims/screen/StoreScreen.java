package Lab2.hust.soict.dsai.aims.screen;

import Lab2.hust.soict.dsai.aims.addscreen.AddBookToStoreScreen;
import Lab2.hust.soict.dsai.aims.addscreen.AddCDToStoreScreen;
import Lab2.hust.soict.dsai.aims.addscreen.AddDVDToStoreScreen;
import Lab2.hust.soict.dsai.aims.cart.Cart;
import Lab2.hust.soict.dsai.aims.media.*;
import Lab2.hust.soict.dsai.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StoreScreen extends JFrame {                               // Trinh Viet Anh 20214990
    private Store store;
    private Cart cart;
    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }
    JMenuBar createMenuBar(){
        JMenu menu = new JMenu("Options");
        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBook = new JMenuItem("Add Book");
        addBook.addActionListener(new AddBook(this));
        JMenuItem addDVD = new JMenuItem("Add DVD");
        addDVD.addActionListener(new AddDVD(this));
        JMenuItem addCD = new JMenuItem("Add CD");
        addCD.addActionListener(new AddCD(this));
        smUpdateStore.add(addBook);
        smUpdateStore.add(addCD);
        smUpdateStore.add(addDVD);
        menu.add(smUpdateStore);
        JMenuItem viewCart = new JMenuItem("View Cart");
        menu.add(viewCart);
        viewCart.addActionListener(new ViewCart(this));
        menu.add(new JMenuItem("View Store"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }
    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS-ANHTV-4990");
        title.setFont((new Font(title.getFont().getName(), Font.PLAIN, 50)));
        title.setForeground(Color.CYAN);

        JButton cart = new JButton("View cart");
        cart.addActionListener(new ViewCart(this));
        cart.setPreferredSize(new Dimension(100, 50));
        cart.setMaximumSize(new Dimension(100, 50));

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemInStore();
        for (int i = 0; i < store.getItemInStore().size(); i++){
            MediaStore cell = new MediaStore(mediaInStore.get(i), cart);
            center.add(cell);
        }
        return center;
    }

    public StoreScreen(Store store, Cart cart) {
        this.store = store;
        this.cart = cart;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
    }
    private class ViewCart implements ActionListener {
        private StoreScreen storeScreen;
        public ViewCart(StoreScreen storeScreen) {
            this.storeScreen = storeScreen;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            this.storeScreen.dispose();
            CartScreen cartScreen = new CartScreen(store, cart, storeScreen);
        }
    }


    public class AddBook implements ActionListener{
        private StoreScreen storeScreen;
        public AddBook(StoreScreen storeScreen) {
            this.storeScreen = storeScreen;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            this.storeScreen.dispose();
            AddBookToStoreScreen addBookToStoreScreen = new AddBookToStoreScreen(store, cart, storeScreen);
        }
    }

    public class AddDVD implements ActionListener{
        private StoreScreen storeScreen;
        public AddDVD(StoreScreen storeScreen) {
            this.storeScreen = storeScreen;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            this.storeScreen.dispose();
            AddDVDToStoreScreen addDVDToStoreScreen = new AddDVDToStoreScreen(store, cart, storeScreen);
        }
    }

    public class AddCD implements ActionListener{
        private StoreScreen storeScreen;
        public AddCD(StoreScreen storeScreen) {
            this.storeScreen = storeScreen;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            this.storeScreen.dispose();
            AddCDToStoreScreen addCDToStoreScreen = new AddCDToStoreScreen(store, cart, storeScreen);
        }
    }
}
