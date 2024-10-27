package Lab1;

import java.util.Locale;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Mai Minh Quan - 20225661 - Enter num1: ");
        String strNum1 = scanner.next();
        double num1 = Double.parseDouble(strNum1);

        System.out.println("Mai Minh Quan - 20225661 - Enter num2: ");
        String strNum2 = scanner.next();
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        System.out.println("num1 + num2 = " + sum);

        double difference = num1 - num2;
        System.out.println("num1 - num2 = " + difference);

        double product = num1 * num2;
        System.out.println("num1 * num2 = " + product);

        if (num2 == 0){
            System.out.println("Divisor is invalid!");
        } else {
            double quotient = num1 / num2;
            System.out.println("num1 / num2 = " + quotient);
        }
        
        scanner.close();
        System.exit(0);
    }
}
