package Game;

import java.util.ArrayList;
import Game.Heroes.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");// Очистка экрана;
        System.out.println(
                "\ndamage -урон, cR -боеспособность(HP), accuracy -точность, mobility -подвижность, scatter -разброс при выстреле, stealth -незаметность");
        System.out.println("\n\tThis is a Subdivision of 10 tanks. Specialization (type) received by Random\n");
        ArrayList<BaseHero> Subdivision = Drafting.MyRealSubdivision(11);// Формирование подразделения
        Printing.MyPrinting(Subdivision);
        //попытка бой по типам
        System.out.println(Subdivision.get(5));
        System.out.println("\n");
        Subdivision.forEach(n -> n.getInfo());
        Subdivision.forEach(n -> n.attack());
    }

}
