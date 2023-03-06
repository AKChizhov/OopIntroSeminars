package Game.Heroes;

import java.util.ArrayList;
import Game.interFaceGame;

public abstract class BaseHero implements interFaceGame {

    protected long ID;
    protected String name;
    protected double damage;
    protected double cR;// combatReadiness - вместо HP
    protected double accuracy;
    protected ArrayList<BaseHero> tanks;

    public BaseHero(long ID, String name, double damage, double cR, double accuracy) {
        this.ID = ID;
        this.name = name;
        this.damage = damage;
        this.cR = cR;
        this.accuracy = accuracy;

    }

    public void powerStrike(){
        System.out.println("*******");
    }
    
    public void attackAll_1(BaseHero enemy) {
        enemy.cR = enemy.cR - damage;
    }
}
