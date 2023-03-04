package Game;

import java.util.ArrayList;
import Game.Heroes.BaseHero;

public class Printing {
    public static void MyPrinting(ArrayList<BaseHero> list) {
        list.forEach(n -> n.about());
        System.out.println("\n");
    }

}