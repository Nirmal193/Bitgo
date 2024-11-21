package org.example.snake_N_ladders.Obstacles;

public class Ladder extends Obstacle {
    public Ladder(int start, int end) {
        super(start, end);
    }

    @Override
    public String getType() {
        return "Ladder";
    }
}
