package Game;

import java.util.ArrayList;
import Game.Heroes.*;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");// Очистка экрана;

        System.out.println("\n\tThis is a Subdivision of 10 tanks. Specialization received by Random\n");
        ArrayList<BaseHero> Subdivision = Drafting.MyRealSubdivision(11);// Формирование подразделения
        Printing.MyPrinting(Subdivision);



    }
}
