import java.util.HashMap;
import java.util.Map;

public class SmartHomeRemoteControl {
    private Map<Integer, Command> commandSlots = new HashMap<>();
    private Command lastCommand;

    public void setCommand(int slot, Command command) {
        commandSlots.put(slot, command);
    }

    public void pressButton(int slot) {
        Command command = commandSlots.get(slot);
        if (command != null) {
            command.execute();
            lastCommand = command;
        } else {
            System.out.println("No command assigned to slot " + slot);
        }
    }

    public void undoButton() {
        if (lastCommand != null) {
            System.out.println("Undo last command");
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo");
        }
    }
}