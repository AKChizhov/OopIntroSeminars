package TaskWithGenerics;

import java.util.ArrayList;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
       
        //Box<String> stringBox = new Box<>();// -
        Box< Apple> appleBox = new Box<>();// +
        Box<Orange> orangeBox = new Box<>();// +
        Box<GoldenApple> goldenAppleBox = new Box<>();// +

        //orangeBox.add(new Apple(1));//-
        orangeBox.add(new Orange(5));
        appleBox.add(new Apple(4));// +
        //appleBox.add(new Orange(3));// -
        appleBox.add(new GoldenApple(2));// +
        System.out.println(appleBox.getWeight());

        //goldenAppleBox.add(new Apple(1));// -
        goldenAppleBox.add(new GoldenApple(2));// +
        System.out.println(goldenAppleBox.getWeight());

       // goldenAppleBox.moveTo(appleBox);// +
        System.out.println(goldenAppleBox.getWeight());
        System.out.println(appleBox.getWeight());

        

        //3*
        /* 
        for (GoldenApple apple : goldenAppleBox){// +

        }
        */

        
        


       
    }




    
}
