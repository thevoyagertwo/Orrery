package Graphics;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;

public class Display extends Canvas{

    private JFrame frame;
    private Canvas canvas;

    private String title;
    private int width, height;

    public Display(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;

        createDisplay();
    }

    public void createDisplay() {
        JFrame frame = new JFrame(title);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width,height));
//        canvas.setMaximumSize(new Dimension(width,height));
//        canvas.setMinimumSize(new Dimension(width,height));

        frame.add(canvas);
        frame.pack();

        canvas.setBackground(ColorUIResource.white);
    }

    public Canvas getCanvas(){
        return canvas;
    }




    public void paint(Graphics g){
        g.fillOval(100,100,50,50);
        g.setColor(Color.red);

    }

}
