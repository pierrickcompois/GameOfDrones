package fr.uga.miage.game;

/**
 * @author Quentin Blondel
 */
public class Drone {

    private int elevation;

    private int coordinateX;

    private int coordinateY;

    public int getElevation() {
        return elevation;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    /**
     * Initializes the fr.uga.miage.game.Drone with spacial coordinates.
     * @param coordinateX
     * @param coordinateY
     */
    public Drone(int coordinateX, int coordinateY) {
        this.elevation = 0;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    /**
     * Elevation is increased of 1.
     * @throws LocationException when elevation is superior to 150 meters
     */
    public void moveUp() throws LocationException {
        if (this.elevation == 150)
            throw new LocationException("The drone can't move up over 150 meters !");
        this.elevation++;
        System.out.println("fr.uga.miage.game.Drone is moving up");
        displayParameters();
    }

    /**
     * Elevation is decreased of 1.
     * @throws LocationException when elevation is equal to 0 meters
     */
    public void moveDown() throws LocationException {
        if (this.elevation == 0)
            throw new LocationException("The drone can't move down when it's on the ground !");
        this.elevation--;
        System.out.println("fr.uga.miage.game.Drone is moving down");
        displayParameters();
    }

    /**
     * Coordinate X is increased of 1. The fr.uga.miage.game.Drone must be in the air to move.
     * @throws LocationException when X is equal to 1000 meters, it is the max range of our fr.uga.miage.game.Drone
     */
    public void moveRight() throws LocationException {
        if (this.elevation == 0)
            throw new LocationException("The drone can't move right when it's on the ground !");
        if (this.coordinateX == 1000)
            throw new LocationException("The drone can't move over 1 km !");
        this.coordinateX++;
        System.out.println("fr.uga.miage.game.Drone is moving right");
        displayParameters();
    }

    /**
     * Coordinate X is decreased of 1. The fr.uga.miage.game.Drone must be in the air to move.
     * @throws LocationException when X is equal to -1000 meters, it is the max range of our fr.uga.miage.game.Drone.
     */
    public void moveLeft() throws LocationException {
        if (this.elevation == 0)
            throw new LocationException("The drone can't move left when it's on the ground !");
        if (this.coordinateX == -1000)
            throw new LocationException("The drone can't move over 1 km !");
        this.coordinateX--;
        System.out.println("fr.uga.miage.game.Drone is moving left");
        displayParameters();
    }

    /**
     * Coordinate Y is increased of 1. The fr.uga.miage.game.Drone must be in the air to move.
     * @throws LocationException when Y is equal to 1000 meters, it is the max range of our fr.uga.miage.game.Drone
     */
    public void moveForward() throws LocationException {
        if (this.elevation == 0)
            throw new LocationException("The drone can't move foward when it's on the ground !");
        if (this.coordinateY == 1000)
            throw new LocationException("The drone can't move over 1 km !");
        this.coordinateY++;
        System.out.println("fr.uga.miage.game.Drone is moving forward");
        displayParameters();
    }

    /**
     * Coordinate Y is decreased of 1. The fr.uga.miage.game.Drone must be in the air to move.
     * @throws LocationException when Y is equal to -1000 meters, it is the max range of our fr.uga.miage.game.Drone.
     */
    public void moveBack() throws LocationException {
        if (this.elevation == 0)
            throw new LocationException("The drone can't move back when it's on the ground !");
        if (this.coordinateY == -1000)
            throw new LocationException("The drone can't move over 1 km !");
        this.coordinateY--;
        System.out.println("fr.uga.miage.game.Drone is moving back");
        displayParameters();
    }

    public void displayParameters() {
        System.out.println("Elevation : " + this.elevation + " / Coordinates(X=" + this.coordinateX + ", Y=" + this.coordinateY + ")");
    }
}
