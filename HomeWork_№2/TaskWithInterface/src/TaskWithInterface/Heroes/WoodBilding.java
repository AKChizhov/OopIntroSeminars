package TaskWithInterface.Heroes;

import TaskWithInterface.InterfaceTask;

public class WoodBilding implements InterfaceTask {
    
    protected double lifeCycle; // Жизненный цикл - аналог очков жизни

    public WoodBilding(double lifeCycle){
       
        this.lifeCycle = lifeCycle;
    }

    public void getInfo(){
        System.out.println("Это деревянное строение !Максимальное значение жизненного цикла - 100 ед.");
    }
    

    public void about(){
        System.out.printf("\nЭто деревянное строение. Жизненный цикл = %.2f\n\n",lifeCycle);

    }  

}
