package taskParticipant;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Participant> participantList = new ArrayList<>();
        participantList.add(new Man("Сергій", 2, 500));
        participantList.add(new Cat("Жорік", 1, 20));
        participantList.add(new Robot("Robocop", 1.5, 190));

        List<Obstacle> obstacleList = new ArrayList<>();
        obstacleList.add(Obstacle.WALL);
        obstacleList.add(Obstacle.RACETRACK);

        for (Obstacle obs : Obstacle.values()) {
            System.out.println("Перешкода " + obs.name() + " " + obs.getValue() + " м");
        }
        System.out.println();

        for (Participant participant : participantList) {
            boolean cont = false;
            for (Obstacle obstacle : obstacleList) {
                if (!cont) {
                    switch (obstacle) {
                        case WALL -> {
                            participant.overcome(obstacle);
                            if (participant.getHeight() >= obstacle.getValue()) {
                                System.out.println(participant.getName() + " подолав перешкоду " +obstacle.name());
                            } else {
                                System.out.println(participant.getName() + " не подолав перешкоду " +
                                        obstacle.name() + "=" + obstacle.getValue() +
                                        " м і вибуває з подальших випробувань. Його максимум: " +
                                        participant.getHeight() + "м");
                                cont = true;
                            }
                        }
                        case RACETRACK -> {
                            participant.overcome(obstacle);
                            if (participant.getDist() >= obstacle.getValue()) {
                                System.out.println(participant.getName() + " подолав перешкоду " +obstacle.name());
                            } else {
                                System.out.println(participant.getName() + " не подолав перешкоду " +
                                        obstacle.name() + "=" + obstacle.getValue() +
                                        " м і вибуває з подальших випробувань. Його максимум: " +
                                        participant.getDist() + "м");
                                cont = true;
                            }
                        }
                    }
                }
            }
        }
    }
}
