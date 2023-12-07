package Lab2.hust.soict.dsai.aims;                                   // Trinh Viet Anh 20214990

import Lab2.hust.soict.dsai.aims.cart.Cart;
import Lab2.hust.soict.dsai.aims.media.*;
import Lab2.hust.soict.dsai.aims.store.Store;

import java.util.*;

public class Aims {
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();

        // Establish and add new media to store                                             // Trinh Viet Anh - 20214990
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion", "Animation", "Roger Allers", 87, 19.95f);
        store.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", " John Musker", 90, 19.99f);
        store.addMedia(dvd3);

        CompactDisc cd1 = new CompactDisc("Christmas", "Jazz", 20f, "Michael Buble");
        cd1.addTrack(new Track("Jingle Bells", 3));
        cd1.addTrack(new Track("White Christmas" + 4));
        cd1.addTrack(new Track("Santa Baby" + 4));
        store.addMedia(cd1);
        CompactDisc cd2 = new CompactDisc("Gorillaz", "Rock", 14.99f, "Gorillaz");
        cd2.addTrack(new Track("5/4", 5));
        store.addMedia(cd2);
        CompactDisc cd3 = new CompactDisc("Blur", "Rock", 18.99f, "Blur");
        cd3.addTrack(new Track("Beetle Bum", 4));
        cd3.addTrack(new Track("Song 2", 3));
        store.addMedia(cd3);

