package Graphics;
import java.awt.*;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;

public class Display extends Canvas{

    private JFrame frame;
    private Canvas canvas;
    private Display display;
    private BufferStrategy bs;
    private Graphics g;

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

        canvas.setBackground(ColorUIResource.RED);
    }

    public Canvas getCanvas(){
        return canvas;
    }


    public void render(){

        bs = this.getCanvas().getBufferStrategy();
        if (bs == null) {
            this.getCanvas().createBufferStrategy(2);
            return;
        }

        g = bs.getDrawGraphics();
        // Draw here
        g.setColor(Color.BLUE);
        g.fillOval(0, 0, 1000, 500);
        // End drawing

        bs.show();
        g.dispose();
    }

//    public void paint(Graphics g){
//        g.fillOval(100,100,50,50);
//        g.setColor(Color.red);
//
//    }

}
