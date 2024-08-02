package main.table;

import main.dice.DieFace;

import java.util.ArrayList;
import java.util.List;

public class Table {
    public final List<DieFace> dice = new ArrayList<>(6);
    private final ReorderStrategy reorderStrategy;

    public Table(ReorderStrategy reorderStrategy) {
        this.reorderStrategy = reorderStrategy;
    }

    public void reorder() {
        reorderStrategy.reorder(dice);
    }
}
