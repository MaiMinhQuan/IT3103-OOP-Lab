// ax^2 + bx + c = 0
import java.util.Scanner;

public class SecondDegreeEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mai Minh Quan - 20225661 - Nhap a, b, c (ax^2 + bx + c = 0): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0){
            if (b == 0){
                if (c == 0){
                    System.out.println("Mai Minh Quan - 20225661 - Phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("Mai Minh Quan - 20225661 - Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("Mai Minh Quan - 20225661 - Phuong trinh co nghiem duy nhat: " + (-c) / b);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0){
                System.out.println("Mai Minh Quan - 20225661 - Phuong trinh vo nghiem");
            } else if (delta == 0) {
                System.out.println("Mai Minh Quan - 20225661 - Phuong trinh co nghiem kep x = " + (-b) / (2 * a));
            } else {
                System.out.println("Mai Minh Quan - 20225661 - Phuong trinh co 2 nghiem phan biet: ");
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }

        }

        scanner.close();
        System.exit(0);
    }
}
