import javax.swing.*;
import java.awt.*;

/**
 * Created by michael_hopps on 10/2/17.
 */
public class HouseMain {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Your title here.");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        int width = 1200;
        int height = 800;
        frame.setPreferredSize(new Dimension(width, height+24));


        JPanel panel = new HousePanel(width, height);
        panel.setFocusable(true);
        panel.grabFocus();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
