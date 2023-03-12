package TaskWithComparison;

import java.util.ArrayList;
import java.util.Comparator;

public class SortComputerBy3param {//Сортировка по 3-м параметрам

    static ArrayList<Notebooks> MySorting(ArrayList<Notebooks> list) {

        list.sort(new Comparator<Notebooks>() {

            public int compare(Notebooks o1, Notebooks o2) {
                if (o2.getmemoryVolume() == o1.getmemoryVolume())
                    return o2.getfrequencyMemory() - o1.getfrequencyMemory();//При равн.объеме оперпамяти по умен.частоты
                return o2.getmemoryVolume() - o1.getmemoryVolume();// Сортировка по уменьшению объема оперативной памяти
            }
        });

        list.sort(new Comparator<Notebooks>() {

            public int compare(Notebooks o1, Notebooks o2) {
                if (o2.getmemoryVolume() == o1.getmemoryVolume() & o2.getfrequencyMemory() == o1.getfrequencyMemory())
                    return (int) o2.getprice() - (int) o1.getprice();// По уменьшению стоимости
                return 0;
            }
        });

        return list;
    }

}
