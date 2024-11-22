//Mai Minh Quân
//20225661
//class "TestStore"
package Lab2_3.AimsProject.src.test.store;

import Lab2_3.AimsProject.src.aims.disc.DigitalVideoDisc;
import Lab2_3.AimsProject.src.aims.store.Store;

public class TestStore {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars", "Science Fiction",
                "Geogre Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        System.out.println(store.toString());

        store.removeDVD(dvd1);
        store.removeDVD(dvd2);
        store.removeDVD(dvd3);

        System.out.println(store.toString());
    }
}
