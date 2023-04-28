package TaskWithComparison;

public class Messages {

    public static void listOf_15_Items() {
        System.out.println(
                "\n\t\u001B[31mОперативная память.Отличаются производителем,объемом,тактовой частотой и стоимостью.\n\tСписок из 15 позиций (15 для удобства сравнения изменений после сортировки). Все поля заполнены рандомно\u001B[0m");
    }

    public static void SortPrice(String whatSort, String howSort, String fontColor) {
        System.out.println(fontColor + "\n\tСортировка по " + howSort + whatSort + "\u001B[0m");
    }

    public static void SortMemoryVolume_FrequencyMemory_Price_DOWN() {
        System.out
                .println("\n\t\u001B[32mСортировка по убыванию : Объема памяти, Тактовой частоты, Стоимости\u001B[0m");
    }

    public static void SortByLengthTradeMark(String howSort, String fontColor) {
        System.out.println(fontColor + "\n\tСортировка по " + howSort + " стоимости\u001B[0m");
    }

}
