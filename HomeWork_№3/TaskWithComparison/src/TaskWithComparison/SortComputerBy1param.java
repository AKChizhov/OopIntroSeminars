package TaskWithComparison;

import java.util.ArrayList;
import java.util.Comparator;

public class SortComputerBy1param {

    static ArrayList<Notebooks> MySorting(ArrayList<Notebooks> list, String flag) {

        list.sort(new Comparator<Notebooks>() {

            public int compare(Notebooks o1, Notebooks o2) {
                if(flag == "price_up") {
                    
                    return (int) o1.getprice() - (int) o2.getprice();// По возрастанию стоимости
                }
                if(flag == "price_down"){ 
                   
                    return (int) o2.getprice() - (int) o1.getprice();// По убыванию стоимости
                }       
                return 0;
                }
        });

        return list;
    }

}
