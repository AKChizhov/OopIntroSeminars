package TaskWithInterface.Heroes;

import TaskWithInterface.App;
import TaskWithInterface.InterfaceTask;

public class Orc implements InterfaceTask {

    protected double fatigue;// Усталость
    protected double lifeCycle; // Жизненный цикл - аналог очков жизни

    public Orc(double fatigue, double lifeCycle) { //Орк
        this.fatigue = fatigue;
        this.lifeCycle = lifeCycle;
    }

    public void getInfo() {
        System.out.println(" Это Орк !Максимальные значения усталости и жизненного цикла - 100 ед.");
    }

    public String about(String color1, String color2) {
        System.out.printf("\n %sЭто Орк. Усталость =  %.2f", color1, fatigue, App.RESET);
        System.out.printf("\n\t %s Жизненный цикл = %.2f", color2, lifeCycle, App.RESET);
        return null;
    }

}
