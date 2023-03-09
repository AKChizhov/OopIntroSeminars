package TaskWithInterface;

public class AnalizColor {
    static String name;

    public static String myAnaliz(double data) {//Анализ параметра для определения цвета шрифта

        if (data < 25) {
            name = TaskWithInterface.ColorLib.ANSI_RED;
        } else if (data < 50 & data >= 25) {
            name = TaskWithInterface.ColorLib.ANSI_YELLOW;
        } else {
            name = TaskWithInterface.ColorLib.ANSI_GREEN;
        }

        return name;
    }

}
