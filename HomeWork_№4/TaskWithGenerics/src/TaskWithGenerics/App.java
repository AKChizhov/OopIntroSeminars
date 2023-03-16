package TaskWithGenerics;

import java.util.ArrayList;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
       
        //Box<String> stringBox = new Box<>();// - Ошибка
        Box< Apple> appleBox = new Box<>();// +
        Box<Orange> orangeBox = new Box<>();// +
        Box<GoldenApple> goldenAppleBox = new Box<>();// +

        //orangeBox.add(new Apple(1));//- Ошибка
        orangeBox.add(new Orange(5));
        appleBox.add(new Apple(3));// +
        System.out.println(" Коробка с яблоками - "+appleBox.getWeight()+" кг.");
        //appleBox.add(new Orange(3));// - Ошибка 
        appleBox.add(new GoldenApple(3));// +
        
        //goldenAppleBox.add(new Apple(1));// - Ошибка
        goldenAppleBox.add(new GoldenApple(4));// +
        System.out.println(" Коробка с золотыми яблоками - "+goldenAppleBox.getWeight()+" кг.");

       // goldenAppleBox.moveTo(appleBox);// +
        System.out.println(" Коробка с золотыми яблоками - "+goldenAppleBox.getWeight()+" кг.");
        System.out.println(" Коробка с яблоками - "+appleBox.getWeight()+" кг.");
        System.out.println(" Коробка с апельсинами - "+orangeBox.getWeight()+" кг.\n");
        
        goldenAppleBox.replaceFruitsToAnotherBox(appleBox);// +
        //appleBox.replaceFruitsToAnotherBox(goldenAppleBox);// - Ошибка
        System.out.println(" Коробка с золотыми яблоками - "+goldenAppleBox.getWeight()+" кг.");
        System.out.println(" Коробка с яблоками после добавления золотых яблок - "+appleBox.getWeight()+" кг.");
        System.out.println(" Коробка с апельсинами - "+orangeBox.getWeight()+" кг.\n");



        //3*
        /* 
        for (GoldenApple apple : goldenAppleBox){// +

        }
        */

       
    }

    
}
