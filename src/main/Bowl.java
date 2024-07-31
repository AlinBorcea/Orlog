package main;

import main.dice.DieFace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Bowl {
    private final List<DieFace> dice = new ArrayList<>(6);
    private int diceLeft = 6;

    public List<DieFace> getDice() {
        return dice;
    }

    public void generateDieFaces() {
        if (diceLeft <= 0) return;

        dice.clear();
        IntStream nums = new Random().ints(diceLeft, 1, 6);
        nums.forEach(value -> dice.add(DieFace.fromInt(value)));
    }

    public void decreaseDiceLeft(int amount) {
        diceLeft -= amount;
    }

}
