package Game;

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
        
        Subdivision.forEach(n -> n.powerStrike());
        
        BaseHero her1 = Subdivision.get(0);
        BaseHero her2 = Subdivision.get(1);
        BaseHero her9 = Subdivision.get(9);
       
        her1.attackAll_1(her2);
        her2.attackAll_1(her1);
        her9.attackAll_1(her1) ;
        System.out.println("\n");
        System.out.println(Subdivision.get(0));
        System.out.println(Subdivision.get(1));
        System.out.println(Subdivision.get(9));
        System.out.println("\n");
    }

}
