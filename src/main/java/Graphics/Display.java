package Graphics;
import Utility.BodyVariablesArray;
import Utility.Constants;
import Utility.ReadFile;

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

        canvas.setBackground(Color.black);
    }

    public Canvas getCanvas(){
        return canvas;
    }


    public void render(){
// sets buffer strategy
        bs = this.getCanvas().getBufferStrategy();
        if (bs == null) {
            this.getCanvas().createBufferStrategy(2);
            return;
        }

        g = bs.getDrawGraphics();
        // Draw here
        g.setColor(Color.BLUE);
        g.fillOval(this.width-500, 500, 10, 10);
        // End drawing

        bs.show();
        g.dispose();
    }

    public void renderBody(double[] xyz, String bodyName){
        int pixelx,pixely;
        double maxDistance = 1e+9 ; // used as maximum distance to find the pixel the body should be at, *2 as its +x, -x as well?
// sets buffer strategy
        bs = this.getCanvas().getBufferStrategy();
        if (bs == null) {
            this.getCanvas().createBufferStrategy(2);
            return;
        }
        // calculating the pixel x,y,z
        pixelx = (int) Math.round( this.width/2. + xyz[0]/maxDistance*(this.width/2. ) ); // half way across screen then depending on +- of the x value it will place it
        pixely = (int) Math.round( this.width/2. + xyz[1]/maxDistance*(this.width/2. ) ); // half way across screen then depending on +- of the x value it will place it

        g = bs.getDrawGraphics();
        // Draw here
        g.setColor(bodyColorPicker(bodyName));
        g.fillOval(pixelx, pixely, 5, 5);
        // End drawing

        bs.show();
        g.dispose();
    }


    public void renderSolarSystem(BodyVariablesArray solarSystem) {
        double[] xyz; // stores xyz vx,vy,vz data
        String bodyName;

        for (int body = 0; body< Constants.solarSystemNames.length ; body++){
            xyz =  solarSystem.bodies.get(body).getxyz();
            bodyName = solarSystem.bodies.get(body).getName();
            renderBody(xyz,bodyName);
        }


    }

    public Color bodyColorPicker(String bodyName){
        Color bodyColor;
        // {"sun","mercury","venus","earth","mars","jupiter","saturn","uranus","neptune"};
        switch (bodyName){
            case "sun":
                bodyColor = Color.orange;
                break;
            case "mercury":
                bodyColor = Color.red;
                break;
            case "venus":
                bodyColor = Color.CYAN;
                break;
            case "earth":
                bodyColor = Color.blue;
                break;
            default:
                bodyColor = Color.gray;
                break;
        }

        return bodyColor;
    }


}

