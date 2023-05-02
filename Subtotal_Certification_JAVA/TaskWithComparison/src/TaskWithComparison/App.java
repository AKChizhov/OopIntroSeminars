package TaskWithComparison;

import java.util.ArrayList;
import java.util.Collections;


public class App {
    public static void main(String[] args) throws Exception {

        System.out.print("\033[H\033[2J");// Очистка экрана

        Messages.listOf_15_Items();
        ArrayList<Notebooks> myComputers = ComputerCreate.MyComputerCreate(15);
        ComputerPrinting.MyPrinting(myComputers);

        Messages.SortPrice(" стоимости ", " увеличению ", "\u001B[33m");
        myComputers = SortComputerBy1param.MySorting(myComputers, "price_up");
        ComputerPrinting.MyPrinting(myComputers);

        Messages.SortPrice("стоимости ", " уменьшению ", "\u001B[34m");
        myComputers = SortComputerBy1param.MySorting(myComputers, "price_down");
        ComputerPrinting.MyPrinting(myComputers);

        Messages.SortMemoryVolume_FrequencyMemory_Price_DOWN();
        myComputers = SortComputerBy3param.MySorting(myComputers);
        ComputerPrinting.MyPrinting(myComputers);

        Messages.SortPrice(" кол-ва букв в названии ", " увеличению ", "\u001B[35m");
        Collections.sort(myComputers, null);
        ComputerPrinting.MyPrinting(myComputers);

        Messages.SortPrice(" кол-ва букв в названии ", " уменьшению ", "\u001B[36m");
        Collections.sort(myComputers, Collections.reverseOrder());
        ComputerPrinting.MyPrinting(myComputers);

        //System.out.println(myComputers);
        System.out.println(myComputers.get(2));
        int nn = 2;
        System.out.println(myComputers.get(nn).toString());
        
    }

}
