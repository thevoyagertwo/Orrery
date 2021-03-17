package Utility;

import java.util.ArrayList;

public class BodyVariablesArray {

        public ArrayList<BodyVariables> bodies;

        public BodyVariablesArray() {
                bodies = new ArrayList();

                bodies.add(new BodyVariables("planet1",1.0,1.0 , 0.0, 0.0, 1.0 ) );
                bodies.add(new BodyVariables("planet2",1.0,-1.0, 0.0, 0.0, -1.0) );

        }


}



//public class BodyVariablesArray {
//
//        public ArrayList<BodyVariables> bodies;
//
//        public BodyVariablesArray() {
//                bodies = new ArrayList<BodyVariables>();
//        }
//
//        public ArrayList<BodyVariables> BodyVariableArrayMaker(){
//                bodies.add(new BodyVariables("planet1",1.0,1.0 , 0.0, 0.0, 1.0 ) );
//                bodies.add(new BodyVariables("planet2",1.0,-1.0, 0.0, 0.0, -1.0) );
//                return bodies;
//        }
//}
