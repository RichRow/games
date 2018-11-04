package com.richrow.boardgames.players;

public abstract class Player implements IPlayer {
    protected String name;

    protected Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}