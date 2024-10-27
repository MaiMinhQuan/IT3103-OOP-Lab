package Lab1;
// Example 5: ShowTwoNumbers.java
import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "Mai Minh Quan - 20225661 - You 've just enter ";

        strNum1 = JOptionPane.showInputDialog(null, 
        "Mai Minh Quan - 20225661 - Please input the first number: ", 
        "Mai Minh Quan - 20225661 - Input the first number",
        JOptionPane.INFORMATION_MESSAGE);

        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null,
        "Mai Minh Quan - 20225661 - Please input the second number: ",
        "Mai Minh Quan - 20225661 - Input the second number",
        JOptionPane.INFORMATION_MESSAGE);

        strNotification += strNum2;

        JOptionPane.showMessageDialog(null, 
        strNotification,
        "Mai Minh Quan - 20225661 - Show two numbers", 
        JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
