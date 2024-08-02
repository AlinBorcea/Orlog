package main;

import main.dice.DieFace;
import main.table.AttackFirstStrategy;
import main.table.DefenseFirstStrategy;
import main.table.Table;

import java.util.List;
import java.util.Random;

public class Game {
    private final Player player1 = new Player(new Table(new AttackFirstStrategy()));
    private final Player player2 = new Player(new Table(new DefenseFirstStrategy()));
    private boolean turnOfPlayer1 = true;

    public void run() {
        turnOfPlayer1 = new Random().nextBoolean();

        Player currentPlayer;
        for (int i = 0; i < 10; i++) {
            System.out.print("Turn " + i + ": ");
            currentPlayer = turnOfPlayer1 ? player1 : player2;

            List<DieFace> generatedFaces = currentPlayer.bowl.generateDieFaces();
            currentPlayer.table.dice.addAll(generatedFaces);
            currentPlayer.table.reorder();

            turnOfPlayer1 = !turnOfPlayer1;
            System.out.println(currentPlayer.table.dice);
        }
    }
}
