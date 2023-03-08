package TaskWithInterface;

import TaskWithInterface.Heroes.Bridge;
import TaskWithInterface.Heroes.Orc;
import TaskWithInterface.Heroes.WoodBilding;
import java.util.Random;

public class App  {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\tИмеются : стальной мост, Орк, деревянное строение");
       
        Bridge bridge = new Bridge(Math.random()*100);
        //Bridge bridge = new Bridge(80);
        Orc orc = new Orc(Math.random()*100, Math.random()*100);
        WoodBilding woodBilding = new WoodBilding(Math.random()*100);
        
        bridge.getInfo();
        orc.getInfo();
        woodBilding.getInfo();

        bridge.about();
        orc.about();
        woodBilding.about();

    }


    
}
