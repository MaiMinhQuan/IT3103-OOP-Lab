package Lab1;

// Example 3: HelloNameDialog.java
import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Mai Minh Quan 20225661 - Please enter your name:");
        JOptionPane.showMessageDialog(null, "Toi la Mai Minh Quan 20225661. Hi " + result + "!");
        System.exit(0);
    }
}
