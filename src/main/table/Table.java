package main.table;

import main.DieFace;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private final List<DieFace> dice = new ArrayList<>(6);
    private final ReorderStrategy reorderStrategy;

    public Table(ReorderStrategy reorderStrategy) {
        this.reorderStrategy = reorderStrategy;
    }

    public List<DieFace> getDice() {
        return dice;
    }

    public void reorder() {
        reorderStrategy.reorder(dice);
    }
}
