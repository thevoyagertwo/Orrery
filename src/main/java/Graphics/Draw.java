package Graphics;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;

public class Draw extends Canvas{

    public static void main(String[] args) {
        JFrame frame = new JFrame("Universe");
        Canvas canvas = new Draw();
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

        canvas.setBackground(ColorUIResource.white);
    }

    public void paint (Graphics g){
        g.fillOval(100,100,50,50);
        g.setColor(Color.red);

    }

}
