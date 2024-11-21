package org.example.snake_N_ladders;

import org.example.snake_N_ladders.Obstacles.Obstacle;
import org.example.snake_N_ladders.Obstacles.ObstacleFactory;

import java.util.ArrayList;
import java.util.List;

public class GameClient {
    public static void main(String[] args) {
        Board board = new Board(100);
        List<String> players = new ArrayList<>();
        players.add("player1");
        players.add("player2");
        List<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(ObstacleFactory.createObstacle(20,10,"snake"));
        obstacles.add(ObstacleFactory.createObstacle(37,12,"snake"));
        obstacles.add(ObstacleFactory.createObstacle(44,20,"snake"));
        obstacles.add(ObstacleFactory.createObstacle(74,33,"snake"));
        obstacles.add(ObstacleFactory.createObstacle(92,78,"snake"));
        obstacles.add(ObstacleFactory.createObstacle(10,20,"ladder"));
        obstacles.add(ObstacleFactory.createObstacle(19,31,"ladder"));
        obstacles.add(ObstacleFactory.createObstacle(24,40,"ladder"));
        obstacles.add(ObstacleFactory.createObstacle(34,70,"ladder"));
        obstacles.add(ObstacleFactory.createObstacle(56,96,"ladder"));
        GameFacade game = new GameFacade(board,players,obstacles);
        game.startGame();
    }
}
