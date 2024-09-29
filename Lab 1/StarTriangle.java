import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mai Minh Quan - 20225661 - Nhap n: ");
        double n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - 1 - i; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i + 1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
