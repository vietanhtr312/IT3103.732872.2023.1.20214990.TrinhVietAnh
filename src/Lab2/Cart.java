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
        qtyOrdered -= 1;
        // notify
        if (!check) System.out.println("The disc has not been added");  // if no DVD removed
        else System.out.println("Remove successful");
    }

    public float totalCost(){                                           // calculate the cost of cart
        float cost = 0.0f;
        for (int i = 0; i < qtyOrdered; i++)
            cost += itemsOrdered[i].getCost();
        return cost;
    }

    public void viewCart() {                                            // print information of every disc in the cart
        System.out.println("Item in the cart:");
        for (int i = 0; i < qtyOrdered; i++)
            itemsOrdered[i].printInfo();
    }
}
