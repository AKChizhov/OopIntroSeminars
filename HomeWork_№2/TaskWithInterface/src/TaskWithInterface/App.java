package TaskWithInterface;

import TaskWithInterface.Heroes.Bridge;
import TaskWithInterface.Heroes.Orc;
import TaskWithInterface.Heroes.WoodBilding;

public class App {
    static String RED = TaskWithInterface.ColorLib.ANSI_RED;
    static String YELLOW = TaskWithInterface.ColorLib.ANSI_YELLOW;
    static String GREEN = TaskWithInterface.ColorLib.ANSI_GREEN;
    static String CYAN = TaskWithInterface.ColorLib.ANSI_CYAN;
    public static String RESET = TaskWithInterface.ColorLib.ANSI_RESET;

    public static void main(String[] args) throws Exception {

        System.out.print("\033[H\033[2J");// Очистка экрана;
        System.out.println(CYAN + "\n\tИмеются : стальной мост, Орк, деревянное строение\n" + RESET);
        
        double bridge1 = Math.random() * 100;
        Bridge bridge = new Bridge(bridge1);//Стальной мост
        String colorbridge = AnalizColor.myAnaliz(bridge1);

        double orc1 = Math.random() * 100;//Параметр усталость
        double orc2 = Math.random() * 100;//Параметр жизненного цикла
        Orc orc = new Orc(orc1, orc2);//Создание объекта класса ОРК
        String color1 = AnalizColor.myAnaliz(orc1);//Цвет состояния усталости
        String color2 = AnalizColor.myAnaliz(orc2);//Цвет состояния жизненного цикла

        double woodBilding1 = Math.random() * 100;
        WoodBilding woodBilding = new WoodBilding(woodBilding1);//Деревянное здание
        String colorWoodBilding = AnalizColor.myAnaliz(woodBilding1);

        bridge.getInfo();
        orc.getInfo();
        woodBilding.getInfo();

        bridge.about(colorbridge, null);
        orc.about(color1, color2);
        woodBilding.about(colorWoodBilding, null);

        System.out.println("\n");
    }

}
