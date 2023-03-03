package Game;

import java.util.ArrayList;
import java.util.Random;
import Game.Heroes.*;

public class Drafting {

    public static int[] company = null;

    static ArrayList<BaseHero> MyRealSubdivision(int number) {

        ArrayList<BaseHero> list = new ArrayList<>();

        int count = 1;
        while (count < number) {
            Random random = new Random();
            Integer index = random.nextInt(3);

            if (index == 0) {
                list.add(new jagT_4_75(count, getname(), 20));
            } else if (index == 1) {
                list.add(new T_5_75_70(count, getname(), 30));
            } else if (index == 2) {
                list.add(new JagdT_128(count, getname(), 10));
            }

            count++;// Пока не наберем 10 машин

        }
        /*
         * for (BaseHero heroBaseHero : list) {
         * heroBaseHero.tanks(list);
         * }
         */

        return list;
    }

    private static String getname() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}
