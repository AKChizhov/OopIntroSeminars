package TaskWithComparison;

import java.util.ArrayList;
import java.util.Comparator;

public class SortComputerBy3param {

    static ArrayList<Notebooks> MySorting(ArrayList<Notebooks> list) {

        list.sort(new Comparator<Notebooks>() {

            public int compare(Notebooks o1, Notebooks o2) {
                if (o2.getmemoryVolume() == o1.getmemoryVolume())
                    return o2.getfrequencyMemory() - o1.getfrequencyMemory();// При равн.объеме оперпамяти по убыв.частоты
                return o2.getmemoryVolume() - o1.getmemoryVolume();// Сортировка по убыванию объема оперативной памяти
            }
        });

        list.sort(new Comparator<Notebooks>() {

            public int compare(Notebooks o1, Notebooks o2) {
                if (o2.getmemoryVolume() == o1.getmemoryVolume() & o2.getfrequencyMemory() == o1.getfrequencyMemory())
                    return (int) o2.getprice() - (int) o1.getprice();// По убыванию стоимости
                return 0;
                }          
        });
           
        return list;
    }

}
