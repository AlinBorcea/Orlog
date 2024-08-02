package test.java;

import main.Bowl;
import main.dice.DiceInfo;
import org.junit.jupiter.api.Test;

public class TestDiceInfo {
    @Test
    public void testDiceInfo() {
        Bowl bowl = new Bowl();
        DiceInfo info = new DiceInfo(bowl.generateDieFaces());

        System.out.println(info);
    }
}
