import Utility.BodyVariablesArray;
import Utility.Constants;
import Utility.ReadFile;
import Graphics.Display;

import java.awt.*;
import java.awt.image.BufferStrategy;


public class main {
    private Display display;
    private BufferStrategy bs;
    private Graphics g;


    public static void main(String[] args) {

        int lineNumber = 0;

        // initialises solarSystem (empty)
        BodyVariablesArray solarSystem = new BodyVariablesArray(Constants.solarSystemNames.length);

        // fills solarSystem with names and masses
        for (int i = 0 ; i<Constants.solarSystemNames.length ; i++){
            Constants.setInitialValues(Constants.solarSystemNames[i],solarSystem.bodies.get(i));
            solarSystem.setBodyVectorArray( i , ReadFile.getDoubleArrayVector(Constants.solarSystemNames[i], lineNumber) );
        }

        // start display
        Display display = new Display("Universe",1000,1000);

        int time = 0;
        int timeStep = 86400; // 1 day is 86400s
        int timeEnd  = 10 * 31_557_600;  // 1 year is 31_557_600s

        while(time < timeEnd){
            for (int i = 0 ; i<Constants.solarSystemNames.length ; i++) {
                solarSystem.applyAttractionAllBody(i,timeStep);

            }
            render();
            System.out.println(solarSystem.bodies.get(3).getx());
            time +=timeStep;
        }






//        Display display = new Display("Universe",1000,1000);
//        display.getCanvas().createBufferStrategy(3);
//        Graphics g = null;
//
//
//        // Probably use a running method like in https://youtu.be/Idb6-Zfdq2Q?list=PLah6faXAgguMnTBs3JnEJY0shAc18XYQZ&t=366
//        Render.render(display , g);
    }


    private void render(){
        BufferStrategy bs;

        bs = display.getCanvas().getBufferStrategy();
        if (bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        // Draw here
        g.fillOval(0, 0, 1000, 1000);
        g.setColor(Color.red);
        // End drawing

        bs.show();
        g.dispose();
    }


}


        // Tests:
        /*

        // tests file reader
        String[] testRead = ReadFile.fileReader("voyager" , 0);
        System.out.println(testRead[7]+ "1 I am a string below me is a double");
        double testDoublex = Double.parseDouble(testRead[2] );
        System.out.println(testDoublex + 1);

        // tests ReadFile stringArrayToDoubleArray
        double[] testReadDouble = ReadFile.stringArrayToDoubleArray(testRead);
        System.out.println(testReadDouble[0]);
        System.out.println(testReadDouble.length);


        // sets and gets using vector array method
        solarSystem.setBodyVectorArray(0 , new double[] {0.0, 0.0, 1.0, 0.0, 0.0, 1.0});
        solarSystem.setBodyVectorArray(0 , testReadDouble);
        System.out.println(solarSystem.bodies.get(0).getz());


        // should be opposite sign as they calculate 0's force on 1 then vice versa
        System.out.println(Arrays.toString(solarSystem.calculateAttractionTwoBody(0, 1)));
        System.out.println(Arrays.toString(solarSystem.calculateAttractionTwoBody(1, 0)));

         */



