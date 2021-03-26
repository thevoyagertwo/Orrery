package Graphics;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class delete {

    public static void render(Display display, Graphics g){
        BufferStrategy bs;

        bs = display.getCanvas().getBufferStrategy();
        if(bs == null){
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        // Draw here
        g.fillOval(0,0,1000,1000);
        g.setColor(Color.red);
        // End drawing

        bs.show();
        g.dispose();

        return;
    }
}
