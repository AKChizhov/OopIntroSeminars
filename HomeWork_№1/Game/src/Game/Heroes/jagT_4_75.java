package Game.Heroes;

public class jagT_4_75 extends BaseHero {

    protected double stealth;

    public jagT_4_75(long ID,String name,double damage,double cR,double accuracy, double stealth) {
        super(ID, name, damage, cR, accuracy);
        this.stealth = stealth;
    }
    
}
