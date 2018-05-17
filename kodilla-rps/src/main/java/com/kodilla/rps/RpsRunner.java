package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String playerName = scanner.nextLine();

        Player player1 = new Player(playerName);

        ComputerPlayer computer = new ComputerPlayer();

        System.out.println("How many rounds do we play?");
        int wantedRounds = scanner.nextInt();

        Score score = new Score(player1, computer, wantedRounds);
        System.out.println("Keyboard shortcuts:\n" +
                "1 - rock\n" +
                "2 - paper\n" +
                "3 - scissors\n" +
                "x - end game\n" +
                "n - play again");


        StageGame stageGame = null;
        while (score.hasNextRound()) {
            stageGame = score.play();
        }
        stageGame.printResult();
    }
}