package Game.Heroes;

public class JagdT_128 extends BaseHero{

    protected double accuracy;

    public JagdT_128(long ID, String name, double damage, double cR, double accuracy) {
        super(ID, name, damage, cR, accuracy);
        
        this.accuracy = accuracy;
    }
    
}
