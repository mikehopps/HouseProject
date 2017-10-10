import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by CHANGE THIS TO YOUR NAME on 10/2/17.
 */

public class HousePanel extends JPanel{

    public HousePanel(int width, int height){
        setSize(width,height);


        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX() + ", " + e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;




    }

}
