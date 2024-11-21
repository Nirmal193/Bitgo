package org.example.snake_N_ladders.Obstacles;

public abstract class Obstacle {
    private int start;
    private int end;
    public Obstacle(int start,int end){
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public abstract String getType();
}
