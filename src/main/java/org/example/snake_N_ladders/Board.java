package org.example.snake_N_ladders;

import org.example.snake_N_ladders.Obstacles.Obstacle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private int size;
    private Map<Integer,Obstacle> obstacleMap;

    public Board(int size){
        this.size = size;
        obstacleMap = new HashMap<>();
    }
    public int getSize(){
        return size;
    }
    public void addObstacle(Obstacle obstacle){
        obstacleMap.putIfAbsent(obstacle.getStart(),obstacle);
    }
    public int processPosition(int position){
            if(obstacleMap.containsKey(position)){
                Obstacle obs = obstacleMap.get(position);
                System.out.println("Hit an obstacle " + obs.getType()
                        + "from start " + obs.getStart()  + "to end " + obs.getEnd());
                return obs.getEnd();
            }
        return position;
    }
}
