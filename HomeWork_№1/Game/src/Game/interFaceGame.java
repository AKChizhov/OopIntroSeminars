package Game;

import Game.Heroes.BaseHero;

public interface interFaceGame {
    public void getInfo();

    public String about();

    public static void GetDamage(double damage,double cR ) {
        if (cR - damage > 0) {
            cR -= damage;
        }
    }   
     
    public static void Attack(BaseHero target) {
    
       
    }
}