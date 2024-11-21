package org.example.snake_N_ladders;

public class Player {
    private String name;
    private int position;
    public Player(String name){
        this.name = name;
        position = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
