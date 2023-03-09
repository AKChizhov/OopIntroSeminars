package TaskWithInterface.Heroes;

import TaskWithInterface.App;
import TaskWithInterface.InterfaceTask;

public class Bridge implements InterfaceTask { //Стальной мост

    String colorHero;
    protected double fatigue;// Усталость

    public Bridge(double fatigue) {
        this.fatigue = fatigue;
    }

    public void getInfo() {
        System.out.println(" Это стальной мост ! Максимальное значение усталости - 100 ед.");
    }

    public String about(String color1, String color2) {
        System.out.printf("\n%s Это стальной мост .Усталость = %.2f  %s", color1, fatigue, App.RESET);
        return null;

    }

}
