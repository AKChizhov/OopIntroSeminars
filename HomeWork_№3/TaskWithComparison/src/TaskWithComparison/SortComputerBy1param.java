package TaskWithComparison;

import java.util.ArrayList;
import java.util.Comparator;

public class SortComputerBy1param {//Сортировка по 1-у параметру

    static ArrayList<Notebooks> MySorting(ArrayList<Notebooks> list, String flag) {

        list.sort(new Comparator<Notebooks>() {

            public int compare(Notebooks o1, Notebooks o2) {
                if (flag == "price_up")
                    return (int) o1.getprice() - (int) o2.getprice();// По увеличению стоимости
                if (flag == "price_down")
                    return (int) o2.getprice() - (int) o1.getprice();// По уменьшению стоимости
                return 0;
            }
        });

        return list;
    }

}
