//Mai Minh Quân - 20225661
package Lab2_3_4_5.AimsProject.src.test.cart;
import javax.naming.LimitExceededException;
import Lab2_3_4_5.AimsProject.src.aims.cart.Cart;
import Lab2_3_4_5.AimsProject.src.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) throws LimitExceededException {
     
        Cart cart = new Cart();
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f); 
        cart.addMedia(dvd1);

        DigitalVideoDisc dv1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f); 
        cart.addMedia(dv1);


        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f); 
        cart.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addMedia(dvd3);

        cart.print();

        cart.searchByID(1);
        cart.searchByTitle("a");
        cart.searchByCategory("Science");
        cart.searchByPrice(2000);
        cart.searchByPrice(1900,2000);

    }
}