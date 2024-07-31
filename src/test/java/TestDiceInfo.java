package test.java;

import main.Bowl;
import main.dice.DiceInfo;
import org.junit.jupiter.api.Test;

public class TestDiceInfo {
    @Test
    public void testDiceInfo() {
        Bowl bowl = new Bowl();
        bowl.generateDieFaces();
        DiceInfo info = new DiceInfo(bowl.getDice());

        System.out.println(bowl.getDice());
        System.out.println(info);
    }
}
