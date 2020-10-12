package fr.uga.miage.game;

import java.util.ArrayList;
import java.util.List;
import fr.uga.miage.game.commands.Command;

/**
 * With the remote control, you can register a flight plan for your fr.uga.miage.game.Drone by
 * adding fr.uga.miage.game.commands. Just call play at the end and check that your plan is valid.
 *
 * @author Quentin Blondel
 */
public class RemoteControl {

    protected List<Command> commands;

    public RemoteControl() {
        commands = new ArrayList<Command>();
    }

    public boolean addCommand(Command command) {
        return commands.add(command);
    }

    public void play() throws LocationException {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void reset() {
        commands.clear();
    }
}
