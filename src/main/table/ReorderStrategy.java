package main.table;

import main.dice.DieFace;

import java.util.List;

public interface ReorderStrategy {
    void reorder(List<DieFace> dice);
}
