package TaskWithComparison;

import java.util.ArrayList;

public class ComputerPrinting {

    public static void MyPrinting(ArrayList<Computers> list) {
        System.out.println("\n");
        list.forEach(n -> n.about());

    }
}
