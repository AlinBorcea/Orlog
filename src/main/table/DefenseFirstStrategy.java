package main.table;

import main.dice.DieFace;

import java.util.List;

public class DefenseFirstStrategy implements ReorderStrategy {
    @Override
    public void reorder(List<DieFace> dice) {
        List<DieFace> axes = dice.stream().filter(dieFace -> dieFace == DieFace.AX).toList();
        List<DieFace> arrows = dice.stream().filter(dieFace -> dieFace == DieFace.ARROW).toList();
        List<DieFace> helmets = dice.stream().filter(dieFace -> dieFace == DieFace.HELMET).toList();
        List<DieFace> shields = dice.stream().filter(dieFace -> dieFace == DieFace.SHIELD).toList();
        List<DieFace> hands = dice.stream().filter(dieFace -> dieFace == DieFace.HAND).toList();

        dice.clear();
        dice.addAll(helmets);
        dice.addAll(shields);
        dice.addAll(axes);
        dice.addAll(arrows);
        dice.addAll(hands);
    }
}
