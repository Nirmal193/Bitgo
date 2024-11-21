package org.example.snake_N_ladders;

import org.example.snake_N_ladders.Obstacles.Obstacle;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<Obstacle> obstacleList;

    public Board(int size){
        this.size = size;
        obstacleList = new ArrayList<>();
    }
    public int getSize(){
        return size;
    }
    public void addObstacle(Obstacle obstacle){
        obstacleList.add(obstacle);
    }
    public int processPosition(int position){
        for(Obstacle obstacle : obstacleList){
            if(position == obstacle.getStart()){
                System.out.println("Hit an obstacle " + obstacle.getType()
                        + "from start " + obstacle.getStart()  + "to end " + obstacle.getEnd());
                return obstacle.getEnd();
            }
        }
        return position;
    }
}
