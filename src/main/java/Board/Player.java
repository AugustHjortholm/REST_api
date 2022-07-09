package Board;

import java.awt.*;
import java.util.Arrays;

public class Player {
    int posX;
    int posY;
    String heading;
    boolean isAI;
    String name;
    Color color;
    String[] commandCards;
    String[] registerCards;

    public Player(int posX, int posY, String heading, boolean isAI, String name, Color color, String[] commandCards, String[] registerCards){
        this.posX = posX;
        this.posY = posY;
        this.heading = heading;
        this.isAI = isAI;
        this.name = name;
        this.color = color;
        this.commandCards = commandCards;
        this.registerCards = registerCards;
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

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public boolean isAI() {
        return isAI;
    }

    public void setAI(boolean AI) {
        isAI = AI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String[] getCommandCards() {
        return commandCards;
    }

    public void setCommandCards(String[] commandCards) {
        this.commandCards = commandCards;
    }

    public String[] getRegisterCards() {
        return registerCards;
    }

    public void setRegisterCards(String[] registerCards) {
        this.registerCards = registerCards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", heading='" + heading + '\'' +
                ", isAI=" + isAI +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", commandCards=" + Arrays.toString(commandCards) +
                ", registerCards=" + Arrays.toString(registerCards) +
                '}';
    }
}
