import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Thong so ma tran
        System.out.print("Mai Minh Quan - 20225661 - Nhap so hang: ");
        int rows = scanner.nextInt();
        System.out.print("Mai Minh Quan - 20225661 - Nhap so cot: ");
        int cols = scanner.nextInt();

        //Khai bao ma tran
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        //Nhap ma tran 1
        System.out.println("Mai Minh Quan - 20225661 - Nhap ma tran 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        //Nhap ma tran 2
        System.out.println("Mai Minh Quan - 20225661 - Nhap ma tran 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        //Tinh tong 2 ma tran
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        //In ket qua
        System.out.println("Mai Minh Quan - 20225661 - Tong 2 ma tran la: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
