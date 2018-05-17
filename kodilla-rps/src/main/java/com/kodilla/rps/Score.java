package com.kodilla.rps;

public class Score { //klasa punkty

    private Game player1; //pola
    private ComputerPlayer player2;
    private int wantedRounds;
    private StageGame stageGame;

    public Score (Game player1, ComputerPlayer player2, int wantedRounds) { //konstruktor punkty
        this.player1 = player1;
        this.player2 = player2;
        this.wantedRounds = wantedRounds;
        stageGame = new StageGame();
    }

    boolean playerOneBeatsPlayerTwo(String p1Move, String p2Move) {
        return ((p1Move.equals("2") && p2Move.equals("1")) || (p1Move.equals("3") && p2Move.equals("2")) ||
                (p1Move.equals("1") && p2Move.equals("3")));
    }

    boolean playerTwoBeatsPlayerOne(String p1Move, String p2Move) {
        return ((p1Move.equals("1") && p2Move.equals("2")) || (p1Move.equals("2") && p2Move.equals("3")) ||
                (p1Move.equals("3") && p2Move.equals("1")));
    }


    public StageGame play() {

        String p1Move = player1.makeMove();
        String p2Move = player2.makeMove();
        stageGame.addRounds();


        if (p1Move.equals(p2Move)) {
            System.out.println("It's a draw.");

        } else if (playerTwoBeatsPlayerOne(p1Move, p2Move)) {
            stageGame.addPointPlayer2();
            System.out.println("Computer wins");


        } else if (playerOneBeatsPlayerTwo(p1Move, p2Move)) {
            stageGame.addPointPlayer1();
            System.out.println("You managed to defeat the computer. You're doing great");


        } else if (p1Move.equals("n")) {
            stageGame.resetGameState();
            System.out.println("Game has been reset.");

        } else if (p1Move.equals("x")) {
            stageGame.numberOfRounds = wantedRounds;
            System.out.println("End Game.");
        }
        return stageGame;
    }

    public boolean hasNextRound() {
        return stageGame.numberOfRounds < wantedRounds;


    }
}
