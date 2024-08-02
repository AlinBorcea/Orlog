package main;

import main.dice.DieFace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Bowl {
    private int diceLeft = 6;

    public List<DieFace> generateDieFaces() {
        if (diceLeft <= 0) return new ArrayList<>();

        List<DieFace> dice = new ArrayList<>(diceLeft);
        IntStream nums = new Random().ints(diceLeft, 1, 6);
        nums.forEach(value -> dice.add(DieFace.fromInt(value)));

        return dice;
    }

    public void decreaseDiceLeft(int amount) {
        diceLeft -= amount;
    }
}
