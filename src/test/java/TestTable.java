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

        table.dice.addAll(bowl.generateDieFaces());
        table.reorder();
        table2.dice.addAll(bowl.generateDieFaces());
        table2.reorder();

        System.out.println(table.dice);
        System.out.println(table2.dice);
    }
}
