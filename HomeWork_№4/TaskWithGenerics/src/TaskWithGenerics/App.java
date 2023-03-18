package TaskWithGenerics;

import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class App {
    public static void main(String[] args) throws Exception {

        // Box<String> stringBox = new Box<>();//-Ошибка "Is not applicable for the arguments"
        Box<Apple> appleBox = new Box<>();// +
        Box<Orange> orangeBox = new Box<>();// +
        Box<GoldenApple> goldenAppleBox = new Box<>();// +
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.add(new Apple(77));
        fruitBox.add(new GoldenApple(88));
        // orangeBox.add(new Apple(1));//- Ошибка "Is not applicable for the arguments"
        orangeBox.add(new Orange(5));
        appleBox.add(new Apple(3));// +
        System.out.println(" \n Коробка с яблоками (проверка весов) - " + appleBox.getWeight() + " кг.\n");
        // appleBox.add(new Orange(3));// - Ошибка "Is not applicable for the arguments"
        goldenAppleBox.add(new GoldenApple(3));// +

        goldenAppleBox.add(new GoldenApple(44));
        // goldenAppleBox.add(new Apple(55));//-ошибка "Is not applicable for the arguments"
        // goldenAppleBox.add(new Apple(1));//-Ошибка "Is not applicable for the arguments"
        appleBox.add(new GoldenApple(66));// +
        appleBox.add(new Apple(10));

        System.out.println(" Коробка с золотыми яблоками до пересыпания- " + goldenAppleBox.getWeight() + " кг.");
        System.out.println(" Коробка с яблоками до пересыпания - " + appleBox.getWeight() + " кг.");
        System.out.println(" Коробка с апельсинами - " + orangeBox.getWeight() + " кг.\n");

        // goldenAppleBox.replaceFruitsToAnotherBox( appleBox);// + ????????????
        // appleBox.replaceFruitsToAnotherBox(goldenAppleBox);// - Ошибка
        /*
         * В методе replaceFruitsToBox после пересыпания нужно бы удалить из текущей коробки) А то вы пересыпать пересыпали,
         *  а очистить не очистили. Плюс там нужен вот такой дженерик: <? super T>. Тогда и ошибка уйдет.
        */
        for (GoldenApple fruit : goldenAppleBox) {
            appleBox.add(fruit);
        }

        goldenAppleBox.delete(null);

        for (Apple fruit : appleBox) {
            // goldenAppleBox.add(fruit); - Ошибка "Is not applicable for the arguments"
        }

        System.out.println(
                " Коробка с золотыми яблоками после пересыпания пустая - " + goldenAppleBox.getWeight() + " кг.");
        System.out.println(" Коробка с яблоками после добавления золотых яблок - " + appleBox.getWeight() + " кг.");
        System.out.println(" Коробка с апельсинами как была так и осталась - " + orangeBox.getWeight() + " кг.\n");

        for (Apple fruit : appleBox) {
            System.out.println("\tВ коробке яблоки с весом :" + fruit.getWeight() + " кг");
        }

        System.out.println('\n');
    }

}
