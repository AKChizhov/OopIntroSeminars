package TaskWithGenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<T extends Fruit> implements Iterable<T> {

    public List<T> fruits = new ArrayList<>();
    private Object box;

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public int getWeight() {//Сумма
        
        int boxWeight = 0;
        for (T fruit : fruits) {
            boxWeight += fruit.getWeight();
        }
        return boxWeight;
    }

    public void moveTo(Box<T> to) {
        for (T fruit : fruits) {
            fruits.add(fruit);
        }
    }

    public void replaceFruitsToAnotherBox(Box<T> to ) {
        anotherBox.box.add(this.box);
    }




    @Override
    public Iterator<T> iterator() {

        return fruits.iterator();
    }

}
