package About_SOLID;

import java.util.UUID;

public class MoveRobotCommandHandler implements CommandHandler {

    @Override
    public String commandName() {
        return "move-robot";
    }

    @Override
    public void handleCommand(RobotMap map, String[] args) {
        UUID robotId = UUID.fromString(args[0]);
        RobotMap.Robot robotById = map.findRobotById(robotId);
        if (robotById != null) {
            robotById.move();
            System.out.println("Робот с идентификаторо " + robotById+" передвинут");  
        }else {
            System.out.println("Робот с идентификаторо " + robotById+" не найден");
        }
        
    }

}
