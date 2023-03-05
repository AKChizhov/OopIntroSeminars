package Game.Heroes;

public class jagT_4_75 extends BaseHero {

    protected double stealth;

    public jagT_4_75(long ID, String name, double stealth) {
        super(ID, name, 50, 50, 50);
        this.stealth = stealth;
    }

    @Override
    public String toString() {
        return "It'a jagT_4_75 " + "Tactical №" + ID + ", commander " + name + ", damage= " + damage + ", cR=" + cR
                + ", accuracy= " + accuracy + " , stealth= " + stealth;
    }

    @Override
    public String about() {
        System.out.println(toString());
        return ("");
    }

    @Override
    public void getInfo() {
    }

    @Override
    public void attack(){
       
        System.out.printf("jagT_4_75 Tactical №%d %s наносит ущерб %s \n",ID,name,damage+accuracy+stealth);
    }
/*
    @Override
    public void attackAll(BaseHero baseHero){
        cR = cR - 0.5;
    }

    */
}