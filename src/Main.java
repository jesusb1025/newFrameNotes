import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //1. create a frame

        JFrame frame = new JFrame("My first frame");
        frame.setSize(500,500);
        // 2. create a panel

        JPanel panel = new JPanel();

        //3. create components
        JButton button = new JButton("push me!");
        JTextField textField = new JTextField(10);
        JLabel label = new JLabel("Hello world");
        ImageIcon icon = new ImageIcon("2C.png");
        // Scaling the image before putting it on the label

        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));

        // Creating a Label with an icon on it
        JLabel picLabel = new JLabel(icon);


        //4. add components to the panel
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(picLabel);
        panel.setBackground(new Color(255,0,0));

        //5. add panel to frame
        frame.add(panel);
        //6. set frame visible
        frame.setVisible(true);
    }
}