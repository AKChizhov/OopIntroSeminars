package Game.Heroes;

public class T_5_75_70 extends BaseHero {

    protected double mobility;

    public T_5_75_70(long ID, String name, double mobility) {
        super(ID, name, 75, 75, 100);

        this.mobility = mobility;
    }

    @Override
    public String toString() {
        return "It'a T_5_75_70 " + "Tactical №" + ID + ", commander " + name + ", damage= " + damage + ", cR=" + cR
                + ", accuracy= " + accuracy + ", mobility= " + mobility;
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
       
        System.out.printf("T_5_75_70 Tactical №%d %s наносит ущерб %s \n",ID,name,damage+accuracy+mobility);
    }

    @Override
    public void attackAll(BaseHero baseHero){
        cR = cR - 0.5;
    }

}