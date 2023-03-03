package Game.Heroes;

public class T_5_75_70 extends BaseHero {

    protected double mobility;

    public T_5_75_70(long ID, String name, double damage, double cR, double accuracy, double mobility) {
        super(ID, name, damage, cR, accuracy);
        
        this.mobility = mobility;
    }
    
}
