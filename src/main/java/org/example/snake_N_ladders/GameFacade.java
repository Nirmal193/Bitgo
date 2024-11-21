package org.example.snake_N_ladders;

import org.example.snake_N_ladders.Obstacles.Obstacle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameFacade {
    private Board board;
    private List<Player> playerList = new ArrayList<>();
    private Random dice = new Random();
    public GameFacade(Board board,List<String> playerList,List<Obstacle> obstacleList){
        this.board = board;
        for(Obstacle obstacle : obstacleList)
            board.addObstacle(obstacle);
        for(String name:playerList)
            this.playerList.add(new Player(name));
    }
    public void startGame(){
        boolean hasWonGame = false;
        while(!hasWonGame) {
            for (Player player : playerList) {
                if(isPlayerWon(player)){
                    hasWonGame = true;
                    break;
                }
            }
        }
    }
    private boolean isPlayerWon(Player player){
        int rolledNumber = dice.nextInt(1,7);
        System.out.println("player " + player.getName() + "has rolled the dice with value :" +rolledNumber);
        int newPosition = player.getPosition() + rolledNumber;
        newPosition = board.processPosition(newPosition);
        player.setPosition(newPosition);
        if(newPosition == board.getSize()){
            System.out.println(player.getName() + " has won the game");
            return true;
        }
        return false;
    }


}
