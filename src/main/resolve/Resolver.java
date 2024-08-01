package main.resolve;

import main.dice.DiceInfo;
import main.dice.DieFace;

import java.util.List;

public class Resolver {
    public ResolveRoundInfo resolve(List<DieFace> dice1, List<DieFace> dice2) {
        DiceInfo diceInfo1 = new DiceInfo(dice1);
        DiceInfo diceInfo2 = new DiceInfo(dice2);

        ResolveRoundInfo roundInfo = new ResolveRoundInfo();

        roundInfo.playerOneChangeInHealth -= diceInfo2.countAxes > diceInfo1.countHelmets ? (int) (diceInfo2.countAxes - diceInfo1.countHelmets) : 0;
        roundInfo.playerOneChangeInHealth -= diceInfo2.countArrows > diceInfo1.countShields ? (int) (diceInfo2.countArrows - diceInfo1.countShields) : 0;

        roundInfo.playerTwoChangeInHealth -= diceInfo1.countAxes > diceInfo2.countHelmets ? (int) (diceInfo1.countAxes - diceInfo2.countHelmets) : 0;
        roundInfo.playerTwoChangeInHealth -= diceInfo1.countArrows > diceInfo2.countShields ? (int) (diceInfo1.countArrows - diceInfo2.countShields) : 0;

        return roundInfo;
    }
}
