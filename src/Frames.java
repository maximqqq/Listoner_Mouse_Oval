import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frames extends JFrame {
    int x = 0, y = 0;
    JPanel p;

    public Frames(String str) {
        super(str);
        p = new JPanel();
        p.setLayout(null);
        Circle c = new Circle();
        p.add(c);
        add(p);
        setSize(500, 500);
        setVisible(true);

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                p.setLocation(x, y);

            }
        });

    }

    public static void main(String[] args) {
        Frames f = new Frames("123");
    }
}

class Circle extends JPanel {

    public Circle() {
        setBounds(0, 0, 66, 66);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(0, 0, 66, 66);

    }
}