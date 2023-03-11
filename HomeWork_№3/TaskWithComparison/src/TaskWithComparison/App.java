package TaskWithComparison;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.print("\033[H\033[2J");// Очистка экрана

        ArrayList<Notebooks> myComputers = ComputerCreate.MyComputerCreate(15);

        ComputerPrinting.MyPrinting(myComputers);

        myComputers = SortComputer.MySorting(myComputers);

        ComputerPrinting.MyPrinting(myComputers);
    }
}
