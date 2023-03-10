package TaskWithComparison;

import java.util.ArrayList;
import java.util.Comparator;


public class SortComputer {
    
    static ArrayList<Computers> MySorting(ArrayList<Computers> list) {

        list.sort(new Comparator<Computers>() {
            @Override
            public int compare(Computers o1, Computers o2) {
                if (o2.getmemoryVolume() == o1.getmemoryVolume())
                    return (int) o2.getprice() - (int) o1.getprice();// При одинаковом объеме оперативной памяти по стоимости
                return o2.getmemoryVolume() - o1.getmemoryVolume();// Сортировка по убыванию объема оперативной памяти
            }
        });

        return list;
    }

}
