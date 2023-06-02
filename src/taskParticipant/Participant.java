package taskParticipant;

abstract class Participant {

    private String name;
    private double height;
    private double dist;

    public void run(double distance) {
            System.out.println(getName() + " біжить " + distance + " м");
    }

    public void jump(double height) {
            System.out.println(getName() + " стрибає " + height + " м");
    }

    public void overcome(Obstacle obstacle) {
        switch (obstacle) {
            case WALL -> jump(obstacle.getValue());
            case RACETRACK -> run(obstacle.getValue());
        }
    }

    public Participant(String name, double height, double length) {
        this.name = name;
        this.height = height;
        this.dist = length;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getDist() {
        return dist;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", lenght=" + dist +
                '}';
    }
}
