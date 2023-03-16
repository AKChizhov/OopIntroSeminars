package TaskWithGenerics;

public class App {
    public static void main(String[] args) throws Exception {
       
        //Box<String> stringBox = new Box<>();// - Ошибка
        Box< Apple> appleBox = new Box<>();// +
        Box<Orange> orangeBox = new Box<>();// +
        Box<GoldenApple> goldenAppleBox = new Box<>();// +
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.add(new Apple(77));
        fruitBox.add(new GoldenApple(88));
        //orangeBox.add(new Apple(1));//- Ошибка
        orangeBox.add(new Orange(5));
        appleBox.add(new Apple(3));// +
        System.out.println(" Коробка с яблоками - "+appleBox.getWeight()+" кг.");
        //appleBox.add(new Orange(3));// - Ошибка 
        goldenAppleBox.add(new GoldenApple(3));// +

        goldenAppleBox.add(new GoldenApple(44));
        //goldenAppleBox.add(new Apple(55));// - ошибка
        
        //goldenAppleBox.add(new Apple(1));// - Ошибка
        appleBox.add(new GoldenApple(66));// +
        appleBox.add(new Apple(10));

       // goldenAppleBox.moveTo(appleBox);// +
        System.out.println(" Коробка с золотыми яблоками - "+goldenAppleBox.getWeight()+" кг.");
        System.out.println(" Коробка с яблоками - "+appleBox.getWeight()+" кг.");
        System.out.println(" Коробка с апельсинами - "+orangeBox.getWeight()+" кг.\n");
        
        //goldenAppleBox.replaceFruitsToAnotherBox( appleBox);// + ????????????
        //appleBox.replaceFruitsToAnotherBox(goldenAppleBox);// - Ошибка
        System.out.println(" Коробка с золотыми яблоками - "+goldenAppleBox.getWeight()+" кг.");
        System.out.println(" Коробка с яблоками после добавления золотых яблок - "+appleBox.getWeight()+" кг.");
        System.out.println(" Коробка с апельсинами - "+orangeBox.getWeight()+" кг.\n");

        for (Apple fruit : appleBox) {  
            System.out.println("\tВ коробке яблоки с весом :"+ fruit.getWeight()+" кг");
        };
 
    }

}
