package com.REST_api.REST_api.Board;

public class Field {
    String[] walls;
    //need fleshing out
    String[] actions;
    int X;
    int Y;

    public Field (int X, int Y, String[] walls, String[] actions){
        this.walls = walls;
        this.actions = actions;
        this.X = X;
        this.Y = Y;

    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public String[] getWalls() {
        return walls;
    }

    public void setWalls(String[] walls) {
        this.walls = walls;
    }

    public String[] getActions() {
        return actions;
    }

    public void setActions(String[] actions) {
        this.actions = actions;
    }

    @Override
    public String toString() {
        return "Field{" +
                "posX=" + X +
                ", posY=" + Y +
                ", wall='" + walls + '\'' +
                ", action='" + actions + '\'' +
                '}';
    }
}
