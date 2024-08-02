package test.java;

import main.Bowl;
import main.dice.DieFace;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TestBowl {
    @Test
    public void testGenerate() {
        Bowl bowl = new Bowl();
        List<DieFace> faces = bowl.generateDieFaces();
        Stream<DieFace> result = faces.stream().filter(dieFace -> dieFace != DieFace.NONE);

        assert(result.count() == faces.size());
    }

    @Test
    public void testGenerateAfterDecrease() {
        Bowl bowl = new Bowl();
        bowl.generateDieFaces();
        bowl.decreaseDiceLeft(3);


        List<DieFace> faces = bowl.generateDieFaces();
        assert (faces.size() == 3);
    }
}
