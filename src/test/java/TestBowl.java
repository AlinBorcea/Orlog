package test.java;

import main.Bowl;
import main.DieFace;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TestBowl {
    @Test
    public void testGenerate() {
        Bowl bowl = new Bowl();
        bowl.generateDieFaces();
        List<DieFace> faces = bowl.getDice();
        Stream<DieFace> result = faces.stream().filter(dieFace -> dieFace != DieFace.NONE);

        assert(result.count() == faces.size());
    }
}
