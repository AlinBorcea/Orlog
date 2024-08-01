package main;

import main.table.Table;

public class Player {
    public final Bowl bowl = new Bowl();
    public final Table table;

    private int health = 15;

    public Player(Table table) {
        this.table = table;
    }

    public void decreaseHealth(int amount) {
        health -= amount;
    }

    public boolean isHealthEmpty() {
        return health <= 0;
    }

}
