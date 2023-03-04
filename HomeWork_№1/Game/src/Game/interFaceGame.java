package Game;


public interface interFaceGame {
    public void getInfo();

    public String about();

    public static void GetDamage(double damage,double cR ) {
        if (cR - damage > 0) {
            cR -= damage;
        }
    }   
     
   
}