package About_SOLID;

public interface CommandHandler {

    String commandName();

    void handleCommand(RobotMap map, String[] args);

}
