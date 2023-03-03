package Game.Heroes;

public abstract class BaseHero {
    
    protected long ID;
    protected String name;
    protected double damage;
    protected double cR;// combatReadiness - вместо HP
    protected double accuracy;
    
    public BaseHero(long ID,String name,double damage,double cR,double accuracy){
        this.ID = ID;
        this.name = name;
        this.damage = damage;
        this.cR = cR;
        this.accuracy = accuracy;

    }



}
