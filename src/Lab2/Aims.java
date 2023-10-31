package Lab2;                                   // Trinh Viet Anh 20214990

public class Aims {
    public static void main(String[] args) {
        //Create a new cart
        Cart anOrder = new Cart();

        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Rogers Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                        "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);


//        print total cost of the item in the cart
        System.out.print("Total cost is: ");
        System.out.println(anOrder.totalCost());

        // remove dvd3 and dvd1 out of cart
        anOrder.removeDigitalVideoDisc(dvd3);
        anOrder.removeDigitalVideoDisc(dvd1);
        anOrder.viewCart();


    }
}
