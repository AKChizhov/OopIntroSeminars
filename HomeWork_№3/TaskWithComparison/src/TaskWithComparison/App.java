package TaskWithComparison;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.print("\033[H\033[2J");// Очистка экрана

        ArrayList<Notebooks> myComputers = ComputerCreate.MyComputerCreate(15);
        ComputerPrinting.MyPrinting(myComputers);

        myComputers = SortComputerBy1param.MySorting(myComputers,"price_up");
        ComputerPrinting.MyPrinting(myComputers);

        myComputers = SortComputerBy1param.MySorting(myComputers,"price_down");
        ComputerPrinting.MyPrinting(myComputers);

        myComputers = SortComputerBy3param.MySorting(myComputers);
        ComputerPrinting.MyPrinting(myComputers);
    }
}
