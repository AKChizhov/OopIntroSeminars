package TaskWithComparison;

public class Computers {

    protected String name;
    protected double price;
    protected int memoryVolume;

    public Computers(String name, double price, int memoryVolume) {
        this.name = name;
        this.price = price;
        this.memoryVolume = memoryVolume;
    }

    public void about() {

        System.out.println(
                " Марка оперативной памяти " + name + ". Ee размер = " + memoryVolume + " Gb. Стоимость = " + price+" руб.");

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

}
