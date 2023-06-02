package taskParticipant;

public enum Obstacle {
    WALL(1.2),
    RACETRACK(200);

    private double value;

    Obstacle(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

}