package org.example.snake_N_ladders.Obstacles;

public class Snake extends Obstacle {
    public Snake(int start, int end) {
        super(start, end);
    }

    @Override
    public String getType() {
        return "Snake";
    }
}
