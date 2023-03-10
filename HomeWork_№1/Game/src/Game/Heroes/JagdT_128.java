package Game.Heroes;


public class JagdT_128 extends BaseHero {

    protected double scatter;

    public JagdT_128(long ID, String name, double scatter) {
        super(ID, name, 100, 1000, 100);

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
       
    }

    @Override
    public void powerStrike(){
       
        System.out.printf("JagdT_128 Tactical №%d %s наносит ущерб %s \n",ID,name,damage+accuracy-scatter);
    }

   
    public void attackAll(BaseHero enemy){
       enemy.cR = enemy.cR - damage + accuracy-scatter;
       
    }
    

}