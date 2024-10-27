package Lab1;

//a11x1 + a12x2 = b1
//a21x1 + a22x2 = b2

import java.util.Scanner;

public class FirstDegreeEquation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập các hệ số
        System.out.println("Mai Minh Quan - 20225661 - Nhap a11, a12, b1 (a11*x + a12*y = b1): ");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1 = scanner.nextDouble();

        System.out.println("Mai Minh Quan - 20225661 - Nhap a21, a22, b2 (a21*x + a22*y = b2): ");
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        // Tính định thức D
        double D = a11 * a22 - a12 * a21;

        if (D != 0) {
            // Tính Dx và Dy
            double Dx = b1 * a22 - b2 * a12;
            double Dy = b2 * a11 - b1 * a21;

            // Tính nghiệm
            double x1 = Dx / D;
            double x2 = Dy / D;

            System.out.println("Mai Minh Quan - 20225661 - Nghiem cua he phuong trinh la: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            // Kiểm tra hệ phương trình vô nghiệm hoặc vô số nghiệm
            if (b2 * a11 == b1 * a21 && b1 * a22 == b2 * a12) {
                System.out.println("Mai Minh Quan - 20225661 - He phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Mai Minh Quan - 20225661 - He phuong trinh vo nghiem.");
            }
        }
    }
}
