//Mai Minh Quân - 20225661
package Lab2_3_4_5.AimsProject.src.test.store;

import Lab2_3_4_5.AimsProject.src.aims.media.DigitalVideoDisc;
import Lab2_3_4_5.AimsProject.src.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f); 
        store.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f); 
        store.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.addMedia(dvd3);

        store.print();   

        store.removeMedia(dvd2);

        store.print();   
    }

}
