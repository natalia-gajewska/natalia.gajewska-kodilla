package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player implements Game { //klasa Gracz implementuje interfejs gra

    private String name; //pola
    private List prepareTheMove() {
        List<String> theMoves = new ArrayList<>();
        theMoves.add("1");
        theMoves.add("2");
        theMoves.add("3");
        theMoves.add("x");
        theMoves.add("n");
        return theMoves;
    }

    public Player(String name) {

        this.name = name;
        prepareTheMove();
    }

    @Override
    public String getName() {

        return name;
    }


    public String makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your move?");
        String playerMove = scanner.nextLine();
        while (!(prepareTheMove().contains(playerMove))){

            System.out.println("Wrong number. You have to type 1, 2, or 3.");

            playerMove = scanner.nextLine();
        }

        return playerMove;

    }
}