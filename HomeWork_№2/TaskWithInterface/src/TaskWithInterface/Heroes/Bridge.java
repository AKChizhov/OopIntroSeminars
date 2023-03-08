package TaskWithInterface.Heroes;

import TaskWithInterface.InterfaceTask;

public class Bridge  implements InterfaceTask{
    
    protected double fatigue;//Усталость
    
    public Bridge(double fatigue){
        this.fatigue = fatigue;
    }

    public void getInfo(){
        System.out.println("Это стальной мост ! Максимальное значение усталости - 100 ед.");
    }
    

    public void about(){
        System.out.printf("\nЭто стальной мост .Усталость = %.2f",fatigue);
        
    }  

}
