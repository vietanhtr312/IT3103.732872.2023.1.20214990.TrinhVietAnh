package Lab2.hust.soict.dsai.aims.store;                                               // Trịnh Việt Anh 20214990

import Lab2.hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBERS_ITEM = 200;
    private DigitalVideoDisc itemInStore[] = new DigitalVideoDisc[MAX_NUMBERS_ITEM];
    private int qtyNumber;

                                                                    // method to add each of disc
    public void addDVD(DigitalVideoDisc dvd) {
        boolean check = false;
        if (qtyNumber == MAX_NUMBERS_ITEM) {                                // check if the store is full
            System.out.println("The STORE is almost full");
        } else {
            for (int i = 0; i < qtyNumber; i++)                             // traverse the list
                if (itemInStore[i].equals(dvd)) {                           // to check if the disc has been added
                    System.out.println("The disc has been added");
                    check = true;
                    break;
                }
            if (!check) {                                                   // If not
                itemInStore[qtyNumber] = dvd;                               // add disc to the list
                qtyNumber += 1;                                             // add quantity
                System.out.println("Store add successful");
            }
        }
    }

                                                                            // method to add a list of disc
    public void  addDVD(DigitalVideoDisc[] dvdList){
        if (qtyNumber + dvdList.length > MAX_NUMBERS_ITEM) {                    // check if the store can add all the list or not
            System.out.println("Can not add all the list to store");
        }else {
            for (DigitalVideoDisc digitalVideoDisc : dvdList) {                 // add sequence of disc
                addDVD(digitalVideoDisc);
            }
        }
    }

                                                                        // method to remove disc
        public void removeDVD(DigitalVideoDisc dvd){
        int j = 0;
        boolean check = false;
        for (int i = 0; i < qtyNumber; i++) {                         // replace the removed DVD by the next DVD
            if (!itemInStore[i].equals(dvd)) {                        // in the list
                itemInStore[j] = itemInStore[i];
                j++;
            } else {
                itemInStore[i] = null;                                 //  delete DVD from the list
                check = true;
            }
        }
        if (!check) System.out.println("The disc has not been added");  // if no DVD removed
        else {
            System.out.println("Store remove successful");
            qtyNumber -= 1;
        }
    }

}
