//Mai Minh Quân - 20225661
//class "AIMS" (Main class)
package Lab2_3.AimsProject.src.aims;

import Lab2_3.AimsProject.src.aims.disc.DigitalVideoDisc;
import Lab2_3.AimsProject.src.aims.cart.Cart;

public class AIMS {
    public static void main(String[] args) {
        //Mai Minh Quân - 20225661 - Tạo giỏ hàng trống
        Cart anOrder = new Cart();

        //Mai Minh Quân - 20225661 - Thêm đĩa vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",
                "Roger Allers",87,19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars","Science Fiction",
                "Geogre Lucas",87,24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        //Mai Minh Quân - 20225661 - Kiểm tra khi chưa thực hiện hàm xoá
        anOrder.print();

        //Mai Minh Quân - 20225661 - Kiểm tra khi dã thực hiện hàm xoá
        anOrder.removeDigitalVideoDisc(dvd2);
        //Mai Minh Quân - 20225661 - Hàm System.out.printf() định dạng như ngôn ngữ C/C++
        System.out.printf("Total cost is: %.2f",anOrder.totalCost());
    }
}