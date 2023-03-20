package FromSimpleToPractical;

import java.util.Arrays;
import java.util.Scanner;

import FromSimpleToPractical.RobotMap.Direction;
import FromSimpleToPractical.RobotMap.Robot;

public class App {

    public static void main(String[] args) {
        // 1.
        // Карта с каким-то размером nxm.
        // На ней можно создать робов, указывая начальное положение.
        // Если начальное положение некорректное ИЛИ эта позиция занята другим робом, то
        // кидаем исключение.
        // Робот имеет направление (вверх, вправо, вниз, влево). У роботов можно менять
        // направление и передвигать их на 1 шаг вперед
        // 2.
        // Написать контроллер к этому коду, который будет выступать посредником между
        // консолью (пользователем) и этой игрой.
        // (0,0) ------------------ (0, m)
        // ...
        // (n, 0) ----------------------- (n, m)

        // Robot, Map, Point

        // Домашнее задание:
        // Реализовать чтение команд с консоли и выполнить их в main методе
        // Список команд:
        // create-map 3 5 -- РЕАЛИЗОВАНО!
        // create-robot 2 7
        // move-robot id
        // change-direction id LEFT

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите команду для создания карты:");
        RobotMap map = null;
        while (true) {
            String command = sc.nextLine();
            if (command.startsWith("create-map")) {
                String[] split = command.split(" "); // [create-map 3 5]
                String[] arguments = Arrays.copyOfRange(split, 1, split.length); // [3 5]

                try {
                    map = new RobotMap(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1]));
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("При создании карты возникло исключение: " + e.getMessage() + "." +
                            " Попробуйте еще раз");
                }
            } else {
                System.out.println("Команда не найдена. Попробуйте еще раз");
            }
        }

        // sc.close();

        RobotMap.Robot robot1 = null;
        RobotMap.Robot robot2 = null;
        RobotMap.Robot robot3 = null;
        RobotMap.Robot robot4 = null;

        try {
            robot1 = map.createRobot(new Point(2, 5));
            robot2 = map.createRobot(new Point(4, 5));
            System.out.println("\n\t1 " + robot1);
            System.out.println("\t2 " + robot2);
        } catch (PositionException e) {
            System.out.println("Во время создания робота случилось исключение: " + e.getMessage());
        }

        if (robot2 != null) {
            try {
                robot2.move();
            } catch (PositionException e) {
                System.out.println("Не удалось переместить робота: " + e.getMessage());
            }
        }

        robot2.changeDirection(Direction.LEFT);
        try {
            robot2.move();
            robot2.move();
            robot2.move();
        } catch (PositionException e) {
            System.out.println("Не удалось переместить робота: " + e.getMessage());
        }
        System.out.println("\t2 " + robot2);

        try {
            robot3 = map.createRobot(new Point(5, 5));
            System.out.println("\t3 " + robot3);
        } catch (Exception e) {
            System.out.println("Во время создания робота случилось исключение: " + e.getMessage());
        }
        // -----------------

        System.out.println("Введите команду для создания робота:");
        while (true) {
            String command = sc.nextLine();
            if (command.startsWith("create-robot")) {
                String[] split = command.split(" "); // [create-robot 2 7]
                String[] arguments = Arrays.copyOfRange(split, 1, split.length); // [2 7]

                try {
                    int hh = Integer.parseInt(arguments[0]);
                    int gg = Integer.parseInt(arguments[1]);
                    try {
                        robot4 = map.createRobot(new Point(hh, gg));
                        System.out.println("\t4 " + robot4+" создан");
                    } catch (PositionException e) {
                        e.printStackTrace();
                    }
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("При создании робота возникло исключение: " + e.getMessage() + "." +
                            " Попробуйте еще раз");
                }
            } else {
                System.out.println("Команда не найдена. Попробуйте еще раз");
            }
            
        }
        //----------------------------------------
        System.out.println("Введите команду для движения робота:");
        while (true) {
            String command = sc.nextLine();
            if (command.startsWith("move-robot")) {
                String[] split = command.split(" "); // [move-robot id]
                String[] arguments = Arrays.copyOfRange(split, 1, split.length); // [id]

                try {
                    int ff = Integer.parseInt(arguments[0]);
                    String robotMove = "robot" + ff;
                    if (robotMove != null) {
                        try {
                            robot4.move();
                        } catch (PositionException e) {
                            System.out.println("Не удалось переместить робота: " + e.getMessage());
                        }
                    }
                    System.out.println("\t4 " + robotMove+" перемещен");
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("При перемещении робота возникло исключение: " + e.getMessage());
                }
            } else {
                System.out.println("Команда не найдена. Попробуйте еще раз");
            }
        }
        
        //------------------------------------------------
        System.out.println("Введите команду для изменения напрвления движения робота (change-direction id LEFT):");
        while (true) {
            String command = sc.nextLine();
            if (command.startsWith("change-direction")) {
                String[] split = command.split(" "); // [move-robot id]
                String[] arguments = Arrays.copyOfRange(split, 1, split.length); // [id LEFT]

                try {
                    int ff = Integer.parseInt(arguments[0]);
                    String robotMoveChange = "robot" + ff;
                    String commandMoveChange = arguments[1];
                    if (robotMoveChange != null) {
                        robot4.changeDirection(Direction.LEFT);
                    }
                    System.out.println("\t4 " + robotMoveChange+" изменение направления движения");
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("При изменении направления движения робота возникло исключение: " + e.getMessage());
                }
            } else {
                System.out.println("Команда не найдена. Попробуйте еще раз");
            }
        }
        sc.close();

    }

}