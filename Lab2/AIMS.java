//Mai Minh Quan - 20225661

package Lab2;
public class AIMS {
    public static void main(String[] args) {
        //Mai Minh Quan - 20225661 - Tạo giỏ hàng trống
        Cart anOrder = new Cart();

        //Mai Minh Quan - 20225661 - Thêm DVD vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",
                "Roger Allers",87,19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars","Science Fiction",
                "Geogre Lucas",87,24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        //Mai Minh Quan - 20225661 - Tổng tiền giỏ hàng
        System.out.printf("Total cost is" + '\n' + anOrder.totalCost());

        System.out.println();
        
        //Mai Minh Quan - 20225661 - Xóa DVD khỏi giỏ hàng
        anOrder.removeDigitalVideoDisc(dvd1);
        anOrder.removeDigitalVideoDisc(dvd2);
        anOrder.removeDigitalVideoDisc(dvd3);
        anOrder.removeDigitalVideoDisc(dvd1);
        System.out.printf("Total cost is: %.2f", anOrder.totalCost());
    
    
    }
}