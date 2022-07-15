package com.REST_api.REST_api.Board;

import java.util.Arrays;

public class Board {
    private Field[] fields;
    private Player[] players;

    public Board(Field[] fields, Player[] players) {
        this.fields = fields;
        this.players = players;
    }

    public Field[] getFields() {
        return fields;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setFields(Field[] fields) {
        this.fields = fields;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Board{" +
                "fields=" + Arrays.toString(fields) +
                ", players=" + Arrays.toString(players) +
                '}';
    }
}
