//Mai Minh Quân
//20225661
//class "TestCart"
package Lab2_3_4.AimsProject.src.test.cart;
import Lab2_3_4.AimsProject.src.aims.cart.Cart;
import Lab2_3_4.AimsProject.src.aims.media.DigitalVideoDisc;
public class TestCart {
    public static void main(String[] args) {
        Cart cart = new Cart();
        // DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",
        //         "Roger Allers",87,19.95f);
        // cart.addDigitalVideoDisc(dvd1);
        // DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars","Science Fiction",
        //         "Geogre Lucas",87,24.95f);
        // cart.addDigitalVideoDisc(dvd2);
        // DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        // cart.addDigitalVideoDisc(dvd3);

        cart.print();

        //Mai Minh Quân - 20225661 - Test search by ID method
        cart.searchById(3);
        cart.searchById(4);

        //Mai Minh Quân - 20225661 - Test search by Title method
        cart.searchByTitle("The Lion King");
        cart.searchByTitle("Alan Walker");
    }
}
