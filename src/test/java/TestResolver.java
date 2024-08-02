package test.java;

import main.Bowl;
import main.resolve.ResolveRoundInfo;
import main.resolve.Resolver;
import main.dice.DieFace;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestResolver {
    @Test
    public void testResolver() {
        Bowl bowl = new Bowl();
        List<DieFace> dice1 = bowl.generateDieFaces();
        List<DieFace> dice2 = bowl.generateDieFaces();

        Resolver resolver = new Resolver();
        ResolveRoundInfo roundInfo = resolver.resolve(dice1, dice2);

        System.out.println(dice1);
        System.out.println(dice2);
        System.out.println(roundInfo);
    }
}
