import Utility.BodyVariables;
import Utility.BodyVariablesArray;
import org.w3c.dom.Attr;

import java.util.ArrayList;


public class main {

    public static void main(String[] args) {

        BodyVariables help = BodyVariables.TestBody();



        System.out.println(help.getName());
        help.setName("try");
        System.out.println(help.getName());


        BodyVariablesArray twoBody = new BodyVariablesArray();


        System.out.println(twoBody.bodies.get(0).getxv());

        System.out.println(twoBody.calulateDistance(0 , 1));

    }

}


