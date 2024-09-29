import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mai Minh Quan - 20225661 - Nhap so phan tu cua mang: ");
        int size = scanner.nextInt();

        int[] a = new int[size];

        System.out.println("Mai Minh Quan - 20225661 - Nhap cac phan tu cua mang: ");

        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();  
        }

        //Sap xep mang tang dan
        for (int i = 0; i < size - 1; i++) {
            int pos = i;
            for (int j = i + 1; j < size; j++) {
                if (a[j] < a[pos]) pos = j;
            }
            int tmp = a[i];
            a[i] = a[pos];
            a[pos] = tmp;

        }

        System.out.println("Mai Minh Quan - 20225661 - Mang sau khi sap xep:");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        //Tinh tong
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a[i];
        }
        System.out.println("\nMai Minh Quan - 20225661 - Tong cac phan tu cua mang: " + sum);
        System.out.println("Mai Minh Quan - 20225661 - Trung binh cong cac phan tu cua mang: " + ((double)sum / size));
        
        scanner.close();
    }
}
