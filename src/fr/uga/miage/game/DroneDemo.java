package fr.uga.miage.game;

/**
 * The main class.
 * @author Quentin Blondel
 */
public class DroneDemo {

    // Setup
    static Drone drone = new Drone(0, 0);

    static RemoteControl remote = new RemoteControl();

    public static void main(String[] args) throws Exception {
        programTheDrone();
        remote.play();
    }

    public static void programTheDrone() {
    // TODO Program the drone to go to position (1,1,1) and to go back to position (0,0,0)
    }
}
