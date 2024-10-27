//Mai Minh Quan - 20225661

package Lab2;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;   //Mai Minh Quan - 20225661 - Số lượng tối đa đĩa DVD trong giỏ hàng

    //Mai Minh Quan - 20225661 - Mảng lưu các đĩa DVD được thêm vào giỏ hàng
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;     //Mai Minh Quan - 20225661 - Số lượng đĩa DVD hiện có trong giỏ hàng

    //Mai Minh Quan - 20225661 - Hàm thêm DVD vào giỏ hàng
    public int addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("Your cart is full");
            return 1;
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered ++;
            System.out.println("The DVD " + '\"' + disc.getTitle() + '\"' + " has been added!");
            return 0;
        }
    }
    


    //Mai Minh Quan - 20225661 - Hàm xoá DVD
    public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if(itemsOrdered[0] ==  null) {
            System.out.println("Your cart is empty!");
            return 1;
        }
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].equals(disc)) {
                for(int j = i; j < qtyOrdered-1; j++) {
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("Remove DVD " + '\"'+ disc.getTitle() + '\"' + " successfully!");
                return 0;
            }
        }
        System.out.println("No DVD match!");
        return 2;
    }

    //Mai Minh Quan - 20225661 - Hàm tính tổng tiền giỏ hàng
    public float totalCost() {
        float sum = 0.00f;
        for(int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
}
