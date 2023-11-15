package Lab2.hust.soict.dsai.test.disc;                               // Trinh Viet Anh 20214990

import Lab2.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());

        //test swap2 method
        swap2(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
    }
    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }

    // swap method to correct swap two object                          // Trinh Viet Anh 20214990
    public static void swap2(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        String tmp = dvd1.getTitle();                   //get dvd1 's title to tmp
        dvd1.setTitle(dvd2.getTitle());                 // set dvd2 's title to dvd1
        dvd2.setTitle(tmp);                             // set tmp to dvd2
    }
}
