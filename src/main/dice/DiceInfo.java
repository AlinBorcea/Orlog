package main.dice;

import java.util.List;

public class DiceInfo {
    public long countAxes;
    public long countArrows;
    public long countHelmets;
    public long countShields;
    public long countHands;
    
    public DiceInfo(List<DieFace> dice) {
        initCounters(dice);
    }

    private void initCounters(List<DieFace> dice) {
        countAxes = dice.stream().filter(dieFace -> dieFace == DieFace.AX).count();
        countArrows = dice.stream().filter(dieFace -> dieFace == DieFace.ARROW).count();
        countHelmets = dice.stream().filter(dieFace -> dieFace == DieFace.HELMET).count();
        countShields = dice.stream().filter(dieFace -> dieFace == DieFace.SHIELD).count();
        countHands = dice.stream().filter(dieFace -> dieFace == DieFace.HAND).count();
    }

    @Override
    public String toString() {
        return "DiceInfo{" +
                "countAxes=" + countAxes +
                ", countArrows=" + countArrows +
                ", countHelmets=" + countHelmets +
                ", countShields=" + countShields +
                ", countHands=" + countHands +
                '}';
    }
}
