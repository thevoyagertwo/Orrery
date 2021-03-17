import Utility.BodyVariables;
import Utility.BodyVariablesArray;


public class main {

    public static void main(String[] args) {

        BodyVariables help = BodyVariables.TestBody();



        System.out.println(help.getName());
        help.setName("try");
        System.out.println(help.getName());


        BodyVariablesArray twoBody = new BodyVariablesArray();


        System.out.println(twoBody.bodies.get(1).getz());

        System.out.println(twoBody.calculateDistance(0 , 1));

    }

}


