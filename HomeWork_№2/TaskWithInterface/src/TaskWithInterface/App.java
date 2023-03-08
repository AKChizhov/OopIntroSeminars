package TaskWithInterface;

import TaskWithInterface.Heroes.Bridge;
import TaskWithInterface.Heroes.Orc;
import TaskWithInterface.Heroes.WoodBilding;

public class App  {
    static String RED =TaskWithInterface.ColorLib.ANSI_RED;
    static String YELLOW =TaskWithInterface.ColorLib.ANSI_YELLOW ;
    static String GREEN =TaskWithInterface.ColorLib.ANSI_GREEN ;
    static String RESET =TaskWithInterface.ColorLib.ANSI_RESET ;
    
    
    public static void main(String[] args) throws Exception {
        


        System.out.println(RED+"\n\tИмеются : стальной мост, Орк, деревянное строение"+RESET);
       
        Bridge bridge = new Bridge(Math.random()*100);
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
