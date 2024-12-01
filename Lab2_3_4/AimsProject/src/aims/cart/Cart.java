//Mai Minh Quân - 20225661 - 
//Class "Cart" source code
package Lab2_3_4.AimsProject.src.aims.cart;
import Lab2_3_4.AimsProject.src.aims.media.Media;
import java.util.*;

public class Cart {
    //Mai Minh Quân - 20225661 - Attribute
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    //Mai Minh Quân - 20225661 - Properties
    public void addMedia(Media item) {
        if(itemsOrdered.contains(item)) {
            System.out.println(item.getTitle() + "is already in the cart !");
        } else {
            itemsOrdered.add(item);
            System.out.println(item.getTitle() + " is now in your cart !");
        }
    }

    public void removeMedia(Media item) {
        if(itemsOrdered.contains(item)) {
            itemsOrdered.remove(item);
        } else {
            System.out.println(item.getClass().getSimpleName() + ' ' + item.getTitle() + " is not in the cart !");
        }
    }

    public float totalCost() {
        float sum = 0;
        for (Media item : itemsOrdered) {
            sum += item.getCost();
        }
        return sum;
    }

    public void print() {
        StringBuilder output = new StringBuilder("*************CART************************** \nOrdered items: \n");
        if(itemsOrdered.isEmpty()) {
            output.append("No time\n");
        } else {
            int i = 1;
            for (Media item : itemsOrdered) {
                output.append(i + ".[" + item.getTitle() + "] - [" + item.getCategory() + "] - "
                        + item.getCost() + " $\n");
                i++;
            }
        }
        output.append("total: ").append(totalCost()).append(" $\n");
        output.append("================================================\n");
        System.out.println(output);
    }

    public void searchById(int i) {
        if(i > itemsOrdered.size()) {
            System.out.println("No match found !");
        } else {
            System.out.println("Result: " +  "[" + itemsOrdered.get(i-1).getTitle() +
                    "] - [" + itemsOrdered.get(i-1).getCategory() + "] -"
                    +  + itemsOrdered.get(i-1).getCost() + " $\n");
        }
    }

    public void searchByTitle(String title) {
        for(Media item : itemsOrdered) {
            if(item.getTitle().equals(title)) {
                System.out.println("Result: " +  "[" + item.getTitle() +
                        "] - [" + item.getCategory() + "] -"
                        +item.getCost() + " $\n");
                return;
            }
        }
        System.out.println("No match found");
    }

