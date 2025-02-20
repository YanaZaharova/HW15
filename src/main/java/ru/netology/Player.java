package ru.netology;

public class Player {
    protected String name;
    protected int id;
    protected int strength;

    public Player(String name, int id, int strength) {
        this.name = name;
        this.id = id;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }
}
