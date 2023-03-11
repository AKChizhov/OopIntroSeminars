package TaskWithComparison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ComputerCreate {

    static ArrayList<Notebooks> MyComputerCreate(int value) {

        ArrayList<Notebooks> list = new ArrayList<>();

        List memoryFrequecyses = Arrays.asList( 2400, 3200);
        Random temp = new Random();
            
        for (int i = 0; i < value; i++) {
            int randomFrequencyMemory = (int) memoryFrequecyses.get(temp.nextInt(memoryFrequecyses.size())); 
            list.add(new Notebooks(getname(), 1000 + (int) (Math.random() * 1000),
                    (8 + 8 * (int) (Math.random() * 10)),randomFrequencyMemory));
        }
        return list;
    }

    private static String getname() {
        return String.valueOf(BrandCompuetrs.values()[new Random().nextInt(BrandCompuetrs.values().length)]);
    }
}
