package TaskWithComparison;

import java.util.Comparator;

public class Notebooks implements Comparable<Notebooks> {

    protected String name;
    protected double price;
    protected int memoryVolume;
    protected int frequencyMemory;

    public Notebooks(String name, double price, int memoryVolume, int frequencyMemory) {
        this.name = name;
        this.price = price;
        this.memoryVolume = memoryVolume;
        this.frequencyMemory = frequencyMemory;
    }

    public void about() {

        System.out.println(
                " Марка оперативной памяти " + name + ". Ee размер = " + memoryVolume + " Gb. Частота = "
                        + frequencyMemory + " HZ. Стоимость = " + price + " руб.");
    }

    public String getname() {
        return name;
    }

    public int getmemoryVolume() {
        return memoryVolume;
    }

    public double getprice() {
        return price;
    }

    public int getfrequencyMemory() {
        return frequencyMemory;
    }
 
    public int compareTo1(Notebooks o) {
        return name.length() - o.getname().length();
    }

 
    public int compareTo(Notebooks o) {
        Integer whatMetod =1;
        if(whatMetod == 2){
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
            return comparator.compare(this.name, o.name);   
        } 
        else { 
            return name.length() - o.getname().length();
        }   
        
    }

    
   
}
