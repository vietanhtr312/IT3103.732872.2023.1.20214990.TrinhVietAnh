package Lab2.hust.soict.dsai.aims.screen;

import Lab2.hust.soict.dsai.aims.cart.Cart;
import Lab2.hust.soict.dsai.aims.media.Media;
import Lab2.hust.soict.dsai.aims.media.Playable;
import Lab2.hust.soict.dsai.exception.PlayerException;

import javax.naming.LimitExceededException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediaStore extends JPanel {                                        // Trinh Viet Anh 20214990
    private Media media;
    private JButton btnPlay, btnAddToCart;
    private Cart cart;
    public MediaStore(Media media, Cart cart) {
        this.media = media;
        this.cart = cart;
        ButtonListener btnListener = new ButtonListener();

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        btnAddToCart = new JButton("Add to cart");
        container.add(btnAddToCart);
        btnAddToCart.addActionListener(btnListener);

        if (media instanceof Playable){
            btnPlay = new JButton("Play");
            container.add(btnPlay);
            btnPlay.addActionListener(btnListener);

        }
        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
                if(button.equals("Add to cart")){
                    try {
                        cart.addMedia(media);
                    } catch (LimitExceededException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                if (button.equals("Play")){
                    try {
                        media.play();
                    } catch (PlayerException ex) {
                        throw new RuntimeException(ex);
                    }
                }
        }
    }

}
