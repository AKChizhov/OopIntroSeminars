package TaskWithInterface.Heroes;

import TaskWithInterface.InterfaceTask;
import TaskWithInterface.App;

public class WoodBilding implements InterfaceTask {

    String colorHero;
    protected double lifeCycle; // Жизненный цикл - аналог очков жизни

    public WoodBilding(double lifeCycle) { //Деревянное здание

        this.lifeCycle = lifeCycle;
    }

    public void getInfo() {
        System.out.println(" Это деревянное строение !Максимальное значение жизненного цикла - 100 ед.");
    }

    public String about(String color1, String color2) {
        System.out.printf("\n%s Это деревянное здание .Жизненный цикл = %.2f  %s", color1, lifeCycle, App.RESET);
        return null;

    }

}