    public Media findMedia(String title) {
        for (Media item : itemsOrdered) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

    public void emptyCart() {
        itemsOrdered.removeAll(itemsOrdered);
    }

    public void sortByTitleCost() {
        Collections.sort(itemsOrdered,Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCostTitle() {
        Collections.sort(itemsOrdered,Media.COMPARE_BY_COST_TITLE);
    }
}


// public class Cart {
//     public static final int MAX_NUMBERS_ORDERED = 20;   //Số lượng tối đa đĩa DVD trong giỏ hàng

//     //Mai Minh Quân - 20225661 -Mảng lưu các đĩa DVD được thêm vào giỏ hàng
//     private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
//     private int qtyOrdered;     //Số lượng đĩa DVD hiện có trong giỏ hàng

//     //Mai Minh Quân - 20225661 -Hàm thêm đĩa DVD vào giỏ hàng
//     public int addDigitalVideoDisc(DigitalVideoDisc disc) {
//         if (qtyOrdered == MAX_NUMBERS_ORDERED) {
//             System.out.println("The cart is almost full. Can't add more díc");
//             return 0;
//         } else {
//             itemsOrdered[qtyOrdered] = disc;
//             qtyOrdered ++;
//             System.out.println("The DVD " + '\"' +disc.getTitle() + '\"' + " have been added!");
//             return 1;
//         }
//     }
//     //Mai Minh Quân - 20225661 -Ham them dia vào gio hang theo List voi so luong tuy y
//     public int addDigitalVideoDisc(DigitalVideoDisc... dvdArray) {
//         int addCount = 0;
//         for (DigitalVideoDisc disc : dvdArray) {
//             if (qtyOrdered == MAX_NUMBERS_ORDERED) {
//                 System.out.println("The cart is almost full. Can't add more discs");
//                 break;
//             } else {
//                 itemsOrdered[qtyOrdered] = disc;
//                 qtyOrdered++;
//                 System.out.println("The DVD " + '\"' + disc.getTitle() + '\"' + " has been added!");
//                 addCount++;
//             }
//         }
//         return addCount;
//     }
//     //Mai Minh Quân - 20225661 -Ham them 2 dia DVD
//     public int addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
//         if (qtyOrdered + 1 >= MAX_NUMBERS_ORDERED) {
//             System.out.println("The cart is almost full. Can't add more discs");
//             return 0;
//         } else {
//             itemsOrdered[qtyOrdered] = dvd1;
//             qtyOrdered++;
//             System.out.println("The DVD " + '\"' + dvd1.getTitle() + '\"' + " has been added!");

//             itemsOrdered[qtyOrdered] = dvd2;
//             qtyOrdered++;
//             System.out.println("The DVD " + '\"' + dvd2.getTitle() + '\"' + " has been added!");

//             return 2; //Tra ve so dia DVD da them duoc
//         }
//     }


//     //Mai Minh Quân - 20225661 -Hàm xoá đĩa (Khi cấu trúc dữ liệu của đĩa DVD là 1 mảng cấu trúc)
//     public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
//         if(itemsOrdered[0] ==  null) {
//             System.out.println("Your cart is empty!");
//             return 0;
//         }
//         for(int i =0; i < qtyOrdered;i++) {
//             if(itemsOrdered[i].equals(disc)) {
//                 for(int j = i;i<qtyOrdered-1;i++) {
//                     itemsOrdered[i] = itemsOrdered[i+1];
//                 }
//                 itemsOrdered[qtyOrdered-1] = null;
//                 qtyOrdered--;
//                 System.out.println("Remove DVD " + '\"'+ disc.getTitle() + '\"' + " successfully!");
//                 return 1;
//             }
//         }
//         System.out.println("No DVD match!");
//         return 0;
//     }

//     //Mai Minh Quân - 20225661 -Hàm tính tổng giá tiền đĩa
//     public float totalCost() {
//         float sum = 0.00f;
//         for(int i =0;i< qtyOrdered;i++) {
//             sum += itemsOrdered[i].getCost();
//         }
//         return sum;
//     }

//     public void print() {
//         StringBuilder output = new StringBuilder("*********************CART************************** \nOrdered items: \n");
//         for (int i = 0; i < qtyOrdered;i++) {
//             output.append(i+1 + ".[" + itemsOrdered[i].getTitle() + "] - [" + itemsOrdered[i].getCategory() + "] - ["
//                     + itemsOrdered[i].getDirector() + "] - [" + itemsOrdered[i].getLength() + "]: "
//                     + itemsOrdered[i].getCost() + " $\n");
//         }
//         output.append("total: ").append(totalCost()).append(" $\n");
//         output.append("***************************************************\n");
//         System.out.println(output);
//     }
//     public void searchById(int i) {
//         if(i > qtyOrdered) {
//             System.out.println("No match found !");
//         } else {
//             System.out.println("Result: " +  "[" + itemsOrdered[i-1].getTitle() +
//                     "] - [" + itemsOrdered[i-1].getCategory() + "] - ["
//                     + itemsOrdered[i-1].getDirector() + "] - ["
//                     + itemsOrdered[i-1].getLength() + "]: " +itemsOrdered[i-1].getCost() + " $\n");
//         }

//     }

//     public void searchByTitle(String title) {
//         for(int i = 0;i < qtyOrdered; i++) {
//             if(itemsOrdered[i].getTitle().equals(title)) {
//                 System.out.println("Result: " +  "[" + itemsOrdered[i].getTitle() +
//                         "] - [" + itemsOrdered[i].getCategory() + "] - ["
//                         + itemsOrdered[i].getDirector() + "] - ["
//                         + itemsOrdered[i].getLength() + "]: " +itemsOrdered[i].getCost() + " $\n");
//                 return;
//             }
//         }
//         System.out.println("No match found !");
//     }
// }

