package TaskWithComparison;

import java.util.ArrayList;
import java.util.Random;

public class ComputerCreate {

    static ArrayList<Computers> MyComputerCrete(int value) {

        ArrayList<Computers> list = new ArrayList<>();

        for (int i = 0; i < 11; i++) {

            list.add(new Computers(getname(), 1000 + (int) (Math.random() * 1000),
                    (8 + 8 * (int) (Math.random() * 10))));

        }

        return list;

    }

    private static String getname() {
        return String.valueOf(BrandCompuetrs.values()[new Random().nextInt(BrandCompuetrs.values().length)]);
    }
}
