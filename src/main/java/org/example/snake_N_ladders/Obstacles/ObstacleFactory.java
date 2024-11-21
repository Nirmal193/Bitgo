package org.example.snake_N_ladders.Obstacles;

import java.util.NoSuchElementException;

public class ObstacleFactory {
    public static Obstacle createObstacle(int start,int end,String type){
        switch (type.toUpperCase()){
            case "SNAKE" :
                return new Snake(start,end);
            case "LADDER":
                return new Ladder(start,end);
            default:
                throw new NoSuchElementException("No such thing present");
        }
    }
}
