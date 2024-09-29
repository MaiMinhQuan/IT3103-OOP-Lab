//ax + b = 0
import java.util.Locale;
import java.util.Scanner;

public class FirstDegreeEquation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Mai Minh Quan - 20225661 - Nhap a: ");
        double a = scanner.nextDouble();

        System.out.print("Mai Minh Quan - 20225661 - Nhap b: ");
        double b = scanner.nextDouble();

        if (a == 0){
            if (b == 0){
                System.out.println("Mai Minh Quan - 20225661 - Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Mai Minh Quan - 20225661 - Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Mai Minh Quan - 20225661 - Phuong trinh co nghiem duy nhat: " + (-b) / a);
        }

        scanner.close();
        System.exit(0);
    }
}
