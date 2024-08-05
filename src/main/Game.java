package main;

import main.dice.DieFace;
import main.resolve.ResolveRoundInfo;
import main.resolve.Resolver;
import main.table.AttackFirstStrategy;
import main.table.DefenseFirstStrategy;
import main.table.Table;

import java.util.List;
import java.util.Scanner;

public class Game {
    private final Player player1 = new Player(new Table(new AttackFirstStrategy()));
    private final Player player2 = new Player(new Table(new DefenseFirstStrategy()));

    public void run() {
        Scanner scanner = new Scanner(System.in);

        Resolver resolver = new Resolver();
        ResolveRoundInfo roundInfo;

        for (int i = 0; i < 2; i++) {
            initPlayer(player1);
            initPlayer(player2);

            player1Turn(player1);
            player2Turn(player2, scanner);

            if (i % 2 == 1) {
                roundInfo = resolver.resolve(player1.table.dice, player2.table.dice);
                player1.decreaseHealth(roundInfo.playerOneChangeInHealth);
                player2.decreaseHealth(roundInfo.playerTwoChangeInHealth);

                System.out.println(player1.table.dice);
                System.out.println(player2.table.dice);
                System.out.println(roundInfo.playerOneChangeInHealth < roundInfo.playerTwoChangeInHealth ? "You lose!" : "You win!");

                player1.table.dice.clear();
                player2.table.dice.clear();
            }
        }
    }
    
    private void initPlayer(Player player) {
        List<DieFace> dice = player.bowl.generateDieFaces();
        player.table.dice.addAll(dice);
    }

    private void player1Turn(Player player) {
        player.bowl.decreaseDiceLeft(6);
    }

    private void player2Turn(Player player, Scanner scanner) {
        System.out.println("Keep first n = ?");
        int n = scanner.nextInt();
        player.bowl.decreaseDiceLeft(6 - n);
    }
}
