package Game;

import java.util.ArrayList;
import Game.Heroes.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");// Очистка экрана;
        System.out.println(
                "\ndamage -урон, cR -боеспособность(HP), accuracy -точность, mobility -подвижность, scatter -разброс при выстреле, stealth -незаметность");
        System.out.println("\n\tThis is a Subdivision of 10 tanks. Specialization (type) received by Random\n");
        ArrayList<BaseHero> Subdivision = Drafting.MyRealSubdivision(11);// Формирование подразделения
        Printing.MyPrinting(Subdivision);
        //попытка бой по типам
       // System.out.println(Subdivision.get(5));
        System.out.println("\n");
        Subdivision.forEach(n -> n.getInfo());
        Subdivision.forEach(n -> n.attack());
        //Subdivision.forEach(n -> n.attackAll(BaseHero baseHero));

    
        for(BaseHero item : Subdivision){
           
            System.out.println(item.getClass().getName());
           if(item instanceof JagdT_128){
            item = (JagdT_128) item;
           }
           

        }
        BaseHero her1 = Subdivision.get(0);
        BaseHero her2 = Subdivision.get(1);
        her1.attackAll(her2, 100, 50);    
        her2.attackAll(her1, 200, 100);   
        System.out.println(Subdivision.get(0));
        System.out.println(Subdivision.get(1));
        System.out.println("\n");
    }

}
