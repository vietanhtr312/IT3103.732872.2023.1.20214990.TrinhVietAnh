package Lab2;

public class Cart {
    private int qtyOrdered = 0;
    public static final int MAX_NUMBERS_ORDERED = 4;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        aa:
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
        } else {
            for (int i = 0; i < qtyOrdered; i++)
                if (itemsOrdered[i].equals(disc)) {
                    System.out.println("The disc has been added");
                    break aa;}
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered += 1;
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int c = 0, k = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (!itemsOrdered[i].equals(disc)) {
                itemsOrdered[c] = itemsOrdered[i];
                c++;
            } else k = 1;
        }
        qtyOrdered -= 1;
        if (k == 0) System.out.println("The disc has not been added");

    }

    public float totalCost(){
        float cost = 0.0f;
        for (int i = 0; i < qtyOrdered; i++)
            cost += itemsOrdered[i].getCost();
        return cost;
    }

    public void viewCart(){
        for (int i = 0; i < qtyOrdered; i++)
            System.out.print(itemsOrdered[i]);
    }
}
