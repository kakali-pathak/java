/*Write a program to generate a window without an applet window using main() function. */
import javax.swing.*;
import java.awt.*;

public class twentyNine {
 public static void main(String[] args) {
    if (GraphicsEnvironment.isHeadless()) {
        System.out.println("Headless environment detected. GU I component are not supported.");
        return;
    }
SwingUtilities.invokeLater(new Runnable() {
    public void run() {
        JFrame frame = new JFrame("Window Without Applet");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel ("This is a window without an applet window.");
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
});
 }    
}