        Book book1 = new Book("The Alchemist", "Novel", 10.2f);
        book1.addAuthor("Paulo Coelho");
        store.addMedia(book1);
        Book book2 = new Book("Island", "Fantasy", 15.0f);
        book2.addAuthor("Aldous Huxley");
        store.addMedia(book2);
        Book book3 = new Book("Wave", "Fiction", 12.75f);
        book3.addAuthor("Suzy Lee");
        store.addMedia(book3);

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            showMenu();                                                         // Display main menu
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> viewStore(store, cart, sc);
                case 2 -> updateStore(store, sc);
                case 3 -> seeCurrentCart(cart, sc);
                case 0 -> System.out.println("Exit!");
                default -> System.out.println("Invalid choice!");}
        } while (choice != 0);
        sc.close();
    }
    public static void viewStore(Store store, Cart cart, Scanner sc) {
        store.print();                                                          // Display medias in store
        int choice;
        do {
            storeMenu();                                                        // Display store menu
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> seeMediaDetail(store, cart, sc);
                case 2 -> addMediaToCart(store, cart, sc);
                case 3 -> playMedia(store, sc);
                case 4 -> cart.print();
                case 0 -> { /* Return to main menu */ }
                default -> System.out.println("Invalid choice!");}
        } while (choice != 0);
    }

    public static void seeMediaDetail(Store store, Cart cart, Scanner sc) {     // display detail menu of media
        System.out.print("Please input media's title: ");                       // take the title from input
        sc.nextLine();
        String title = sc.nextLine();
        Media media = store.searchByTitle2(title);

        if (media != null) {                                                    // If found media
            System.out.println(media.toString());                               // print media's info
            int subChoice;

            do {
                mediaDetailsMenu();                                             // Display menu
                subChoice = sc.nextInt();

                switch (subChoice) {
                    case 1 -> cart.addMedia(media);
                    case 2 -> playMedia(media);
                    case 0 -> { /* Return */ }
                    default -> System.out.println("Invalid choice!");
                }
            } while (subChoice != 0);
        } else {
            System.out.println("Media not found!");                          // notify if not found
        }
    }
    public static void addMediaToCart(Store store, Cart cart, Scanner sc) {
        System.out.print("Please input media's title: ");
        sc.nextLine();
        String titleToAdd = sc.nextLine();
        Media mediaToAdd = store.searchByTitle2(titleToAdd);

        if (mediaToAdd != null) {
            cart.addMedia(mediaToAdd);                                              // add new media to cart
        } else {
            System.out.println("Media not found!");
        }
    }

    public static void removeMediaFromStore(Store store, Scanner sc) {
        System.out.print("Please input media's title: ");
        sc.nextLine();
        String titleToRemove = sc.nextLine();
        Media mediaToRemove = store.searchByTitle2(titleToRemove);

        if (mediaToRemove != null) {
            store.removeMedia(mediaToRemove);
        } else {
            System.out.println("Media not found!");
        }
    }
    public static void playMedia(Store store, Scanner sc) {                         // play media with input title
        System.out.print("Please input media's title: ");
        sc.nextLine();
        String titleToPlay = sc.nextLine();
        Media mediaToPlay = store.searchByTitle2(titleToPlay);

        if (mediaToPlay != null) {
            if (mediaToPlay instanceof Playable) {                                 // if media can be played
                ((Playable) mediaToPlay).play();                                   // play media
            } else {
                System.out.println("This media cannot play!");                      // if not notify
            }
        } else {
            System.out.println("Media not found!");
        }
    }
    public static void playMedia(Media media) {                                     // play specifically media
        if (media instanceof Playable) {
            ((Playable) media).play();
        } else {
            System.out.println("This media cannot play!");
        }
    }
    public static void updateStoreMenu() {
        System.out.println("Option: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add media");
        System.out.println("2. Delete media");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2: ");
    }
    public static void updateStore(Store store, Scanner sc) {
        int choice;

        do {
            updateStoreMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> store.addWithDetails(sc);
                case 2 -> removeMediaFromStore(store, sc);
                case 0 -> { /* Return */ }
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    public static void seeCurrentCart(Cart cart, Scanner sc) {
        cart.print();
        int choice;

        do {
            cartMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> filterMediaInCart(cart, sc);
                case 2 -> sortMediaInCart(cart, sc);
                case 3 -> removeMediaFromCart(cart, sc);
                case 4 -> playMediaFromCart(cart, sc);
                case 5 -> placeOrder(cart, sc);
                case 0 -> { /* Return */ }
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    public static void filterMediaInCart(Cart cart, Scanner sc) {
        System.out.println("Choice: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter by title");
        System.out.println("2. Filter by id");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1 -> filterMediaByTitle(cart, sc);
            case 2 -> filterMediaById(cart, sc);
            case 0 -> { /* Return */ }
            default -> System.out.println("Invalid choice!");
        }
    }
    public static void filterMediaByTitle(Cart cart, Scanner sc) {
        System.out.print("Input title: ");
        String titleToFilter = sc.nextLine();
        boolean check = false;                                                      // check if the title found
        for (Media media : cart.getItemsOrdered()) {
            if (media.getTitle().equals(titleToFilter)) {
                System.out.println(media.toString());
                check = true;
            }
        }
        if(!check) System.out.println("Title not found! Please check again");         // if not notify
    }

    public static void filterMediaById(Cart cart, Scanner sc) {
        System.out.print("Input ID: ");
        int idToFilter = sc.nextInt();
        boolean check = false;
        for (Media media : cart.getItemsOrdered()) {
            if (media.getId() == idToFilter) {
                System.out.println(media.toString());
                check = true;
            }
        }
        if(!check) System.out.println("Id not found! Please check again");
    }

    public static void sortMediaInCart(Cart cart, Scanner sc) {
        System.out.println("Choice: ");
        System.out.println("--------------------------------");
        System.out.println("1. Sort by title");
        System.out.println("2. Filter by id");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                cart.sortByCostTitle();
                cart.print();
            }
            case 2 -> {
                cart.sortByTitleCost();
                cart.print();
            }
            default -> System.out.println("Invalid choice!");
        }
    }

    public static void removeMediaFromCart(Cart cart, Scanner sc) {
        System.out.print("Please input media's title: ");
        sc.nextLine();
        String titleToRemove = sc.nextLine();
        Media mediaToRemove = cart.searchByTitle2(titleToRemove);

        if (mediaToRemove != null) {
            cart.removeMedia(mediaToRemove);
        } else {
            System.out.println("Media not found!");
        }
    }


    public static void playMediaFromCart(Cart cart, Scanner sc) {
        System.out.print("Please input media's title: ");
        sc.nextLine();
        String titleToPlay = sc.nextLine();
        Media mediaToPlay = cart.searchByTitle2(titleToPlay);

        if (mediaToPlay != null) {
            playMedia(mediaToPlay);
        } else {
            System.out.println("Media not found!");
        }
    }

    public static void placeOrder(Cart cart, Scanner sc) {
        System.out.println("Number of media: " + cart.getQtyOrder());
        System.out.println("Total cost: " + cart.totalCost());
        System.out.print("Do you confirm? (Y/N) ");
        sc.nextLine();
        String confirm = sc.nextLine();

        if (confirm.equalsIgnoreCase("Y")) {
            System.out.println("Order has been placed!");
            cart.clearCart();
        } else if (confirm.equalsIgnoreCase("N")) {
            System.out.println("Order place failed!");
        } else {
            System.out.println("Invalid choice!");
        }
    }
}


