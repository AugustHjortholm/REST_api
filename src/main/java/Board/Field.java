package Board;

public class Field {
    int posX;
    int posY;
    String wall;
    String action;

    public Field (int posX, int posY, String wall, String action){
        this.posX = posX;
        this.posY = posY;
        this.wall = wall;
        this.action = action;

    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Field{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", wall='" + wall + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
