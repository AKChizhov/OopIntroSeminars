package TaskWithComparison;

import java.util.ArrayList;

public class ComputerPrinting {

    public static void MyPrinting(ArrayList<Notebooks> list) {
        System.out.println("\n");
        list.forEach(n -> n.about());
        System.out.println("\n");
    }
}
