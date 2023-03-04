package Game.Heroes;



public class JagdT_128 extends BaseHero {

    protected double scatter;

    public JagdT_128(long ID, String name, double scatter) {
        super(ID, name, 100, 100, 100);

        this.scatter = scatter;
    }

    @Override
    public String toString() {
        return "It'a JagdT_128 " + "Tactical №" + ID + ", commander " + name + " , damage= " + damage + ", cR=" + cR
                + ", accuracy= " + accuracy + " , scatter= " + scatter;
    }

    @Override
    public String about() {
        System.out.println(toString());
        return ("");

    }

    @Override
    public void getInfo() {
        System.out.println("Tactical № "+ID);
        
    }

    

}