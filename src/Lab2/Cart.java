package Lab2;                                   // Trinh Viet Anh 20214990

public class Cart {
    private int qtyOrdered = 0;
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        boolean check=false;
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {                        // check if the cart is full
            System.out.println("The cart is almost full");              // print notification
        } else {
            for (int i = 0; i < qtyOrdered; i++)                        // traverse the list
                if (itemsOrdered[i].equals(disc)){                      // to check if the disc has been added
                    System.out.println("The disc has been added");      // notify
                    check = true;
                    break;}
            if (!check){                                                // If not
                itemsOrdered[qtyOrdered] = disc;                        // add disc to the list
                qtyOrdered += 1;                                        // add quantity
                System.out.println("Add successful");}                  // notify success
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int j = 0;
        boolean check = false;
        for (int i = 0; i < qtyOrdered; i++) {                          // replace the removed DVD by the next DVD
            if (!itemsOrdered[i].equals(disc)) {                        // in the list
                itemsOrdered[j] = itemsOrdered[i];
                j++;
            } else {
                itemsOrdered[i] = null;                                 //  delete DVD from the list
                check = true;
            }
        }
        // notify
        if (!check) System.out.println("The disc has not been added");  // if no DVD removed
        else {
            System.out.println("Remove successful");
            qtyOrdered -= 1;
        }
    }

    public float totalCost(){                                           // calculate the cost of cart
        float cost = 0.0f;
        for (int i = 0; i < qtyOrdered; i++)
            cost += itemsOrdered[i].getCost();
        return cost;
    }

    // 2.1 add method with the array parameter                      Trinh Viet Anh 20214990
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        if (qtyOrdered + dvdList.length > MAX_NUMBERS_ORDERED) {            // check if the cart can add all the list or not
            System.out.println("The list has too many disc");
            System.out.println("Please add at most " + (MAX_NUMBERS_ORDERED - qtyOrdered) + " disc");
        }else {
        for (DigitalVideoDisc digitalVideoDisc : dvdList) {                 // add sequence of disc
            addDigitalVideoDisc(digitalVideoDisc);
            }
        }
    }

    // 2.2 add method with two parameters                            Trinh Viet Anh 20214990
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED) System.out.println("The cart is almost full, " +
                "can not add two more disc");
        else {
            addDigitalVideoDisc(dvd1);
            addDigitalVideoDisc(dvd2);
        }
    }

    public void print() {                                            // print information of every disc in the cart
                                                                    //  Trinh Viet Anh 20214990
        System.out.println("******************CART********************");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemsOrdered[i].toString());
        }

        System.out.println("Total cost: " + totalCost());
        System.out.println("******************************************");
    }

                                                                    // method to find the disc with id
                                                                    // Trinh Viet Anh 20214990
    public void searchById(int id){
        boolean check = false;                                      // to check can find id or not
        for(int i = 0; i < qtyOrdered; i++)
            if(id == itemsOrdered[i].getId()) {                     // if list ordered has disc with same id
                System.out.println("The disc requested: ");
                System.out.println(itemsOrdered[i].toString());     // print out disc info
                check = true;
            }
        if (!check) System.out.println("Can not find the ID requested");        // if not notify
    }

                                                                    // method to find the disc with title
                                                                    // Trinh Viet Anh 20214990
    public void searchbByTitle(String title){
        boolean check = false;
        for(int i = 0; i < qtyOrdered; i++)
            if (itemsOrdered[i].isMatch(title)){                       // if list ordered has disc with same title
                System.out.println("The disc requested: ");
                System.out.println(itemsOrdered[i].toString());         // print out disc info
                check = true;
            }
        if (!check) System.out.println("Can not find the ID requested");        // if not notify
    }

}
