package fr.uga.miage.game.commands;

import fr.uga.miage.game.LocationException;

/**
 * @author Quentin Blondel
 */
public interface Command {

    void execute() throws LocationException;
}
