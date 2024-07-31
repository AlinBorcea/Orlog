package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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
