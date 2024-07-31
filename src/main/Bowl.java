package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Bowl {
    private List<DieFace> dice = new ArrayList<>(6);
    private int diceLeft = 6;

    public List<DieFace> getDice() {
        return dice;
    }

    public void generateDieFaces() {}

}
