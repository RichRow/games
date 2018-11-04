package com.richrow.boardgames.rules;

public abstract class Rules implements IRules {
    protected String name;

    protected Rules(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}