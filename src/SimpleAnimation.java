import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleAnimation {
    int x = 70;
    int y = 70;


    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            x=x+2;
            y=y+3;

            drawPanel.repaint();

            try {
                Thread.sleep(20);
            } catch (Exception ex) { }

        }
    }


    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());

            /*int red = (int)(Math.random()*255);
            int green = (int)(Math.random()*255);
            int blue = (int)(Math.random()*255);

            Color randomColor = new Color(red,green,blue);
            g.setColor(randomColor);*/

            g.setColor(Color.green);
            g.fillRect(x, y, 40, 40);

        }
    }
}
