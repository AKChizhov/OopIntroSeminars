package TaskWithInterface.Heroes;

import TaskWithInterface.InterfaceTask;
import TaskWithInterface.App;
public class WoodBilding implements InterfaceTask {
    
    String colorHero;
    protected double lifeCycle; // Жизненный цикл - аналог очков жизни

    public WoodBilding(double lifeCycle){
       
        this.lifeCycle = lifeCycle;
    }

    public void getInfo(){
        System.out.println("Это деревянное строение !Максимальное значение жизненного цикла - 100 ед.");
    }
    

    public void about(){
        if (lifeCycle < 25) {colorHero = TaskWithInterface.ColorLib.ANSI_RED;
        }else if(lifeCycle < 50 & lifeCycle >=25){colorHero = TaskWithInterface.ColorLib.ANSI_YELLOW;
        }else {colorHero = TaskWithInterface.ColorLib.ANSI_GREEN;
        }

        System.out.printf("\n%s Это деревянное здание .Усталость = %.2f  %s", colorHero, lifeCycle, App.RESET);

    }  

}
