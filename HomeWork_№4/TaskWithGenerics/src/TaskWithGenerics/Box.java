package TaskWithGenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box <T extends Fruit> implements Iterable<T>{

    public List <T > fruits = new ArrayList<>();
    
    
    

    public void add(T fruit){
        fruits.add(fruit);
    }
    
    
    public int getWeight(){
        //сумма
        //throw new UnsupportedOperationException();
        
        
        return 77;
    }
    
    public void moveTo(Box <T> to){
        //

    }


   


    @Override
    public Iterator<T> iterator() {
        
       return fruits.iterator();
    }


    

    
}
