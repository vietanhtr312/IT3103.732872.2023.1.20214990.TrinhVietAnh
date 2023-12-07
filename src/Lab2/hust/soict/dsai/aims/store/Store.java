package Lab2.hust.soict.dsai.aims.store;                                               // Trịnh Việt Anh 20214990

import Lab2.hust.soict.dsai.aims.media.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {                                                            // Trinh Viet Anh - 20214990
    public static final int MAX_NUMBERS_ITEM = 200;
    private ArrayList<Media> itemInStore = new ArrayList<Media>();

                                                                    // method to add media
    public void addMedia(Media newMedia) {
        if (itemInStore.size() == MAX_NUMBERS_ITEM) {                       // check if the store is full
            System.out.println("The STORE is almost full");
        } else {
            if (itemInStore.contains(newMedia))                             // to check if the disc has been added
                System.out.println("The disc has been added");
            else {                                                          //If not
            itemInStore.add(newMedia);
            System.out.println("Store add successful");
            }
        }
    }

                                                                    // method to add a list of media
    public void  addMedia(Media[] mediaList){
        for (Media media : mediaList) {
            addMedia(media);
            if (itemInStore.size() == MAX_NUMBERS_ITEM) break;
        }
    }

                                                                    // method to remove media
    public void removeMedia(Media aMedia){
        if (itemInStore.contains(aMedia)){                                  // to check if the media has been added
            itemInStore.remove(aMedia);                                     // remove the media
            System.out.println("Remove successful");}                       // notify success
        else                                                                // If not
            System.out.println("The disc has not been added");              // notify
    }

    public void print(){
        System.out.println("******************STORE********************");
        for (Media order : itemInStore) {
            System.out.println(order.toString());
        }
        System.out.println("******************************************");
    }
    public void searchByTitle(String title){
        boolean check = false;
        for(Media order : itemInStore)
            if (order.getTitle().equals(title)){                                // if itemOrdered has media with same title
                System.out.println("The disc requested: ");
                System.out.println(order.toString());                           // print out media info
                check = true;
            }
        if (!check) System.out.println("Can not find the ID requested");        // if not notify
    }
    public Media searchByTitle2(String title){
        for(Media order : itemInStore)
            if (order.getTitle().equals(title)){                                // if itemOrdered has media with same title
                return order;
            }
        return null;        // if not notify
    }
    public void addWithDetails(Scanner sc) {                                    // add a new media to store by input
        System.out.print("Input media's type: ");
        sc.nextLine();
        String type = sc.nextLine();

        System.out.print("Please input media's info: ");
        System.out.print("Title: ");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.print("Category: ");
        sc.nextLine();
        String category = sc.nextLine();
        System.out.print("Cost: ");
        sc.nextFloat();
        float cost = sc.nextFloat();
        Media m = null;
        if (type.equals("DigitalVideoDisc")){
            System.out.print("Director: ");
            sc.nextLine();
            String director = sc.nextLine();
            System.out.print("Length: ");
            sc.nextInt();
            int length = sc.nextInt();
            m = new DigitalVideoDisc(title, category, director, length, cost);}
        if (type.equals("CompactDisc")){
            System.out.print("Artist: ");
            sc.nextLine();
            String artist = sc.nextLine();
            m = new CompactDisc(title, category, cost, artist);}
        if (type.equals("Book")){
            m = new Book(title, category, cost);
        }
        itemInStore.add(m);
    }

}
