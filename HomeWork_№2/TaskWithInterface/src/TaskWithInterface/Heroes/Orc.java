package TaskWithInterface.Heroes;

import TaskWithInterface.InterfaceTask;

public class Orc implements InterfaceTask {
    
    protected double fatigue;//Усталость
    protected double lifeCycle; // Жизненный цикл - аналог очков жизни

    public Orc(double fatigue, double lifeCycle){
        this.fatigue = fatigue;
        this.lifeCycle = lifeCycle;
    }
    
    
    public void getInfo(){
        System.out.println("Это Орк !Максимальные значения усталости и жизненного цикла - 100 ед.");
    }
    

    public void about(){
        System.out.printf("\nЭто Орк. Усталость =  %.2f, Жизненный цикл = %.2f",fatigue,lifeCycle);

    }  


}
