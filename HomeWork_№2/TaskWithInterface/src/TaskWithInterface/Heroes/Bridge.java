package TaskWithInterface.Heroes;

import TaskWithInterface.App;
import TaskWithInterface.InterfaceTask;

public class Bridge  implements InterfaceTask{

    String colorHero;
    protected double fatigue;//Усталость
    
    public Bridge(double fatigue){
        this.fatigue = fatigue;
    }

    public void getInfo(){
        System.out.println("Это стальной мост ! Максимальное значение усталости - 100 ед.");
    }
    

    public void about(){
        if (fatigue < 25) {colorHero = TaskWithInterface.ColorLib.ANSI_RED;
        }else if(fatigue < 50 & fatigue >=25){colorHero = TaskWithInterface.ColorLib.ANSI_YELLOW;
        }else {colorHero = TaskWithInterface.ColorLib.ANSI_GREEN;
        }

        System.out.printf("\n%s Это стальной мост .Усталость = %.2f  %s", colorHero, fatigue, App.RESET);

        
    }  

}
