package TaskWithComparison;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Computers> myComputers = ComputerCreate.MyComputerCrete(20);

        ComputerPrinting.MyPrinting(myComputers);

        myComputers = SortComputer.MySorting(myComputers);

        ComputerPrinting.MyPrinting(myComputers);
    }
}
