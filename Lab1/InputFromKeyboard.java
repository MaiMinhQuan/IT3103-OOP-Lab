package Lab1;
import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Mai Minh Quan - 20225661 - What 's your name?");
        String strName = keyboard.nextLine();
        System.out.println("Mai Minh Quan - 20225661 - How old are you?");
        int iAge = keyboard.nextInt();
        System.out.println("Mai Minh Quan - 20225661 - How tall are you (m)?");
        double dHeight = keyboard.nextDouble();

        System.out.println("Mai Minh Quan - 20225661 - Mrs/Ms. " + strName + ", " + iAge + " years old." +
        " Your height is " + dHeight + ".");

        keyboard.close();
    }
}
