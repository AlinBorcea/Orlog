package test.java;

import main.table.AttackFirstStrategy;
import main.Bowl;
import main.table.DefenseFirstStrategy;
import main.table.Table;
import org.junit.jupiter.api.Test;

public class TestTable {
    @Test
    public void testTable() {
        Table table = new Table(new AttackFirstStrategy());
        Table table2 = new Table(new DefenseFirstStrategy());
        Bowl bowl = new Bowl();

        bowl.generateDieFaces();
        table.getDice().addAll(bowl.getDice());
        table.reorder();
        table2.getDice().addAll(bowl.getDice());
        table2.reorder();

        System.out.println(bowl.getDice());
        System.out.println(table.getDice());
        System.out.println(table2.getDice());
    }
}
