package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Test_Graphics {


    public static void main(String[] args) {
        final String title = "Test Window";
        final int width = 1200;
        final int height = width / 16 * 9;

        //Creating the frame.
        JFrame frame = new JFrame(title);

        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        //Creating the canvas.
        Canvas canvas = new Canvas();

        canvas.setSize(width, height);
        canvas.setBackground(Color.BLACK);
        canvas.setVisible(true);
        canvas.setFocusable(false);


        //Putting it all together.
        frame.add(canvas);

        canvas.createBufferStrategy(3);

        boolean running = true;

        BufferStrategy bufferStrategy;
        Graphics graphics;

        int i = 0;

        while (running) {
            bufferStrategy = canvas.getBufferStrategy();
            graphics = bufferStrategy.getDrawGraphics();
            graphics.clearRect(0, 0, width, height);

            graphics.setColor(Color.GREEN);
            graphics.drawString("This is some text placed in the top left corner.", 5, 15);

            if (i % 2 ==0) {
                graphics.fillOval(0, 0, 500, 500);
            }
            else {
                graphics.fillOval(0, 0, 200, 1000);
            }
            bufferStrategy.show();
            graphics.dispose();

            i++;
            System.out.println(i);

        }
    }

}